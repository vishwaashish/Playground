#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  int time;
  std::cin>>age;
  std::cin>>time;
  switch(time){
    case 10: if(age>13)
      			cout<<"$8.00";
      		 else
               cout<<"$4.00";
             break; 
    case 13: if(age>13)
      			cout<<"$5.00";
      		 else
               cout<<"$2.00";
             break; 
    case 18: if(age>13)
      			cout<<"$8.00";
      		 else
               cout<<"$4.00";
             break;
    case 22: if(age>13)
      			cout<<"$8.00";
      		 else
               cout<<"$4.00";
             break;  
  }
  
}
