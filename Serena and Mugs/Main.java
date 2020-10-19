#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n1=2,n2=2;
  int a[n1][n2];
  for(int i=0;i<n1;i++){
  	for(int j=0;j<n2;j++){
      cin>>a[i][j];
    }
  }


      if(a[1][0] == a[1][1]){
      	cout<<"YES";
      }
      else{
        cout<<"NO";
      }
      
 
  
}