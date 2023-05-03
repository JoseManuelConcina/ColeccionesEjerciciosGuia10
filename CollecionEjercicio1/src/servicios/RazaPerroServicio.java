package servicios;

import entidad.RazaPerro;
import java.util.ArrayList;

import java.util.Scanner;

public class RazaPerroServicio {

    Scanner leer = new Scanner(System.in);
  

   

    public void cargarPerros( ArrayList <RazaPerro> razas ) {
            
            System.out.println("Ingrese el nombre del perro");
            String nombre = leer.next();
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Ingrese la edad de: " + nombre);
            int edad = leer.nextInt();
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Ingrese la raza de : " + nombre);
            String raza = leer.next();
            System.out.println("------------------------------------------------------------------");
            RazaPerro rp = new RazaPerro(edad, nombre, raza);
            razas.add(rp);
      
    }

    public void mostarRazas(ArrayList <RazaPerro> razas){
        
        razas.forEach((aux) -> {
            System.out.println(aux);
        });
        System.out.println("La cantidad de perros en la lista es de : "+razas.size());
    }

    
    
}
