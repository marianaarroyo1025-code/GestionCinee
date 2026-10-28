package CasoBCine;

import java.util.Scanner;

public class FuncionNormal extends FuncionCine {
    private int capacidadDisponible;

    public FuncionNormal() {
        super();
        this.capacidadDisponible = 100; // Asientos libres simulados
    }

    public FuncionNormal(String tituloPelicula, String sala, int asientosOcupados, int capacidadDisponible) {
        super(tituloPelicula, sala, asientosOcupados);
        this.capacidadDisponible = capacidadDisponible;
    }

    @Override
    public void ingresar() {
        super.ingresar();
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE LA CAPACIDAD DISPONIBLE DE LA SALA: ");
        this.capacidadDisponible = teclado.nextInt();
    }

    // Simulación de venta de entradas gestionando disponibilidad
    public void venderEntradas(int cantidad) {
        if (cantidad > 0 && cantidad <= capacidadDisponible) {
            setAsientosOcupados(getAsientosOcupados() + cantidad);
            capacidadDisponible -= cantidad;
            calcularRecaudacionBase(); // Aplica tarifa base estándar sin recargos
            System.out.println("¡Venta de " + cantidad + " entradas realizada con éxito!");
        } else {
            System.out.println("Error: No hay suficiente disponibilidad o la cantidad es inválida.");
        }
    }

    public int getCapacidadDisponible() {
        return capacidadDisponible;
    }
    
    
}
