package business.service;

import business.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.dao.BookDAO;
import persistence.entities.Book;

@Service
public class BookService {

    @Autowired
    BookDAO bookDAO;

    public void insert(BookDTO bookDTO){
        Book book = new Book();
        book.setName(bookDTO.getName());
        book.setVolumeNumber(bookDTO.getVolumeNumber());
        book.setBookType(bookDTO.getBookType());
        book.setBorrowed(bookDTO.isBorrowd());
        bookDAO.insert(book);
    }

}
