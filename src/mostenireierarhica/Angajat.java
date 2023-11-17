package mostenireierarhica;

public class Angajat extends Taran {
    private String specializare;
    public Angajat(){}
    public Angajat(String nume , String prenume , int campuri , String specializare){
        super(nume , prenume , campuri );
        this.specializare=specializare;
    }

    @Override
    public void Descriere() {
        System.out.println("introdu numele , prenumele , numarul de campuri , specializarea");
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Angajat{" + '\n' +
                "nume = " + super.getNume() + '\n' +
                "prenume = " + super.getPrenume() + '\n' +
                "campuri=" + super.getCampuri() + '\n' +
                "specializare=" + getSpecializare() + '\n' +
                '}';
    }
}
