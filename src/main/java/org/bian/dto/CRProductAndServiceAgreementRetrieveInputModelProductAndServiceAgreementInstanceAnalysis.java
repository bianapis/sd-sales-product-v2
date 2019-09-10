package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceAnalysis
 */
public class CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceAnalysis   {
  private String productAndServiceAgreementInstanceAnalysisReference = null;

  private String productAndServiceAgreementInstanceAnalysisReportType = null;

  private String productAndServiceAgreementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productAndServiceAgreementInstanceAnalysisReference
  **/

  public String getProductAndServiceAgreementInstanceAnalysisReference() {
    return productAndServiceAgreementInstanceAnalysisReference;
  }

  public void setProductAndServiceAgreementInstanceAnalysisReference(String productAndServiceAgreementInstanceAnalysisReference) {
    this.productAndServiceAgreementInstanceAnalysisReference = productAndServiceAgreementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productAndServiceAgreementInstanceAnalysisReportType
  **/

  public String getProductAndServiceAgreementInstanceAnalysisReportType() {
    return productAndServiceAgreementInstanceAnalysisReportType;
  }

  public void setProductAndServiceAgreementInstanceAnalysisReportType(String productAndServiceAgreementInstanceAnalysisReportType) {
    this.productAndServiceAgreementInstanceAnalysisReportType = productAndServiceAgreementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productAndServiceAgreementInstanceAnalysisParameters
  **/

  public String getProductAndServiceAgreementInstanceAnalysisParameters() {
    return productAndServiceAgreementInstanceAnalysisParameters;
  }

  public void setProductAndServiceAgreementInstanceAnalysisParameters(String productAndServiceAgreementInstanceAnalysisParameters) {
    this.productAndServiceAgreementInstanceAnalysisParameters = productAndServiceAgreementInstanceAnalysisParameters;
  }


}

