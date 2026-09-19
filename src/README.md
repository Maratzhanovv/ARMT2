# Armwrestling Tournament

This project is about an armwrestling tournament. I used Factory Method and Abstract Factory patterns in this project.

## Factory Method

Factory Method creates different types of tournaments.

Tournament is the main interface. AmateurTournament and ProfessionalTournament implement this interface. AmateurTournamentCreator creates an amateur tournament. ProfessionalTournamentCreator creates a professional tournament.

## Abstract Factory

Abstract Factory creates related objects together.

AmateurTournamentFactory creates AmateurTournament and AmateurReferee. ProfessionalTournamentFactory creates ProfessionalTournament and ProfessionalReferee.

## Clean Code

### 1. Meaningful names

I used clear names for classes and methods.

```java
Tournament createTournament();
Referee createReferee();
```

These names show what the methods do.

### 2. Small methods

My methods are short and do one task.

```java
public Tournament createTournament() {
    return new AmateurTournament();
}
```

This method only creates one tournament.

### 3. Small classes

Each class has its own task.

```java
public class AmateurReferee implements Referee
```

This class only works with the amateur referee.

### 4. No repeated code

I created the showEvent method and used it for both tournament types.

```java
showEvent(amateurFactory);
showEvent(professionalFactory);
```

This helps me not write the same code two times.

### 5. Using interfaces

The program works with interfaces.

```java
public static void showEvent(TournamentFactory factory)
```

Because of this, the same method can work with amateur and professional factories.

## Run

Run the Main class to see the result.