package org.companymanagementservice.domain.valueobjects;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import org.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Email implements ValueObject {
    private final String email;

    protected Email() {
        this.email = "default@email.com";
    }
}
