#include <iostream>
#include<bits/stdc++.h> 
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i; 

  string greeting;
  getline(cin,greeting);      
  reverse(greeting.begin(),greeting.end());
  cout<<greeting<<endl;
}