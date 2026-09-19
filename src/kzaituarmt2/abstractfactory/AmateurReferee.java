package kzaituarmt2.abstractfactory;
public class AmateurReferee implements Referee {
    @Override
    public String getRole() {
        return "Amateur Referee";
    }
    @Override
    public void checkPlayers() {
        System.out.println("Amateur referee checks the players.");
    }
}
