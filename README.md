# Day 1 assignments
These assignments were given in the morning and was expected to be finished by the end of the day.  Assignments are written in english out of habit.

Dessa uppgifter var givna på förmiddagen och förväntades vara klara i slutet av dagen. Uppgifterna är skrivna på engelska, vanesak.
## Uppgift 1: Ålderskategorier
Skapa ett program som läser in en persons ålder och bestämmer vilken kategori personen
tillhör:
* Under 13: "Barn"
* 13-19: "Tonåring"
* 20-64: "Vuxen"
* 65 och över: "Senior"

Använd int-variabel för ålder och if-else-satser för att skriva ut rätt kategori.
## Uppgift 2: Betygskonverterare
Skriv ett program som konverterar poäng (0-100) till bokstavsbetyg:
* 90-100: A
* 80-89: B
* 70-79: C
* 60-69: D
* Under 60: F

Använd double för poäng och implementera med if-else if-kedja. Lägg till validering som
kontrollerar att poängen är mellan 0-100.
## Uppgift 3: Enkel kalkylator
Skapa en miniräknare som kan utföra grundläggande operationer (`+`, `-`, `*`, `/`) på två tal.
Programmet ska:
* Läsa in två double-värden
* Läsa in en char för operation
* Använda switch-sats för att välja operation
* Hantera division med noll som specialfall
* Skriva ut resultatet med lämplig formatering
## Uppgift 4: Temperaturomvandlare med rekommendationer
Bygg ett program som konverterar mellan Celsius och Fahrenheit och ger
klädrekommendationer:
* Låt användaren välja konverteringsriktning (C -> F eller F -> C)
* Utför beräkningen med double-variabler
* Baserat på sluttemperaturen i Celsius, ge råd:
  * Under 0°C: "Mycket kallt - ta på dig vinterkläder!"
  * 0-10°C: "Kallt - jacka behövs"
  * 11-20°C: "Svalt - lätt jacka"
  * 21-30°C: "Behagligt - t-shirt räcker"
  * Över 30°C: "Varmt - shorts och linne!"
## Uppgift 5: Bankkonto-simulator
Utveckla en enkel bankkontosimulator som:
* Håller reda på saldo (double)
* Läser in transaktionstyp (String: "insättning" eller "uttag")
* Läser in belopp (double)
* Kontrollerar att uttag inte överstiger saldot
* Kontrollerar att belopp är positivt
* Uppdaterar och visar nytt saldo
* Använder boolean-variabler för att hålla reda på om transaktionen lyckades

Varje uppgift tränar olika aspekter: datatyper (int, double, char, String, boolean),
villkorssatser (if-else, switch), input-validering och logiskt tänkande.
