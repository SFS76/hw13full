public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book("War and Peace", author, 2000);
        System.out.println( book.toString());
        book.setPublishingYear(2020);
        System.out.println( book.toString());


        Author author2 = new Author("Lewis", "Carrol");
        Book book2 = new Book("Alis in mirror", author2, 2011);
        System.out.println( book2.toString());
        book2.setPublishingYear(2020);
        System.out.println( book2.toString());

        System.out.println(book2.equals(book));

        Book book3 = new Book("War and Peace", author, 2010);
        System.out.println(book3.equals(book));
    }
}