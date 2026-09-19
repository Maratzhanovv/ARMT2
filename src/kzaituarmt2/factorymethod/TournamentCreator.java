package kzaituarmt2.factorymethod;

public abstract class TournamentCreator {
    public abstract Tournament createTournament();
    public void organizeTournament() {
        Tournament tournament = createTournament();
        System.out.println("Tournament type: " + tournament.getType());
        tournament.startTournament();

    }
}
