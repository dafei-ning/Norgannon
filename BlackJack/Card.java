package BlackJack;

/*
 * 扑克牌有两种属性：牌面大小facevalue，牌面花色CardSuit
 * 对应两个API：牌面大小，牌面花色
 *
 */

public class Card {
    // 1 for A, 2 for 2, 11 for J, 12 for Q, 13 for K
    private int facevalue;
    private final CardSuit cardsuit;

    public Card (int fv, CardSuit cs ){
        facevalue = fv;
        cardsuit = cs;
    }

    public int value(){
        return facevalue;
    }

    public CardSuit cardSuit(){
        return cardsuit;
    }
}

enum CardSuit {
    Club, Diamond, Heart, Spade
}


