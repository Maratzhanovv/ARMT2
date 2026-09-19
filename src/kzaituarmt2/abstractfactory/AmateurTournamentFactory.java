package kzaituarmt2.abstractfactory;
import kzaituarmt2.factorymethod.AmateurTournament;
import kzaituarmt2.factorymethod.Tournament;

public class AmateurTournamentFactory implements TournamentFactory {
    @Override
    public Tournament createTournament() {
        return new AmateurTournament();
    }

    @Override
    public Referee createReferee() {
        return new AmateurReferee();
    }
}
