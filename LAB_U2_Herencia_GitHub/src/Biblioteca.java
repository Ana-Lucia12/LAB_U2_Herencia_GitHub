/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josue Castillo
 */
package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    // Agregar material
    public void agregarMaterial(Material material) {

        materiales.add(material);

        System.out.println("Material agregado correctamente.");
    }

    // Listar materiales
    public void listarMateriales() {

        if (materiales.isEmpty()) {

            System.out.println("No hay materiales registrados.");
            return;
        }

        for (Material material : materiales) {

            material.mostrarInfo();
            System.out.println("----------------");
        }
    }

    // Buscar por ID
    public Material buscarPorId(int id) {

        for (Material material : materiales) {

            if (material.getId() == id) {
                return material;
            }
        }

        return null;
    }

    // Prestar material
    public void prestarMaterial(int id) {

        Material material = buscarPorId(id);

        if (material != null) {

            material.prestar();

        } else {

            System.out.println("Material no encontrado.");
        }
    }

    // Devolver material
    public void devolverMaterial(int id) {

        Material material = buscarPorId(id);

        if (material != null) {

            material.devolver();

        } else {

            System.out.println("Material no encontrado.");
        }
    }

    // Mostrar total materiales
    public void mostrarTotalMateriales() {

        System.out.println("Total materiales: "
                + Material.getContadorMateriales());
    }
}