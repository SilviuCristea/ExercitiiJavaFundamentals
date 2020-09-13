package entryPoint;

import business.dto.AuthorDTO;
import business.dto.BookDTO;
import business.dto.PersonDTO;
import business.dto.SectionDTO;
import business.service.AuthorService;
import business.service.BookService;
import business.service.PersonService;
import business.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryEntryPoint {

    @Autowired
    AuthorService authorService;
    @Autowired
    BookService bookService;
    @Autowired
    PersonService personService;
    @Autowired
    SectionService sectionService;

    public void run(){
        AuthorDTO authorDTO = new AuthorDTO("Stanescu", "Nichita");
        authorService.insert(authorDTO);
        AuthorDTO authorDTO1 = new AuthorDTO("Sadoveanu", "Mihail");
        authorService.insert(authorDTO1);

        BookDTO bookDTO = new BookDTO("Padurea spanzuratilor", 3, "Drama", true );
        bookService.insert(bookDTO);
        BookDTO bookDTO1 = new BookDTO("Enigma Otiliei", 1, "Drama", false);
        bookService.insert(bookDTO);

        PersonDTO personDTO = new PersonDTO("Avutu", "Paul", 1990);
        personService.insert(personDTO);
        PersonDTO personDTO1 = new PersonDTO("Zgarcitu", "Gheorghe", 1995);
        personService.insert(personDTO1);

        SectionDTO sectionDTO = new SectionDTO("Drama");
        sectionService.insert(sectionDTO);
        SectionDTO sectionDTO1 = new SectionDTO("Comedie");
        sectionService.insert(sectionDTO1);
    }
}
