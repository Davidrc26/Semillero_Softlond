public class ConversorMonedas {
    /**
     * Convierte una cantidad de una moneda a otra según una tasa de conversión.
     * @param cantidad 
     * @param tasa 
     * @return cantidad convertida
     */
    public double convertir(double cantidad, double tasa) {
        return cantidad * tasa;
    }
}