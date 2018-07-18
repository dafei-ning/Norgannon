package BlackJack;


public class Card {
    // 1 for A, 2 for 2, 11 for J, 12 for Q, 13 for K
    private final FaceValue facevalue;
    private final CardSuit suit;

    public Card (FaceValue fv, CardSuit cs ){
        facevalue = fv;
        suit = cs;
    }

    public int value(){

        int CardValue = 0;

        switch (facevalue){
            case Ace:
                CardValue = 1;
                break;
            case Two:
                CardValue = 2;
                break;
            case Three:
                CardValue = 3;
                break;
            case Four:
                CardValue = 4;
                break;
            case Five:
                CardValue = 5;
                break;
            case Six:
                CardValue = 6;
                break;
            case Seven:
                CardValue = 7;
                break;
            case Eight:
                CardValue = 8;
                break;
            case Nine:
                CardValue = 9;
                break;
            case Ten:
                CardValue = 10;
                break;
            case Jack:
                CardValue = 10;
                break;
            case Queen:
                CardValue = 10;
                break;
            case King:
                CardValue = 10;
                break;

        }

        return CardValue;
    }

    public CardSuit cardSuit(){
        return suit;
    }


}



enum CardSuit {
    Club, Diamond, Heart, Spade
}

enum FaceValue {
    Ace, Two, Three, Four, Five,
    Six, Seven, Eight, Nine, Ten,
    Jack, Queen, King
}