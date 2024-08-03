public class Relleno implements Ingrediente{
    private String sabor;
    private int cantidad;

    public Relleno(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Sabor "+sabor;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
