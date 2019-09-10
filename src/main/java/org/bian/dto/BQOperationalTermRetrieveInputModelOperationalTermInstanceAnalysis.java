package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalTermRetrieveInputModelOperationalTermInstanceAnalysis
 */
public class BQOperationalTermRetrieveInputModelOperationalTermInstanceAnalysis   {
  private String operationalTermInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return operationalTermInstanceAnalysisReference
  **/

  public String getOperationalTermInstanceAnalysisReference() {
    return operationalTermInstanceAnalysisReference;
  }

  public void setOperationalTermInstanceAnalysisReference(String operationalTermInstanceAnalysisReference) {
    this.operationalTermInstanceAnalysisReference = operationalTermInstanceAnalysisReference;
  }


}

