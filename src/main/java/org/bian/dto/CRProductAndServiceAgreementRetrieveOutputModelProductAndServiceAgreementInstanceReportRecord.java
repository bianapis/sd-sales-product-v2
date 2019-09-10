package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceReportRecord
 */
public class CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceReportRecord   {
  private String productAndServiceAgreementInstanceReportData = null;

  private String productAndServiceAgreementInstanceReportType = null;

  private Object productAndServiceAgreementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productAndServiceAgreementInstanceReportData
  **/

  public String getProductAndServiceAgreementInstanceReportData() {
    return productAndServiceAgreementInstanceReportData;
  }

  public void setProductAndServiceAgreementInstanceReportData(String productAndServiceAgreementInstanceReportData) {
    this.productAndServiceAgreementInstanceReportData = productAndServiceAgreementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productAndServiceAgreementInstanceReport
  **/

  public Object getProductAndServiceAgreementInstanceReport() {
    return productAndServiceAgreementInstanceReport;
  }

  public void setProductAndServiceAgreementInstanceReport(Object productAndServiceAgreementInstanceReport) {
    this.productAndServiceAgreementInstanceReport = productAndServiceAgreementInstanceReport;
  }


}

