/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author tonon
 */
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JogoInterface jogo;        
        while(true){
            System.out.println("Escolha o jogo: \n 0 - MaiorMenor \n 1 - CaraCoroa");
            Scanner s = new Scanner(System.in);
            int numero = s.nextInt();
            switch(numero){
                case 0:
                    jogo=new MenorMaior();
                    break;
                case 1:
                    jogo=new CaraCoroa();
                    break;
                default:
                    jogo=new MenorMaior();
            }

            System.out.println(jogo.jogar());
            
            System.out.println("Continuar jogando? s/n");
            if(s.next().equals("n"))
                jogo.abortar();
            s.close();
        }
    }
    
}
