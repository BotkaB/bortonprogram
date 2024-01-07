
package model;


public class Letartoztatott extends Fogvatartott {
    private double egyuttmukodesiHajlandosag;

    public Letartoztatott(String ftNev) {
        super(ftNev);
        this.egyuttmukodesiHajlandosag = 50;
    }
    
     public Letartoztatott(String ftNev, double egyuttmukodesiHajlandosag ) {
        super(ftNev);
        this.egyuttmukodesiHajlandosag = egyuttmukodesiHajlandosag;
    }

    
    public double getEgyuttmukodesiHajlandosag() {
        return egyuttmukodesiHajlandosag;
    }


    public void setEgyuttmukodesiHajlandosag() {
        if (egyuttmukodesiHajlandosag<=90.90)
            {
            this.egyuttmukodesiHajlandosag *= 1.10;
            } 
        else
            {this.egyuttmukodesiHajlandosag=100;}
    }
    
    public void setEgyuttmukodesiHajlandosagProjekt(){
        if (egyuttmukodesiHajlandosag<=86.95)
            {
            this.egyuttmukodesiHajlandosag *= 1.15;
            } 
        else
            {this.egyuttmukodesiHajlandosag=100;}
    }
    
    public void setEgyuttmukodesiHajlandosagTulzsufolt() {
        if (egyuttmukodesiHajlandosag>=1.2)
            {
            this.egyuttmukodesiHajlandosag *= 0.80;
            } 
        else
            {this.egyuttmukodesiHajlandosag=0;}
    }
    
    @Override
    public String toString() {
        String os = super.toString();
        return os + " <|ext-- "
                + "Letartóztatott{" + "együttműködési hajlandóság=" + egyuttmukodesiHajlandosag + "}";
    }
    
     
}
