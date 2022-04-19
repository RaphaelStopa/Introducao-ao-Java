package heranca;

public class Professor extends Pessoa {
    private String titulacao;


    public Professor(int matricula, String nome, String rg, String lagadouro, int numero, String bairro, String cidade, String cep, String emial, String fone, String titulacao) {
        super(matricula, nome, rg, lagadouro, numero, bairro, cidade, cep, emial, fone);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
