public class Movie extends Product{

    private String director;

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public Movie() {}

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        setPrice(getPrice()-(getPrice()*0.15));
        return this.getPrice();
    }

    public String toString() {
        return ("Name: "+ getName()+"\nPrice: "+getPrice()+"\nDirector: "+director);
    }
}
