package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalTermRetrieveOutputModelOperationalTermInstanceReport
 */
public class BQOperationalTermRetrieveOutputModelOperationalTermInstanceReport   {
  private Object operationalTermInstanceReportRecord = null;

  private String operationalTermInstanceReportType = null;

  private String operationalTermInstanceReportParameters = null;

  private Object operationalTermInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return operationalTermInstanceReportRecord
  **/

  public Object getOperationalTermInstanceReportRecord() {
    return operationalTermInstanceReportRecord;
  }

  public void setOperationalTermInstanceReportRecord(Object operationalTermInstanceReportRecord) {
    this.operationalTermInstanceReportRecord = operationalTermInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return operationalTermInstanceReportType
  **/

  public String getOperationalTermInstanceReportType() {
    return operationalTermInstanceReportType;
  }

  public void setOperationalTermInstanceReportType(String operationalTermInstanceReportType) {
    this.operationalTermInstanceReportType = operationalTermInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return operationalTermInstanceReportParameters
  **/

  public String getOperationalTermInstanceReportParameters() {
    return operationalTermInstanceReportParameters;
  }

  public void setOperationalTermInstanceReportParameters(String operationalTermInstanceReportParameters) {
    this.operationalTermInstanceReportParameters = operationalTermInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return operationalTermInstanceReport
  **/

  public Object getOperationalTermInstanceReport() {
    return operationalTermInstanceReport;
  }

  public void setOperationalTermInstanceReport(Object operationalTermInstanceReport) {
    this.operationalTermInstanceReport = operationalTermInstanceReport;
  }


}

