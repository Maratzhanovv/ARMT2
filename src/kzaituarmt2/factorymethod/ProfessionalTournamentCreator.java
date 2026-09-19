package kzaituarmt2.factorymethod;

public class ProfessionalTournamentCreator extends TournamentCreator {
    @Override
    public Tournament createTournament() {
        return new ProfessionalTournament();
    }
}
