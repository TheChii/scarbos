//scor 58

#include <fstream>
using namespace std;

ifstream fin("divpar.in");
ofstream fout("divpar.out");

int main(){
	int s=0;
	int n; fin>>n;
	
	int x;
	for(int i=0;i<n;i++){
		fin>>x;
		
		int div = 1;
		for(int d=2;d<=x;d++){
			if(x%d==0) div++;
		}
		
		if(div%2==0) s++;
	}
	
	fout<<s;
}
