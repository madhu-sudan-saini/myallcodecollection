#include<iostream>
#include<vector>
using namespace std;
int main()
{
	vector<int> v ;
	cout<<"size :"<<v.size()<<"\n";
	cout<<"vector capicity :"<<v.capacity()<<"\n";
	v.push_back(1);
	cout<<"vector capicity :"<<v.capacity()<<"\n";
	v.push_back(2);
	cout<<"vector capicity :"<<v.capacity()<<"\n";
	v.push_back(3);
	cout<<"vector capicity :"<<v.capacity()<<"\n";
	v.push_back(4);
	cout<<"vector capicity :"<<v.capacity()<<"\n";
	cout<<"size :"<<v.size()<<"\n";
}
