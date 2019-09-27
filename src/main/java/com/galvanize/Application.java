package com.galvanize;

public class Application {

    public static void main(String[] args) {
        for(int i=2; i<=6; i++) {
            if (i % 2 == 0 ) System.out.println(i);
        }

        Table roundTable = new Table();
        roundTable.setShape("round");

        System.out.println(roundTable);

    }
}
