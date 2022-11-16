package com.gitpher.prac4brains;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class CrudRestController {

    private final CrudService crudService;

    @GetMapping("/companyList")
    public ResponseEntity<List<Company>> getCompanyList() {
        return new ResponseEntity<List<Company>>(crudService.getCompanyList(), HttpStatus.OK);
    }

    @GetMapping("/company/{id}")
    public ResponseEntity<Company> getCompany(@PathVariable Long id) {
        return new ResponseEntity<Company>(crudService.getCompanyById(id), HttpStatus.OK);
    }

    @PostMapping("/company/save")
    public ResponseEntity<Void> saveOrUpdateCompany(@RequestBody Company company) {
        crudService.saveOrUpdateCompany(company);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/company/delete/{id}")
    public ResponseEntity<Void> deleteCompany(@PathVariable Long id) {
        crudService.deleteCompany(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
