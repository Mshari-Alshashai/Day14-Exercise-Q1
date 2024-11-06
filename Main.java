public class Main {
    public static void main(String[] args) {

    Book b1 = new Book("Lord of The Rings",24.99,"Tolken");
    Movie m1 = new Movie("Gladiator",15.99,"Ridley Scott");

    b1.getDiscount();
    m1.getDiscount();
        System.out.println(b1.toString());
        System.out.println("========================");
        System.out.println(m1.toString());

    }
}