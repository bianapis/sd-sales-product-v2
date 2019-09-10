package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementControlOutputModel
 */
public class CRProductAndServiceAgreementControlOutputModel   {
  private String productAndServiceAgreementControlActionTaskReference = null;

  private Object productAndServiceAgreementControlActionTaskRecord = null;

  private String productAndServiceAgreementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product And Service Agreement instance control processing service call 
   * @return productAndServiceAgreementControlActionTaskReference
  **/

  public String getProductAndServiceAgreementControlActionTaskReference() {
    return productAndServiceAgreementControlActionTaskReference;
  }

  public void setProductAndServiceAgreementControlActionTaskReference(String productAndServiceAgreementControlActionTaskReference) {
    this.productAndServiceAgreementControlActionTaskReference = productAndServiceAgreementControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return productAndServiceAgreementControlActionResponse
  **/

  public String getProductAndServiceAgreementControlActionResponse() {
    return productAndServiceAgreementControlActionResponse;
  }

  public void setProductAndServiceAgreementControlActionResponse(String productAndServiceAgreementControlActionResponse) {
    this.productAndServiceAgreementControlActionResponse = productAndServiceAgreementControlActionResponse;
  }


}

