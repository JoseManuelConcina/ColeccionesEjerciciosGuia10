package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in);

    public void crearProducto(HashMap<String, Producto> productos) {

        System.out.println("Ingrese el nombre del producto : ");
        String nombre = leer.next();
        System.out.println("Ingrese el precio del producto : " + nombre);
        Double precio = leer.nextDouble();
        Producto p = new Producto(nombre, precio);
        productos.put(nombre, p);

    }

    public void modificarPrecio(HashMap<String, Producto> productos) {
        System.out.println("Ingrese el nombre del producto que desea modificar su valor");
        String nombre = leer.next();

        if (productos.containsKey(nombre)) {
            Producto p = productos.get(nombre);
            System.out.println("Ingrese el nuevo valor del producto : ");
            p.setPrecio(leer.nextDouble());

        } else {
            System.out.println("El producto no se encuentra ");
        }

    }

    public void eliminarProducto(HashMap<String, Producto> productos) {
        System.out.println("Ingrese el nombre del producto que desea eliminar su valor");
        String nombre = leer.next();
        
        if (productos.containsKey(nombre)) {
            Producto p = productos.get(nombre);
          productos.remove(p.getProducto());
            System.out.println("El producto "+ nombre +" , ha sido eliminado");

        }else {
            System.out.println("El producto no se encuentra");
        }
    }
    
 public void mostrarProductos (HashMap<String, Producto> productos){
     
     for (String aux : productos.keySet()) {
         Producto p = productos.get(aux);
         
         System.out.println("Nombre del producto "+p.getProducto()+" Precio : "+p.getPrecio());
     }
     
   
 }   
    
}
