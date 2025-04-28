#include<iostream>
using namespace std;
int main()
{
	int a=0;
	int b=1;
	cout<<a<<" "<<b;
	for(int i=1;i<=10;i++)
	{
		int c=a+b;
		cout<<" "<<c;
		a=b;
		b=c;
	}
cout<<a<<" "<<b;

}
