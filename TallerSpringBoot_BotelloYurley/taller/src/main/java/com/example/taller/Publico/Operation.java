package com.example.taller.Publico;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean permit_all;
    private String http_method,name,path;
    

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="operation_id",nullable = false)
    private Granted_permission Granted_permission ;

    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="module_id",nullable = false)
    private Module module ;

    public Operation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPermit_all() {
        return permit_all;
    }

    public void setPermit_all(boolean permit_all) {
        this.permit_all = permit_all;
    }

    public String getHttp_method() {
        return http_method;
    }

    public void setHttp_method(String http_method) {
        this.http_method = http_method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Granted_permission getGranted_permission() {
        return Granted_permission;
    }

    public void setGranted_permission(Granted_permission granted_permission) {
        Granted_permission = granted_permission;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
    

    
}
