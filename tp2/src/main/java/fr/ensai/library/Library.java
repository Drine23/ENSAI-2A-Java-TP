package fr.ensai.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a library.
 */
public class Library {

    // Attributes
    private String name;
    private List<Item> items ;

    /**
     * Constructs a new Book object.
     */
    public Library(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    public void displayItems(){
        if (this.items.isEmpty()){
            System.out.println("la liste est vide");
        }
        else{
            for (Item item : this.items){
                System.out.println(item);
        }
    }
}
    public void loadBooksFromCSV(String filePath) {

        URL url = getClass().getClassLoader().getResource(filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            Map<String, Author> authors = new HashMap<>();
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String isbn = data[0].trim();
                    String title = data[1].trim();
                    String authorName = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    int pageCount = Integer.parseInt(data[4].trim());

                    // Check if author already exists in the map
                    Author author = authors.get(authorName);
                    if (author == null) {
                        author = new Author(authorName,0,"");
                        authors.put(authorName, author);
                        System.out.println(author.toString());
                    }
                    Book book = new Book(isbn, title, author, year, pageCount);

                    this.addItem(book);
                }
            }
        } catch (

        IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }}