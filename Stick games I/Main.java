#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n=2;
  int a[n];
  for(int i=0;i<n;i++){
  	 cin>>a[i];
  }
  for(int i=0;i<n;i++){
  	 if((a[0] %2==0)&&(a[1] %2==0)){
     	cout<<"Mani Iyer";
       	break;
     }
    else{
          	cout<<"Arun Gupta";
      break;
    }
  }
  
}