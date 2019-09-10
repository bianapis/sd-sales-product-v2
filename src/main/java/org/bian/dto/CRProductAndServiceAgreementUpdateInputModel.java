package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductAndServiceAgreementUpdateInputModelProductAndServiceAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementUpdateInputModel
 */
public class CRProductAndServiceAgreementUpdateInputModel   {
  private String salesProductServicingSessionReference = null;

  private String productAndServiceAgreementInstanceReference = null;

  private CRProductAndServiceAgreementUpdateInputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord = null;

  private Object productAndServiceAgreementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get productAndServiceAgreementInstanceRecord
   * @return productAndServiceAgreementInstanceRecord
  **/

  public CRProductAndServiceAgreementUpdateInputModelProductAndServiceAgreementInstanceRecord getProductAndServiceAgreementInstanceRecord() {
    return productAndServiceAgreementInstanceRecord;
  }

  public void setProductAndServiceAgreementInstanceRecord(CRProductAndServiceAgreementUpdateInputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord) {
    this.productAndServiceAgreementInstanceRecord = productAndServiceAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productAndServiceAgreementUpdateActionTaskRecord
  **/

  public Object getProductAndServiceAgreementUpdateActionTaskRecord() {
    return productAndServiceAgreementUpdateActionTaskRecord;
  }

  public void setProductAndServiceAgreementUpdateActionTaskRecord(Object productAndServiceAgreementUpdateActionTaskRecord) {
    this.productAndServiceAgreementUpdateActionTaskRecord = productAndServiceAgreementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

