#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void string_reverse1(char* string) 
{	
	char* front = string;
	char* back = string;
	while (*back) {
		back++;
	}
	back--;
	while (front <= back) {
		char temp = *back;
		*back-- = *front;
		*front++ = temp;
	}
	printf("%s\n", string);
}

char* string_reverse2(const char* string)
{
	int len = strlen(string);	// assuming can use string.h
	char string2[len];
	strcpy(string2, string);
	string_reverse1(string2);
	return string2;
}


int main() 
{
	char bro[] = "broski";
	const char hi[] = "hello world";
	printf("%s\n", bro);
	string_reverse1(bro);
	string_reverse2(hi);
	return 0;
}
