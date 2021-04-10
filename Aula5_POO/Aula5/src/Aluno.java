public class Aluno {
    public String nome;
    public String matricula;
    public double nota;
    public Aluno(){

    }
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String toString(){
        return matricula + " - " + nome;
    }
}
