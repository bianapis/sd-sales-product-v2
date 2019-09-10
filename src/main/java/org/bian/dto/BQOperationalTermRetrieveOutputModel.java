package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermRetrieveOutputModelOperationalTermInstanceAnalysis;
import org.bian.dto.BQOperationalTermRetrieveOutputModelOperationalTermInstanceRecord;
import org.bian.dto.BQOperationalTermRetrieveOutputModelOperationalTermInstanceReport;
import org.bian.dto.BQOperationalTermRetrieveOutputModelProductAndServiceAgreementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalTermRetrieveOutputModel
 */
public class BQOperationalTermRetrieveOutputModel   {
  private BQOperationalTermRetrieveOutputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord = null;

  private BQOperationalTermRetrieveOutputModelOperationalTermInstanceRecord operationalTermInstanceRecord = null;

  private String operationalTermRetrieveActionTaskReference = null;

  private Object operationalTermRetrieveActionTaskRecord = null;

  private String operationalTermRetrieveActionResponse = null;

  private BQOperationalTermRetrieveOutputModelOperationalTermInstanceReport operationalTermInstanceReport = null;

  private BQOperationalTermRetrieveOutputModelOperationalTermInstanceAnalysis operationalTermInstanceAnalysis = null;


  /**
   * Get productAndServiceAgreementInstanceRecord
   * @return productAndServiceAgreementInstanceRecord
  **/

  public BQOperationalTermRetrieveOutputModelProductAndServiceAgreementInstanceRecord getProductAndServiceAgreementInstanceRecord() {
    return productAndServiceAgreementInstanceRecord;
  }

  public void setProductAndServiceAgreementInstanceRecord(BQOperationalTermRetrieveOutputModelProductAndServiceAgreementInstanceRecord productAndServiceAgreementInstanceRecord) {
    this.productAndServiceAgreementInstanceRecord = productAndServiceAgreementInstanceRecord;
  }


  /**
   * Get operationalTermInstanceRecord
   * @return operationalTermInstanceRecord
  **/

  public BQOperationalTermRetrieveOutputModelOperationalTermInstanceRecord getOperationalTermInstanceRecord() {
    return operationalTermInstanceRecord;
  }

  public void setOperationalTermInstanceRecord(BQOperationalTermRetrieveOutputModelOperationalTermInstanceRecord operationalTermInstanceRecord) {
    this.operationalTermInstanceRecord = operationalTermInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operational Term instance retrieve service call 
   * @return operationalTermRetrieveActionTaskReference
  **/

  public String getOperationalTermRetrieveActionTaskReference() {
    return operationalTermRetrieveActionTaskReference;
  }

  public void setOperationalTermRetrieveActionTaskReference(String operationalTermRetrieveActionTaskReference) {
    this.operationalTermRetrieveActionTaskReference = operationalTermRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return operationalTermRetrieveActionTaskRecord
  **/

  public Object getOperationalTermRetrieveActionTaskRecord() {
    return operationalTermRetrieveActionTaskRecord;
  }

  public void setOperationalTermRetrieveActionTaskRecord(Object operationalTermRetrieveActionTaskRecord) {
    this.operationalTermRetrieveActionTaskRecord = operationalTermRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return operationalTermRetrieveActionResponse
  **/

  public String getOperationalTermRetrieveActionResponse() {
    return operationalTermRetrieveActionResponse;
  }

  public void setOperationalTermRetrieveActionResponse(String operationalTermRetrieveActionResponse) {
    this.operationalTermRetrieveActionResponse = operationalTermRetrieveActionResponse;
  }


  /**
   * Get operationalTermInstanceReport
   * @return operationalTermInstanceReport
  **/

  public BQOperationalTermRetrieveOutputModelOperationalTermInstanceReport getOperationalTermInstanceReport() {
    return operationalTermInstanceReport;
  }

  public void setOperationalTermInstanceReport(BQOperationalTermRetrieveOutputModelOperationalTermInstanceReport operationalTermInstanceReport) {
    this.operationalTermInstanceReport = operationalTermInstanceReport;
  }


  /**
   * Get operationalTermInstanceAnalysis
   * @return operationalTermInstanceAnalysis
  **/

  public BQOperationalTermRetrieveOutputModelOperationalTermInstanceAnalysis getOperationalTermInstanceAnalysis() {
    return operationalTermInstanceAnalysis;
  }

  public void setOperationalTermInstanceAnalysis(BQOperationalTermRetrieveOutputModelOperationalTermInstanceAnalysis operationalTermInstanceAnalysis) {
    this.operationalTermInstanceAnalysis = operationalTermInstanceAnalysis;
  }


}

