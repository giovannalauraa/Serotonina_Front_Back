package model;

public class Tarefa {
    private static int idCounter = 0;

    private int id;
    private String tarefa;
    

    public Tarefa(){
        this.id = ++Tarefa.idCounter;
        this.tarefa = "Anônimo";
    }
    

    public Tarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public int getId() {
        return id;
    }


    public String getTarefa() {
        return tarefa;
    }


    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

}




    //public void setId(int id) {
    //    this.id = id;
    //}

    /*public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public int getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(int seguindo) {
        this.seguindo = seguindo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

}
*/