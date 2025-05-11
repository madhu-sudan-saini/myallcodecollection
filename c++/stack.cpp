#include<iostream>
#include<stack>
using namespace std;
int main()
{
	stack<string> s;
	
	s.push("c");
	s.push("c++");
	s.push("java");
	
	cout<<"size of stack :"<<s.size()<<"\n";
	
	cout<<"empty or not :"<<s.empty()<<"\n";
	


	cout<<"top element :"<<s.top()<<"\n";
	
	s.pop();
	cout<<"size of stack :"<<s.size()<<"\n";
	
	cout<<"top element :"<<s.top()<<"\n";
	
}
