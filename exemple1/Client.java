public class Client {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println("bonjour le monde");
 
        FabriqueProduit fabriqueproduit = new FabriqueProduit();
        Produit produit = null;
 
        //affiche un produit de type A
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeA);
        produit.methodeproduit();
        //affiche un produit de type B
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeB);
        produit.methodeproduit();
        //affiche un produit de type C
        produit = fabriqueproduit.createProduit(fabriqueproduit.typeC);
        produit.methodeproduit();
        //produit inexistant
        String e = "D";
        try {
            produit = fabriqueproduit.createProduit(e);
            produit.methodeproduit();
        } catch (IllegalArgumentException ex) {
            System.out.println("Erreur : " + ex.getMessage());
        }
    }
}
