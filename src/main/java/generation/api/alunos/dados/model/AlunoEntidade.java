package  generation.api.alunos.dados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AlunoEntidade {

    @Id
    private Long identificador;
    private String nomeAluno;
    private int idade;
    private double nota1;
    private double nota2;
    private String nomeProfessor;
    private int numeroSala;


  

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public int getNumeroSala() {
        return numeroSala;
    }


    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

}
