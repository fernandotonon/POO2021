import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /*int[] listaInt = new int[10];

        //int[] listaInt = {5,15,35};

        for(int i=0;i<listaInt.length;i++)
            listaInt[i]=i*2;
        System.out.println(Arrays.toString(listaInt));*/


        int qtdLinhas = 10;
        int qtdColunas = 3;
        int[][] notas= new int[qtdLinhas][qtdColunas];
        notas[0][0]=5;
        notas[0][1]=8;
        notas[0][2]=4;
        for(int i=0; i<qtdLinhas;i++){
            for(int j=0; j<qtdColunas; j++){
                System.out.println(notas[i][j]);
            }
        }

        /*ArrayList<Integer> lista=new ArrayList<Integer>();
        lista.add(1);
        lista.add(5);
        System.out.println(lista);

        String s;
        boolean result = s.startsWith("");
        */

    }
}
