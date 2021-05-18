public class Cidade {
	public void contrata(Professor p) { p.ensina(); p.trabalha(); }
	public void contrata(Empregado e) { e.trabalha();}
	public void cobraDe(Contribuinte c) { c.pagaIR();}
	public void registra(Cidadao c) { c.getRG();}
	public void alimenta(Animal a) { a.come();}
	public static void main (String[] args) {
		Pessoa joao = new Pessoa();
		Cidade cba = new Cidade();
		cba.contrata(joao); // considera Professor
		cba.contrata((Empregado)joao); // Empregado
		cba.cobraDe(joao); // considera Contribuinte
		cba.registra(joao); // considera Cidadao
		cba.alimenta(joao); // considera Animal
}}