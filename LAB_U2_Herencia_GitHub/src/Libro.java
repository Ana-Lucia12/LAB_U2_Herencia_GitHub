/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
// La clase libro hereda de material
public class Libro extends Material {
    
    //Atributos propios del libro
    private String autor;
    private int cantidadPaginas;
    private Genero genero;
    
    // Constructor de la clase Libro
    public Libro (int id, String titulo,boolean disponible, String autor, int cantidadPaginas, Genero genero ) {
        
        //Llama al constructor de la superclase
        super(id, titulo, true);    
        
        //Iniciar los atributos
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        this.genero = genero;
    }
    
    //Metodo sobrescrito
    @Override
    public void mostrarInfo() {
        
        System.out.println("--- Libro ---");
        System.out.println("ID: " + getId());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de paginas: " + cantidadPaginas);
        System.out.println("Genero: " + genero);
    
    }
    
    
}
