package persistence.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "volumes_number")
    private int volumeNumber;
    @Column(name = "book_type")
    private String bookType;
    @Column(name = "borrowed")
    private boolean borrowed;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Author author;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sectiion_id")
    private Section section;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "persons_books", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {@JoinColumn(name = "person_id")})
    private Set<Person> personSet;

    public Book(String name, int volumeNumber, String bookType, boolean borrowed, Author author, Section section) {
        this.name = name;
        this.volumeNumber = volumeNumber;
        this.bookType = bookType;
        this.borrowed = borrowed;
        this.author = author;
        this.section = section;
    }
    public Book(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(int volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", volumeNumber=" + volumeNumber +
                ", bookType='" + bookType + '\'' +
                ", borrowed=" + borrowed +
                ", author=" + author +
                ", section=" + section +
                '}';
    }
}
