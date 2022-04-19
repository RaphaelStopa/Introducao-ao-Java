package heranca;

public class Aluno extends Pessoa{ //subcalsses
    String escolaridade;


    public Aluno(int matricula, String nome, String rg, String lagadouro, int numero, String bairro, String cidade, String cep, String emial, String fone, String escolaridade) {
        super(matricula, nome, rg, lagadouro, numero, bairro, cidade, cep, emial, fone);
        this.escolaridade = escolaridade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }



}
