
package model;


public class Elitelt extends Fogvatartott {
        private VisszaesesiKockazat kockazat;

    public Elitelt(String ftNev, VisszaesesiKockazat kockazat) {
        super(ftNev);
        this.kockazat = kockazat;
    }
    
    public Elitelt(String ftNev) {
        this(ftNev, VisszaesesiKockazat.Kozepes);
    }
    
    public void reintegralodik(){
        if(kockazat != VisszaesesiKockazat.NagyonAlacsony){
            kockazat = VisszaesesiKockazat.values()[kockazat.ordinal()+1];
        }
    }
    
    public VisszaesesiKockazat getKockazat() {
        return kockazat;
    }
    
     public void setKockazatTulzsufolt() {
       if(kockazat != VisszaesesiKockazat.NagyonMagas){
            this.kockazat = VisszaesesiKockazat.values()[kockazat.ordinal()-1];
        }
       else{this.kockazat=kockazat;}

    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " <|ext-- "
                + "Elitelt{" + "visszaesési kockázat=" + kockazat + "}";
    }

  
    
}
