public class ProduitFactoryD extends ProduitFactory {
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitD();
        return produit;
    }
}
