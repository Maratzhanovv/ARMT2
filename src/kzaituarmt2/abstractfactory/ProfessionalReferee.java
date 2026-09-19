package kzaituarmt2.abstractfactory;
public class ProfessionalReferee implements Referee {
    @Override
    public String getRole() {
        return "Professional Referee";
    }
    @Override
    public void checkPlayers() {
        System.out.println("Professional referee checks the players.");
    }
}


