package br.com.letscode.java;

import java.sql.SQLOutput;

public class EstruturasCondicionais2 {

    public static void main(String[] args) {

        int nota = 80;
        String graduacao;

        // A 80; B 70; C 60; D 0
        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "null";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Graduação inválida");
        }

    }

}
