#include <iostream>
using namespace std;

namespace name1{
    string name = "ram";
    int age=20;
}
namespace name2{
    string name = "ram";
}

using namespace name1;
int main()
{
    // int a;
    // cout<< "Enter teh value of a ";
    // cin>>a;
    // cout<<"a value is "<<a;

    // int a;
    // std::cout<< "Enter teh value of a ";
    // std::cin>>a;
    // std::cout<<"a value is "<<a;

    // string name = "ram";
    // string name = "ram";

    // cout<<name1::name<<endl;
    // cout<<name2::name<<endl;
    // cout<<name1::age;

    // cout<<name;

    // string s;
    // cout<<"enter the string ";
    // cin>>s;
    // cout<<s;

    // string s;
    // cout<<"enter the string ";
    // getline(cin,s);
    // cout<<s;

    // string s="hello world";
    // string s("hello world");using constructor
    // cout<<s<<endl;

    // string firstName="aashiqui ";
    // string lastName="bhai";
    // cout<<firstName+""+lastName<<endl;

    // firstName.append(lastName);
    // cout<<firstName<<endl;

    // cout<<firstName[12]<<endl;
    // firstName[12]='z';
    // cout<<firstName;

    // string s;
    // cout<<"Enter the string ";
    // cin>>s;
    // cout<<"The string  is: "<<s;

    // to  a newline (\n) remains in the input buffer.
    // cin.ignore();

    // cout<<"Enter the string ";
    // getline(cin,s);

    // When getline(cin, str); is called, it immediately reads the leftover newline (\n) from the buffer instead of waiting for user input.

    // cout<<"The string  is: "<<s;

   
    return 0;
}