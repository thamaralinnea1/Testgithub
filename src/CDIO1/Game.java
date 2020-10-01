package CDIO1;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        //opretter 4 terninger så spillerne får to hver

        Dice Dice1 =new Dice();
        Dice Dice2 = new Dice();
        Dice Dice3 = new Dice();
        Dice Dice4 = new Dice();


        //summen af terningerne der bliver slået
        int sum1;
        int sum2;

        //Holder styr på spiller 1 og spiller 2's sum i løbet af spillet
        int p1sum=0;
        int p2sum=0;

        //While loop der kører indtil spiller 1 og 2's sum er større eller lig med 40
        while (p1sum <=40 && p2sum <=40) {
            Scanner input = new Scanner(System.in);
            System.out.println("press r and enter to roll dice");
            String roll = input.nextLine();

            if (roll.equals("r")) {

                Dice1.roll();
                Dice2.roll();
                Dice3.roll();
                Dice4.roll();

                sum1 = Dice1.getFacevalue() + Dice2.getFacevalue();
                sum2 = Dice3.getFacevalue() + Dice4.getFacevalue();

                //når en spiller spiller med to terninger skal det integrere det tal der er blevet slået.
                int dienr1 = Dice1.getFacevalue();
                int dienr2 = Dice2.getFacevalue();
                int dienr3 = Dice3.getFacevalue();
                int dienr4 = Dice4.getFacevalue();

                // vi laver boolean for at hvis en spille får to ens.
                boolean toens1 = false;
                boolean toens2 = false;

                // tjek hvis tallet slår to 1'ere

                if (dienr1 == 1 && dienr2 == 1) {
                    toens1 = true;
                } else if (dienr3 == 1 && dienr4 == 1) {
                    toens2 = true;
                } else if (dienr1 == 3 && dienr2 == 3) {
                    toens1 = true;
                } else if (dienr3 == 3 && dienr4 == 3) {
                    toens2 = true;
                } else if (dienr1 == 5 && dienr2 == 5) {
                    toens1 = true;
                } else if (dienr3 == 5 && dienr4 == 5) {
                    toens2 = true;
                } else
                    // Programmet lægger den gamle og den nye sum sammen som er p1sum og p2sum, med mindre det er to 1'ere.
                    p1sum = p1sum + sum1;
                p2sum = p2sum + sum2;
                System.out.println("Player 1: " + "Die One: " + Dice1 + ", Die Two: " + Dice2);
                System.out.println("Player 1 total = " + p1sum);
                System.out.println("Player 2: " + "Die One: " + Dice3 + ", Die Two: " + Dice4);
                System.out.println("Player 2 total = " + p2sum);
            }
            }
            }
        }

