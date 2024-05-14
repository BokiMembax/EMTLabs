package org.companymanagementservice.domain.models;

import jakarta.persistence.*;
import org.sharedkernel.domain.base.AbstractEntity;

import java.util.Date;

@Entity
@Table(name="greenClassCertificate")
public class GreenClassCertificate extends AbstractEntity<GreenClassCertificateId> {
    private String emissionClassName;

    private Date expiresOn;

    @AttributeOverride(name = "id", column = @Column(name = "truckId"))
    private TruckId truckId;

    @OneToOne
    @JoinColumn(name = "truckId")
    private Truck truck;
}
