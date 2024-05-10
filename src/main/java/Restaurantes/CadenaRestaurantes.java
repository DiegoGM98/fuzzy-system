package Restaurantes;
import java.util.ArrayList;

public class CadenaRestaurantes {
    private ArrayList<Restaurante> locales;

    // Constructor
    public CadenaRestaurantes() {
        this.locales = new ArrayList<>();
    }

    // Métodos
    public void agregarRestaurante(Restaurante restaurante) {
        locales.add(restaurante);
    }

    public Restaurante buscarRestaurantePorNombre(String nombre) {
        for (Restaurante r : locales) {
            if (r.getNombre().equals(nombre)) {
                return r;
            }
        }
        return null;
    }

    public void eliminarRestaurante(Restaurante restaurante) {
        locales.remove(restaurante);
    }

    // Nuevo método para obtener la lista de locales
    public ArrayList<Restaurante> getLocales() {
        return locales;
    }
}

