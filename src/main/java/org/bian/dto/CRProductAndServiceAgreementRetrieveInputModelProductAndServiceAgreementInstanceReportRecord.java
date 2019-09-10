package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceReportRecord
 */
public class CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceReportRecord   {
  private String productAndServiceAgreementInstanceReportReference = null;

  private String productAndServiceAgreementInstanceReportType = null;

  private String productAndServiceAgreementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productAndServiceAgreementInstanceReportReference
  **/

  public String getProductAndServiceAgreementInstanceReportReference() {
    return productAndServiceAgreementInstanceReportReference;
  }

  public void setProductAndServiceAgreementInstanceReportReference(String productAndServiceAgreementInstanceReportReference) {
    this.productAndServiceAgreementInstanceReportReference = productAndServiceAgreementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productAndServiceAgreementInstanceReportType
  **/

  public String getProductAndServiceAgreementInstanceReportType() {
    return productAndServiceAgreementInstanceReportType;
  }

  public void setProductAndServiceAgreementInstanceReportType(String productAndServiceAgreementInstanceReportType) {
    this.productAndServiceAgreementInstanceReportType = productAndServiceAgreementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productAndServiceAgreementInstanceReportParameters
  **/

  public String getProductAndServiceAgreementInstanceReportParameters() {
    return productAndServiceAgreementInstanceReportParameters;
  }

  public void setProductAndServiceAgreementInstanceReportParameters(String productAndServiceAgreementInstanceReportParameters) {
    this.productAndServiceAgreementInstanceReportParameters = productAndServiceAgreementInstanceReportParameters;
  }


}

