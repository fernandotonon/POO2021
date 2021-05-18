public class App {
    public static void main(String[] args) throws Exception {
        Cosmetico esmalte = new Cosmetico();
        esmalte.setCodigo(1);
        esmalte.setDescricao("Produto para pintar unhas");
        esmalte.setPreco(5.5);

        Alimento baguncinha = new Alimento();
        baguncinha.setCodigo(2);
        baguncinha.setDescricao("Sanduiche muito bom");
        baguncinha.setPreco(7.5);

        System.out.println(esmalte);
        System.out.println(baguncinha);
    }
}
