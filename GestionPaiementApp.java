public class GestionPaiementApp {
    public static void main(String[] args) {
        CarteCredit carte = new CarteCredit(100.0, "1234-5678-9012-3456");
        PayPal paypal = new PayPal(50.0, "email@example.com");

        Commande commande1 = new Commande(100.0, carte);
        Commande commande2 = new Commande(50.0, paypal);

        System.out.println("Traitement de la commande 1 :");
        commande1.processPayment();

        System.out.println("\nTraitement de la commande 2 :");
        commande2.processPayment();
    }
}
