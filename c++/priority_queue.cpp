#include<iostream>
#include<queue>
using namespace std;
int main()
{
	//for max
	priority_queue<int> max;
	
	//for min;
	priority_queue < int,vector<int>,greater<int> > min;
	
	max.push(3);
	max.push(1);
	max.push(5);
	max.push(0);
	
	cout<<"size ->" <<max.size()<<"\n";
	
	int n=max.size();
	for(int i=0;i<n;i++)
	{
		cout<<max.top()<<" ";
		max.pop();
	}
	cout<<"\n";
	
		
	min.push(7);
	min.push(6);
	min.push(10);
	min.push(3);
	
	cout<<"size ->" <<min.size()<<"\n";
	
	n=min.size();
	for(int i=0;i<n;i++)
	{
		cout<<min.top()<<" ";
		min.pop();
	}
	cout<<"\n";
	
	cout<<"size ->"<<min.size();
	
}
