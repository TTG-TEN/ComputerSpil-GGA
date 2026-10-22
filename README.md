# Computerspil – GameSystem

## Beskrivelse
Dette projekt er udviklet som en del af feedbackopgaven om computerspil. Formålet er at anvende grundlæggende principper inden for objektorienteret programmering (OOP) i Java.

Programmet simulerer et simpelt system, der kan administrere computerspil og spillere. Det er muligt at tilføje spil og spillere, finde dem ud fra deres ID, opdatere spilleres scores og vise en leaderboard sorteret efter score.

## Klasser

### Game
Klassen `Game` repræsenterer et computerspil og indeholder følgende attributter:

- `gameId` – spillets unikke ID.
- `title` – spillets titel.
- `genre` – spillets genre.
- `price` – spillets pris.

Klassen indeholder en konstruktør, getter- og setter-metoder samt metoden `displayDetails()`, der viser spillets oplysninger.

### Player
Klassen `Player` repræsenterer en spiller og indeholder følgende attributter:

- `playerId` – spillerens unikke ID.
- `name` – spillerens navn.
- `age` – spillerens alder.
- `score` – spillerens score.

Klassen indeholder en konstruktør, getter- og setter-metoder samt metoderne `displayDetails()` og `updateScore()`, som henholdsvis viser spillerens oplysninger og opdaterer spillerens score.

### GameSystem
Klassen `GameSystem` fungerer som systemets centrale administrationsklasse. Den indeholder to arrays, som gemmer henholdsvis spil og spillere.

Klassen indeholder følgende funktioner:

- `addGame()` – tilføjer et spil til systemet.
- `addPlayer()` – tilføjer en spiller til systemet.
- `displayAllGames()` – viser alle registrerede spil.
- `displayAllPlayers()` – viser alle registrerede spillere.
- `findGameById()` – finder et spil ud fra dets ID ved hjælp af en gennemgang af arrayet.
- `findPlayerById()` – finder en spiller ud fra deres ID ved hjælp af en gennemgang af arrayet.
- `updatePlayerScore()` – opdaterer en spillers score ud fra spillerens ID.
- `sortPlayersByScore()` – sorterer spillerne efter score i faldende rækkefølge ved hjælp af Bubble Sort.
- `displayLeaderboard()` – viser spillerne i en leaderboard med den højeste score først.

Systemet har desuden en kapacitetsbegrænsning, som bestemmes, når et `GameSystem`-objekt oprettes.

## Objektorienteret programmering
Projektet anvender flere centrale principper inden for objektorienteret programmering:

- **Klasser og objekter:** `Game`, `Player` og `GameSystem` modellerer forskellige dele af systemet.
- **Konstruktører:** Bruges til at initialisere objekter med deres startværdier.
- **Indkapsling:** Attributterne er erklæret `private` og tilgås gennem getter- og setter-metoder.
- **Arrays af objekter:** Bruges til at opbevare flere spil og spillere.
- **Metoder:** Funktionaliteten er opdelt i separate metoder, så koden bliver mere overskuelig og genanvendelig.
- **Linear Search:** Bruges til at finde spil og spillere ved at gennemgå arrayets elementer ét ad gangen.
- **Bubble Sort:** Bruges til at sortere spillerne efter deres score.

## Test og eksempel på anvendelse
Programmet testes gennem `main()`, hvor der oprettes et `GameSystem`-objekt, fem spillere og otte spil.

Testen demonstrerer blandt andet, hvordan man kan:

1. Tilføje spil og spillere til systemet.
2. Vise alle registrerede spil og spillere.
3. Opdatere Sofies score.
4. Vise en leaderboard sorteret efter score.
5. Søge efter et spil eller en spiller ved hjælp af deres ID.
6. Vise en spillers detaljer.
7. Ændre genren for et eksisterende spil.

Eksempel på oprettelse af systemet:

```java
GameSystem gameSystem = new GameSystem(10, 5);
```

Dette opretter et system med plads til maksimalt 10 spil og 5 spillere.

## Begrænsninger
Systemet er udviklet som en grundlæggende øvelse i Java og objektorienteret programmering.

- Data gemmes kun i hukommelsen og forsvinder, når programmet afsluttes.
- Antallet af spil og spillere er begrænset af størrelsen på de oprettede arrays.
- Der er endnu ikke implementeret en fuld fejlhåndtering for ugyldige ID'er eller søgninger, der ikke finder et resultat.

## Konklusion
Projektet demonstrerer, hvordan klasser, objekter, indkapsling, arrays og metoder kan anvendes til at udvikle et simpelt administrationssystem i Java. Det giver samtidig praktisk erfaring med at søge efter objekter, opdatere data og sortere spillere efter deres scores.
