#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int x,y,n,t;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
  	cin>>arr[i];
  	
  }
  for(int i = 1;i < n; i++)
    {
       // Change < to > if you want to find the smallest element
       if(arr[0] < arr[i])
           arr[0] = arr[i];
    }
    cout << arr[0];
    
  
  
}