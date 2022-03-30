string name;
Console.Write("Vad heter du? ");
name = Console.ReadLine();

int age;
Console.Write("Hur gammal är du? ");
age = int.Parse(Console.ReadLine());

int current_year;
current_year = DateTime.Now.Year;

int birth_year = current_year - age;
Console.WriteLine($"Okej {name}. Du föddes alltså år {birth_year}.");

string has_children; 
Console.Write("Har du några barn? ");
has_children = Console.ReadLine();

if (has_children.ToLower() == "ja") 
{    
    int children_amount; 
    Console.Write("Hur många barn har du? ");
    children_amount = int.Parse(Console.ReadLine());
    Console.WriteLine($"Trevligt med {children_amount} barn. Själv har jag inga barn då jag är ett program.");
}
else
{
    Console.WriteLine("Inte jag heller, för att jag är ett program.");
}
    