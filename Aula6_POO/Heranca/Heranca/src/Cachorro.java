public class Cachorro extends Animal{
    public void correr(){
        System.out.println("Cachorro correndo");
    }
    @Override
    public String emitirSom() {
        return "Au Au!";
    }
}
