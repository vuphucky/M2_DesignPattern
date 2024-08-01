// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {
        System.out.println("begin test");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2= new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("bookBorrower1 asked to borrow the book");
        System.out.println("bookBorrower1 author and title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("bookBorrower2 asked to borrow the book");
        System.out.println("bookBorrower2 author and title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("bookBorrower1 return the book");

        bookBorrower2.borrowBook();
        System.out.println("bookBorrower2 author and title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("end testing");
    }
}