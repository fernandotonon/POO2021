import java.util.HashSet;

public class Universidade {
    private static Universidade instance = new Universidade();
    private HashSet<Aluno> alunos = new HashSet<Aluno>();
    private HashSet<Professor> professores = new HashSet<Professor>();
    public static Universidade getInstance(){
        return instance;
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
    public void addProfessor(Professor p){
        professores.add(p);
    }
    public void removeProfessor(Professor p){
        professores.remove(p);
    }
    public HashSet<Professor> getProfessores(){
        return professores;
    }
}
