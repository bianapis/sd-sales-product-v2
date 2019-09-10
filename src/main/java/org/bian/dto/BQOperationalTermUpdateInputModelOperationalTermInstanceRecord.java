package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermEvaluateInputModelOperationalTermInstanceRecordOperationalTermParameterType;
import org.bian.dto.BQOperationalTermUpdateInputModelOperationalTermInstanceRecordOperationalTermTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalTermUpdateInputModelOperationalTermInstanceRecord
 */
public class BQOperationalTermUpdateInputModelOperationalTermInstanceRecord   {
  private String operationalTermType = null;

  private String operationalTermDescription = null;

  private BQOperationalTermEvaluateInputModelOperationalTermInstanceRecordOperationalTermParameterType operationalTermParameterType = null;

  private BQOperationalTermUpdateInputModelOperationalTermInstanceRecordOperationalTermTransactionRecord operationalTermTransactionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Type of term (e.g. fee waiver, rate discount, linked service) 
   * @return operationalTermType
  **/

  public String getOperationalTermType() {
    return operationalTermType;
  }

  public void setOperationalTermType(String operationalTermType) {
    this.operationalTermType = operationalTermType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the term, including servicing and fulfillment details  
   * @return operationalTermDescription
  **/

  public String getOperationalTermDescription() {
    return operationalTermDescription;
  }

  public void setOperationalTermDescription(String operationalTermDescription) {
    this.operationalTermDescription = operationalTermDescription;
  }


  /**
   * Get operationalTermParameterType
   * @return operationalTermParameterType
  **/

  public BQOperationalTermEvaluateInputModelOperationalTermInstanceRecordOperationalTermParameterType getOperationalTermParameterType() {
    return operationalTermParameterType;
  }

  public void setOperationalTermParameterType(BQOperationalTermEvaluateInputModelOperationalTermInstanceRecordOperationalTermParameterType operationalTermParameterType) {
    this.operationalTermParameterType = operationalTermParameterType;
  }


  /**
   * Get operationalTermTransactionRecord
   * @return operationalTermTransactionRecord
  **/

  public BQOperationalTermUpdateInputModelOperationalTermInstanceRecordOperationalTermTransactionRecord getOperationalTermTransactionRecord() {
    return operationalTermTransactionRecord;
  }

  public void setOperationalTermTransactionRecord(BQOperationalTermUpdateInputModelOperationalTermInstanceRecordOperationalTermTransactionRecord operationalTermTransactionRecord) {
    this.operationalTermTransactionRecord = operationalTermTransactionRecord;
  }


}

