package Array;

import java.util.Scanner;

// 10 alunos, 4 bimestres, 1 média
public class vetores4 {
    public static void main(String[] args) {
    
    Scanner lerr = new Scanner(System.in);

    int alunos[][] = new int [10][4];
    double media[] = new double [10];
    
    for (int alu = 0; alu < 10; alu++){
        for (int not = 0; not < 4; not++){
            System.out.println("digite a nota do " + (alu +1) + " aluno do bimestre " + (not +1));
            alunos[alu][not] = lerr.nextInt();
        }
    

    for (int not = 0; not < 10;not++){
        media[not] = (alunos[not][0] + alunos[not][1] + alunos[not][2] + alunos[not][3])/4;
    }
}
    for (int ixtudante = 0; ixtudante < 10; ixtudante++){
        if (media[ixtudante]> 7) {
            System.out.println("as maiores médias são:");
            System.out.println("a média do " + (ixtudante +1) + " aluno é " + media[ixtudante]);
        }
    }
    lerr.close();
}
    
}