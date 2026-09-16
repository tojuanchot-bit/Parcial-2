import java.util.Scanner;
import java.util.Stack;

public class Reproductorr {
    public static void main(String[] args) {
        System.out.println("SPOBREFY");
        System.out.println("-----------------");


        boolean continuar = true;
        int opcion;
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<ObjCancion> playlist = new Stack<>();

        while (continuar) {

            System.out.println("1. Reproducir.");
            System.out.println("2. Mostrar historial.");
            System.out.println("3. canción actual: ");
            System.out.println("4. retroceder.");
            System.out.println("0. salir.");
            System.out.print("Opcion: ");
            opcion = m.ValidarEntero(sc);
            sc.nextLine();


            switch (opcion) {
                case 1:
                    m.reproducir(playlist);
                    m.cancionActual(playlist);
                    break;

                case 2:
                    m.historial(playlist);
                    break;

                case 3:
                    m.cancionActual(playlist);
                    break;

                case 4:
                    m.retroceder(playlist);
                    m.cancionActual(playlist);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
            
                default:
                    System.out.println("Ingrese una opción valida ");
                    break;
            }
            
        }
    }

}
