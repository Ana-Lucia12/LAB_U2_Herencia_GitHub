/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yarie
 */

//  CLASE ABSTRACTA
public abstract class Material {
    
    private final int id;
    private String titulo;
    private boolean disponible;
    private static int contadorMateriales;
    
    // CONSTRUCTOR
    public Material(int id, String titulo, boolean disponible){
    
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    
        contadorMateriales++;
    }

    // GETTERS Y SETTERS
    public int getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static int getContadorMateriales() {
        return contadorMateriales;
    }
    
    //MÉTODO PRESTAR
    public void prestar() {
        
        if(disponible == false){
            System.out.println("Ya esta prestado este material.");
        } else {
            disponible = false;
            System.out.println("Se presto el material correctamente.");  
        }
    }
    //MÉTODO DEVOLVER
    public void devolver() {
        if(disponible) {
            System.out.println("El material ya había sido devuelto.");
        } else{
            disponible = true;
            System.out.println("El material fue devuelto correctamente.");
        }
    }
    
    // MÉTODO PARA MOSTRAR INFROMACIÓN
    public abstract void mostrarInfo();
}


