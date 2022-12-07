import java.util.Scanner;

public class projeto {
    public static void main(String[] args){


        int v = 0 , n = 0;
        String linha1 ,linha2, linha3 , coluna1, coluna2, coluna3,diagonal1,diagonal2;
        String s ;

        Scanner ler = new Scanner(System.in);

        String m [][]= new String[3][3];

        m[0][0]="7";
        m[0][1]="8";
        m[0][2]="9";


        m[1][0]="4";
        m[1][1]="5";
        m[1][2]="6";


        m[2][0]="1";
        m[2][1]="2";
        m[2][2]="3";


        System.out.printf("O jogo esta iniciando");

        System.out.printf("\n" +
                m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );

        while (n <= 9){
            linha1 =  m[0][0] + m[0][1] + m[0][2];
            linha2 = m[1][0] + m[1][1] + m[1][2];
            linha3 = m[2][0] + m[2][1] + m[2][2];

            coluna1 = m[0][0] + m[1][0] + m[2][0];
            coluna2 = m[0][1] + m[1][1] + m[2][1];
            coluna3 = m[0][2] + m[1][2] + m[2][2];

            diagonal1 = m[0][0] + m[1][1] + m[2][2];
            diagonal2 = m[0][2] + m[1][1] + m[2][0];      
            

            if (linha1.equals("XXX") ||  linha2.equals("XXX") || linha3.equals("XXX")||
                    coluna1.equals("XXX") ||  coluna2.equals("XXX") || coluna3.equals("XXX")||
                    diagonal1.equals("XXX") || diagonal2.equals("XXX")){
                System.out.printf("\n X venceu");
                break;
            }
            if (linha1.equals("000") ||  linha2.equals("000") || linha3.equals("000")||
                    coluna1.equals("000") ||  coluna2.equals("000") || coluna3.equals("000")||
                    diagonal1.equals("000") || diagonal2.equals("000")){
                System.out.printf("\n 0 venceu");
                break;
            }

            if ( n %2==0){
                s = "X";
            } else {
                s = "0";
            }

            if ( n > 8){
                System.out.printf("deu tua mae");
            }else {
                v = ler.nextInt();
            }

            if (v == 1 && (m[2][0].equals("1"))){
                m[2][1] = s;

                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[0][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;
            }if (v == 2 && (m[2][1].equals("2"))){
                m[2][1] = s;

                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;


        }if (v == 3 && (m[2][2].equals("3"))){
                m[2][2] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;


            }if (v == 4 && (m[1][0].equals("4"))){
                m[1][0] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;


            }if (v == 5 && (m[1][1].equals("5"))){
                m[1][1] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;


            }if (v == 6 && (m[1][2].equals("6"))){
                m[1][2] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;


            }if (v == 7 && (m[0][0].equals("7"))){
                m[0][0] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;


            }if (v == 8 && (m[0][1].equals("8"))){
                m[0][1] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;


            }if (v == 9 && (m[0][2].equals("9"))){
                m[0][2] = s;
                //Exibindo as posisçoes
                System.out.printf("\n" +
                        m[0][0] + "\t" +  m[0][1] + "\t" +  m[0][2] + "\n" + "\n"+
                        m[1][0] + "\t" +  m[1][1] + "\t" +  m[1][2] + "\n" + "\n"+
                        m[2][0] + "\t" +  m[2][1] + "\t" +  m[2][2] );
                n++;
                continue;


            }else {
                System.out.printf("A posição" + v +"ja esta preenchida.");
                System.out.printf("Digite outra posição e precione enter:");

        }
}
}
}
