package org.companymanagementservice.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NonNull;
import org.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class FullName implements ValueObject {
    private final String firstName;
    private final String lastName;

    public FullName(@NonNull String firstName, @NonNull String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
