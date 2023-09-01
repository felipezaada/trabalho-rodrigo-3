package Extra;

public class CalcularFibo {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        for (int n = 0; n < 6; n++) {
            int resultado = fibonacci.calculaFib(n);
            System.out.println(resultado);
        }

    }
}