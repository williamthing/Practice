#include <stdlib.h>
#include <time.h>
#include <stdio.h>

int main() {
	srand((unsigned int) time(NULL));
	int randomNum;
	for (int i = 0; i < 5; i++) {
		randomNum = rand() % 2;
		printf("%d\n", randomNum);
	}

	return 0;
}
