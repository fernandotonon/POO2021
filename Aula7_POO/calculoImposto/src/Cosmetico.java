public class Cosmetico extends Produto{
    @Override
    public double calcularICMS() {
        return getPreco()*0.25;
    }
}
