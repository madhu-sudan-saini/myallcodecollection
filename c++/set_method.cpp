#include<iostream>
#include<set>
using namespace std;
int main()
{
	set<int> s;
	
	s.insert(3);
	s.insert(1);
	s.insert(5);
	s.insert(0);
    s.insert(5);
    s.insert(1);
    s.insert(1);
	
	cout<<"size ->" <<s.size()<<"\n";
	
	int i;
	for(auto i : s)
	{
		cout<<i<<" ";
	
	}
	cout<<"\n";
	
	s.erase(s.begin());

    for(auto i : s)
	{
		cout<<i<<" ";
	
	}
	cout<<"\n";

    cout<<"5 is present or not :"<<s.count(5);

	
}
