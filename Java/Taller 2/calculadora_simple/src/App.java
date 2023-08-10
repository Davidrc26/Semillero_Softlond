public class App {
    public static void main(String[] args) throws Exception {
        
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(170, 19));
        System.out.println(calc.restar(1, 2, 4, -5));
        System.out.println(calc.multiplicar(25, 610));
        try {
            System.out.println(calc.dividir(3, 4));
        } catch (ArithmeticException e) {
            System.out.println("No es posible dividir por entre 0. Detalles: \n" + e.getMessage());
        }

    }
}
