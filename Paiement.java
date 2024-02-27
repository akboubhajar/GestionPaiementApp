class Paiement {
    double montant;

    public Paiement(double montant) {
        this.montant = montant;
    }

    public void effectuerPaiement() {
        System.out.println("Paiement de " + montant + " effectué.");
    }
}

class CarteCredit extends Paiement {
    String numeroCarte;

    public CarteCredit(double montant, String numeroCarte) {
        super(montant);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement() {
        System.out.println("Paiement de " + montant + " effectué par carte de crédit (Numéro de carte : " + numeroCarte + ")");
    }
}

class PayPal extends Paiement {
    String email;

    public PayPal(double montant, String email) {
        super(montant);
        this.email = email;
    }

    @Override
    public void effectuerPaiement() {
        System.out.println("Paiement de " + montant + " effectué via PayPal (Email : " + email + ")");
    }
}

class Commande {
    double montant;
    Paiement moyenPaiement;

    public Commande(double montant, Paiement moyenPaiement) {
        this.montant = montant;
        this.moyenPaiement = moyenPaiement;
    }

    public void processPayment() {
        moyenPaiement.effectuerPaiement();
    }
}

