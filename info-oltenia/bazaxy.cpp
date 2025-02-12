#include <fstream>
#include <set>
#include <string>
using namespace std;

ifstream fin("bazaxy.in");
ofstream fout("bazaxy.out");


long long toBase10(string num, int base) {
	long long result = 0;
	for (char c : num)
		result=result*base + (c - '0');
	return result;
}

string fromBase10(long long num, int base) {
	if(num==0) return "0";
	string result = "";
	while(num>0) {
		result=char((num % base) + '0') + result;
		num/=base;
	}
	return result;
}

int main() {
	int bx, by;
	string X, Y;
	fin>>bx>>by>>X>>Y;
	
	int BazaXY = min(bx, by);

	long long valX = toBase10(X, bx);
	long long valY = toBase10(Y, by);
	
	string newX = fromBase10(valX, BazaXY);
	string newY = fromBase10(valY, BazaXY);
	
	set<char> digitsX(newX.begin(), newX.end());
	set<char> digitsY(newY.begin(), newY.end());
	
	char commonDigit = -1;
	for (char d = '0'; d <= '9'; d++) {
		if (digitsX.count(d) && digitsY.count(d)) {
			commonDigit = d;
			break;
		}
	}

	if (commonDigit==-1)
		fout<<"-1\n";
	else
		fout<<commonDigit << "\n";
	
	fout<<newX<<" "<<newY<<"\n";
	
	return 0;
}
