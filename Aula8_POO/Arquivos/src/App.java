/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tonon
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            Path uri = Paths.get(".\\src");
            if(Files.exists(uri))
            {
                    System.out.printf("Tamanho: %s%n", Files.size(uri));
                    System.out.printf("Data da Última Modificação: %s%n", Files.getLastModifiedTime(uri));
                    System.out.printf("Caminho: %s%n", uri.toAbsolutePath());
                    if(Files.isDirectory(uri)){
                        DirectoryStream<Path> diretorio = Files.newDirectoryStream(uri);
                        for(Path p:diretorio){
                            System.out.println(p);
                        }
                    }
            }
            else
            {
                System.out.println("URI não existe");
            }
        } catch (IOException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}