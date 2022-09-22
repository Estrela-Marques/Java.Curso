package br.com.letscode.java;

public class LacosNumericos {

    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        // Para uma variável que incia em 1, e vai ate 10, mudando 1 po 1, faça:

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + "x" + i + " = " + j * i);
            }
        }
    }
}
