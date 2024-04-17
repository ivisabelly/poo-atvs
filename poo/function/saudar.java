package function;
import java.util.Scanner;

public class saudar {
    
    public static void main(String[] args) {
        Saudação();
    }

    public static void Saudação(){
        System.out.println("bom diaw!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("oi, " + nome);
        scanner.close();
    }
}
