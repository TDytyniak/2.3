import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    System.out.println("Podaj liczbę a: ");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    System.out.println("Podaj liczbę b: ");
    double b = scanner.nextDouble();
    double skladnik1 = Math.pow(a, b);
    double skladnik2 = Math.pow(b, a);
    double suma = skladnik1 + skladnik2;
    System.out.println(suma);
    
  }
}