package rvt.exercises;

public class Book {
    public String name;
    public int published;
    public String author;

    public Book(String name, int published, String author) {
        this.name = name;
        this.published = published;
        this.author = author;
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
            return this.published;
        }
        return this.published + this.name.hashCode();
    }
}
