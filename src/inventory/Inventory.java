package inventory;
import product.Product;

public class Inventory {
        private Product product;
        private int quantity;

        public Inventory(Product p, int q){
            this.product = p;
            this.quantity = q;
        }

        public void addQuantity(int q){
            this.quantity += q;
        }

        public void removeQuantity(int q){
            this.quantity -= q;
        }

        @Override
        public String toString(){
            return "Inventory of " + this.quantity + product.getName();
        }
}
