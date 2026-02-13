public class main {
    public static void main(String[] args) {

        Mago mago = new Mago("Merlín", 5, 80, 50);
        Guerrero guerrero = new Guerrero("Conan", 6, 120);
        Ladron ladron = new Ladron("Sombra", 4, 70);

        System.out.println("INFO INICIAL");
        mago.mostrarInfo();
        System.out.println();
        guerrero.mostrarInfo();
        System.out.println();
        ladron.mostrarInfo();

        System.out.println("\nEQUIPAMIENTO");
        mago.agregarEquipamiento(new Equipamiento("Varita antigua", "arma"));
        guerrero.agregarEquipamiento(new Equipamiento("Escudo de hierro", "armadura"));
        ladron.agregarEquipamiento(new Equipamiento("Daga rápida", "arma"));

        System.out.println("\nInventario del mago:");
        mago.getInventario().mostrarInventario();

        System.out.println("\nCOMBATE / PROTECCIÓN");
        guerrero.proteger(mago);
        mago.bajarVida(30);

        System.out.println("\nEl guerrero cambia a quién protege:");
        guerrero.proteger(ladron);

        System.out.println("\nAhora el mago ya no está protegido:");
        mago.bajarVida(30);

        System.out.println("\nMAGIA");
        mago.lanzarHechizo(20);
        mago.lanzarHechizo(40);
        mago.recargarMana(30);
        mago.lanzarHechizo(40);

        System.out.println("\nROBO / INVISIBILIDAD");
        ladron.robar();
        ladron.hacerseInvisible();
        ladron.robar();

        System.out.println("\nCURACIÓN");
        mago.curar(15);

        System.out.println("\nFIN: INFO FINAL");
        mago.mostrarInfo();
        System.out.println();
        guerrero.mostrarInfo();
        System.out.println();
        ladron.mostrarInfo();
    }
}
