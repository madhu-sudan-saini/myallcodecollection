#include<iostream>
using namespace std;
void inserectionsort(int arr[],int size)
{
	int i,j;
	for(i=1;i<size;i++)
	{
	  int curr=arr[i];
	  int prev=i-1;
	  while(prev >=0 && arr[prev]>curr)
	  {
	  	arr[prev+1]=arr[prev];
	  	prev--;
	  }
	  arr[prev+1]=curr;
		
	}
}
void printarray(int arr[],int size)
{
	cout<<"print inserection array:"<<"\n";
	for(int i=0;i<size;i++)
	{
		cout<<arr[i]<<" ";	
	}

}
int main ()
{
	int size=5;
	int arr[]={4,1,5,2,3};
	inserectionsort(arr,size);
	printarray(arr,size);
	
}
