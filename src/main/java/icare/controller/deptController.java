package icare.controller;


import icare.model.deptModel;
import icare.service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/departments")
public class deptController {

    @Autowired
    private deptService service;

    @GetMapping
    public List<deptModel> getAllDepartments() {
        List<deptModel> departments = service.findAll();
        return departments;
    }
}
