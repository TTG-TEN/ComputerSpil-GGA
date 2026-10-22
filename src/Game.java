public class Game {
    private int gameÍd;
    private String title;
    private String genre;
    private double price;


    public Game(int gameÍd, String title, String genre, double price) {
        this.gameÍd = gameÍd;
        this.genre = genre;
     this.title = title;
     this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getGameÍd() {
        return gameÍd;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGameÍd(int gameÍd) {
        this.gameÍd = gameÍd;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }
public void displayDetails() {
        System.out.println("Spil ID: " + gameÍd);
        System.out.println("Navn: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Pris: " + price);

    }
}






