enum LapTop {
    MacBook(2000), Lenovo(1000), HP, Dell(36666);

    private int price;

    private LapTop(int price) {
        this.price = price;
        System.out.println("Count");

    }

    private LapTop() {
        price = 25;
        System.out.println("one");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class EnumClass {
    public static void main(String[] args) {
        LapTop lap = LapTop.MacBook;
        // System.out.println(lap.getPrice());

        for (LapTop i : LapTop.values()) {
            System.out.println(i.getPrice());
        }

    }
}