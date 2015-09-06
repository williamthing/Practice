#!/bin/python

def print_coin_flips(n):
    def coin_flips(n, result):
        if n == 0:
            print result
        elif n > 0:
            coin_flips(n-1, result + "H")
            coin_flips(n-1, result + "T")

    coin_flips(n, "")

print_coin_flips(1)
print_coin_flips(5)
print_coin_flips(2)
print_coin_flips(7)
