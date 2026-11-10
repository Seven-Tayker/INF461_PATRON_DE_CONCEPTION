public class Client {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println("............Methode 2: Abstract Factory............");
        ProduitFactory produitfactoryA = new ProduitFactoryA();
        ProduitFactory produitfactoryB = new ProduitFactoryB();
        ProduitFactory produitfactoryC = new ProduitFactoryC();
        ProduitFactory produitfactoryD = new ProduitFactoryD();
        Produit produit = null;
 
        // affiche un produit de type A
        produit = produitfactoryA.getProduit();
        produit.methodeproduit();
        // affiche un produit de type B
        produit = produitfactoryB.getProduit();
        produit.methodeproduit();
        // affiche un produit de type C
        produit = produitfactoryC.getProduit();
        produit.methodeproduit();
        // affiche un produit de type D
        produit = produitfactoryD.getProduit();
        produit.methodeproduit();
    }
}
