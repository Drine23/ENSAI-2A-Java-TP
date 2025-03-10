package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        Library library = new Library("library1");
        Magazine magazine1 = new Magazine("issn1","magasine1","350",2000,20);
        Magazine magazine2 = new Magazine("issn2","magasine2","35",2001,30);
        library.addItem(magazine1);
        library.addItem(magazine2);
        System.err.println(library);
        library.loadBooksFromCSV("books.csv");
        library.displayItems();

    }
}