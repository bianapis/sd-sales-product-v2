package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalTermEvaluateInputModelOperationalTermInstanceRecordOperationalTermParameterType
 */
public class BQOperationalTermEvaluateInputModelOperationalTermInstanceRecordOperationalTermParameterType   {
  private String operationalTermParameterSetting = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The value of the parameter for this instance 
   * @return operationalTermParameterSetting
  **/

  public String getOperationalTermParameterSetting() {
    return operationalTermParameterSetting;
  }

  public void setOperationalTermParameterSetting(String operationalTermParameterSetting) {
    this.operationalTermParameterSetting = operationalTermParameterSetting;
  }


}

