#include <iostream>
using namespace std;

int main() {
    int amount;
    cout << "Enter the amount in rupees: ";
    cin >> amount;

    int remaining = amount;
    int hundred = 0, fifty = 0, twenty = 0, ten = 0, one = 0;
    int choice = 1;

    while (choice <= 5) {
        switch (choice) {
            case 1:
                hundred = remaining / 100;
                remaining %= 100;
                break;
            case 2:
                fifty = remaining / 50;
                remaining %= 50;
                break;
            case 3:
                twenty = remaining / 20;
                remaining %= 20;
                break;
            case 4:
                ten = remaining / 10;
                remaining %= 10;
                break;
            case 5:
                one = remaining;
                break;
        }
        choice++;
    }

    cout << "Breakdown of " << amount << " rupees:\n";
    cout << "100s: " << hundred << endl;
    cout << "50s : " << fifty << endl;
    cout << "20s : " << twenty << endl;
    cout << "10s : " << ten << endl;
    cout << "1s  : " << one << endl;

    return 0;
}
