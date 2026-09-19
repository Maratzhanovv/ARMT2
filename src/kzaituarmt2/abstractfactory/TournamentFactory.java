package kzaituarmt2.abstractfactory;
import kzaituarmt2.factorymethod.Tournament;

public interface TournamentFactory {
    Tournament createTournament();

    Referee createReferee();
}