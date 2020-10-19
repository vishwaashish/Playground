#include<iostream>
#include<cmath>
using namespace std;

int power(int x, int y){
  if(x==1){
    return 1;
  }
  else{
    return pow(x,y);
  }
}
int main()
{
  int x,y;
  cout<<"Enter the value of a"<<endl;
  std::cin>>x;
  cout<<"Enter the value of n"<<endl;
  std::cin>>y;
  cout<<"The value of "<<x<<" power "<<y<<" is "<<power(x,y);
}