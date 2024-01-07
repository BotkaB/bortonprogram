/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bianka
 */
public abstract class Fogvatartott {

    private String ftNeve;
    private boolean reintegralt;

    public Fogvatartott(String ftNev) {
        this.ftNeve = ftNev;
        reintegralt = false;
    }

    public String getFtNev() {
        return ftNeve;
    }

    public void setFtNev(String ftNeve) {
        this.ftNeve = ftNeve;
    }

    public boolean isReintegralt() {
        return reintegralt;
    }

    public void setReintegralt(boolean reintegralt) {
        this.reintegralt = reintegralt;
    }

    @Override
    public String toString() {
        return "Fogvatartott{" + "ftNeve=" + ftNeve + ", reintegralt=" + reintegralt + "}";
    }
    
    

}
 

