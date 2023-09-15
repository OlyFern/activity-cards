package com.csc205.activity;

public interface Deck {

    void cut(int index);
    Card deal();
    void newOrder(Deck deck);
    int search(Card card);
    void shuffle();
    int size();
    Card turnOver();

}
