public class Visualizacao {
    private Alunos espectador;
    private Video filme;

    public Visualizacao(Alunos espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+ 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void avaliar(){
        this.filme.setAvalicao(5);// Foi assim para caso não haja avaliação a nota então eh 5

    }
    public void avaliar(int nota) {// Para nota ser passada
        this.filme.setAvalicao(nota);

    }
    public void avaliar(float porc){// nota de acordo com o tempo que assitiu
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        }else if (porc <= 50){
            tot = 5;
        }else if (porc <= 90) {
            tot = 8;
        }else {
            tot = 10;
        }
        this.filme.setAvalicao(tot);

    }

    public Alunos getEspectador() {
        return espectador;
    }

    public void setEspectador(Alunos espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
