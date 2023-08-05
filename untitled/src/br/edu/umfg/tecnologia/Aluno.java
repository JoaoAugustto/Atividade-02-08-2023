package br.edu.umfg.tecnologia;

public class Aluno {
    private  int  registroAcademico;
    private String nomeAluno, situacao;
    private double notaUm, notaDois, notaTrabalho;
    private double mediaFinal;

    public Aluno(String nomeAluno, int registroAcademico, double notaUm, double notaDois, double notaTrabalho) {
        this.nomeAluno = nomeAluno;
        this.registroAcademico = registroAcademico;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTrabalho = notaTrabalho;
    }

    public void Media(){
        mediaFinal = (notaUm * 0.35) + (notaDois * 0.35) + (notaTrabalho * 0.3);
        String mediaFormatada = String.format("%.2f", mediaFinal);
        System.out.println ("Media:  " + mediaFormatada);
    }

    public  void Situacao(){
        if (mediaFinal >= 7) {
            situacao = "APROVADO";
        } else {
            situacao = "EXAME";
        }
        System.out.println("Situação: " + situacao);
    }

    public String toString(){
        System.out.println("R.A: " + registroAcademico + " | " + "Nome: " + nomeAluno);
        return null;
    }

}
