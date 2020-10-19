
#include<stdio.h>
#include<iostream>
int main()
{
    int n,i,j,k,s;
    std::cin>>n;
  s=n;
    for(i=1;i<=n+1;i++)
    {
        for(k=1;k<=i;k++)
        {
          if(i<5){
            std::cout<<s;
          }
        }
      
        s++;
      if(i<5){
        std::cout<<"\n";}
    }
    s--;
    for(i=n+1;i>=1;i--)
    {
        for(k=1;k<=i;k++)
        {
            if(i<5){
            std::cout<<s;
          }
        }
        s--;
      if(i<5){
        std::cout<<"\n";}
    }
    return 0;
}

