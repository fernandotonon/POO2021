public class Alimento extends Produto{
    @Override
    public double calcularICMS() {
        return getPreco()*0.12;
    }
}
