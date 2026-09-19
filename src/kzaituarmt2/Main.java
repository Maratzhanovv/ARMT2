package kzaituarmt2;

import kzaituarmt2.factorymethod.AmateurTournamentCreator;
import kzaituarmt2.factorymethod.ProfessionalTournamentCreator;
import kzaituarmt2.factorymethod.TournamentCreator;

public class Main {
    public static void main(String[] args) {
        TournamentCreator amateurCreator =
                new AmateurTournamentCreator();

        TournamentCreator professionalCreator =
                new ProfessionalTournamentCreator();

        amateurCreator.organizeTournament();

        System.out.println();

        professionalCreator.organizeTournament();
    }
}