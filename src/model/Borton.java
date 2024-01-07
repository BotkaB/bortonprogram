package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Borton {

  public static final String TEXT_RED =  "\u001B[31m";   
  public static final String TEXT_RESET = "\u001B[0m";
    
    
    ArrayList<Fogvatartott> fogvatartottak = new ArrayList<Fogvatartott>();
    private int ferohely;
    private int fogvatartottDb;
    private boolean tulzsufolt;
 

    public Borton() {
        this(6);
    }

    public Borton(int ferohelyFo) {
        fogvatartottDb = 0;
        ferohely = ferohelyFo;
        fogvatartottak = new ArrayList<Fogvatartott>();
        tulzsufolt = false;

    }

    public void befogad(Fogvatartott fogvatartott) {
        fogvatartottDb++;
        fogvatartottak.add(fogvatartott);

        if (fogvatartottDb > ferohely) {
            tulzsufolt = true;
            System.out.println("\nA börtön túlzsúfolt! Az együttműködési hajlandóság csökken, a visszaesési kockázat nő!\n");
           tulzsufltsagHatasa();

        }

    }

    public void Reintegracio() {
        if (fogvatartottDb > 0) {
            for (Object o : fogvatartottak) {
                ((Fogvatartott) o).setReintegralt(true);
                if (o instanceof Elitelt) {
                    ((Elitelt) o).reintegralodik();
                } else if (o instanceof Letartoztatott) {
                    ((Letartoztatott) o).setEgyuttmukodesiHajlandosag();
                }

            }
        } else {
            System.out.println("A börtönben nincs fogvatartott!");
        }

    }

    public void ReintegracioProjekt() {
        if (fogvatartottDb > 0) {
            for (Object o : fogvatartottak) {
                ((Fogvatartott) o).setReintegralt(true);
                if (o instanceof Elitelt) {
                    ((Elitelt) o).reintegralodik();
                } else if (o instanceof Letartoztatott) {
                    ((Letartoztatott) o).setEgyuttmukodesiHajlandosagProjekt();
                }

            }
        } else {
            System.out.println("A börtönben nincs fogvatartott!");
        }

    }

    public Fogvatartott szabadit(String ftNeve) {
        boolean van = false;
        if (fogvatartottDb > 0) {

            for (Object o : fogvatartottak) {
                if (((Fogvatartott) o).getFtNev().equals(ftNeve)) {
                    fogvatartottDb--;
                    van = true;
                    if (fogvatartottDb <= ferohely) {
                        tulzsufolt = false;
                    }

                    Fogvatartott fogvatartott = ((Fogvatartott) o);

                    boolean ftTipus = fogvatartott instanceof Elitelt;
                    String ft_tip = " letartóztatott";
                    if (ftTipus) {
                        ft_tip = " elítélt";
                    }
                    System.out.println(String.format("\nSzabadítva: %s %s!", ftNeve, ft_tip));
                    fogvatartottak.remove(fogvatartottDb);

                    return fogvatartott;
                }

            }
            if (van == false) {
                System.out.println("Nincs ilyen nevű fogvatartott a börtönben!");
            }

        } else {
            System.out.println("A börtönben nincs fogvatartott!");
        }

        return null;
    }

    public String[] getFogvatartottakLeirasa() {
        String[] ft = new String[this.fogvatartottak.size()];

        for (int i = 0; i < fogvatartottDb; i++) {
            Fogvatartott fogvatartott = this.fogvatartottak.get(i);
            if (fogvatartott != null) {
                boolean ftTipus = fogvatartott instanceof Letartoztatott;
                String ft_tip = " elítélt";
                if (ftTipus) {
                    ft_tip = " letartóztatott";
                }
                ft[i] = fogvatartott.getFtNev() + ft_tip;
                ft[i] += fogvatartott.isReintegralt() ? " reintegrálódott" : " nem reintegrálódott";
                if (ftTipus) {
                    ft[i] += String.format(" (együttműködési hajlandósága: %.2f%%)", ((Letartoztatott) fogvatartott).getEgyuttmukodesiHajlandosag());
                } else if (fogvatartott instanceof Elitelt) {
                    ft[i] += " (visszaesési kockázata: " + ((Elitelt) fogvatartott).getKockazat().toString() + ")";
                }
            }
        }
        return ft;
    }

    public int getFogvatartottDb() {
        return fogvatartottDb;
    }

    public int getFerohely() {
        return ferohely;
    }

    public boolean isTulzsufolt() {
        return tulzsufolt;
    }

    public ArrayList<Fogvatartott> getFogvatartottak() {

        return new ArrayList<Fogvatartott>(fogvatartottak);
    }

    public void lazadas() {
        fogvatartottDb=0;
        System.out.println(TEXT_RED+"A börtönben lázadás tört ki, a fogvatartottak megszöktek!"+TEXT_RESET);
        fogvatartottDb=0;
        fogvatartottak = new ArrayList<Fogvatartott>();
      
    }
    
    public void tulzsufltsagHatasa()
    {
        for (Object o : fogvatartottak) {

                if (((Fogvatartott) o) instanceof Letartoztatott) {
                    ((Letartoztatott) o).setEgyuttmukodesiHajlandosagTulzsufolt();
                } else if (((Fogvatartott) o) instanceof Elitelt) {
                    ((Elitelt) o).setKockazatTulzsufolt();
                }
            }
       
}
}
    
