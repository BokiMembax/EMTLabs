package org.companymanagementservice.domain.models;

import jakarta.persistence.*;
import org.companymanagementservice.domain.valueobjects.Email;
import org.sharedkernel.domain.base.AbstractEntity;

import java.util.Set;

@Entity
@Table(name="company")
public class Company extends AbstractEntity<CompanyId> {

    private String companyName;

    private String embs;

    private Email email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Truck> truckList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<User> userList;

    public Company() {

    }
}
