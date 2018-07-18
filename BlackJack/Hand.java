package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 玩家中的手牌表示方法：
 * 1）一list的手牌
 * 2）分数
 * 3）加手牌
 */


public class Hand {

    protected final List<Card> cards = new ArrayList<>();

    public int score() {
        int score = 0;
        for (Card card: cards) {
            score += card.value();
        }
        return score;
    }

    public void addCards (Card[] c) {
        Collections.addAll(cards, c);
    }

    public int size() {
        return cards.size();
    }
}
