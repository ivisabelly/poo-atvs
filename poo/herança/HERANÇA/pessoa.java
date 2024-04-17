import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class pessoa {
    private String nome;
    private int datual;
    private int nascimento;
    public String apelido = "";
    
    public pessoa(String nome, int nascimento) {
        this.nome = nome;
        this.nascimento= nascimento;
    }
    private int Calculaidade() {
          return(datual = LocalDate.now().getYear() - this.nascimento);
    }

    public String saudacao() {
        LocalTime horinha = LocalTime.now();
        int hora = horinha.getHour();
        String horao = horinha.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        if (hora >= 5 && hora <= 11) {
        return horao+"bom dia, me chamo ," + this.nome + "mas meu apelido é " + this.apelido + "tenho " + this.Calculaidade()+ "anos.";
        }
        else if (hora >= 12 && hora <= 18) {
        return horao+"boa tarde, me chamo ," + this.nome + "mas meu apelido é " + this.apelido + "tenho " + this.Calculaidade()+ "anos.";
        }
        else if (hora >= 19 && hora <= 23) {
        return horao+"boa noite, me chamo ," + this.nome + "mas meu apelido é " + this.apelido + "tenho " + this.Calculaidade()+ "anos.";
        }
        else if (hora>= 00 && hora <=4) {
        return horao+"vai dormir seu bosta";    
        }
        else{
        return "ta chapano doidao tá tudo errado";   
        }
    }
    public static void main(String[] args) {
        pessoa barbie = new pessoa("juscelio", 1542);
         System.out.println(); barbie.saudacao();
}
}
