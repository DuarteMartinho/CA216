from cmd import Cmd
import os
import sys

class MyPrompt(Cmd):

    def do_hello(self, args):
        """Says hello. If you provide a name, it will greet you with it."""
        if len(args) == 0:
            name = 'stranger'
        else:
            name = args
    
        print ("Hello, %s" % name)

    def do_ls(self, args):
        """Lists all directories and files."""
        path = "."
        if len(args) == 1:
            path = args[0]

        files = os.listdir(path)

        for name in files:
            print(name)


    def do_quit(self, args):
        """Quits the program."""
        print("Quitting.")
        raise SystemExit



if __name__ == '__main__':
    prompt = MyPrompt()
    prompt.prompt = '> '
    prompt.cmdloop('Starting prompt...')

