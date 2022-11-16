package com.gitpher.prac4brains;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CrudService {

    private final CrudRepository crudRepository;


    public List<Company> getCompanyList() {
        return crudRepository.findAll();
    }

    public Company getCompanyById(Long id) {
        return crudRepository.findById(id).get();
    }

    public void saveOrUpdateCompany(Company company) {
        crudRepository.save(company);
    }

    public void deleteCompany(Long id) {
        crudRepository.deleteById(id);
    }


}
