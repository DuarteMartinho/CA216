from multiprocessing import *

def sayHi4( name, id):
    print("Hiddy-ho!  I'm worker ", name, " and today I have to dig hole ", id)

def manyGreetings4():

    print("Hi from process", current_process().pid, "(main process)")
    list = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]
    for i in range(26):
        Process(target=sayHi4, args=(list[i], str(i),)).start()

if __name__ == '__main__':
    manyGreetings4()