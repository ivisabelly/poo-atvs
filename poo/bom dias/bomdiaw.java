import java.util.Scanner;
public class bomdiaw {
    public static void main(String[] args) {
        
        System.out.println("bom diaw!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("oi, " + nome);
        scanner.close();
        
        
    }
}