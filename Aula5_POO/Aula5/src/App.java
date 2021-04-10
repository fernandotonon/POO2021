public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Util.PI);
        Aluno a = new Aluno("Aluno","a1");
        Aluno b = new Aluno("Aluno","b2");
        Professor i = Professor.getInstance();
        i.setNome("Professor");
        i.setMatricula("p1");
        Professor j = Professor.getInstance();
        j.setNome("Outro Professor");
        j.setMatricula("p2");
        Universidade u = new Universidade();
        u.addAluno(a);
        u.addAluno(b);
        u.addProfessor(i);
        u.addProfessor(j);
        System.out.println(u.getAlunos());
        System.out.println(u.getProfessores());
        Disciplina d1 = new Disciplina();
        d1.setNome("POO");
        d1.setProfessor(i);
        d1.addAluno(a);
        d1.addAluno(b);
        Disciplina d2 = new Disciplina();
        d2.setNome("LPIII");
        d2.setProfessor(j);
        d2.addAluno(a);
        Disciplina d3 = new Disciplina();
        d3.setNome("Aplicações Móveis");
        d3.setProfessor(j);
        d3.addAluno(b);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
