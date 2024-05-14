package org.companymanagementservice.domain.models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.companymanagementservice.domain.valueobjects.Email;
import org.companymanagementservice.domain.valueobjects.FullName;
import org.sharedkernel.domain.base.AbstractEntity;

import java.util.Date;

@Entity
@Table(name="user")
public class User extends AbstractEntity<UserId> {

    private Email email;

    private Date dateOfEmployment;

    private FullName fullName;

    @AttributeOverride(name = "id", column = @Column(name = "companyId"))
    private CompanyId companyId;

    public User() {

    }
}
