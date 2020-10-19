#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
   int tballs,truns,runs,balls;
  cin>>tballs>>truns>>runs>>balls;
  int o=tballs/6;
  cout<<o<<endl;
  float a,b,c,rr,x,y,z,trr;
  a=(balls%6)/10.0;
  b=balls/6;
  c=a+b;
  cout<<c<<endl;
  rr=runs/c;
  std::cout<< fixed << setprecision(1) <<rr<<endl;
  x=(tballs%6)/10.0;
  y=tballs/6;
  z=x+y;
  trr=truns/z;
  cout<<trr<<endl;
  if(rr>trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}