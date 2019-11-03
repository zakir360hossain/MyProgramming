from threading import Thread
import time


def timer(name, delay, repeat):
    print("Timer: " + name + " Started")
    while repeat > 0:
        time.sleep(delay)
        print(name + ": " + str(time.ctime(time.time())))
        repeat -= 1

    print("Timer: " + name + " completed")


def main():
    timer1 = Thread(target=timer, args=("Timer1", 1, 5))  # thread 1
    timer2 = Thread(target=timer, args=("Timer2", 2, 5)) # thread 2
    timer1.start()
    timer2.start()
    print("Main completed")


main()