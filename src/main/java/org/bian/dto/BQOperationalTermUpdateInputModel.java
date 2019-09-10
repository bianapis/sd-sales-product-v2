package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermUpdateInputModelOperationalTermInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalTermUpdateInputModel
 */
public class BQOperationalTermUpdateInputModel   {
  private String productAndServiceAgreementInstanceReference = null;

  private String operationalTermInstanceReference = null;

  private BQOperationalTermUpdateInputModelOperationalTermInstanceRecord operationalTermInstanceRecord = null;

  private Object operationalTermUpdateActionTaskRecord = null;

  private String operationalTermUpdateActionRequest = null;


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
   * Get operationalTermInstanceRecord
   * @return operationalTermInstanceRecord
  **/

  public BQOperationalTermUpdateInputModelOperationalTermInstanceRecord getOperationalTermInstanceRecord() {
    return operationalTermInstanceRecord;
  }

  public void setOperationalTermInstanceRecord(BQOperationalTermUpdateInputModelOperationalTermInstanceRecord operationalTermInstanceRecord) {
    this.operationalTermInstanceRecord = operationalTermInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return operationalTermUpdateActionTaskRecord
  **/

  public Object getOperationalTermUpdateActionTaskRecord() {
    return operationalTermUpdateActionTaskRecord;
  }

  public void setOperationalTermUpdateActionTaskRecord(Object operationalTermUpdateActionTaskRecord) {
    this.operationalTermUpdateActionTaskRecord = operationalTermUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return operationalTermUpdateActionRequest
  **/

  public String getOperationalTermUpdateActionRequest() {
    return operationalTermUpdateActionRequest;
  }

  public void setOperationalTermUpdateActionRequest(String operationalTermUpdateActionRequest) {
    this.operationalTermUpdateActionRequest = operationalTermUpdateActionRequest;
  }


}

