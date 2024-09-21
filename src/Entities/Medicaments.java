package Entities;

public class Medicaments {
    //attribute
    private String medicament ;
    private double price ;
    //constructor
    public Medicaments(String medicament, double price) {
        this.medicament = medicament;
        this.price = price;
    }
    //méthode
    public void AfficherDetails () {
        System.out.println("Nom du médicaments : " + medicament);
        System.out.println("Le prix du médicaments : " + price + " Ar ");
    }
}
