public class MinhaClasse {
    static int valorGlobal = 1;
    int outroValor = 1;
    public static int getValorGlobal() {
        MinhaClasse a = new MinhaClasse();
        return a.outroValor;
    } 
    public int getOutroValor(){
        return outroValor;
    }
    public static int RGBToGray(int R, int G, int B) {
        return (R+G+B)/3;
    } 
}
