from multiprocessing import *

def sayHi():
    print("Hi from process", current_process().pid, " (Child 1)")

def sayHi2():
    print("Hi from process", current_process().pid, " (Child 2)")

def procEx():
    print("Hi from process", current_process().pid, "(parent process)")

    otherProc = Process(target=sayHi, args=())
    otherProc2 = Process(target=sayHi2, args=())

    otherProc.start()
    otherProc2.start()

### execute

if __name__ == '__main__':
    procEx()
