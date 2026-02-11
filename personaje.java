public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean protegido;

    private Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.protegido = false;
        this.inventario = new Inventario();
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Nivel: " + nivel + " | Vida: " + puntosVida);
    }

    public void bajarVida(int cantidad) {
        int danoFinal = cantidad;

        if (protegido) {
            danoFinal = cantidad / 2;
            System.out.println(nombre + " está protegido. Daño reducido a " + danoFinal);
        }

        puntosVida -= danoFinal;

        if (puntosVida < 0) {
            puntosVida = 0;
        }

        System.out.println(nombre + " recibe " + danoFinal + " de daño. Vida actual: " + puntosVida);
    }

    public void curar(int cantidad) {
        puntosVida += cantidad;
        System.out.println(nombre + " se cura " + cantidad + ". Vida actual: " + puntosVida);
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void agregarEquipamiento(Equipamiento equipamiento) {
        inventario.agregarEquipamiento(equipamiento);
        System.out.println(nombre + " ha añadido " + equipamiento.getNombre() + " al inventario.");
    }

    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }

    public boolean estaProtegido() {
        return protegido;
    }

    public String getNombre() {
        return nombre;
    }
}