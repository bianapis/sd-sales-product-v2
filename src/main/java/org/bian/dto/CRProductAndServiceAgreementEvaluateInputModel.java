package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementEvaluateInputModel
 */
public class CRProductAndServiceAgreementEvaluateInputModel   {
  private String salesProductServicingSessionReference = null;

  private Object productAndServiceAgreementEvaluateActionRecord = null;

  private String productAndServiceAgreementInstanceStatus = null;

  private CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return salesProductServicingSessionReference
  **/

  public String getSalesProductServicingSessionReference() {
    return salesProductServicingSessionReference;
  }

  public void setSalesProductServicingSessionReference(String salesProductServicingSessionReference) {
    this.salesProductServicingSessionReference = salesProductServicingSessionReference;
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

  public CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecord getProductAndServiceAgreementInstanceRecord() {
    return productAndServiceAgreementInstanceRecord;
  }

  public void setProductAndServiceAgreementInstanceRecord(CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord) {
    this.productAndServiceAgreementInstanceRecord = productAndServiceAgreementInstanceRecord;
  }


}

