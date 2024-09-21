package Entities;

public class Creme extends Medicaments{
    public Creme(String medicament, double price) {
        super(medicament, price);
    }
    @Override
    public void AfficherDetails() {
        super.AfficherDetails();
        System.out.println("Type: Crème");
        System.out.println("Recommandation: Appliquer directement sur la peau");
    }
}
