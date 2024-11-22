package com.posco.assignoperation.s20g01.domain.carAssignment;

import com.posco.assignoperation..domain.UsageCategory;import com.posco.assignoperation..domain.CarType;import com.posco.assignoperation..domain.MainDepartment;import com.posco.assignoperation..domain.OperationSection;import com.posco.assignoperation..domain.OperationType;import com.posco.assignoperation..domain.IncludeDriver;import com.posco.assignoperation..domain.ProgressStage;import com.posco.assignoperation..domain.Period;

import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="CarAssignment_table")
@Data

public class CarAssignment  {

    
    @Id
    
    
    
    private Long id;

    
    
    
    
    private String requesterName;

    
    
    
    
    private String organization;

    
    
    
    
    private String employeeNumber;

    
    
    
    
    private String officeNumber;

    
    
    
    
    private String mobileNumber;

    
    
    
    
    private Date requestDate;

    
    
    
    
    private String approverInfo;

    
    
    
    
    private String approverPosition;

    
    
    
    
    private String usagePurpose;

    
    
    
    
    private String numberOfPassengers;

    
    
    
    
    private String routeSetting;

    
    
    
    
    private String remarks;

    
    
    
    
    private String passengerContact;

    
    
    
    
    private String attachedDocuments;

    
    
    
    
    private String cancellationReason;

    
    
    
    @Enumerated(EnumType.STRING)
    private UsageCategory usageCategory;

    
    
    
    @Enumerated(EnumType.STRING)
    private CarType carType;

    
    
    
    @Enumerated(EnumType.STRING)
    private MainDepartment mainDepartment;

    
    
    
    @Enumerated(EnumType.STRING)
    private OperationSection operationSection;

    
    
    
    @Enumerated(EnumType.STRING)
    private OperationType operationType;

    
    
    
    @Enumerated(EnumType.STRING)
    private IncludeDriver includeDriver;

    
    
    
    @Enumerated(EnumType.STRING)
    private ProgressStage progressStage;

    
    
    
    @Embedded
    private Period period;



}
