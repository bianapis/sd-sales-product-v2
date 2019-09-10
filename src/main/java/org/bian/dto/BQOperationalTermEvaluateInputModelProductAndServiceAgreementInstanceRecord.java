package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordDateType;
import org.bian.dto.CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordLinkedAccounts;
import org.bian.dto.CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * BQOperationalTermEvaluateInputModelProductAndServiceAgreementInstanceRecord
 */
public class BQOperationalTermEvaluateInputModelProductAndServiceAgreementInstanceRecord   {
  private String productInstanceReference = null;

  private String underlyingProductInstanceReference = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String taxReference = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionSetting = null;

  private CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordPositionLimits positionLimits = null;

  private CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the sales product instance, i.e. the 'wrapped' product by its sold reference name 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the underlying product instance - this is the fulfillment vehicle that has amended/augmented features to 'create' the sold product 
   * @return underlyingProductInstanceReference
  **/

  public String getUnderlyingProductInstanceReference() {
    return underlyingProductInstanceReference;
  }

  public void setUnderlyingProductInstanceReference(String underlyingProductInstanceReference) {
    this.underlyingProductInstanceReference = underlyingProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the product primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the product for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the investment account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

