public abstract class Postre {
    private String nombre;
    private int tamano;
    private double precio;

    public Postre(String nombre, int tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    public void preparar(){
        System.out.println("Preparando");
    }
    public void servir(){
        System.out.println("Servir");
    }
}
