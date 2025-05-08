package com.example.taller.Publico;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy="role",fetch= FetchType.EAGER)
    private List<User> user;

    @OneToMany(mappedBy="roles",fetch= FetchType.EAGER)
    private List<Granted_permission> granted_permission;

    public Role() {
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    } 

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Granted_permission> getGranted_permission() {
        return granted_permission;
    }

    public void setGranted_permission(List<Granted_permission> granted_permission) {
        this.granted_permission = granted_permission;
    }
    


}
