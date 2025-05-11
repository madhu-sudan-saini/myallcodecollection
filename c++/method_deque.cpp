#include<iostream>
#include<deque>
using namespace std;
int main()
{
	deque<int> d;
	
	cout << "Size: " << d.size() << "\n";
	
	d.push_front(1);
	d.push_front(3);
	d.push_front(5);
	
	d.push_back(2);
	d.push_back(4);
	d.push_back(6);
	
    int i;
    cout<<"element :"<<"\n";
    for (i=0;i<d.size();i++){
        cout << d[i] << " ";
    }	
    cout<<"\n";
	
	d.pop_front();
	d.pop_back();
	cout<<"after pop front and back :"<<"\n";
    for (i=0;i<d.size();i++){
        cout << d[i] << " ";
    }
	 cout<<"\n";			
	 
	cout<<"front element :"<<d.front()<<"\n"; 
	cout<<"front element :"<<d.back()<<"\n"; 
	
	cout<<"print first index element  :"<<d.at(1)<<"\n"; 
	
	cout<<"empty or not:"<<d.empty()<<"\n"; 
	
	cout<<"size befor erase:"<<d.size()<<"\n"; 
	d.erase(d.begin(),d.begin()+1);
    cout<<"size befor erase:"<<d.size()<<"\n"; 
		
}
