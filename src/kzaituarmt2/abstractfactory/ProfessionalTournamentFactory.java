package kzaituarmt2.abstractfactory;
import kzaituarmt2.factorymethod.ProfessionalTournament;
import kzaituarmt2.factorymethod.Tournament;

public class ProfessionalTournamentFactory implements TournamentFactory {
    @Override
    public Tournament createTournament() {
        return new ProfessionalTournament();
    }

    @Override
    public Referee createReferee() {
        return new ProfessionalReferee();
    }
}