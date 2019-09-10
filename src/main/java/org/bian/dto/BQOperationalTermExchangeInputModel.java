package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermExchangeInputModelOperationalTermExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQOperationalTermExchangeInputModel
 */
public class BQOperationalTermExchangeInputModel   {
  private String productAndServiceAgreementInstanceReference = null;

  private String operationalTermInstanceReference = null;

  private Object operationalTermExchangeActionTaskRecord = null;

  private BQOperationalTermExchangeInputModelOperationalTermExchangeActionRequest operationalTermExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product And Service Agreement instance 
   * @return productAndServiceAgreementInstanceReference
  **/

  public String getProductAndServiceAgreementInstanceReference() {
    return productAndServiceAgreementInstanceReference;
  }

  public void setProductAndServiceAgreementInstanceReference(String productAndServiceAgreementInstanceReference) {
    this.productAndServiceAgreementInstanceReference = productAndServiceAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Operational Term instance 
   * @return operationalTermInstanceReference
  **/

  public String getOperationalTermInstanceReference() {
    return operationalTermInstanceReference;
  }

  public void setOperationalTermInstanceReference(String operationalTermInstanceReference) {
    this.operationalTermInstanceReference = operationalTermInstanceReference;
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
   * Get operationalTermExchangeActionRequest
   * @return operationalTermExchangeActionRequest
  **/

  public BQOperationalTermExchangeInputModelOperationalTermExchangeActionRequest getOperationalTermExchangeActionRequest() {
    return operationalTermExchangeActionRequest;
  }

  public void setOperationalTermExchangeActionRequest(BQOperationalTermExchangeInputModelOperationalTermExchangeActionRequest operationalTermExchangeActionRequest) {
    this.operationalTermExchangeActionRequest = operationalTermExchangeActionRequest;
  }


}

