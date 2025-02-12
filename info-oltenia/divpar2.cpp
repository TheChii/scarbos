//scor 100

#include <fstream>
#include <cmath>
using namespace std;

ifstream fin("divpar.in");
ofstream fout("divpar.out");

int main(){
    int s = 0;
    int n; fin>>n;
    
    for(int i=0;i<n;i++){
        int x;fin>>x;
        
        int div = 1;
        int sqrt_x = static_cast<int>(sqrt(x));
        
        for(int d=2; d<=sqrt_x;d++){
            if(x%d == 0){
                div++;
                if(d!=x/d) div++; 
            }
        }
        
        if(x!=1) div++; 
        
        if(div%2==0) s++;
    }
    
    fout<<s;
}
