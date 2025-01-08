/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.clasesabstractaa;

import ec.edu.espoch.clasesabstractaa.Clases.Animal;
import ec.edu.espoch.clasesabstractaa.Clases.Gato;
import ec.edu.espoch.clasesabstractaa.Clases.Leon;
import ec.edu.espoch.clasesabstractaa.Clases.Lobo;
import ec.edu.espoch.clasesabstractaa.Clases.Perro;

/**
 *
 * @author PERSONAL
 */
public class Clasesabstractaa {

    public static void main(String[] args) {
        
        //declarar un array de animal
        Animal[] animales = new Animal[4];
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
      
        for (int i = 0; i < animales.length; i++){
            
            System.out.println("nombre cientifico"+animales[i].getNombreCientifico());
            System.out.println("Sun habitat"+animales[1].getHabitat());
            System.out.println("Su sonido"+animales[2].getSonido());
            System.out.println("Su alimentos"+animales[3].getAlimentos());
        }
            
        }  
}
