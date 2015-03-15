#include <stdio.h>
#include <string.h>

void main(int argc, char** argv) {
	
	int len;
	char temp;
	char *str = argv[1];
	char *end_ptr = str;
	len = strlen(str);
	end_ptr += len - 1;
	printf("%c\n", *str);
	printf("%c\n", *end_ptr);
	while (str < end_ptr) {
		temp = (*end_ptr);
		*end_ptr = *str;
		*str = temp;
		--end_ptr;
		++str;
	}

	printf("%s\n", argv[1]);
}
