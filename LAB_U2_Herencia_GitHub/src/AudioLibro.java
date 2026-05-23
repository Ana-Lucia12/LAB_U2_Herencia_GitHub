/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author verom
 */
public class AudioLibro extends Material{
    // Atributos del audiolibro
    private String narrador;
    private int duracionMinutos;
    
    // Constructor
    public AudioLibro(int id, String titulo, String narrador, int duracionMinutos) {
        super(id, titulo, true); // Llama al constructor de Material
        //Atributos propios
        this.narrador = narrador;
        this.duracionMinutos = duracionMinutos;
    }
    
    //método mostrarInfo()
    @Override
    public void mostrarInfo() {
        System.out.println("--- Audiolibro ---");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Narrador: " + narrador);
        System.out.println("Duración: " + duracionMinutos + " minutos");
    }
    
    // Lógica adicional: Clasifica el audiolibro según cuanto dure
    public void verificarDuracion() {
        if (this.duracionMinutos > 60) {
            System.out.println("El audiolibro '" + getTitulo() + "' es de larga duración.");
        }
        else {
            System.out.println("El audiolibro '" + getTitulo() + "' es de corta duración.");
        }
    }
    
}
