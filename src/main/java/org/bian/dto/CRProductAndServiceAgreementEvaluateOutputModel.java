package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductAndServiceAgreementEvaluateOutputModelProductAndServiceAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementEvaluateOutputModel
 */
public class CRProductAndServiceAgreementEvaluateOutputModel   {
  private String productAndServiceAgreementInstanceReference = null;

  private String productAndServiceAgreementEvaluateActionReference = null;

  private Object productAndServiceAgreementEvaluateActionRecord = null;

  private String productAndServiceAgreementInstanceStatus = null;

  private CRProductAndServiceAgreementEvaluateOutputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product And Service Agreement instance 
   * @return productAndServiceAgreementInstanceReference
  **/

  public String getProductAndServiceAgreementInstanceReference() {
    return productAndServiceAgreementInstanceReference;
  }

  public void setProductAndServiceAgreementInstanceReference(String productAndServiceAgreementInstanceReference) {
    this.productAndServiceAgreementInstanceReference = productAndServiceAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return productAndServiceAgreementEvaluateActionReference
  **/

  public String getProductAndServiceAgreementEvaluateActionReference() {
    return productAndServiceAgreementEvaluateActionReference;
  }

  public void setProductAndServiceAgreementEvaluateActionReference(String productAndServiceAgreementEvaluateActionReference) {
    this.productAndServiceAgreementEvaluateActionReference = productAndServiceAgreementEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return productAndServiceAgreementEvaluateActionRecord
  **/

  public Object getProductAndServiceAgreementEvaluateActionRecord() {
    return productAndServiceAgreementEvaluateActionRecord;
  }

  public void setProductAndServiceAgreementEvaluateActionRecord(Object productAndServiceAgreementEvaluateActionRecord) {
    this.productAndServiceAgreementEvaluateActionRecord = productAndServiceAgreementEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product And Service Agreement instance (e.g. initialised, pending, active) 
   * @return productAndServiceAgreementInstanceStatus
  **/

  public String getProductAndServiceAgreementInstanceStatus() {
    return productAndServiceAgreementInstanceStatus;
  }

  public void setProductAndServiceAgreementInstanceStatus(String productAndServiceAgreementInstanceStatus) {
    this.productAndServiceAgreementInstanceStatus = productAndServiceAgreementInstanceStatus;
  }


  /**
   * Get productAndServiceAgreementInstanceRecord
   * @return productAndServiceAgreementInstanceRecord
  **/

  public CRProductAndServiceAgreementEvaluateOutputModelProductAndServiceAgreementInstanceRecord getProductAndServiceAgreementInstanceRecord() {
    return productAndServiceAgreementInstanceRecord;
  }

  public void setProductAndServiceAgreementInstanceRecord(CRProductAndServiceAgreementEvaluateOutputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord) {
    this.productAndServiceAgreementInstanceRecord = productAndServiceAgreementInstanceRecord;
  }


}

