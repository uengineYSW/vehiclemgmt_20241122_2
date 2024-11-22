package com.posco.assignoperation.s20g01.domain.carAssignment;

import java.util.*;
import lombok.Data;
import java.time.LocalDate;
import com.posco.assignoperation..domain.UsageCategory;
import com.posco.assignoperation..domain.CarType;
import com.posco.assignoperation..domain.MainDepartment;
import com.posco.assignoperation..domain.OperationSection;
import com.posco.assignoperation..domain.OperationType;
import com.posco.assignoperation..domain.IncludeDriver;
import com.posco.assignoperation..domain.ProgressStage;
import com.posco.assignoperation..domain.Period;


@Data
public class UpdateCarAssignmentCommand {

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
        private UsageCategory usageCategory;
        private CarType carType;
        private MainDepartment mainDepartment;
        private OperationSection operationSection;
        private OperationType operationType;
        private IncludeDriver includeDriver;
        private ProgressStage progressStage;
        private Period period;


}
