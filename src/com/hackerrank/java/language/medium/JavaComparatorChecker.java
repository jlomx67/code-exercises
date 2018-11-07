package com.hackerrank.java.language.medium;

import java.util.Comparator;

public class JavaComparatorChecker implements Comparator<JavaComparatorPlayer> {

    @Override
    public int compare(JavaComparatorPlayer player1, JavaComparatorPlayer player2) {
        if(player1.score == player2.score){
            return player1.name.compareTo(player2.name);
        } else {
            return player2.score - player1.score;
        }
    }
}
