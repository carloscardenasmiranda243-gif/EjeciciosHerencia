public abstract class Animal {
    protected String alias;
    protected int nivelEnergia;

    public Animal(String alias) {
        this.alias = alias;
        this.nivelEnergia = 100;
    }

    public abstract void hacerSonido();

    public void moverse() {
        System.out.println(alias + " se está moviendo.");
    }

    public void dormir() {
        System.out.println(alias + " está durmiendo.");
    }

    public void comer() {
        System.out.println(alias + " está comiendo.");
    }
}