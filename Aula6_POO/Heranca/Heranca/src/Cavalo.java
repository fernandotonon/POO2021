public class Cavalo extends Animal{
    public void correr(){
        System.out.println("Cavalo correndo");
    }
    @Override
    public String emitirSom() {
        return "Relincha";
    }
}
