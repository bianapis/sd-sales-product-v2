package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceAnalysis;
import org.bian.dto.CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceRecord;
import org.bian.dto.CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductAndServiceAgreementRetrieveOutputModel
 */
public class CRProductAndServiceAgreementRetrieveOutputModel   {
  private CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord = null;

  private String productAndServiceAgreementRetrieveActionTaskReference = null;

  private Object productAndServiceAgreementRetrieveActionTaskRecord = null;

  private String productAndServiceAgreementRetrieveActionResponse = null;

  private CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceReportRecord productAndServiceAgreementInstanceReportRecord = null;

  private CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceAnalysis productAndServiceAgreementInstanceAnalysis = null;


  /**
   * Get productAndServiceAgreementInstanceRecord
   * @return productAndServiceAgreementInstanceRecord
  **/

  public CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceRecord getProductAndServiceAgreementInstanceRecord() {
    return productAndServiceAgreementInstanceRecord;
  }

  public void setProductAndServiceAgreementInstanceRecord(CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord) {
    this.productAndServiceAgreementInstanceRecord = productAndServiceAgreementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product And Service Agreement instance retrieve service call 
   * @return productAndServiceAgreementRetrieveActionTaskReference
  **/

  public String getProductAndServiceAgreementRetrieveActionTaskReference() {
    return productAndServiceAgreementRetrieveActionTaskReference;
  }

  public void setProductAndServiceAgreementRetrieveActionTaskReference(String productAndServiceAgreementRetrieveActionTaskReference) {
    this.productAndServiceAgreementRetrieveActionTaskReference = productAndServiceAgreementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productAndServiceAgreementRetrieveActionResponse
  **/

  public String getProductAndServiceAgreementRetrieveActionResponse() {
    return productAndServiceAgreementRetrieveActionResponse;
  }

  public void setProductAndServiceAgreementRetrieveActionResponse(String productAndServiceAgreementRetrieveActionResponse) {
    this.productAndServiceAgreementRetrieveActionResponse = productAndServiceAgreementRetrieveActionResponse;
  }


  /**
   * Get productAndServiceAgreementInstanceReportRecord
   * @return productAndServiceAgreementInstanceReportRecord
  **/

  public CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceReportRecord getProductAndServiceAgreementInstanceReportRecord() {
    return productAndServiceAgreementInstanceReportRecord;
  }

  public void setProductAndServiceAgreementInstanceReportRecord(CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceReportRecord productAndServiceAgreementInstanceReportRecord) {
    this.productAndServiceAgreementInstanceReportRecord = productAndServiceAgreementInstanceReportRecord;
  }


  /**
   * Get productAndServiceAgreementInstanceAnalysis
   * @return productAndServiceAgreementInstanceAnalysis
  **/

  public CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceAnalysis getProductAndServiceAgreementInstanceAnalysis() {
    return productAndServiceAgreementInstanceAnalysis;
  }

  public void setProductAndServiceAgreementInstanceAnalysis(CRProductAndServiceAgreementRetrieveOutputModelProductAndServiceAgreementInstanceAnalysis productAndServiceAgreementInstanceAnalysis) {
    this.productAndServiceAgreementInstanceAnalysis = productAndServiceAgreementInstanceAnalysis;
  }


}

