#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <signal.h>
#include <sys/types.h>

unsigned int sleep(unsigned int seconds);
pid_t getpid(void);

void sighandler(int signnum) {
    printf("Received a signal: %d\n", signnum);
}

int main(int argc, char **argv)
{
    signal(SIGINT, sighandler);
    int i = 0;
    int n = atoi(argv[1]);
    while (i < n)
    {
        printf("Sleeping for 5 seconds...\n");
        pid_t id = getpid();
        int secsLeft = sleep(5);
        if (secsLeft > 0) {
            printf("There still was %d seconds left.\n", secsLeft);
        }
        printf("Process ID: %d\n", id);
        i += 1;
    }
    
}

