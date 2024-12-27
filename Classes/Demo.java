
class Laptop {
    String model;
    int price;

    // public String toString() {
    // return model + price;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public boolean equals(Laptop that) {
    // if (this.model.equals(that.model) && this.price == that.price) {

    // return true;
    // } else {
    // return false;
    // }
    // };

}

public class Demo {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.price = 100;
        obj.model = "Lenovo";

        Laptop obj2 = new Laptop();
        obj2.price = 100;
        obj2.model = "Lenovo2";

        boolean res = obj.equals(obj2);
        System.out.println(res);
    }
}
