package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermEvaluateInputModelOperationalTermInstanceRecord;
import org.bian.dto.BQOperationalTermEvaluateInputModelProductAndServiceAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalTermEvaluateInputModel
 */
public class BQOperationalTermEvaluateInputModel   {
  private BQOperationalTermEvaluateInputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord = null;

  private String productAndServiceAgreementInstanceReference = null;

  private Object operationalTermInitiateActionRecord = null;

  private BQOperationalTermEvaluateInputModelOperationalTermInstanceRecord operationalTermInstanceRecord = null;


  /**
   * Get productAndServiceAgreementInstanceRecord
   * @return productAndServiceAgreementInstanceRecord
  **/

  public BQOperationalTermEvaluateInputModelProductAndServiceAgreementInstanceRecord getProductAndServiceAgreementInstanceRecord() {
    return productAndServiceAgreementInstanceRecord;
  }

  public void setProductAndServiceAgreementInstanceRecord(BQOperationalTermEvaluateInputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord) {
    this.productAndServiceAgreementInstanceRecord = productAndServiceAgreementInstanceRecord;
  }


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
   * Get operationalTermInstanceRecord
   * @return operationalTermInstanceRecord
  **/

  public BQOperationalTermEvaluateInputModelOperationalTermInstanceRecord getOperationalTermInstanceRecord() {
    return operationalTermInstanceRecord;
  }

  public void setOperationalTermInstanceRecord(BQOperationalTermEvaluateInputModelOperationalTermInstanceRecord operationalTermInstanceRecord) {
    this.operationalTermInstanceRecord = operationalTermInstanceRecord;
  }


}

