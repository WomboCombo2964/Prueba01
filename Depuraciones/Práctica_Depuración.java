package Depuraciones;

import java.util.Scanner;

public class Práctica_Depuración {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número por la consola y te diré el doble");

        int num_usuario = scanner.nextInt();

        scanner.close();

        int resultado = num_usuario*2;

        System.out.println("El doble de su número será "+resultado);

    }
}
