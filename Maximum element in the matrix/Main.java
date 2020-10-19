#include<iostream>
using namespace std;
int main()
{
    int n1,n2,max;
    std::cin >> n1;
    std::cin >> n2;
    int a[n1][n2];
  	for(int i=0;i<n1;i++) {
        for (int j=0;j<n2;j++) {
          cin>>a[i][j];
        }
    }
    for (int i=0;i<n1;i++) {
 
        for (int j=0;j<n2;j++) {
            if(a[i][j]>max)
                max=a[i][j];
        }
    }
  
        cout<<"The maximum element is "<<max<<endl;
    
}
