#include<iostream>
using namespace std;
bool search(int arr[],int size,int key)
{
	for(int i=0;i<=size;i++)
	{
		if(arr[i]==key)
		{
			return 1;
		}
	}
	return 0;
}
int main()
{
	int size=10;
	int arr[10]={10,20,3094 ,574,484892};
	
	int key;
	cin>>key;
	bool found=search(arr,10,key);
	if(found)
	{
		cout<<"element found";
	}
	else
	{
		cout<<"element not found";
	}
	
}
