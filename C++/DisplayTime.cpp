// William Thing
// C++ practice
//


#include <iostream>
#include <ctime>

using namespace std;

int main()
{
	time_t now = time(0); // get the current time
	char* dt = ctime(&now);
	cout << "The local date and time is: " << dt << endl;
	return 0;
}
