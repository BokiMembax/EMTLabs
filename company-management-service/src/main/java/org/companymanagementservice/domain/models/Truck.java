package org.companymanagementservice.domain.models;

import jakarta.persistence.*;
import org.sharedkernel.domain.base.AbstractEntity;

import java.util.Date;

@Entity
@Table(name="truck")
public class Truck extends AbstractEntity<TruckId> {

    private String vin;

    private String registration;

    private Date manufacturedOn;

    @AttributeOverride(name = "id", column = @Column(name = "companyId"))
    private CompanyId companyId;

    @OneToOne(mappedBy = "truck")
    private CemtCertificate cemtCertificate;

    @OneToOne(mappedBy = "truck")
    private CmrCertificate cmrCertificate;

    @OneToOne(mappedBy = "truck")
    private GreenClassCertificate greenClassCertificate;

    public Truck() {

    }
}
