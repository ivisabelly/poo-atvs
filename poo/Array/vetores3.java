package Array;

public class vetores3 {
    public static void main(String[] args) {
        
        String letras[] = {"humberto","Mozean","Ariely"}; //todo vetor começa no 0 - obrigadp savio

        for(String palavras : letras){
            System.out.println("nessa palavra " + palavras + " tem as vogais:");

            String vogais = palavras.replaceAll("[^aeiouAEIOU]", ""); // se removemos o "^" ele exclui as vogais i vai mostrar as consoantes
            System.out.println(vogais);
        }
    }
   
}
