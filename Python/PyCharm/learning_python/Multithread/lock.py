import threading
import time

tLock = threading.Lock()


def timer(name, delay, repeat):
    print("Timer: " + name + " Started")
    tLock.acquire()  # Acquires a semaphore, decrements counter.
    print(name + " has acquired the lock")
    while repeat > 0:
        time.sleep(delay)
        print(name + ": " + str(time.ctime(time.time())))
        repeat -= 1

    print(name + " is releasing the lock")
    tLock.release()  # Release a semaphore, increment a counter.
    print("Timer: " + name + " completed")


def main():
    timer1 = threading.Thread(target=timer, args=("Timer1", 1, 5))  # thread 1
    timer2 = threading.Thread(target=timer, args=("Timer2", 2, 5)) # thread 2
    timer1.start()
    timer2.start()
    print("Main completed")


main()