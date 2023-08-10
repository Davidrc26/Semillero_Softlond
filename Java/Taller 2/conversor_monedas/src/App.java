public class App {
    public static void main(String[] args) throws Exception {
        // pruebas
        ConversorMonedas conversor = new ConversorMonedas();
        System.out.println("100 USD a COP: " + conversor.convertir(100, 4000));
        System.out.println("100 USD a EUR: " + conversor.convertir(100, 0.91));
        System.out.println("100 USD a MXN: " + conversor.convertir(100, 17.06));

    }
}
