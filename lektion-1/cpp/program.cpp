#include <iostream>
#include <ctime>

using namespace std;

int main() 
{
    std::string name;
    std::cout << "Vad heter du? ";
    std::cin >> name;

    int age;
    cout << "\nHur gammal är du? ";
    cin >> age;

    time_t current_time = time(NULL);
    int current_year;
    current_year = 1970 + current_time / 31537970;
    
    int birth_year;
    birth_year = current_year - age;
    cout << "Okej " << name << ". Du föddes alltså år " << birth_year << ".";

    string has_children;
    cout << "\nHar du några barn? ";
    cin >> has_children;

    if (has_children == "ja") 
    {
        int children_amount;
        cout << "\nHur många barn har du? ";
        cin >> children_amount;
        cout << "Trevligt med " << children_amount << " barn. Själv har jag inga barn då jag är ett program.";
    }
    else 
    {
        cout << "Inte jag heller, för att jag är ett program.";
    }    

    return 0;
}


