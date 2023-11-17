package mosteniresimpla;

public class Lexus extends Masina {
    private String culoarea;

    public Lexus(String brand, double anul, double locuri, String culoarea) {
        super(brand, anul, locuri);
        this.culoarea = culoarea;
    }
    @Override
    public void categorie(){
        System.out.println("sedan");
    }

    public String getCuloarea() {
        return culoarea;
    }

    public void setCuloarea(String culoarea) {
        this.culoarea = culoarea;
    }

    @Override
    public String toString() {
        return "Lexus{" + '\n' +
                "culoarea = " + getCuloarea() + '\n' +
                "brand = " + super.getBrand() + '\n' +
                "locuri = " + super.getLocuri() + '\n' +
                "anul = " + super.getAnul() + '\n' +
                '}';
    }
}

