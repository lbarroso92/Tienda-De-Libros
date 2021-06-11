package tienda.de.libros;

import java.util.Scanner;

public class TiendaDeLibros {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona un nombre");
        String nombre = consola.nextLine();
        System.out.println("Poporciona el id");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envío gratuito");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Precio $ " + precio);
        System.out.println("Envío Gratuito " + envioGratuito);

    }

}
