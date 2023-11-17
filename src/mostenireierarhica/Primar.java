package mostenireierarhica;

public class Primar extends Angajat {
    private String mandat;
    public Primar(){}
    public Primar(String nume , String prenume ,int campuri , String specializare , String mandat){
        super(nume, prenume, campuri, specializare);
        this.mandat=mandat;
    }

    @Override
    public void Descriere() {
        System.out.println("introdu numele , prenumele , numarul de campuri , specializarea , locul mandatului");
    }

    public String getMandat() {
        return mandat;
    }

    public void setMandat(String mandat) {
        this.mandat = mandat;
    }
    @Override
    public String toString() {
        return "Primar{" + '\n' +
                "nume = " + super.getNume() + '\n' +
                "prenume = " + super.getPrenume() + '\n' +
                "campuri=" + super.getCampuri() + '\n' +
                "specializare=" + super.getSpecializare() + '\n' +
                "mandat= " + getMandat() + '\n' +
                '}';
    }
}
