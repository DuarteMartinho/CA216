#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <signal.h>
#include <sys/types.h>

#define MAX_BUFFER 1024                        // max line buffer
#define MAX_ARGS 64                            // max # args
#define SEPARATORS " \t\n"                     // token separators

void do_clr();
void do_dir(char *dir);
void do_os(char **args);
void do_env();

extern char **environ;

int main(int argc, char **argv) {
    char buf[MAX_BUFFER];                      // line buffer
    char * args[MAX_ARGS];                     // pointers to arg strings
    char ** arg;                            // working pointer thru args
    char * prompt = "$ " ;                    // shell prompt

    while (1) {
        fputs(prompt, stdout);

        if (fgets(buf, MAX_BUFFER, stdin)) {
            arg = args;
            *arg++ = strtok(buf,SEPARATORS);   // tokenise input
            while ((*arg++ = strtok(NULL,SEPARATORS)));

            if (args[0]) {
                if (!strcmp(args[0],"clr")) {
                    // clear command
                    do_clr();
                } else if (!strcmp(args[0],"dir") && args[1] != NULL) {
                    // dir command
                    do_dir(args[1]);
                } else if (!strcmp(args[0],"environ")){
                    // Get system environment variables
                    do_env();
                } else if (!strcmp(args[0],"quit")) {
                    // quit
                    exit(0);
                } else {
                    // Pass any other command to the os shell
                    do_os(args);
                }
            }
        }
    }

    return 0;
}

void do_clr() {
    system("clear");
}

void do_dir(char *dir) {
    char *cmd = calloc(MAX_BUFFER, sizeof(char));
    strcat(cmd, "ls -la ");
    strcat(cmd, dir);
    system(cmd);
    free(cmd);
}

void do_os(char **args) {
    char *cmd = calloc(MAX_BUFFER, sizeof(char));
    while (*args) {
        strcat(cmd, *args++);
        strcat(cmd, " ");
    }
    system(cmd);
    free(cmd);
}

void do_env() {
    char **environ2 = environ;
    while (*environ2){
        fputs(*environ2++, stdout);
        fputs("\n", stdout);
    }
}