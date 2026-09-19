package kzaituarmt2.factorymethod;

public class AmateurTournament implements Tournament {
    @Override
    public String getType() {
        return "Amateur Armwrestling Tournament";
    }
    @Override
    public void startTournament() {
        System.out.println("Amateur tournament has been started.");
    }
}
