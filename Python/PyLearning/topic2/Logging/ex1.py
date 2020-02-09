import logging

# Purpose: Record progress and problems...
# Levels: Debug, Info, Warning, Error, Critical

# Debug: detailed debug(), typically of interest only when diagnosing problems.
# Info: Confirmation that things are working as expected:
# Warning: An indication that something unexpected happened, or indicative of some problem in the near future.
# Error: Due to a more serious problem, the software has not been able to perform some function
# Critical: A serious error, indicating that the program itself may be unable to continue running,

logging.basicConfig(filename='ex1.log', level=logging.DEBUG, format='%(asctime)s:%(levelname)s:%(name)s:%(message)s')


def add(x, y):
    return x + y


def sub(x, y):
    return x - y


def mul(x, y):
    return x * y


def div(x, y):
    return x / y


a = add(345, 346)
logging.debug(f"Added: {a}")

b = sub(345, 346)
logging.debug(f"Subtracted: {a}")

c = mul(345, 346)
logging.debug(f"multiplied: {a}")

a = div(345, 0)
logging.debug(f"divided: {a}")
