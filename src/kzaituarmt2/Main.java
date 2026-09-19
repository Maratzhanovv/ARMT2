package kzaituarmt2;
import kzaituarmt2.abstractfactory.AmateurTournamentFactory;
import kzaituarmt2.abstractfactory.ProfessionalTournamentFactory;
import kzaituarmt2.abstractfactory.Referee;
import kzaituarmt2.abstractfactory.TournamentFactory;
import kzaituarmt2.factorymethod.AmateurTournamentCreator;
import kzaituarmt2.factorymethod.ProfessionalTournamentCreator;
import kzaituarmt2.factorymethod.Tournament;
import kzaituarmt2.factorymethod.TournamentCreator;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORY METHOD");

        TournamentCreator amateurCreator = new AmateurTournamentCreator();
        TournamentCreator professionalCreator = new ProfessionalTournamentCreator();

        amateurCreator.organizeTournament();
        professionalCreator.organizeTournament();

        System.out.println("\nABSTRACT FACTORY");

        TournamentFactory amateurFactory = new AmateurTournamentFactory();
        TournamentFactory professionalFactory = new ProfessionalTournamentFactory();

        showEvent(amateurFactory);
        showEvent(professionalFactory);
    }

    public static void showEvent(TournamentFactory factory) {
        Tournament tournament = factory.createTournament();
        Referee referee = factory.createReferee();
        System.out.println("\nTournament: " + tournament.getType());
        System.out.println("Referee: " + referee.getRole());
        referee.checkPlayers();
        tournament.startTournament();
    }
}