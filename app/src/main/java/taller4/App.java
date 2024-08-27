package taller4;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        // Llamar a cada función y imprimir el resultado
        System.out.println("1. Números impares:");
        System.out.println(imprimirNumerosImpares(200));

        System.out.println("\n2. Serie de Fibonacci:");
        System.out.println(serieFibonacci(10));

        System.out.println("\n3. Raíz cuadrada de un número aleatorio:");
        int cantidad = (int) (Math.random() * 10) + 20;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(raizCuadradaAleatoria());
        }

        System.out.println("\n4. Números pares generados:");
        System.out.println(contarNumerosPares(1, 100));

        System.out.println("\n5. Suma de números aleatorios:");
        System.out.println(sumarNumerosAleatorios(10));

        System.out.println("\n6. Sorteo de lotería:");
        System.out.println(sorteoLoteria());
    }

    // 1. Función que imprime números impares desde 1 hasta un número dado
    public static String imprimirNumerosImpares(int n) {
        if (n < 100 || n > 500) {
            return "Error: El número debe estar entre 100 y 500";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sb.append(i).append(", ");
                if (i % 8 == 0) {
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    // 2. Función que devuelve la serie de Fibonacci hasta un número dado
    public static String serieFibonacci(int n) {
        if (n < 2) {
            return "Error: El número debe ser mayor que 2";
        }
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            sb.append(a).append(", ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        return sb.toString();
    }

    // 3. Función que devuelve la raíz cuadrada de un número aleatorio
    public static double raizCuadradaAleatoria() {
        Random rand = new Random();
        int numero = rand.nextInt(354) + 2;
        return Math.sqrt(numero);
    }

    // 4. Función que cuenta los números pares generados en un rango
    public static String contarNumerosPares(int inicio, int fin) {
        if (inicio >= fin) {
            return "Error: El rango es inválido";
        }
        int contador = 0;
        Random rand = new Random();
        for (int i = 0; i < 900; i++) {
            int numero = rand.nextInt(fin - inicio) + inicio;
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return "Se generaron " + contador + " números pares";
    }

    // 5. Función que suma números aleatorios
    public static int sumarNumerosAleatorios(int cantidad) {
        Random rand = new Random();
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += rand.nextInt(100);
        }
        return suma;
    }

    // 6. Función que simula un sorteo de lotería
    public static String sorteoLoteria() {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i = 20; i > 0; i--) {
            int numero = rand.nextInt(10000);
            int serie = rand.nextInt(51) + 100;
            if (i > 5) {
                if (i == 20) {
                    sb.append("======PREMIOS MENORES=======\n");
                }
                sb.append("Sorteo # ").append(i).append(" - Número Premiado ").append(String.format("%04d", numero)).append(" - Serie ").append(serie).append("\n");
            } else if (i > 1) {
                if (i == 5) {
                    sb.append("======PREMIOS SECOS=========\n");
                }
                sb.append("Sorteo # ").append(i).append(" - Número Premiado ").append(String.format("%04d
