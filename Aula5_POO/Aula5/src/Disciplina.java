import java.util.HashSet;

public class Disciplina {
    private String nome;
    private Professor professor;
    private HashSet<Aluno> alunos = new HashSet<Aluno>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void addAluno(Aluno a){
        alunos.add(a);
    }
    public void removeAluno(Aluno a){
        alunos.remove(a);
    }
    public HashSet<Aluno> getAlunos(){
        return alunos;
    }
    public String toString(){
        return getNome() + " - Professor: " + getProfessor() + " - Alunos: " + getAlunos();
    }
}
