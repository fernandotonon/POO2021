import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> jaulas = new ArrayList<Animal>();
    public void adicionarAnimal(Animal animal){
        jaulas.add(animal);
    }
    public void executaAcoes(){
        for(Animal a:jaulas){
            System.out.println(a.emitirSom());
            if(a instanceof Cachorro){
                Cachorro cachorro = (Cachorro)a;
                cachorro.correr();
            }
            else if(a instanceof Cavalo){
                ((Cavalo)a).correr();
            }
        }
    }
}
