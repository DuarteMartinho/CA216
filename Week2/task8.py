from multiprocessing import *
import time

def greet(q):
    print("(child process) Waiting for name...")
    name1 = q.get()
    name2 = q.get()
    name3 = q.get()
    name4 = q.get()
    name5 = q.get()
    print("(child process1) Well, hi", name1)
    print("(child process2) Well, hi", name2)
    print("(child process3) Well, hi", name3)
    print("(child process4) Well, hi", name4)
    print("(child process5) Well, hi", name5)

def sendName():
    q = Queue()
    
    p1 = Process(target=greet, args=(q,))
    p1.start()
    
    time.sleep(5) # wait for 5 seconds
    print("(parent process) Ok, I'll send the name")
    q.put("Jimmy1")
    q.put("Jimmy2")
    q.put("Jimmy3")
    q.put("Jimmy4")
    q.put("Jimmy5")

#execute
if __name__ == '__main__':
    sendName()