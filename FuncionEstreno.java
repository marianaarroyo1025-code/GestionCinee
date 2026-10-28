
package CasoBCine;
import java.util.Scanner;
    public class FuncionEstreno extends FuncionCine {
    private double recargoEstreno; // Tarifa o recargo extra por sala VIP / Estreno

    public FuncionEstreno() {
        super();
        this.recargoEstreno = 5000.0; // Valor extra por defecto
    }

    public FuncionEstreno(String tituloPelicula, String sala, int asientosOcupados, double recargoEstreno) {
        super(tituloPelicula, sala, asientosOcupados);
        this.recargoEstreno = recargoEstreno;
        calcularRecaudacionEstreno();
    }

    @Override
    public void ingresar() {
        super.ingresar(); // Llama al ingresar del padre
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL RECARGO ADICIONAL POR ESTRENO/VIP: ");
        this.recargoEstreno = teclado.nextDouble();
        calcularRecaudacionEstreno();
    }

    // Modifica el cálculo de la recaudación incluyendo el recargo de estreno
    public void calcularRecaudacionEstreno() {
        double total = getAsientosOcupados() * (TARIFA_BASE + recargoEstreno);
        setRecaudacion(total);
    }

    public double getRecargoEstreno() {
        return recargoEstreno;
    }
}

