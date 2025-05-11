#include<iostream>
#include<queue>
using namespace std;
int main()
{
	queue<string> q;
	
	q.push("madhu");
	q.push("sudan");
	q.push("saini");
	
	cout<<"size of queue :"<<q.size()<<"\n";
	
	cout<<"empty or not :"<<q.empty()<<"\n";
	


	cout<<"top element :"<<q.front()<<"\n";
	
	q.pop();
	cout<<"size of queue :"<<q.size()<<"\n";
	
	cout<<"top element :"<<q.front()<<"\n";
	
}
