#include<iostream>
using namespace std;
int swap(int x,int y){
	int t;
 	  t = x;
      x = y;
      y = t;
  
  	std::cout<<"After swapping a= "<<x<<" and b="<<y<<endl;
}
int main(){
	int a,b;
    std::cin>>a;
    std::cin>>b;
  	std::cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
  	swap(a,b);
  
}