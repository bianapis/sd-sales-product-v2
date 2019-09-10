package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceAnalysis;
import org.bian.dto.CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementRetrieveInputModel
 */
public class CRProductAndServiceAgreementRetrieveInputModel   {
  private Object productAndServiceAgreementRetrieveActionTaskRecord = null;

  private String productAndServiceAgreementRetrieveActionRequest = null;

  private CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceReportRecord productAndServiceAgreementInstanceReportRecord = null;

  private CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceAnalysis productAndServiceAgreementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productAndServiceAgreementRetrieveActionTaskRecord
  **/

  public Object getProductAndServiceAgreementRetrieveActionTaskRecord() {
    return productAndServiceAgreementRetrieveActionTaskRecord;
  }

  public void setProductAndServiceAgreementRetrieveActionTaskRecord(Object productAndServiceAgreementRetrieveActionTaskRecord) {
    this.productAndServiceAgreementRetrieveActionTaskRecord = productAndServiceAgreementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productAndServiceAgreementRetrieveActionRequest
  **/

  public String getProductAndServiceAgreementRetrieveActionRequest() {
    return productAndServiceAgreementRetrieveActionRequest;
  }

  public void setProductAndServiceAgreementRetrieveActionRequest(String productAndServiceAgreementRetrieveActionRequest) {
    this.productAndServiceAgreementRetrieveActionRequest = productAndServiceAgreementRetrieveActionRequest;
  }


  /**
   * Get productAndServiceAgreementInstanceReportRecord
   * @return productAndServiceAgreementInstanceReportRecord
  **/

  public CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceReportRecord getProductAndServiceAgreementInstanceReportRecord() {
    return productAndServiceAgreementInstanceReportRecord;
  }

  public void setProductAndServiceAgreementInstanceReportRecord(CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceReportRecord productAndServiceAgreementInstanceReportRecord) {
    this.productAndServiceAgreementInstanceReportRecord = productAndServiceAgreementInstanceReportRecord;
  }


  /**
   * Get productAndServiceAgreementInstanceAnalysis
   * @return productAndServiceAgreementInstanceAnalysis
  **/

  public CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceAnalysis getProductAndServiceAgreementInstanceAnalysis() {
    return productAndServiceAgreementInstanceAnalysis;
  }

  public void setProductAndServiceAgreementInstanceAnalysis(CRProductAndServiceAgreementRetrieveInputModelProductAndServiceAgreementInstanceAnalysis productAndServiceAgreementInstanceAnalysis) {
    this.productAndServiceAgreementInstanceAnalysis = productAndServiceAgreementInstanceAnalysis;
  }


}

