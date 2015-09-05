#!/bin/python

def reverse_string(string):
    """ method takes a string input and return the reverse
    off the given string ex. bird becomes drib
    """
    if string == "":
        return ""
    else:
        return reverse_string(string[1:]) + string[0]

def powers(n, exp):
    """ takes in integer n and exponent exp to return
    what value n is raised to by the exponent
    Since returns integer any negative exp will return 0
    easy fix by changing to return double/float
    """
    if exp < 0:
        exp = exp * -1
        return (1 / powers(n, exp))
    if exp == 0:
        return 1
    if exp == 1:
        return n
    else:
        return n * powers(n, exp-1)

def factorial(n):
    """ Takes an integer n and returns the factor of n (n!)
    Assume that not going to be passed a negative integer
    """
    if n == 0:
        return 1
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)

def write_squares(n):
    if n == 1:
        print "square of 1 is 1!!!"
    elif n % 2 == 0:
        write_squares(n-1)
        print("even square {}".format(n*n))
    else:
        print("odd square {}".format(n*n))
        write_squares(n-1)

if __name__ == "__main__":
    # Testing reverse_string method
    word = "bird"
    print reverse_string(word)

    # test powers function
    print powers(2, 2)
    print powers(100, 0)
    print powers(8, 3)
    print powers(2, -1)

    # test factorial
    print factorial(0)
    print factorial(1)
    print factorial(3)
    print factorial(5)
    print factorial(10)

    # testing write squares
    write_squares(5)
    write_squares(1)
    write_squares(8)
