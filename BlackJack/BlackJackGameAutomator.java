/* BlackJackGameAutomator */

package BlackJack;

public class BlackJackGameAutomator {

    private Deck deck;
    private BlackJackHand[] hands;
    private static final int HIT_UNTIL = 16;

    public BlackJackGameAutomator (int numPlayers) {
        hands = new BlackJackHand[numPlayers];
    }

























    public void simulate(){

    }



    public static void main (String [] args){
        BlackJackGameAutomator Automator = new BlackJackGameAutomator();
        Automator.simulate();
    }
}