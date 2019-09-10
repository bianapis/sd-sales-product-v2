package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermRetrieveInputModelOperationalTermInstanceAnalysis;
import org.bian.dto.BQOperationalTermRetrieveInputModelOperationalTermInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOperationalTermRetrieveInputModel
 */
public class BQOperationalTermRetrieveInputModel   {
  private Object operationalTermRetrieveActionTaskRecord = null;

  private String operationalTermRetrieveActionRequest = null;

  private BQOperationalTermRetrieveInputModelOperationalTermInstanceReport operationalTermInstanceReport = null;

  private BQOperationalTermRetrieveInputModelOperationalTermInstanceAnalysis operationalTermInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return operationalTermRetrieveActionTaskRecord
  **/

  public Object getOperationalTermRetrieveActionTaskRecord() {
    return operationalTermRetrieveActionTaskRecord;
  }

  public void setOperationalTermRetrieveActionTaskRecord(Object operationalTermRetrieveActionTaskRecord) {
    this.operationalTermRetrieveActionTaskRecord = operationalTermRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return operationalTermRetrieveActionRequest
  **/

  public String getOperationalTermRetrieveActionRequest() {
    return operationalTermRetrieveActionRequest;
  }

  public void setOperationalTermRetrieveActionRequest(String operationalTermRetrieveActionRequest) {
    this.operationalTermRetrieveActionRequest = operationalTermRetrieveActionRequest;
  }


  /**
   * Get operationalTermInstanceReport
   * @return operationalTermInstanceReport
  **/

  public BQOperationalTermRetrieveInputModelOperationalTermInstanceReport getOperationalTermInstanceReport() {
    return operationalTermInstanceReport;
  }

  public void setOperationalTermInstanceReport(BQOperationalTermRetrieveInputModelOperationalTermInstanceReport operationalTermInstanceReport) {
    this.operationalTermInstanceReport = operationalTermInstanceReport;
  }


  /**
   * Get operationalTermInstanceAnalysis
   * @return operationalTermInstanceAnalysis
  **/

  public BQOperationalTermRetrieveInputModelOperationalTermInstanceAnalysis getOperationalTermInstanceAnalysis() {
    return operationalTermInstanceAnalysis;
  }

  public void setOperationalTermInstanceAnalysis(BQOperationalTermRetrieveInputModelOperationalTermInstanceAnalysis operationalTermInstanceAnalysis) {
    this.operationalTermInstanceAnalysis = operationalTermInstanceAnalysis;
  }


}

