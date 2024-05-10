package Restaurantes;

public class Restaurante {
    private String nombre;
    private String ciudad;
    private double ingresos;

    // Constructor
    public Restaurante(String nombre, String ciudad, double ingresos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.ingresos = ingresos;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
}

