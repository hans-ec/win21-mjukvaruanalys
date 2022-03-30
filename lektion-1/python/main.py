from datetime import date

name = input("Vad heter du? ")

age = int(input("Hur gammal är du? "))

today = date.today()
current_year = today.year
birth_year = current_year - age
print("Okej " + name + ". Du föddes alltså år " + str(birth_year) + ".")

has_children = input("Har du några barn? ")

if (has_children.lower() == "ja"):
    children_amount = int(input("Hur många barn har du? "))
    print("Trevligt med " + str(children_amount) + " barn. Själv har jag inga barn då jag är ett program.")
else:
    print("Inte jag heller, för att jag är ett program.")
