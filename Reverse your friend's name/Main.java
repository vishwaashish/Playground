#include<iostream>
#include<string>

#include <bits/stdc++.h> 
using namespace std;
int main() 
{ 
	string n;
	getline(cin,n);
  	reverse(n.begin(),n.end());
  	cout<<n;
}