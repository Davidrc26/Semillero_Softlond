
public class Calculadora {

    /**
     * suma cualquier cantidad de números enteros y devuelve el resultado
     * @param numeros  números enteros a sumar
     * @return  resultado de la suma
     */
    public int sumar(int ... numeros) {
        int resultado = 0;
        for (int i : numeros) {
            resultado += i;
        }
        return resultado;
    }

    
    /**
     * resta cualquier cantidad de números enteros y devuelve el resultado
     * @param numeros números enteros a restar
     * @return resultado de la resta
     */
    public int restar(int ... numeros) {
        int resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }
     
    /**
     * multiplica cualquier cantidad de números enteros y devuelve el resultado
     * @param numeros números enteros a multiplicar
     * @return resultado de la multiplicación
     */
    public int multiplicar(int ... numeros) {
        int resultado = 1;
        for (int i : numeros) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * divide dos números enteros y devuelve el resultado
     * @param a dividendo
     * @param b divisor
     * @return resultado de la división
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        } else {
            return a / b;
        }
      
    }

}