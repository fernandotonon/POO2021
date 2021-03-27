public class App {
    public static void main(String[] args) throws Exception {
        Aluno a = new Aluno("Fernando");
        Aluno b = new Aluno("Fernando2",7.0);
        Aluno c = new Aluno();
        a.setNome("nome");
        System.out.println(a.getNome()+" "+a.isAptoGraduar());
        a.setNota(7.0);
        System.out.println(a.mesmaNota(b));
        System.out.println(a.getNome()+" "+a.isAptoGraduar());
    }
}
