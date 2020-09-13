package business.dto;

import persistence.entities.Author;
import persistence.entities.Section;

public class BookDTO {
    private String name;
    private int volumeNumber;
    private String bookType;
    private boolean borrowd;


    public BookDTO(String name, int volumeNumber, String bookType, boolean borrowd) {
        this.name = name;
        this.volumeNumber = volumeNumber;
        this.bookType = bookType;
        this.borrowd = borrowd;
    }
    public BookDTO(){

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

    public boolean isBorrowd() {
        return borrowd;
    }

    public void setBorrowd(boolean borrowd) {
        this.borrowd = borrowd;
    }



    @Override
    public String toString() {
        return "BookDTO{" +
                "name='" + name + '\'' +
                ", volumeNumber=" + volumeNumber +
                ", bookType='" + bookType + '\'' +
                ", borrowd=" + borrowd +
                '}';
    }
}
