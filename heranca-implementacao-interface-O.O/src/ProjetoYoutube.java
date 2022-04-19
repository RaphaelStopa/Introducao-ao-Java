public class ProjetoYoutube {
    public static void main(String[] args) {

        Video v[] = new Video[3]; // vetor de video
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Alunos g[] = new Alunos[2];
        g[0] = new Alunos("Jubileu", 22, "M", "Juba");
        g[1] = new Alunos("Creuza", 12, "F", "creuzita");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());

        System.out.println(vis[0].toString());

    }
}
