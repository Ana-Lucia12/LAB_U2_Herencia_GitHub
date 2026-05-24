/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author verom
 */
public class Tesis extends Material{
    // Atributos de la tesis
    private String autor;
    private String universidad;
    private int anioPublicacion;
    
    // Constructor
   public Tesis(int id, String titulo, String autor, String universidad, int anioPublicacion) {
        super(id, titulo, true);// Llama al constructor de Material
        //Atributos propios
        this.autor = autor;
        this.universidad = universidad;
        this.anioPublicacion = anioPublicacion;
    }
   
   //método mostrarInfo()
   @Override
    public void mostrarInfo() {
        System.out.println("--- Tesis ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Autor: " + autor);
        System.out.println("Universidad: " + universidad);
        System.out.println("Año: " + anioPublicacion);
    }
    
    // Lógica adicional: Verifica si la tesis es reciente o antigua
    public void verificarAntiguedad() {
        int anioActual = 2026; // Año actual
        if ((anioActual - this.anioPublicacion) <= 5) {
            System.out.println("La tesis '" + getTitulo() + "' es reciente (menos de 5 años).");
        } 
        else {
            System.out.println("La tesis '" + getTitulo() + "' es antigua (más de 5 años).");
        }
    }
}
