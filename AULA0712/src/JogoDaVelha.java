import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("     -------JOGO DA VELHA-------");
        System.out.println("Digite o número para selecionar um espaço");


        mostrarTabuleiro();
        System.out.println();
        System.out.println("    É a vez do Jogador 1 - X");
        int jogador1 = Input.nextInt();
        //System.out.println(Jogador1); // mostrar resultado selecionado na tela



        mostrarTabuleiro();
        System.out.println();
        System.out.println("     É a vez do Jogador 2 - O");
        int Jogador2 = Input.nextInt();
        //System.out.println(Jogador2);// mostrar resultado selecionado na tela


   }


   public static void mostrarTabuleiro(){
       String Tabuleiro[][] = new String[3][3];
       Tabuleiro[0][0] = "7";
       Tabuleiro[0][1] = "8";
       Tabuleiro[0][2] = "9";

       Tabuleiro[1][0] = "4";
       Tabuleiro[1][1] = "5";
       Tabuleiro[1][2] = "6";

       Tabuleiro[2][0] = "1";
       Tabuleiro[2][1] = "2";
       Tabuleiro[2][2] = "3";

       System.out.printf("\n" +
               "           " + Tabuleiro[0][0] + "\t " +  Tabuleiro[0][1] + "\t   " +  Tabuleiro[0][2] + "\n" + "\n"+
               "           " + Tabuleiro[1][0] + "\t " +  Tabuleiro[1][1] + "\t   " +  Tabuleiro[1][2] + "\n" + "\n"+
               "           " + Tabuleiro[2][0] + "\t " +  Tabuleiro[2][1] + "\t   " +  Tabuleiro[2][2]  + "\n");
   }


   public static void alterarTabuleiro(){


   }




}
