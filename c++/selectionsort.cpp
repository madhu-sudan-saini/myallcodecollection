#include<iostream>
using namespace std;
void selectionsort(int arr[],int n)
{
	int i,j;
	for(i=0;i<n-1;i++)
	{
		int smallidx=i;
		for(j=i+1;j<n;j++)
		{
			if(arr[j] < arr[smallidx])
			{
				smallidx=j;
			}	
		}
		swap(arr[smallidx],arr[i]);
	} 
}
printarray(int arr[],int n)
{
	int i;
	cout<<"sorted array :"<<"\n";
	for(i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}
}
int main()
{
	int arr[6]={1,5,2,9,45,23};
	selectionsort(arr,6);
	printarray(arr,6);
}
