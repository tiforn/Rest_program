package ua.lviv.iot.spring.first.buisness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.first.dataAccess.SubjectRepository;
import ua.lviv.iot.spring.first.rest.model.Subject;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

}
