import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        // Ejercicio 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La suma de los numeros es: " + (num1 + num2));
        System.out.println("La resta de los numeros es: " + (num1 - num2));
        System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
        System.out.println("La division de los numeros es: " + (num1 / num2));
        sc.close();

        // Ejercicio 2
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc2.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        sc2.close();

        // Ejercicio 3
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = sc3.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + perimetro);
        sc3.close();

        // Ejercicio 4
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc4.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        sc4.close();

        // Ejercicio 5
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1_5 = sc5.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2_5 = sc5.nextInt();
        if (num1_5 > num2_5) {
            System.out.println("El numero mayor es: " + num1_5);
        } else {
            System.out.println("El numero mayor es: " + num2_5);
        }
        sc5.close();

        // Ejercicio 6
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num6 = sc6.nextInt();
        if (num6 > 0) {
            System.out.println("El numero es positivo");
        } else if (num6 < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
        sc6.close();

        // Ejercicio 7
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num7 = sc7.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num7 + " x " + i + " = " + (num7 * i));
        }
        sc7.close();

        // Ejercicio 8
        Scanner sc8 = new Scanner(System.in);
        int num8 = (int) (Math.random() * 100 + 1);
        int num8_2 = 0;
        while (num8 != num8_2) {
            System.out.println("Ingrese un numero: ");
            num8_2 = sc8.nextInt();
            if (num8_2 > num8) {
                System.out.println("El numero ingresado es mayor");
            } else if (num8_2 < num8) {
                System.out.println("El numero ingresado es menor");
            }
        }
        System.out.println("Adivinaste el numero");
        sc8.close();

        // Ejercicio 9
        Scanner sc9 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num9 = sc9.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num9; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num9 + " es: " + factorial);
        sc9.close();

        // Ejercicio 10
        int num10 = 0;
        int num10_2 = 1;
        int num10_3 = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println(num10);
            num10_3 = num10 + num10_2;
            num10 = num10_2;
            num10_2 = num10_3;
        }

        // Ejercicio 11
        Scanner sc11 = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triangulo: ");
        double lado1 = sc11.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo: ");
        double lado2 = sc11.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo: ");
        double lado3 = sc11.nextDouble();
        double s = (lado1 + lado2 + lado3) / 2;
        double area11 = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        System.out.println("El area del triangulo es: " + area11);
        sc11.close();

        // Ejercicio 12
        Scanner sc12 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num12 = sc12.nextInt();
        int contador = 0;
        for (int i = 1; i <= num12; i++) {
            if (num12 % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
        sc12.close();

        // Ejercicio 13

        Scanner sc13 = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal: ");
        double num13 = sc13.nextDouble();
        System.out.println("Ingrese la cantidad de decimales: ");
        int decimales = sc13.nextInt();
        System.out.println("El numero redondeado es: " + String.format("%." + decimales + "f", num13));
        sc13.close();

        // Ejercicio 14

        Scanner sc14 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num14 = sc14.nextInt();
        int suma = 0;
        for (int i = 1; i < num14; i++) {
            if (num14 % i == 0) {
                suma += i;
            }
        }
        if (suma == num14) {
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero no es perfecto");
        }
        sc14.close();

        // Ejercicio 15
        Scanner sc15 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num15 = sc15.nextInt();
        int num15_2 = num15;
        int num15_3 = 0;
        while (num15_2 != 0) {
            num15_3 = num15_3 * 10 + num15_2 % 10;
            num15_2 /= 10;
        }
        if (num15 == num15_3) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
        sc15.close();

        // Ejercicio 16
        Scanner sc16 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num16 = sc16.nextInt();
        int num16_2 = 0;
        int num16_3 = 1;
        int num16_4 = 0;
        for (int i = 0; i < num16; i++) {
            System.out.println(num16_2);
            num16_4 = num16_2 + num16_3;
            num16_2 = num16_3;
            num16_3 = num16_4;
        }
        sc16.close();

        // Ejercicio 17

        Scanner sc17 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num17 = sc17.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num17_2 = sc17.nextInt();
        int cont = 0;
        for (int i = num17; i <= num17_2; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(i);
            }
            cont = 0;
        }
        sc17.close();

        // Ejercicio 18

        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteres = mayusculas + minusculas + numeros;
        int longitud = 8;
        Random random = new Random();
        char[] password = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            password[i] = caracteres.charAt(random.nextInt(caracteres.length()));
        }
        System.out.println(password);

        // Ejercicio 19

        Scanner sc19 = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc19.nextLine();
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        sc19.close();

        // Ejercicio 20

        Scanner sc20 = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = sc20.nextLine();
        String cadena2 = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadena2 += cadena.charAt(i);
        }
        System.out.println(cadena2);
        sc20.close();

        // Ejercicio 21

        Scanner sc21 = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena21 = sc21.nextLine();
        System.out.println("Ingrese una letra: ");
        String letra = sc21.nextLine();
        int index = 0;
        for (int i = 0; i < cadena21.length(); i++) {
            if (cadena21.charAt(i) == letra.charAt(0)) {
                index++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + index + " veces");
        sc21.close();

        // Ejercicio 22

        Scanner sc22 = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc22.nextLine();
        String frase2 = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            frase2 += frase.charAt(i);
        }
        if (frase.equals(frase2)) {
            System.out.println("La frase es palindromo");
        } else {
            System.out.println("La frase no es palindromo");
        }
        sc22.close();

        // Ejercicio 23

        Scanner sc23 = new Scanner(System.in);
        System.out.println("Ingrese una oracion: ");
        String oracion = sc23.nextLine();
        String[] palabras = oracion.split(" ");
        System.out.println("La oracion tiene " + palabras.length + " palabras");
        sc23.close();

        // Ejercicio 24

        Scanner sc24 = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena24 = sc24.nextLine();
        System.out.println("Ingrese una letra: ");
        String letra24 = sc24.nextLine();
        System.out.println("Ingrese una letra para reemplazar: ");
        String letra24_2 = sc24.nextLine();
        String cadena24_2 = "";
        for (int i = 0; i < cadena24.length(); i++) {
            if (cadena24.charAt(i) == letra24.charAt(0)) {
                cadena24_2 += letra24_2;
            } else {
                cadena24_2 += cadena24.charAt(i);
            }
        }
        System.out.println(cadena24_2);
        sc24.close();

        // Ejercicio 25

        Scanner sc25 = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase25 = sc25.nextLine();
        String[] palabras25 = frase25.split(" ");
        for (int i = 0; i < palabras25.length; i++) {
            System.out.println(palabras25[i]);
        }
        sc25.close();

        // Ejercicio 26

        Scanner sc26 = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena26 = sc26.nextLine();
        int cont26 = 0;
        for (int i = 0; i < cadena26.length(); i++) {
            if (cadena26.charAt(i) != ' ') {
                cont26++;
            }
        }
        System.out.println("La cadena tiene " + cont26 + " caracteres sin contar los espacios en blanco");
        sc26.close();

        // Ejercicio 27
        Scanner sc27 = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase27 = sc27.nextLine();
        String[] palabras27 = frase27.split(" ");
        Arrays.sort(palabras27);
        for (int i = 0; i < palabras27.length; i++) {
            System.out.println(palabras27[i]);
        }
        sc27.close();

        // Ejercicio 28

        int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println(sum);

        // Ejercicio 29

        int[] arreglo_29 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int max = 0;
        for (int i = 0; i < arreglo_29.length; i++) {
            if (arreglo_29[i] > max) {
                max = arreglo_29[i];
            }
        }
        System.out.println(max);

        // Ejercicio 30

        int[] arreglo_30 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arreglo_30_2 = new int[arreglo_30.length];
        int cont_30 = 0;
        for (int i = 0; i < arreglo_30.length; i++) {
            for (int j = 0; j < arreglo_30_2.length; j++) {
                if (arreglo_30[i] == arreglo_30_2[j]) {
                    cont_30++;
                }
            }
            if (cont_30 == 1) {
                arreglo_30_2[i] = arreglo_30[i];
            }
            cont_30 = 0;
        }

        System.out.println(Arrays.toString(arreglo_30_2));

        // Ejercicio 31

        int[] arreglo_31 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int aux = 0;
        for (int i = 0; i < arreglo_31.length; i++) {
            for (int j = 0; j < arreglo_31.length - 1; j++) {
                if (arreglo_31[j] > arreglo_31[j + 1]) {
                    aux = arreglo_31[j];
                    arreglo_31[j] = arreglo_31[j + 1];
                    arreglo_31[j + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(arreglo_31));

        // Ejercicio 32

        int[] arreglo_32 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int num_32 = 0;
        Scanner sc32 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num_32 = sc32.nextInt();
        for (int i = 0; i < arreglo_32.length; i++) {
            if (arreglo_32[i] == num_32) {
                System.out.println("El numero " + num_32 + " se encuentra en el indice " + i);
            }
        }
        sc32.close();

        // Ejercicio 33

        int[] arreglo_33 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arreglo_33_2 = new int[arreglo_33.length];
        int cont_33 = 0;
        for (int i = 0; i < arreglo_33.length; i++) {
            for (int j = 0; j < arreglo_33_2.length; j++) {
                if (arreglo_33[i] == arreglo_33_2[j]) {
                    cont_33++;
                }
            }
            if (cont_33 == 1) {
                arreglo_33_2[i] = arreglo_33[i];
            }
            cont_33 = 0;
        }
        int[] arreglo_33_3 = new int[arreglo_33_2.length];
        int cont_33_2 = 0;
        for (int i = 0; i < arreglo_33_2.length; i++) {
            for (int j = 0; j < arreglo_33.length; j++) {
                if (arreglo_33_2[i] == arreglo_33[j]) {
                    cont_33_2++;
                }
            }
            arreglo_33_3[i] = cont_33_2;
            cont_33_2 = 0;
        }
        System.out.println(Arrays.toString(arreglo_33_2));
        System.out.println(Arrays.toString(arreglo_33_3));

        // Ejercicio 34
        int[] arreglo_35 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arreglo_35_2 = new int[arreglo_35.length];
        int num_35 = 0;
        Scanner sc35 = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num_35 = sc35.nextInt();
        for (int i = 0; i < arreglo_35.length; i++) {
            if (i + num_35 < arreglo_35.length) {
                arreglo_35_2[i] = arreglo_35[i + num_35];
            } else {
                arreglo_35_2[i] = arreglo_35[i + num_35 - arreglo_35.length];
            }
        }
        System.out.println(Arrays.toString(arreglo_35_2));
        sc35.close();

        // Ejercicio 35

        int[][] arreglo_36 = new int[10][10];
        for (int i = 0; i < arreglo_36.length; i++) {
            for (int j = 0; j < arreglo_36.length; j++) {
                arreglo_36[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < arreglo_36.length; i++) {
            System.out.println(Arrays.toString(arreglo_36[i]));
        }

    }
}