from multiprocessing import *

def sayHi4( name):
    print("Hi", name, "from process", current_process().pid)

def manyGreetings4():

    print("Hi from process", current_process().pid, "(main process)")

    for i in range(10):
        Process(target=sayHi4, args=("p"+str(i),)).start()
if __name__ == '__main__':
    manyGreetings4()