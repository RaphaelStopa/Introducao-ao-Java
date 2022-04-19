import javax.print.DocFlavor;

public class Video implements AcoesVideos {
    private String titulo;
    private int avalicao;
    private int views;
    private int curtidas;
    private boolean reprodizindo;



    public Video(String titulo) {
        this.titulo = titulo;
        this.avalicao =1;
        this.views = 0;
        this.curtidas = 0;
        this.reprodizindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(int avalicao) {
        int nova;
        nova = (int) (this.avalicao + avalicao)/this.views;
        this.avalicao = avalicao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReprodizindo() {
        return reprodizindo;
    }

    public void setReprodizindo(boolean reprodizindo) {
        this.reprodizindo = reprodizindo;
    }

    @Override
    public void paly() {

        this.reprodizindo = true;
    }

    @Override
    public void pause() {

        this.reprodizindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;

    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avalicao=" + avalicao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reprodizindo=" + reprodizindo +
                '}';
    }
}
