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
 * BQOperationalTermEvaluateOutputModelProductAndServiceAgreementInstanceRecord
 */
public class BQOperationalTermEvaluateOutputModelProductAndServiceAgreementInstanceRecord   {
  private String underlyingProductInstanceReference = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordPositionLimits positionLimits = null;

  private CRProductAndServiceAgreementEvaluateInputModelProductAndServiceAgreementInstanceRecordDateType dateType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option (note the corresponding attribute for the base product instance will cross reference the sales product instance for applicable entitlements terms) 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option (note the corresponding attribute for the base product instance will cross reference the sales product instance for applicable restrictions terms) 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
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

