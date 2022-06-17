public class ProductManager {

    public Product[] productCart = new Product[0];
    public Product[] findAll() {
        return productCart;
    }

    public void addProduct(Product product) {
        int length = this.productCart.length + 1;
        Product[] tmpProduct = new Product[length];
        for (int i = 0; i < this.productCart.length; i++) {
            tmpProduct[i] = this.productCart[i];
        }
        int lastIndex = tmpProduct.length - 1;
        tmpProduct[lastIndex] = product;
        this.productCart = tmpProduct;
        return;
    }

    public void removeById(int id) {
        for (Product product : findAll()) {
            if (matchesId(product, id)) {
                int length = productCart.length - 1;
                Product[] tmp = new Product[length];
                int index = 0;
                for (Product product1 : productCart) {
                    if (product1.id != id) {
                        tmp[index] = product1;
                        index++;
                        productCart = tmp;
                    }
                }
            }
        }
    }

    public boolean matchesId(Product product, int id) {
        if (product.id == id) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(Product product, String search) {
        if (product.productName.contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : findAll()) {
            if (matches(product, text)) {
                int length = result.length + 1;
                Product[] tmp = new Product[length];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = product;
                result = tmp;
            }
        }
        return result;
    }
}