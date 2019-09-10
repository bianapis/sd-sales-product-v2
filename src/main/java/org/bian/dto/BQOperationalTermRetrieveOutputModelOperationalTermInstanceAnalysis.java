package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalTermRetrieveOutputModelOperationalTermInstanceAnalysis
 */
public class BQOperationalTermRetrieveOutputModelOperationalTermInstanceAnalysis   {
  private Object operationalTermInstanceAnalysisRecord = null;

  private String operationalTermInstanceAnalysisReportType = null;

  private String operationalTermInstanceAnalysisParameters = null;

  private Object operationalTermInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return operationalTermInstanceAnalysisRecord
  **/

  public Object getOperationalTermInstanceAnalysisRecord() {
    return operationalTermInstanceAnalysisRecord;
  }

  public void setOperationalTermInstanceAnalysisRecord(Object operationalTermInstanceAnalysisRecord) {
    this.operationalTermInstanceAnalysisRecord = operationalTermInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return operationalTermInstanceAnalysisReportType
  **/

  public String getOperationalTermInstanceAnalysisReportType() {
    return operationalTermInstanceAnalysisReportType;
  }

  public void setOperationalTermInstanceAnalysisReportType(String operationalTermInstanceAnalysisReportType) {
    this.operationalTermInstanceAnalysisReportType = operationalTermInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return operationalTermInstanceAnalysisParameters
  **/

  public String getOperationalTermInstanceAnalysisParameters() {
    return operationalTermInstanceAnalysisParameters;
  }

  public void setOperationalTermInstanceAnalysisParameters(String operationalTermInstanceAnalysisParameters) {
    this.operationalTermInstanceAnalysisParameters = operationalTermInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return operationalTermInstanceAnalysisReport
  **/

  public Object getOperationalTermInstanceAnalysisReport() {
    return operationalTermInstanceAnalysisReport;
  }

  public void setOperationalTermInstanceAnalysisReport(Object operationalTermInstanceAnalysisReport) {
    this.operationalTermInstanceAnalysisReport = operationalTermInstanceAnalysisReport;
  }


}

