public class Book {
    // instance variables
    private String title;
    private int year;
    private boolean isRead;

    // constructor with title and year
    public Book(String title, int year) {
        this.title = title;
        this.year = year;
        this.isRead = false;
    }

    // constructor with title and default year
    public Book(String title) {
        this.title = title;
        this.year = 1960; // default year
        this.isRead = false;
    }

    // setter for isRead
    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    // getter for isRead
    public boolean isRead() {
        return isRead;
    }

    // toString method for output representation
    @Override
    public String toString() {
        return "This Book  \ntitle: " + title + ",  \n year of publication: " + year + ",  \n read: " + isRead;
    }

    public static void main(String[] args) {
        // test code
        int year = 1975;
        String title = "The Findrinarf City";
        Book b1 = new Book(title, year);
        System.out.println(b1);
        b1.setRead(true);
        System.out.println(b1);

        title = "The Prophecy of Pilmene";
        Book b2 = new Book(title);
        System.out.println(b2);
        b2.setRead(true);
        System.out.println("The book has now been read: " + b2.isRead());
    }
}

