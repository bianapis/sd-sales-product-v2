package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermEvaluateOutputModelOperationalTermInstanceRecord;
import org.bian.dto.BQOperationalTermEvaluateOutputModelProductAndServiceAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalTermEvaluateOutputModel
 */
public class BQOperationalTermEvaluateOutputModel   {
  private BQOperationalTermEvaluateOutputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord = null;

  private String operationalTermInstanceReference = null;

  private String operationalTermInitiateActionReference = null;

  private Object operationalTermInitiateActionRecord = null;

  private String operationalTermInstanceStatus = null;

  private BQOperationalTermEvaluateOutputModelOperationalTermInstanceRecord operationalTermInstanceRecord = null;


  /**
   * Get productAndServiceAgreementInstanceRecord
   * @return productAndServiceAgreementInstanceRecord
  **/

  public BQOperationalTermEvaluateOutputModelProductAndServiceAgreementInstanceRecord getProductAndServiceAgreementInstanceRecord() {
    return productAndServiceAgreementInstanceRecord;
  }

  public void setProductAndServiceAgreementInstanceRecord(BQOperationalTermEvaluateOutputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord) {
    this.productAndServiceAgreementInstanceRecord = productAndServiceAgreementInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return operationalTermInitiateActionReference
  **/

  public String getOperationalTermInitiateActionReference() {
    return operationalTermInitiateActionReference;
  }

  public void setOperationalTermInitiateActionReference(String operationalTermInitiateActionReference) {
    this.operationalTermInitiateActionReference = operationalTermInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return operationalTermInitiateActionRecord
  **/

  public Object getOperationalTermInitiateActionRecord() {
    return operationalTermInitiateActionRecord;
  }

  public void setOperationalTermInitiateActionRecord(Object operationalTermInitiateActionRecord) {
    this.operationalTermInitiateActionRecord = operationalTermInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Operational Term instance (e.g. initialised, pending, active) 
   * @return operationalTermInstanceStatus
  **/

  public String getOperationalTermInstanceStatus() {
    return operationalTermInstanceStatus;
  }

  public void setOperationalTermInstanceStatus(String operationalTermInstanceStatus) {
    this.operationalTermInstanceStatus = operationalTermInstanceStatus;
  }


  /**
   * Get operationalTermInstanceRecord
   * @return operationalTermInstanceRecord
  **/

  public BQOperationalTermEvaluateOutputModelOperationalTermInstanceRecord getOperationalTermInstanceRecord() {
    return operationalTermInstanceRecord;
  }

  public void setOperationalTermInstanceRecord(BQOperationalTermEvaluateOutputModelOperationalTermInstanceRecord operationalTermInstanceRecord) {
    this.operationalTermInstanceRecord = operationalTermInstanceRecord;
  }


}

