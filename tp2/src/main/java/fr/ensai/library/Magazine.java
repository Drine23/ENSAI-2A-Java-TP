package fr.ensai.library;

/**
 * Represents a magazine.
 */
public class Magazine extends Item {

    // Attributes
    private String issn;
    private String issueNumber;


    /**
     * Constructs a new Magazine object.
     */
    public Magazine(String issn, String title, String issueNumber, int year, int pageCount) {
        super(title,year,pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine" + this.title + this.issueNumber;
    }

}