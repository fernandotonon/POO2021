public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
    public void trabalha() {
        System.out.println("trabalha");
    }
    public void ensina() {
        System.out.println("ensina");
    }
    public void pagaIR() {
        System.out.println("pagaIR");
    }
    public void getCPF() {
        System.out.println("getCPF");
    }
    public void vota() {
        System.out.println("vota");
    }
    public void getRG() {
        System.out.println("getRG");
    }
}
