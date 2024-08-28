package icare.service;

import icare.model.deptModel;

import icare.repository.deptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class deptService {

    @Autowired
    private deptRepo repository;

    public List<deptModel> findAll() {
        return repository.findAll();
    }

    public Optional<deptModel> findById(String id) {
        return repository.findById(id);
    }
}
