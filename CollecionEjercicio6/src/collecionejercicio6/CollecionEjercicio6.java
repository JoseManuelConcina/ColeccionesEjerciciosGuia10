package collecionejercicio6;

import entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;
import servicio.ProductoServicio;

public class CollecionEjercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);     
        HashMap<String, Producto> productos = new HashMap();
        ProductoServicio ps = new ProductoServicio();
        int opcion =0;
        do {          
  
        System.out.println("Selecciones la opcion que desea :");
        System.out.println("1- Cargar producto");
        System.out.println("2- Modificar Precio de un producto");
        System.out.println("3- Eliminar un producto ");
        System.out.println("4- Mostrar los productos");
        System.out.println("5- Salir");
        opcion = leer.nextInt();

   
        switch (opcion) {
            case 1:
                   ps.crearProducto(productos);
                   break;
            case 2:
                ps.modificarPrecio(productos);
                break;
            case 3:
                ps.eliminarProducto(productos);
                break;
            case 4:
                ps.mostrarProductos(productos);
            break;
            default: 
                    System.out.println("Ingrese una opcion valida ");
                    
                        
        }
         } while ( opcion !=5); 
    }

}
