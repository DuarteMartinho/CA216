from multiprocessing import *

def sayHi():
    print("Hi from process", current_process().pid, " (Child 1)")

def procEx():
    print("Hi from process", current_process().pid, "(parent process)")

    otherProc = Process(target=sayHi, args=())

    otherProc.start()

### execute

if __name__ == '__main__':
    procEx()
