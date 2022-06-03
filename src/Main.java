import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        Impresora impresora = new Impresora();
        DocumentoOfimatico documentoOfimatico = null;
        String nombre = "";
        String tamano = "";

        while (!salir) {

            System.out.println("Seleccione una opción: \n");
            System.out.println("\t1. Encender impresora.");
            System.out.println("\t2. Apagar impresora.");
            System.out.println("\t3. Añadir trabajo.");
            System.out.println("\t4. Ver lista de trabajos.");
            System.out.println("\t5. Imprimir.");
            System.out.println("\t6. Salir.");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    impresora.printerUp();
                    System.out.println("Impresora encendida");
                    break;

                case 2:
                    impresora.printerDown();
                    System.out.println("Impresora apagada");
                    break;

                case 3:
                    if (impresora.isEstado()) {
                        System.out.print("Nombre del documento: -> ");
                        nombre = scanner.nextLine();
                        System.out.print("Tamaño del documento: -> ");
                        tamano = scanner.nextLine();
                        documentoOfimatico = new DocumentoOfimatico(nombre, tamano);
                        impresora.addWork(documentoOfimatico);
                        System.out.println("Añadiendo trabajo " + nombre + " " + tamano);
                    } else {
                        System.out.println("Con la impresora apagada no se puede añadir un trabajo");
                    }

                    break;

                case 4:
                    System.out.println(impresora);
                    break;

                case 5:
                    if (impresora.sizeCola() > 0) {
                        System.out.println("Imprimiendo --> " + impresora.imprimir());
                    } else {
                        System.out.println("La cola de impresión no tiene ningún documento");
                    }

                    break;

                case 6:
                    salir = true;
                    break;

            }
        }
    }
}
