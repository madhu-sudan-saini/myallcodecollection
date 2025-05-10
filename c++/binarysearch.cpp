#include<iostream>
using namespace std;
int binarysearch(int arr[],int size,int key)
{
	int start=0;
	int end=size-1;
	int mid=(start + (end-start)/2);
	
	while(start<=end)
	{
		if(arr[mid]==key)
		{
			return mid;
		}
		
		if(key > arr[mid])
		{
			start =mid+1;
		}
		else
		{
			end=mid-1;
		}
		mid=(start + end)/2;
	}
	return -1;
}
int main()
{
	int arr[8]={1,5,9,15,30,57,89,100};
	int value;
	cout<<"enter value to search :";
	cin>>value;
	int index=binarysearch(arr,8,value);
	
	cout<<"value found index :"<<index;	
}
