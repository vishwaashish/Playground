#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char str[100];
  gets(str);
  int len = strlen(str);
  if(len>50)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
   
}