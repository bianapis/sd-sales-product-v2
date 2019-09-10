package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductAndServiceAgreementUpdateInputModelProductAndServiceAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementUpdateOutputModel
 */
public class CRProductAndServiceAgreementUpdateOutputModel   {
  private CRProductAndServiceAgreementUpdateInputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord = null;

  private String productAndServiceAgreementUpdateActionTaskReference = null;

  private Object productAndServiceAgreementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productAndServiceAgreementUpdateActionTaskReference
  **/

  public String getProductAndServiceAgreementUpdateActionTaskReference() {
    return productAndServiceAgreementUpdateActionTaskReference;
  }

  public void setProductAndServiceAgreementUpdateActionTaskReference(String productAndServiceAgreementUpdateActionTaskReference) {
    this.productAndServiceAgreementUpdateActionTaskReference = productAndServiceAgreementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

