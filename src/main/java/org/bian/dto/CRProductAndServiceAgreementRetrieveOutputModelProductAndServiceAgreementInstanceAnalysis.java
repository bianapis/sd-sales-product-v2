package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceAnalysis
 */
public class CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceAnalysis   {
  private String productAndServiceAgreementInstanceAnalysisData = null;

  private String productAndServiceAgreementInstanceAnalysisReportType = null;

  private Object productAndServiceAgreementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productAndServiceAgreementInstanceAnalysisData
  **/

  public String getProductAndServiceAgreementInstanceAnalysisData() {
    return productAndServiceAgreementInstanceAnalysisData;
  }

  public void setProductAndServiceAgreementInstanceAnalysisData(String productAndServiceAgreementInstanceAnalysisData) {
    this.productAndServiceAgreementInstanceAnalysisData = productAndServiceAgreementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productAndServiceAgreementInstanceAnalysisReport
  **/

  public Object getProductAndServiceAgreementInstanceAnalysisReport() {
    return productAndServiceAgreementInstanceAnalysisReport;
  }

  public void setProductAndServiceAgreementInstanceAnalysisReport(Object productAndServiceAgreementInstanceAnalysisReport) {
    this.productAndServiceAgreementInstanceAnalysisReport = productAndServiceAgreementInstanceAnalysisReport;
  }


}

