public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public void lanzarHechizo(int costeMana) {
        if (mana >= costeMana) {
            mana -= costeMana;
            System.out.println(getNombre() + " lanza un hechizo. Mana restante: " + mana);
        } else {
            System.out.println(getNombre() + " no tiene suficiente maná para lanzar el hechizo.");
        }
    }

    public void recargarMana(int cantidad) {
        mana += cantidad;
        System.out.println(getNombre() + " recarga " + cantidad + " de maná. Mana actual: " + mana);
    }

    public int getMana() {
        return mana;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Maná: " + mana);
    }
}