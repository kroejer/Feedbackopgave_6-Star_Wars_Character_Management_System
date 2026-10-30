# **Feedbackopgave 6 - Star Wars character management system**

## **Gruppemedlemmer:**
Jonas, Oliver, Valdemar og Kasper

## **Projektbeskrivelse:**
Vi har øvet os på at lave et character management system i Star Wars tema ved hjælp 
af OOP hvor vi har haft fokus på arv, polymorfi, superklasser, subklasser, final og 
protected.  


## **Hvordan køres programmet:**
Programmet køres gennem vores main klasse fil, hvor vi opretter en ArrayList af 
**Character** (superklassen) objekter, som vi derefter tilføjer objekter til af alle 
de forskellige subklasser (Jedi, Sith, Droid, osv...). 
Vi kører derefter en for-each løkke hvor vi tager hvert enkelt objekt en ad gangen
og kalder deres `action();` metode, som er polymorfisk og derfor vil køre den korrekte
metode specifikt for den subklasse objektet tilhører. Samtidig tjekker for-each løkken
også om objektet er en instans af `Jedi();` subklassen, og hvis det er det kalder den
på `meditate();` metoden, som kun findes i `Jedi();` subklassen. Så tjekker den også
om objektet er en instans af `ForceUser();` interface, og hvis det er det kalder den på
`useForce();` metoden, som kun findes i `Jedi();` og `Sith();` subklasserne. Til sidst 
tjekker den også om objektet er en instans af `BountyHunter();` subklassen, og hvis det 
er det kalder den på `hunt();` metoden, som kun findes i `BountyHunter();` subklassen.

## **Klasser vi har implementeret samt deres felter og metoder:**

### **Character** superklassen:
#### Felter inde i **Character** superklassen:
* `protected String name;`
* `protected int age;`

#### Metoder inde i **Character** superklassen:
* `public Character(String name, int age);` (Konstruktøren)
* `public void action();`
* `public void showinfo();`
* `final void goLive();`


### **Jedi** subklassen:
#### Felter inde i **Jedi** subklassen:
* Arver alle felter fra **Character** superklassen.

#### Metoder inde i **Jedi** subklassen:
* Arver alle metoder fra **Character** superklassen.
* `public Jedi(String name, int age);` (Konstruktøren)
* `@Override public void action();`
* `public void meditate();`
* `@Override public void useForce();` (Arvet fra **ForceUser** interface)


### **Sith** subklassen:
#### Felter inde i **Sith** subklassen:
* Arver alle felter fra **Character** superklassen.

#### Metoder inde i **Sith** subklassen:
* Arver alle metoder fra **Character** superklassen.
* `public Sith(String name, int age);` (Konstruktøren)
* `@Override public void action();`
* `@Override public void useForce();` (Arvet fra **ForceUser** interface)


### **Droid** subklassen:
#### Felter inde i **Droid** subklassen:
* Arver alle felter fra **Character** superklassen.


#### Metoder inde i **Droid** subklassen:
* Arver alle metoder fra **Character** superklassen.
* `public Droid(String name, int age);` (Konstruktøren)
* `@Override public void action();`

### **CloneTrooper** subklassen:
#### Felter inde i **CloneTrooper** subklassen:
* Arver alle felter fra **Character** superklassen.

#### Metoder inde i **CloneTrooper** subklassen:
* Arver alle metoder fra **Character** superklassen.
* `public CloneTrooper(String name, int age);` (Konstruktøren)
* `@Override public void action();`

### **BountyHunter** subklassen:
#### Felter inde i **BountyHunter** subklassen:
* Arver alle felter fra **Character** superklassen.

#### Metoder inde i **BountyHunter** subklassen:
* Arver alle metoder fra **Character** superklassen.
* `public BountyHunter(String name, int age);` (Konstruktøren)
* `@Override public void action();`
* `public void hunt();`

### **ForceUser** interface:
#### Metoder inde i **ForceUser** interface:
- `void useForce();`

## **Udfordringer ved projektet:**


## **Tests vi har lavet:**

| Test | Sådan udføres testen | Forventet resultat | Reelt resultat |
|---|---|---|---|
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |
|  |  |  |  |
