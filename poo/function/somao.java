package function;
import java.util.Scanner;
public class somao {

    public static void main(String[] args) {
        calcula();
    }


    public static void calcula() {
        Scanner lerr = new Scanner(System.in);

        System.out.println("escreve um numero ai: ");
        int num1 = lerr.nextInt();
        System.out.println("escreve um numero ai: ");
        int num2 = lerr.nextInt();
        
        System.out.println("escolha: \n 1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        int num3 = lerr.nextInt();

        if (num3 == 1) {
            System.out.println((num1 + num2));
            
        }
        else if  (num3 == 2) {
            System.out.println((num1 - num2));
        }
        else if (num3 == 3){
            System.out.println((num1 * num2));
        }
        else if (num3 == 4){
            System.out.println((num1 / num2));
        }
        else{
            System.out.println("nao tem nada somano nao");
        }
        lerr.close();
    }
} 
