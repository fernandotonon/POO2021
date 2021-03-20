public class App {
    public static void main(String[] args) throws Exception {
        Estudante a = new Estudante();
        a.setNota(6.0f);
        System.out.println(a.isAprovado());
    }
}
