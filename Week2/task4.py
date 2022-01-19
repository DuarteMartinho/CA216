from multiprocessing import *
def sayHi2(n):    
    print("Hi", n, "from process", current_process().pid)

def manyGreetings():    
    print("Hi from process", current_process().pid, "(main process)")        
    name = input('Hi there please enter a name: ')
    n = int(input('Please input the number of processes desired: '))
    i = 0
    while i < n:
        process = Process(target=sayHi2, args=(name,))    
        process.start()
        i += 1
#execute
if __name__ == '__main__':
    manyGreetings()