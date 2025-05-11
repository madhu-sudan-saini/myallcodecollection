#include<iostream>
#include<list>
using namespace std;
int main()
{
	list<int> l;
	
	cout << "Size: " << l.size() << "\n";
	
	l.push_front(1);
	l.push_front(3);
	l.push_front(5);
	
	l.push_back(2);
	l.push_back(4);
	l.push_back(6);
	

    cout<<"element :"<<"\n";
    for (int i : l){
        cout << i << " ";
    }	
    cout<<"\n";
	
	l.pop_front();
	l.pop_back();
	cout<<"after pop front and back :"<<"\n";
    for (int i : l){
        cout << i << " ";
    }
	 cout<<"\n";			
	 
	cout<<"front element :"<<l.front()<<"\n"; 
	cout<<"front element :"<<l.back()<<"\n"; 
	
	
	cout<<"empty or not:"<<l.empty()<<"\n"; 
	
	cout<<"size befor erase:"<<l.size()<<"\n"; 
	l.erase(l.begin());
    cout<<"size befor erase:"<<l.size()<<"\n"; 
		
}
