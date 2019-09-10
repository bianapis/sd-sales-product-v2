package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOperationalTermGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * BQOperationalTermGrantOutputModel
 */
public class BQOperationalTermGrantOutputModel   {
  private String operationalTermGrantActionTaskReference = null;

  private Object operationalTermGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private BQOperationalTermGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Operational Term instance grant service call 
   * @return operationalTermGrantActionTaskReference
  **/

  public String getOperationalTermGrantActionTaskReference() {
    return operationalTermGrantActionTaskReference;
  }

  public void setOperationalTermGrantActionTaskReference(String operationalTermGrantActionTaskReference) {
    this.operationalTermGrantActionTaskReference = operationalTermGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return operationalTermGrantActionTaskRecord
  **/

  public Object getOperationalTermGrantActionTaskRecord() {
    return operationalTermGrantActionTaskRecord;
  }

  public void setOperationalTermGrantActionTaskRecord(Object operationalTermGrantActionTaskRecord) {
    this.operationalTermGrantActionTaskRecord = operationalTermGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public BQOperationalTermGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(BQOperationalTermGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

