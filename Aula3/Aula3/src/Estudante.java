public class Estudante {
    boolean matriculado = false;
    float nota = 0.0f; 
    public Estudante (boolean matriculado, float nota){
        this.matriculado = matriculado;
        this.nota = nota;
    }
    public Estudante(boolean matriculado){
        this(matriculado, 0.0f);
        System.out.println("passei aqui");
    }
    public Estudante(float nota){
        this(true,nota);
    }
    public Estudante(){
        this(true);
    }
    public boolean getMatriculado(){
        return matriculado;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public boolean isAprovado(){
        return nota>=7.0f;
    }
}
