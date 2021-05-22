import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author tonon
 */
public class ManipulaArquivo {
    public static void main(String[] args) {
        Formatter arquivoEscrita;
        try {
            arquivoEscrita = new Formatter("arquivo.txt");        
            arquivoEscrita.format("%s %d %n", "teste", 1);
            arquivoEscrita.close();
            
            Scanner arquivoLeitura = new Scanner(Paths.get("arquivo.txt"));
            while(arquivoLeitura.hasNext()){
                System.out.printf("%s %d %n", arquivoLeitura.next(), arquivoLeitura.nextInt());
            }
            arquivoLeitura.close();


            Classe1 c1 = new Classe1();
            c1.setA("Teste asd");
            c1.setB(10);

            Path uri = Paths.get("obj.serializado");
            ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(uri));
            os.writeObject(c1);

            ObjectInputStream is = new ObjectInputStream(Files.newInputStream(uri));
            Classe1 c2 = (Classe1)is.readObject();
            is.close();
            System.out.println(c2.getA());
            System.out.println(c2.getB());

        } catch (Exception ex) {            
        }
    }
}