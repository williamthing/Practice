/*
William Thing

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

*/
#include <iostream>
using namespace std;

int addDigits(int num);

int main() {
    int num = 38;
    num = addDigits(num);
    cout << num << endl;
    return 0;
}

int addDigits(int num) {
    if (num / 10 == 0) {
        return num % 10;
    }
    num = addDigits((num/10)) + num % 10;
    return addDigits(num);
}
