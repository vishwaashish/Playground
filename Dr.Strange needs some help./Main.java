#include <iostream>

#include <cmath>
int fact(int,int,int);
using namespace std;
int main()
{
 	double base, exponent, last;
   	cin>>base>>exponent>>last;
  	fact(base,exponent,last);
	return 0;
}

int fact(int base, int exponent,int last){
  int result=pow(base,exponent);
  if(result<last){
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  else{
    cout<<"Doctor, you can proceed with your experiment.";
  }
    
}
