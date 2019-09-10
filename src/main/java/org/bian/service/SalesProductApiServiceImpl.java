/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SalesProductApiServiceImpl implements SalesProductApiService {

	public SDSalesProductActivateOutputModel activate(SDSalesProductActivateInputModel request){
		return JsonReader.read("activate-SDSalesProductActivateOutputModel.json",new TypeReference<SDSalesProductActivateOutputModel>(){});
	}
	
	public SDSalesProductConfigureOutputModel configure(String sdReferenceId, SDSalesProductConfigureInputModel request){
		return JsonReader.read("configure-SDSalesProductConfigureOutputModel.json",new TypeReference<SDSalesProductConfigureOutputModel>(){});
	}
	
	public CRProductAndServiceAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductAndServiceAgreementControlInputModel request){
		return JsonReader.read("control-CRProductAndServiceAgreementControlOutputModel.json",new TypeReference<CRProductAndServiceAgreementControlOutputModel>(){});
	}
	
	public CRProductAndServiceAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRProductAndServiceAgreementEvaluateInputModel request){
		return JsonReader.read("evaluate-CRProductAndServiceAgreementEvaluateOutputModel.json",new TypeReference<CRProductAndServiceAgreementEvaluateOutputModel>(){});
	}
	
	public BQOperationalTermEvaluateOutputModel evaluateOperationalterm(String sdReferenceId, String crReferenceId, BQOperationalTermEvaluateInputModel request){
		return JsonReader.read("evaluate-BQOperationalTermEvaluateOutputModel.json",new TypeReference<BQOperationalTermEvaluateOutputModel>(){});
	}
	
	public BQOperationalTermExchangeOutputModel exchangeOperationalterm(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalTermExchangeInputModel request){
		return JsonReader.read("exchange-BQOperationalTermExchangeOutputModel.json",new TypeReference<BQOperationalTermExchangeOutputModel>(){});
	}
	
	public SDSalesProductFeedbackOutputModel feedback(String sdReferenceId, SDSalesProductFeedbackInputModel request){
		return JsonReader.read("feedback-SDSalesProductFeedbackOutputModel.json",new TypeReference<SDSalesProductFeedbackOutputModel>(){});
	}
	
	public BQOperationalTermGrantOutputModel grantOperationalterm(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalTermGrantInputModel request){
		return JsonReader.read("grant-BQOperationalTermGrantOutputModel.json",new TypeReference<BQOperationalTermGrantOutputModel>(){});
	}
	
	public BQOperationalTermRetrieveOutputModel retrieveOperationalterm(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOperationalTermRetrieveOutputModel.json",new TypeReference<BQOperationalTermRetrieveOutputModel>(){});
	}
	
	public SDSalesProductRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSalesProductRetrieveOutputModel.json",new TypeReference<SDSalesProductRetrieveOutputModel>(){});
	}
	
	public CRProductAndServiceAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductAndServiceAgreementRetrieveOutputModel.json",new TypeReference<CRProductAndServiceAgreementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRProductAndServiceAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductAndServiceAgreementUpdateInputModel request){
		return JsonReader.read("update-CRProductAndServiceAgreementUpdateOutputModel.json",new TypeReference<CRProductAndServiceAgreementUpdateOutputModel>(){});
	}
	
	public BQOperationalTermUpdateOutputModel updateOperationalterm(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalTermUpdateInputModel request){
		return JsonReader.read("update-BQOperationalTermUpdateOutputModel.json",new TypeReference<BQOperationalTermUpdateOutputModel>(){});
	}
	
}
