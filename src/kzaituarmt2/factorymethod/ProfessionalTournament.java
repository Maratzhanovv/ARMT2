package kzaituarmt2.factorymethod;
public class ProfessionalTournament implements Tournament {
    @Override
    public String getType() {
        return "Professional Armwrestling Tournament";
    }
    @Override
    public void startTournament() {
        System.out.println("Professional tournament has started.");
    }
}
