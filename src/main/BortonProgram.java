package main;

import model.Borton;
import model.Elitelt;
import model.Letartoztatott;
import model.VisszaesesiKockazat;

public class BortonProgram {

    private Borton borton;

    public static void main(String[] args) {
        new BortonProgram();

    }

    public BortonProgram() {
        borton = new Borton(5);

        System.out.println("--- Az első befogadások UTÁN, reintegráció ELŐTT:");

        borton.befogad(new Letartoztatott("Pál", 25));
        borton.befogad(new Letartoztatott("Palkó"));
        borton.befogad(new Elitelt("Tamás", VisszaesesiKockazat.Magas));
        borton.befogad(new Elitelt("Tomi"));
        bortonFogvatartottaiKiir();

        System.out.println("\n--- Az 1. reintegráció után UTÁN:");
        borton.Reintegracio();
        bortonFogvatartottaiKiir();

        System.out.println("\n--- Új befogadás UTÁN:");
        borton.befogad(new Elitelt("Thomas", VisszaesesiKockazat.Alacsony));
        bortonFogvatartottaiKiir();

        System.out.println("\n--- Az 1. reintegrációs projekt után UTÁN:");
        borton.ReintegracioProjekt();
        bortonFogvatartottaiKiir();
        
        System.out.println("\n---A börtön férőhelyeinek száma: " + borton.getFerohely());
        System.out.println("\n---A fogvatartottak száma: " + borton.getFogvatartottDb());

        System.out.println("\n--- Új befogadás túlzsúfoltsággal UTÁN:");
        borton.befogad(new Letartoztatott("Pali", 5));
        bortonFogvatartottaiKiir();  
        //System.out.println(borton.isTulzsufolt());

     
        System.out.println("\n--- 2. új befogadás túlzsúfoltsággal UTÁN:");
        borton.befogad(new Elitelt("Lali", VisszaesesiKockazat.Kozepes));
        bortonFogvatartottaiKiir();  
      
        System.out.println(borton.isTulzsufolt());
        
        System.out.println("\n---A börtön férőhelyeinek száma: " + borton.getFerohely());
        System.out.println("\n---A fogvatartottak száma: " + borton.getFogvatartottDb());
        
        
        System.out.println("\n--- A 2. reintegrációs projekt után UTÁN:");
        borton.ReintegracioProjekt();
        bortonFogvatartottaiKiir();
        
        System.out.println("\n--- Újabb három reintegráció után UTÁN:");
        for (int i = 0; i < 3; i++) {
            borton.Reintegracio();
        }
               
        bortonFogvatartottaiKiir();
 
        borton.szabadit("Pali");

        System.out.println("\n"+borton.isTulzsufolt());

        borton.szabadit("Tomi");
        System.out.println("\n"+borton.isTulzsufolt());

        bortonFogvatartottaiKiir();
        
        System.out.println("\n--- Nem létező fogvatartott szabadítása:");
        borton.szabadit("Zoli");
        
        
        System.out.println("\n--- Újabb négy befogadás túlzsúfoltsággal UTÁN:");
        borton.befogad(new Elitelt("Aladár", VisszaesesiKockazat.Kozepes));
        bortonFogvatartottaiKiir();
        borton.befogad(new Elitelt("Álmos", VisszaesesiKockazat.Alacsony));
        bortonFogvatartottaiKiir();
        borton.befogad(new Letartoztatott("János", 70));
        borton.befogad(new Letartoztatott("István"));
        bortonFogvatartottaiKiir();
        
        System.out.println("\n---A börtön férőhelyeinek száma: " + borton.getFerohely());
        System.out.println("\n---A fogvatartottak száma: " + borton.getFogvatartottDb());
       
        System.out.println();
        borton.lazadas();
        
        System.out.println("\n---A börtön férőhelyeinek száma: " + borton.getFerohely());
        System.out.println("\n---A fogvatartottak száma: " + borton.getFogvatartottDb());
        bortonFogvatartottaiKiir();
        
        
        System.out.println("\n--- Üres börtönből szabadítás szabadítása:");
        borton.szabadit("Zoli");
        System.out.println("\n--- Üres börtönben reintegráció:");
        borton.Reintegracio();
        System.out.println("\n--- Üres börtönben reintegrációs projekt");
        borton.ReintegracioProjekt();
        
        System.out.println("--- Üres börtönbe befogadás:");

        borton.befogad(new Letartoztatott("Pál", 25));
        borton.befogad(new Letartoztatott("Palkó"));
        borton.befogad(new Elitelt("Tamás", VisszaesesiKockazat.Magas));
        borton.befogad(new Elitelt("Tomi"));
        bortonFogvatartottaiKiir();

    }

    private void bortonFogvatartottaiKiir() {
        for (String fogvatartott : borton.getFogvatartottakLeirasa()) {
            if (fogvatartott != null) {
                System.out.println(fogvatartott);
            }
        }

    }

}
