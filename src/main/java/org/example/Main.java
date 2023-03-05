package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        while (x<4) {
            if (x<1) {
                System.out.print("a ");
            }
            x = x - 1;
            if (x<1) {
                System.out.println("noise ");
            }
            x = x + 2;
            if (x==1) {
                System.out.println("annoys");
                                                      }
            x = x + 1;
            if (x>3) {
                System.out.print("an");
            }
                    }
        System.out.print(" oyster");
    }

}