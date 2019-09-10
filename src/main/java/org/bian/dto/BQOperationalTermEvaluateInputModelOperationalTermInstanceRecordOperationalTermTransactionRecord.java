package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOperationalTermEvaluateInputModelOperationalTermInstanceRecordOperationalTermTransactionRecord
 */
public class BQOperationalTermEvaluateInputModelOperationalTermInstanceRecordOperationalTermTransactionRecord   {
  private String operationalTermTransactionType = null;

  private String operationalTermTransactionDescription = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of transaction and the resulting cash adjustment (e.g. interest forgiveness, fee reduction) 
   * @return operationalTermTransactionType
  **/

  public String getOperationalTermTransactionType() {
    return operationalTermTransactionType;
  }

  public void setOperationalTermTransactionType(String operationalTermTransactionType) {
    this.operationalTermTransactionType = operationalTermTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the transaction detailing amounts and source and the creditor of transfers 
   * @return operationalTermTransactionDescription
  **/

  public String getOperationalTermTransactionDescription() {
    return operationalTermTransactionDescription;
  }

  public void setOperationalTermTransactionDescription(String operationalTermTransactionDescription) {
    this.operationalTermTransactionDescription = operationalTermTransactionDescription;
  }


}

