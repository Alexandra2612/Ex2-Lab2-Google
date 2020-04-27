public class Studio {
   private String nume;
   private Film[] filme;

    public Studio(String n,Film[] f){
       this.nume=n;
       this.filme=f;
   }
   public String getNume1(){
       if(filme.length>2)
           return nume;
       return null;
   }
   public String getNume2(){
      for(int i=0;i<filme.length;i++){
          Actor[] tab=filme[i].getActori();
          for(int j=0;j<tab.length;j++)
              if(tab[j].getNumeActor().equals("actor cu 2 oscaruri"))
                  return this.nume;
      }
      return null;
   }
   public String getNume3(){
        for(int i=0;i<filme.length;i++)
        {
            Actor[] tab=filme[i].getActori();
            for(int j=0;j<tab.length;j++)
                if(tab[j].getVarstaActor()>50)
                    return filme[i].getNumeFilm();
        }
       return null;
   }
}
