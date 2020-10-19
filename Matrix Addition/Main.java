#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,n1,sum=0,sum1=0,sum2=0;
  cin>>n;
  cin>>n1;
  int a[n][n1],b[n][n1],c[100][100];
  for(int i=0;i<n;i++){
    for(int j=0;j<n1;j++){
    cin>>a[i][j];
  	}
  }
  for(int i=0;i<n;i++){
    for(int j=0;j<n1;j++){
    cin>>b[i][j];
  	}
  }
   for(int i=0;i<n;i++){
    for(int j=0;j<n1;j++){
     c[i][j]=a[i][j]+b[i][j];
  	}
  }
 for(int i=0;i<n;i++){
    for(int j=0;j<n1;j++){
    cout<<c[i][j]<<" ";
  	}
   cout<<"\n";
  }
  
}
