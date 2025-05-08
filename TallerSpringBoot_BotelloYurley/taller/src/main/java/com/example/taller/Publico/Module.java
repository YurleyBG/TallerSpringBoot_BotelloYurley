package com.example.taller.Publico;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Module {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String base_path, name;

    @OneToMany(mappedBy="module",fetch= FetchType.EAGER)
    private List<Operation> operation;


    public Module(Long id, String base_path, String name) {
        this.id = id;
        this.base_path = base_path;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBase_path() {
        return base_path;
    }
    public void setBase_path(String base_path) {
        this.base_path = base_path;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Operation> getOperation() {
        return operation;
    }
    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    


}
