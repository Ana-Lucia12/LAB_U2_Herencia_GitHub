/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Revista extends Material {
    
    //Atributos propios
    private int numeroEdicion;
    private String mesPublicacion;
    
    //Cosntructor de la clase 
    public Revista(int id, String titulo, int numeroEdicion, String mesPublicacion) {
        super(id, titulo, true);
        
        //Iniciar atributos
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }
    
    //Metodo sobrescrito
    @Override
    public void mostrarInfo() {
    System.out.println("--- Revista ---");
    System.out.println("ID: " + getId());
    System.out.println("Titulo: " + getTitulo());
    System.out.println("Disponible: " + isDisponible());
    System.out.println("Numero de edicion: " + numeroEdicion);
    System.out.println("Mes de publicacion: " + mesPublicacion);
    }
}

