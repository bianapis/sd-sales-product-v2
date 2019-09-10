package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermUpdateInputModelOperationalTermInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalTermUpdateOutputModel
 */
public class BQOperationalTermUpdateOutputModel   {
  private BQOperationalTermUpdateInputModelOperationalTermInstanceRecord operationalTermInstanceRecord = null;

  private String operationalTermUpdateActionTaskReference = null;

  private Object operationalTermUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get operationalTermInstanceRecord
   * @return operationalTermInstanceRecord
  **/

  public BQOperationalTermUpdateInputModelOperationalTermInstanceRecord getOperationalTermInstanceRecord() {
    return operationalTermInstanceRecord;
  }

  public void setOperationalTermInstanceRecord(BQOperationalTermUpdateInputModelOperationalTermInstanceRecord operationalTermInstanceRecord) {
    this.operationalTermInstanceRecord = operationalTermInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return operationalTermUpdateActionTaskReference
  **/

  public String getOperationalTermUpdateActionTaskReference() {
    return operationalTermUpdateActionTaskReference;
  }

  public void setOperationalTermUpdateActionTaskReference(String operationalTermUpdateActionTaskReference) {
    this.operationalTermUpdateActionTaskReference = operationalTermUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return operationalTermUpdateActionTaskRecord
  **/

  public Object getOperationalTermUpdateActionTaskRecord() {
    return operationalTermUpdateActionTaskRecord;
  }

  public void setOperationalTermUpdateActionTaskRecord(Object operationalTermUpdateActionTaskRecord) {
    this.operationalTermUpdateActionTaskRecord = operationalTermUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

