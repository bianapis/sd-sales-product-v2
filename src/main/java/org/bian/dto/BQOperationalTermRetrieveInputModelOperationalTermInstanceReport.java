package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalTermRetrieveInputModelOperationalTermInstanceReport
 */
public class BQOperationalTermRetrieveInputModelOperationalTermInstanceReport   {
  private String operationalTermInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return operationalTermInstanceReportReference
  **/

  public String getOperationalTermInstanceReportReference() {
    return operationalTermInstanceReportReference;
  }

  public void setOperationalTermInstanceReportReference(String operationalTermInstanceReportReference) {
    this.operationalTermInstanceReportReference = operationalTermInstanceReportReference;
  }


}

