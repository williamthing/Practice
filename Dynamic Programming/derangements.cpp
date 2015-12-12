#include<iostream>
using namespace std;

/*
A Derangement is a permutation of n elements, such that no 
element appears in its original position. For example, a 
derangement of {0, 1, 2, 3} is {2, 3, 1, 0}.

Given a number n, find total number of Derangements 
of a set of n elements.
*/

int countDer(int);

int main() {
    int n = 4;
    cout << "Count of Derangements is " << countDer(n) << "\n";
    return 0;
}

int countDer(int n) {
    int der[n+1];
    // base case
    der[0] = 1;
    der[1] = 0;
    der[2] = 1;
    for (int i = 3; i <= n; i++) {
        der[i] = (i-1)*(der[i-1] + der[i-2]);
    }
    return der[n];
}
