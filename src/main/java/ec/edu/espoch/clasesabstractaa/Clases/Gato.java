/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.clasesabstractaa.Clases;

/**
 *
 * @author PERSONAL
 */
public class Gato extends felinos {
    
      @Override
      public String getSonido() {
        return "maullido";
    }

    @Override
    public String getAlimentos() {
        return "ratones";
    }

    @Override
    public String getHabitat() {
        return "domestico" ;
    }

    @Override
    public String getNombreCientifico() {
        return "felis silvestris catus";
    }
    
    
    
}
