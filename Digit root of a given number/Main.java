#include<iostream>
using namespace std;
int main()
{
    int n,rem=0,rem1=0,num,num1;
    std::cin>>n;
    while(n){
        num=n%10;
        rem=rem+num;
        n=n/10;
    }
    while(rem){
        num1=rem%10;
        rem1=rem1+num1;
        rem=rem/10;
    }
    cout<<rem1;
}