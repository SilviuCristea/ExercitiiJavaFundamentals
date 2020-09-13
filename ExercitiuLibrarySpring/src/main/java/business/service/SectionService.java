package business.service;

import business.dto.SectionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.dao.SectionDAO;
import persistence.entities.Section;

@Service
public class SectionService {

    @Autowired
    SectionDAO sectionDAO;

    public void insert(SectionDTO sectionDTO){
        Section section = new Section();
        section.setName(sectionDTO.getName());
        sectionDAO.insert(section);
    }
}
