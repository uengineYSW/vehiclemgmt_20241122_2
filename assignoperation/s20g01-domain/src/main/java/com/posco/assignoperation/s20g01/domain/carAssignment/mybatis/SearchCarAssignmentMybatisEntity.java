package com.posco.assignoperation.s20g01.domain.carAssignment.mybatis;

import lombok.Data;
import java.util.Date;

import com.posco.assignoperation..domain.Period;


@Data
public class SearchCarAssignmentMybatisEntity {
        private Date approvalDate;
        private Date requestDate;
        private Period period;
}
