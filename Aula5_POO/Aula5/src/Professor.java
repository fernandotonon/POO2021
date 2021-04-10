public class Professor {
    public String nome;
    public String matricula;
    public double salario;
    private static Professor instance = new Professor();
    private Professor(){
    }
    public static Professor getInstance(){
        return instance;
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
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String toString(){
        return matricula + " - " + nome;
    }
}
