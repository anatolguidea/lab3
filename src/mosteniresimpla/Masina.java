package mosteniresimpla;

abstract class Masina {
    private String brand;
    private double locuri;
    private double anul;
    public Masina(String brand , double anul , double locuri){
        this.brand=brand;
        this.anul=anul;
        this.locuri=locuri;
    }
    public abstract void categorie();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLocuri() {
        return locuri;
    }

    public void setLocuri(double locuri) {
        this.locuri = locuri;
    }

    public double getAnul() {
        return anul;
    }

    public void setAnul(double anul) {
        this.anul = anul;
    }

    @Override
    public String toString() {
        return "Lexus{" + '\n' +
                "brand=" + getBrand() + '\n' +
                "locuri=" + getLocuri() + '\n' +
                "anul=" + getAnul() + '\n' +
                '}';
    }
}
