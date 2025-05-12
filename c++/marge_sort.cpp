#include<iostream>
using namespace std;
void marge(int arr1[],int l ,int arr2[],int m,int arr3[])
{
    int i=0,j=0,k=0;
        while(i<l && j<m)
        {
            if(arr1[i] < arr2[j])
            {
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                arr3[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<l)
        {
            arr3[k]=arr1[i];
            k++;
            i++; 
        }
        while(j<m)
        {
            arr3[k]=arr2[j];
            k++;
            j++;
        }
}
void print(int arr3[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        cout<<arr3[i]<<" ";
    }
    
}
int main()
{
    int arr1[5]={2,5,8,9,11};
    int arr2[6]={1,4,6,10,20,30};
    int arr3[11]={};

    marge(arr1, 5,arr2,6,arr3);

    print(arr3,11);

}
