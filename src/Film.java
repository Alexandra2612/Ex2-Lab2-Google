public class Film {
    private Integer an_aparitie;
    private String nume;
    private Actor[] actori;
    public Film(Integer a,String n,Actor[] act){
        this.an_aparitie=a;
        this.nume=n;
        this.actori=act;
    }
    public Actor[] getActori(){
        return actori;
    }
    public String getNumeFilm(){
        return nume;
    }
}
