public class Book extends Product{

    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public Book() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        setPrice(getPrice()-(getPrice()*0.2));
        return getPrice();
    }

    @Override
    public String toString() {
        return ("Name: "+ getName()+"\nPrice: "+getPrice()+"\nAuthor: "+author);
    }
}
