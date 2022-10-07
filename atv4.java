import java.util.Scanner;

public class atv4 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        //variaveis
        int notaUm;
        int notaDois;
        int notaTres;
        int notaQuatro;
        int notaFinal;

        
        //Entrada de dados
        System.out.print("Insira a primeira nota ");
        notaUm = teclado.nextInt();
        System.out.print("Insira a segunda nota ");
        notaDois = teclado.nextInt();
        System.out.print("Insira a terceira nota ");
        notaTres = teclado.nextInt();
        System.out.print("Insira a quarta nota ");
        notaQuatro = teclado.nextInt();
        teclado.close();

        //Processamento de dados

        notaFinal = (notaUm+notaDois+notaTres+notaQuatro)/4;

        //Saida de dados

        System.out.print("A media das notas é "+ notaFinal+"");

        


 }
}