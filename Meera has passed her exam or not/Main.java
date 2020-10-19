#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int x1,y,n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
  	cin>>a[i];
  }
  cin>>x1;
  for(int i=0;i<n;i++){
    
    if(a[i]==x1){
      cout<<"She passed her exam";
      break;
    }
    if(i==n-1){
      cout<<"She failed";
      break;
    }
  	
  }
  
}