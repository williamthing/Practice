// William Thing
// C++ practice
//


#include <ctime>
#include <iostream>

using namespace std;

int main()
{
	time_t t = time(0) // get the current time
	struct tm * now = localtime(&t);
	cout << now->tm_mday << '-' // day
		<< end1;

	return 0;
}
