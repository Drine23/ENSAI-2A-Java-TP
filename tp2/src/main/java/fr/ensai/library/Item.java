package fr.ensai.library;

public abstract class Item {
    protected String title;
    protected int year;
    protected int pageCount;

    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }
    public String toString() {
        return "Item " + this.title +"in"+this.year +"with"+this.pageCount+"pages";
    }

}
