import java.util.Scanner;
public class bomdiahora {
    public  static  void  main ( String [] args ) {
        Scanner  scanner = new  Scanner ( System.in );

        System.out.println("me diz a hora aí(0 até 23):");
        int horao = scanner.nextInt();

        if ( horao >= 5 && horao <= 11 ) {
            System.out.println("bom dia mano");
            }
            else  if ( horao >= 12 && horao <= 18 ) {
            System.out.println("boa tarde meu mano");
            }
            else  if ( horao >= 19 && horao <= 23 ) {
            System.out.println("boa noite minha vea");
            }
            else  if ( horao >= 00 && horao <= 4 ) {
            System.out.println("vai dormir seu boxta");
            }
            else {
            System.out.println("bota o número direito lesado");
            }

            scanner.close();
    }
    
}
