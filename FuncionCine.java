
package CasoBCine;

import java.util.Scanner;

public final class FuncionCine {


   public static final double TARIFA_BASE = 12000.0;


    private String tituloPelicula;
    private String sala;
    private int asientosOcupados;
    private double recaudacion;


    public FuncionCine() {
        this.tituloPelicula = "";
        this.sala = "";
        this.asientosOcupados = 0;
        this.recaudacion = 0.0;
    }


    public FuncionCine(String tituloPelicula, String sala, int asientosOcupados) {
        setTituloPelicula(tituloPelicula);
        setSala(sala);
        setAsientosOcupados(asientosOcupados);
        calcularRecaudacionBase();
    }


    public void ingresar() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("INGRESE EL TITULO DE LA PELICULA: ");
        setTituloPelicula(teclado.nextLine());
        
        System.out.println("INGRESE LA SALA DE CINE: ");
        setSala(teclado.nextLine());
        
        System.out.println("INGRESE LA CANTIDAD DE ASIENTOS OCUPADOS: ");
        int asientos = teclado.nextInt();
        setAsientosOcupados(asientos);
        
        calcularRecaudacionBase();
    }


    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public String getSala() {
        return sala;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public double getRecaudacion() {
        return recaudacion;
    }


    public void setTituloPelicula(String tituloPelicula) {
        if (tituloPelicula != null && !tituloPelicula.trim().isEmpty()) {
            this.tituloPelicula = tituloPelicula;
        } else {
            this.tituloPelicula = "Desconocida";
        }
    }

    public void setSala(String sala) {
        if (sala != null && !sala.trim().isEmpty()) {
            this.sala = sala;
        } else {
            this.sala = "General";
        }
    }

    public void setAsientosOcupados(int asientosOcupados) {
        if (asientosOcupados >= 0) {
            this.asientosOcupados = asientosOcupados;
        } else {
            System.out.println("Error: Los asientos ocupados no pueden ser negativos.");
            this.asientosOcupados = 0;
        }
    }

    public void setRecaudacion(double recaudacion) {
        if (recaudacion >= 0) {
            this.recaudacion = recaudacion;
        } else {
            System.out.println("Error: La recaudación no puede ser negativa.");
            this.recaudacion = 0.0;
        }
    }


    public void calcularRecaudacionBase() {
        this.recaudacion = this.asientosOcupados * TARIFA_BASE;
    }
}