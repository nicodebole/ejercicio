/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, hobbie, editor, sistema;
        int edad;
        
        System.out.println("Ingresar nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar apellido: ");
        apellido = entrada.nextLine();
        System.out.println("Ingresar edad: ");
        edad = parseInt(entrada.nextLine());
        System.out.println("Ingresar hobbie: ");
        hobbie = entrada.nextLine();
        System.out.println("Ingresar editor: ");
        editor = entrada.nextLine();
        System.out.println("Ingresar sistema: ");
        sistema = entrada.nextLine();
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Hobbie: "+hobbie);
        System.out.println("Editor de codigo: "+editor);
        System.out.println("Sistema operativo: "+sistema);
    }
    
}
