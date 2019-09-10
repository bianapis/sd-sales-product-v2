package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductAndServiceAgreementControlInputModelProductAndServiceAgreementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementControlInputModel
 */
public class CRProductAndServiceAgreementControlInputModel   {
  private String salesProductServicingSessionReference = null;

  private String productAndServiceAgreementInstanceReference = null;

  private Object productAndServiceAgreementControlActionTaskRecord = null;

  private CRProductAndServiceAgreementControlInputModelProductAndServiceAgreementControlActionRequest productAndServiceAgreementControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return productAndServiceAgreementControlActionTaskRecord
  **/

  public Object getProductAndServiceAgreementControlActionTaskRecord() {
    return productAndServiceAgreementControlActionTaskRecord;
  }

  public void setProductAndServiceAgreementControlActionTaskRecord(Object productAndServiceAgreementControlActionTaskRecord) {
    this.productAndServiceAgreementControlActionTaskRecord = productAndServiceAgreementControlActionTaskRecord;
  }


  /**
   * Get productAndServiceAgreementControlActionRequest
   * @return productAndServiceAgreementControlActionRequest
  **/

  public CRProductAndServiceAgreementControlInputModelProductAndServiceAgreementControlActionRequest getProductAndServiceAgreementControlActionRequest() {
    return productAndServiceAgreementControlActionRequest;
  }

  public void setProductAndServiceAgreementControlActionRequest(CRProductAndServiceAgreementControlInputModelProductAndServiceAgreementControlActionRequest productAndServiceAgreementControlActionRequest) {
    this.productAndServiceAgreementControlActionRequest = productAndServiceAgreementControlActionRequest;
  }


}

