#include<iostream>
using namespace std;
void printarray(int arr[],int size)
{
	for(int i=0;i<size;i++)
	{	
		cout<<arr[i]<<" ";
	}
}
void swapAlternet(int arr[],int size)
{
	for(int i=0;i<size;i+=2)
	{
		if(i+1 < size)
		{ 
		swap(arr[i],arr[i+1]);
		}
	}
}

int main()
{
	int arr[6]={10,20,2,30,2,50};
	swapAlternet(arr,6);
	printarray(arr,6);
}
	

