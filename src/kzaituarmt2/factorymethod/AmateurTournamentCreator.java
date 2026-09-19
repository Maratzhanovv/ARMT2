package kzaituarmt2.factorymethod;
public class AmateurTournamentCreator extends TournamentCreator {
    @Override
    public Tournament createTournament() {
        return new AmateurTournament();
    }
}