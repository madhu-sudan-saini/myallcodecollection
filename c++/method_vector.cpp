#include<iostream>
#include<vector>
using namespace std;

int main() {
    vector<int> v;
    
    cout << "Size: " << v.size() << "\n";
    cout << "Vector capacity: " << v.capacity() << "\n";
    
    v.push_back(1);
    cout << "Vector capacity: " << v.capacity() << "\n";
    
    v.push_back(2);
    cout << "Vector capacity: " << v.capacity() << "\n";
    
    v.push_back(3);
    cout << "Vector capacity: " << v.capacity() << "\n";
    
    v.push_back(4);
    cout << "Vector capacity: " << v.capacity() << "\n";
    
    cout << "Size: " << v.size() << "\n";
    
    cout << "Element at 2nd index: " << v.at(2) << "\n";
    cout << "Front element: " << v.front() << "\n";
    cout << "End element: " << v.back() << "\n";
    
    cout << "Before pop:\n";
    int i;
    for (i=0;i<v.size();i++){
        cout <<v[i] << " ";
    }
    cout << "\n";
    
    v.pop_back();
    
    cout << "After pop:\n";
    for (i=0;i<v.size();i++) {
        cout << v[i] << " ";
    }
    cout << "\n";
    
    cout<<"size befor clear :"<<v.size()<<"\n";
    v.clear();
     cout<<"size after clear :"<<v.size()<<"\n";
    
    return 0;
}
