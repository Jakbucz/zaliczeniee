import java.util.Scanner;


class Main {
  public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
   
    System.out.print("Podaj rok urodzenia: ");
    int a = scanner.nextInt();

    System.out.print("Podaj który mamy rok: ");
    int b = scanner.nextInt();

    int wiek = b - a;

    System.out.print("Wiek wynosi: " + wiek + " lat ");
  
  }
}
