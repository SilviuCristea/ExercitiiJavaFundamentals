package business.service;


import business.dto.AuthorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.dao.AuthorDAO;
import persistence.entities.Author;

@Service
public class AuthorService {

    @Autowired
    AuthorDAO authorDAO;

    AuthorDTO authorDTO = new AuthorDTO();

    public void insert(AuthorDTO authorDTO){
        Author author = new Author();
        author.setName(authorDTO.getName());
        author.setFirstName(authorDTO.getFirstName());
        authorDAO.insert(author);
    }


}
