#include<iostream>
using namespace std;

int main()
{
    int flag = 1;
    int num;
    cout << "Enter a number to check if it is prime or not: ";
    cin >> num;

    if (num <= 1) {
        flag = 0; 
    } else {
        for (int i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0)
            {
                flag = 0; 
                break;
            }
        }
    }

    if (flag == 1)
    {
        cout << "Number is prime.";
    }
    else
    {
        cout << "Number is not prime.";
    }

    return 0;
}
