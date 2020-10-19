#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f1,s1,a1,f2,s2,a2,a3,f3,s3;
  double f,s,a,fd,sd,ad;
  cin>>f1>>f2>>f3;
  cin>>s1>>s2>>s3;
  cin>>a1>>a2>>a3;
  fd=(f1/100)*f2;
  sd=(s1/100)*s2;
  ad=(a1/100)*a2;
  f=(f1-fd)+f3;
  s=(s1-sd)+s3;
  a=(a1-ad)+a3;
  cout<<"In Flipkart Rs."<<f<<endl;
  cout<<"In Snapdeal Rs."<<s<<endl;
  cout<<"In Amazon Rs."<<a<<endl;
  if(f<=s && f<a)
    cout<<"He will prefer Flipkart";
  else if(s<=a && s<=f)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}