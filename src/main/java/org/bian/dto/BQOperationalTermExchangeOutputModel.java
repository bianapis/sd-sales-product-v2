package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalTermExchangeOutputModel
 */
public class BQOperationalTermExchangeOutputModel   {
  private String operationalTermExchangeActionTaskReference = null;

  private Object operationalTermExchangeActionTaskRecord = null;

  private String operationalTermExchangeActionResponse = null;

  private String operationalTermInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operational Term instance exchange service call 
   * @return operationalTermExchangeActionTaskReference
  **/

  public String getOperationalTermExchangeActionTaskReference() {
    return operationalTermExchangeActionTaskReference;
  }

  public void setOperationalTermExchangeActionTaskReference(String operationalTermExchangeActionTaskReference) {
    this.operationalTermExchangeActionTaskReference = operationalTermExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return operationalTermExchangeActionTaskRecord
  **/

  public Object getOperationalTermExchangeActionTaskRecord() {
    return operationalTermExchangeActionTaskRecord;
  }

  public void setOperationalTermExchangeActionTaskRecord(Object operationalTermExchangeActionTaskRecord) {
    this.operationalTermExchangeActionTaskRecord = operationalTermExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return operationalTermExchangeActionResponse
  **/

  public String getOperationalTermExchangeActionResponse() {
    return operationalTermExchangeActionResponse;
  }

  public void setOperationalTermExchangeActionResponse(String operationalTermExchangeActionResponse) {
    this.operationalTermExchangeActionResponse = operationalTermExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Operational Term instance (e.g. accepted, rejected, verified) 
   * @return operationalTermInstanceStatus
  **/

  public String getOperationalTermInstanceStatus() {
    return operationalTermInstanceStatus;
  }

  public void setOperationalTermInstanceStatus(String operationalTermInstanceStatus) {
    this.operationalTermInstanceStatus = operationalTermInstanceStatus;
  }


}

