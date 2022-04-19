package heranca;

public class Pessoa { //super classe/ classe mae

    int matricula;
    String nome;
    String rg;
    String lagadouro;
    int numero;
    String bairro;
    String cidade;
    String cep;
    String emial;
    String fone;


    public Pessoa(int matricula, String nome, String rg, String lagadouro, int numero, String bairro, String cidade, String cep, String emial, String fone) {
        this.matricula = matricula;
        this.nome = nome;
        this.rg = rg;
        this.lagadouro = lagadouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.emial = emial;
        this.fone = fone;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLagadouro() {
        return lagadouro;
    }

    public void setLagadouro(String lagadouro) {
        this.lagadouro = lagadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
