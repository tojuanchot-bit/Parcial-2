import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class Metodos {

    Scanner sc = new Scanner(System.in);
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingresar un valor numérico entero");
            sc.next();
        }
        return sc.nextInt();
    }

    public double ValidarDouble(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingresar un valor numérico decimal");
            sc.next();
        }
        return sc.nextDouble();
    }

    public Stack<ObjCancion> reproducir (Stack<ObjCancion> playlist){

        ObjCancion meroTema = new ObjCancion();

        System.out.println("Tema: ");
        meroTema.setNombre(sc.nextLine());
        System.out.println("Artista: ");
        meroTema.setArtista(sc.nextLine());
        meroTema.setDuracion((Math.random() * 5) + 1);
        playlist.push(meroTema);
        return playlist;
    }

    public void historial (Stack<ObjCancion> playlist){

        if (playlist.isEmpty()) {
            System.out.println("No hay canciones en historial.");
            return;
        }
        
        System.out.println("Canciones reproducidas: ");

        for (ObjCancion objCancion : playlist) {
            
            System.out.println("Cancion: " + objCancion.getNombre());
            System.out.println("Artista: " + objCancion.getArtista());
            System.out.printf("Duración: %.2f minutos%n", objCancion.getDuracion());
            System.out.println("----------------------");
        }

    }

    public void retroceder(Stack<ObjCancion> playlist){
        if (playlist.isEmpty()) {
            System.out.println("No hay canciones para retroceder.");
            return;
        }
        ObjCancion tema = playlist.pop();
        System.out.println("Retrocediendo, se quitó: " + tema.getNombre());
    }

    public void cancionActual(Stack<ObjCancion> playlist){
        ObjCancion tema = playlist.peek();

        if (playlist.isEmpty()) {
            System.out.println("No hay canciones reproduciendose.");
            return;
        }
        
            System.out.println("Reproduciendo: ");
            System.out.println("Cancion: " + tema.getNombre());
            System.out.println("Artista: " + tema.getArtista());
            System.out.printf("Duración: %.2f minutos%n", tema.getDuracion());
            System.out.println("----------------------");

    }


}
