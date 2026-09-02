public class Pajaro extends Animal {
    private double dimensionAlar;

    public Pajaro(String alias, double dimensionAlar) {
        super(alias);
        this.dimensionAlar = dimensionAlar;
    }

    @Override
    public void hacerSonido() {
        System.out.println(alias + " canta: ¡Pío, pío!");
    }

    public void volar() {
        System.out.println(alias + " está volando por los cielos.");
    }

    public double getDimensionAlar() {
        return dimensionAlar;
    }

    public void setDimensionAlar(double dimensionAlar) {
        this.dimensionAlar = dimensionAlar;
    }
}