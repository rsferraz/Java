package Java;

import java.util.Scanner;

public class LacoCondicionais {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade;
        boolean cnh;

        System.out.println("Qual sua idade? ");
        idade = ler.nextInt();

        System.out.println("Você tem CNH? True or False");
        cnh = ler.nextBoolean();

        if (idade >= 18 && cnh == true) {
            System.out.println("Você pode dirigir.");
        } else if (idade >= 18 && cnh == false) {
            System.out.println("Você não pode dirigir.");

        } else {
            System.out.println("você não pode dirigir...");
        }

    }

}