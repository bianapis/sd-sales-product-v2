package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalTermGrantInputModel
 */
public class BQOperationalTermGrantInputModel   {
  private String productAndServiceAgreementInstanceReference = null;

  private String operationalTermInstanceReference = null;

  private Object operationalTermGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private BQOperationalTermGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return operationalTermGrantActionTaskRecord
  **/

  public Object getOperationalTermGrantActionTaskRecord() {
    return operationalTermGrantActionTaskRecord;
  }

  public void setOperationalTermGrantActionTaskRecord(Object operationalTermGrantActionTaskRecord) {
    this.operationalTermGrantActionTaskRecord = operationalTermGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public BQOperationalTermGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(BQOperationalTermGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

