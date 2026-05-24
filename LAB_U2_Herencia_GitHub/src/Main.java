/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Josue Castillo
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcion = 0;

        do {

            System.out.println("\n===== MENU BIBLIOTECA =====");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Agregar Tesis");
            System.out.println("4. Agregar Audiolibro");
            System.out.println("5. Listar materiales");
            System.out.println("6. Buscar material por ID");
            System.out.println("7. Prestar material");
            System.out.println("8. Devolver material");
            System.out.println("9. Mostrar total materiales");
            System.out.println("10. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ID: ");
                    int idLibro = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String tituloLibro = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Cantidad paginas: ");
                    int paginas = sc.nextInt();

                    Libro libro = new Libro(
                            idLibro,
                            tituloLibro,
                            true,
                            autor,
                            paginas,
                            Genero.GENERAL
                    );

                    biblioteca.agregarMaterial(libro);

                    break;

                case 2:

                    System.out.print("ID: ");
                    int idRevista = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String tituloRevista = sc.nextLine();

                    System.out.print("Numero edicion: ");
                    int edicion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Mes publicacion: ");
                    String mes = sc.nextLine();

                    Revista revista = new Revista(
                            idRevista,
                            tituloRevista,
                            true,
                            edicion,
                            mes
                    );

                    biblioteca.agregarMaterial(revista);

                    break;

                case 3:

                    System.out.print("ID: ");
                    int idTesis = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String tituloTesis = sc.nextLine();

                    System.out.print("Autor: ");
                    String autorTesis = sc.nextLine();

                    System.out.print("Universidad: ");
                    String universidad = sc.nextLine();

                    System.out.print("Año: ");
                    int anio = sc.nextInt();

                    Tesis tesis = new Tesis(
                            idTesis,
                            tituloTesis,
                            autorTesis,
                            universidad,
                            anio
                    );

                    biblioteca.agregarMaterial(tesis);

                    break;

                case 4:

                    System.out.print("ID: ");
                    int idAudio = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Titulo: ");
                    String tituloAudio = sc.nextLine();

                    System.out.print("Narrador: ");
                    String narrador = sc.nextLine();

                    System.out.print("Duracion minutos: ");
                    int minutos = sc.nextInt();

                    AudioLibro audiolibro =
                            new AudioLibro(
                                    idAudio,
                                    tituloAudio,
                                    narrador,
                                    minutos
                            );

                    biblioteca.agregarMaterial(audiolibro);

                    break;

                case 5:
                    biblioteca.listarMateriales();
                    break;

                case 6:

                    System.out.print("Ingrese ID: ");
                    int buscarId = sc.nextInt();

                    Material material =
                            biblioteca.buscarPorId(buscarId);

                    if (material != null) {
                        material.mostrarInfo();
                    } else {
                        System.out.println("No encontrado.");
                    }

                    break;

                case 7:

                    System.out.print("ID del material: ");
                    int prestarId = sc.nextInt();

                    biblioteca.prestarMaterial(prestarId);

                    break;

                case 8:

                    System.out.print("ID del material: ");
                    int devolverId = sc.nextInt();

                    biblioteca.devolverMaterial(devolverId);

                    break;

                case 9:
                    biblioteca.mostrarTotalMateriales();
                    break;

                case 10:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 10);

        sc.close();
    }
}
