import java.time.LocalDate;

public class Book {
    private String nameBook;
    Author author;
    public int publishingYear;

        public Book (String nameBook, Author author, int publishingYear) {
            this.nameBook = nameBook;
            this.author = new Author(author.getFirstName(), author.getLastName());
            this.publishingYear = publishingYear;
        }

        public String getNameBook() {
            return nameBook;
        }
        public int getPublishingYear() {
            return publishingYear;
        }

        public void setPublishingYear(int publishingYear) {
            if (publishingYear < 1950 || publishingYear > LocalDate.now().getYear() + 1) {
                System.out.println("Invalid publishing year:" + publishingYear);
                return;
            }
            this.publishingYear = publishingYear;

        }
        @Override
        public String toString() {
            return "book = " + nameBook + " author " + author.firstName + " " + author.lastName + " year " + publishingYear;
        }
        @Override
        public boolean equals(Object other) {
            if (this.getClass() != other.getClass()) {
                return false;
            }
            Book book = (Book) other;
            return nameBook.equals(book.nameBook)
                    && author.firstName.equals(book.author.firstName)
                    && author.lastName.equals(book.author.lastName);
        }
        @Override
        public int hashCode() {
            return java.util.Objects.hash(nameBook, author.firstName, author.lastName);
        }
    }