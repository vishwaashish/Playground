#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,n,x1,y1;
  cin>>x;
  x1=x;
  cin>>y;
  y1=y;
  while(x != y){
    if(x>y)
      x-=y;
    else
      y-=x;
  }
  cout<<"G.C.D of "<<x1<<" and "<<y1<<" = "<<x;
}