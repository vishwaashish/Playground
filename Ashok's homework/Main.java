#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int n1,n2,x,y;
  int a[100][100],b[100][100];
  cin>>n1;
  cin>>n2;
  a[n1][n2];
  b[n1][n2];
    for(int i=0;i<n1;i++){
      for(int j=0;j<n2;j++){
        cin>>a[i][j];
      }
    }
   	for(int i=0;i<n1;i++){
      for(int j=0;j<n2;j++){
        cin>>b[i][j];
      }
    }
  	for(int i=0;i<n1;i++){
      for(int j=0;j<n2;j++){
        cout<<a[i][j]+b[i][j]<<" ";
      }
      cout<<endl;
    }
  
}
