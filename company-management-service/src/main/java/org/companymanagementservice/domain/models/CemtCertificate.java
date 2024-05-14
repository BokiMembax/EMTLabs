package org.companymanagementservice.domain.models;

import jakarta.persistence.*;
import org.sharedkernel.domain.base.AbstractEntity;

import java.util.Date;

@Entity
@Table(name="cemtCertificate")
public class CemtCertificate extends AbstractEntity<CemtCertificateId> {
    private Date expiresOn;

    @AttributeOverride(name = "id", column = @Column(name = "truckId"))
    private TruckId truckId;

    @OneToOne
    @JoinColumn(name = "truckId")
    private Truck truck;
}
