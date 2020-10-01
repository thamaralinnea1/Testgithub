package Figurer;

import java.util.Scanner;

public class Cirkel {
    public static void main(String[] args) {
        double radius,area;
        Scanner input = new Scanner(System.in);
        System.out.println("beregn radius af cirkel");
        radius  = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;
        System.out.println("Cirklens omraade er " + area);
    }
}
