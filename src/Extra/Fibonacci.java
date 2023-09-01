package Extra;

class Fibonacci {

   public int calculaFib(int n) {
      return n == 0 ? 0 : n == 1 ? 1 : calculaFib(n - 1) + calculaFib(n - 2);

   }
}