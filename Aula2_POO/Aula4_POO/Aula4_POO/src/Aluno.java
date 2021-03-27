public class Aluno {
    private String nome;
    private double nota;
    private int faltas;
    private boolean aptoGraduar;

    private Aluno(String nome, double nota, int faltas, boolean aptoGraduar) {
        this.nome = nome.toUpperCase();
        this.nota = nota>=0.0&&nota<=10.0?nota:0.0;
        this.faltas = faltas;
        this.aptoGraduar = aptoGraduar;
    }

    public Aluno(String nome, double nota){
        this(nome, nota, 0, false);
    }

    public Aluno(String nome){
        this(nome, 0.0, 0, false);
    }

    public Aluno(){
        this("Aluno Padrão", 0.0, 0, false);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
        updateAptoGraduar();
    }
    public int getFaltas() {
        return faltas;
    }
    public String getStringFaltas() {
        return "O aluno: "+nome+" possui " + faltas + " faltas.";
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
        updateAptoGraduar();
    }
    public boolean isAptoGraduar() {
        return aptoGraduar;
    }
    private void updateAptoGraduar() {
        this.aptoGraduar = nota>=7.0&&faltas<10;
    }
    public boolean mesmaNota(Aluno x){
        return nota==x.nota;
    }
}
