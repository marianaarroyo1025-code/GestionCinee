
package CasoBCine;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA FUNCION ESTRENO ---");
        FuncionEstreno estreno = new FuncionEstreno();
        estreno.ingresar(); // Ingresa datos por consola
        
        System.out.println("\n--- RESULTADOS ESTRENO ---");
        System.out.println("Película: " + estreno.getTituloPelicula());
        System.out.println("Sala: " + estreno.getSala());
        System.out.println("Asientos Ocupados: " + estreno.getAsientosOcupados());
        System.out.println("Recaudación Total (con recargo): $" + estreno.getRecaudacion() + " COP");

        System.out.println("\n----------------------------------");
        System.out.println("--- PRUEBA FUNCION NORMAL ---");
        FuncionNormal normal = new FuncionNormal();
        normal.ingresar();
        
        System.out.println("\n[Simulación] Vendiendo 5 entradas...");
        normal.venderEntradas(5);

        System.out.println("\n--- RESULTADOS FUNCION NORMAL ---");
        System.out.println("Película: " + normal.getTituloPelicula());
        System.out.println("Sala: " + normal.getSala());
        System.out.println("Asientos Ocupados Actuales: " + normal.getAsientosOcupados());
        System.out.println("Recaudación Base: $" + normal.getRecaudacion() + " COP");
        System.out.println("Capacidad Restante en Sala: " + normal.getCapacidadDisponible());
    }
}
