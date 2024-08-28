package icare.controller;


import icare.model.deptModel;
import icare.service.deptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
