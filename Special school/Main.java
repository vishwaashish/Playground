#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string n1,n2;
  cin>>n1;
  cin>>n2;
  reverse(n1.begin(),n1.end());
  if(n1==n2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}