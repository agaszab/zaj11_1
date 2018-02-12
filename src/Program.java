import java.util.Scanner;

public class Program {

    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        String liczba=scan.nextLine();
        Integer integer= Integer.valueOf(liczba);
        int integer2=integer;
        System.out.println(integer2);

        System.out.println("Podaj liczbę:");
        String liczba3=scan.nextLine();
        Double dob=Double.valueOf(liczba3);
        double dob2=dob;
        System.out.println(dob2);



    }
}
