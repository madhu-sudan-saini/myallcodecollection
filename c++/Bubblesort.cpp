#include<iostream>
using namespace std;
void Bubblesort(int arr[],int n)
{
	int i,j;
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(arr[i] > arr[j])
			{
				swap(arr[i] ,arr[j]);
			}
		}
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
	int arr[6]={1,4,2,9,45,23};
	Bubblesort(arr,6);
	printarray(arr,6);
}
