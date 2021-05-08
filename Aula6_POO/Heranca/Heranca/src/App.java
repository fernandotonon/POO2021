public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();

        /*Veterinario vet = new Veterinario();

        vet.examinar(cachorro);
        vet.examinar(cavalo);
        vet.examinar(preguica);
*/
        Zoologico zoo = new Zoologico();

        zoo.adicionarAnimal(cachorro);
        zoo.adicionarAnimal(cachorro);
        zoo.adicionarAnimal(cavalo);
        zoo.adicionarAnimal(cavalo);
        zoo.adicionarAnimal(cavalo);
        zoo.adicionarAnimal(cachorro);
        zoo.adicionarAnimal(cachorro);
        zoo.adicionarAnimal(preguica);
        zoo.adicionarAnimal(preguica);
        zoo.adicionarAnimal(preguica);

        zoo.executaAcoes();

    }
}
