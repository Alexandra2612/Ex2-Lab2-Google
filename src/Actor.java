public class Actor {
    private Premiu[] premii;
    private String nume;
    private Integer varsta;
    public Actor(String n,Integer v,Premiu[] p){
        this.nume=n;
        this.varsta=v;
        this.premii=p;
    }
    public String getNumeActor(){
        return nume;
    }
    public Integer getVarstaActor(){
        return varsta;
    }
}
