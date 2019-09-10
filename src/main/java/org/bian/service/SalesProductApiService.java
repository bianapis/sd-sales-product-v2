/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SalesProductApiService {

	SDSalesProductActivateOutputModel activate(SDSalesProductActivateInputModel request);
	
	SDSalesProductConfigureOutputModel configure(String sdReferenceId, SDSalesProductConfigureInputModel request);
	
	CRProductAndServiceAgreementControlOutputModel control(String sdReferenceId, String crReferenceId, CRProductAndServiceAgreementControlInputModel request);
	
	CRProductAndServiceAgreementEvaluateOutputModel evaluate(String sdReferenceId, CRProductAndServiceAgreementEvaluateInputModel request);
	
	BQOperationalTermEvaluateOutputModel evaluateOperationalterm(String sdReferenceId, String crReferenceId, BQOperationalTermEvaluateInputModel request);
	
	BQOperationalTermExchangeOutputModel exchangeOperationalterm(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalTermExchangeInputModel request);
	
	SDSalesProductFeedbackOutputModel feedback(String sdReferenceId, SDSalesProductFeedbackInputModel request);
	
	BQOperationalTermGrantOutputModel grantOperationalterm(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalTermGrantInputModel request);
	
	BQOperationalTermRetrieveOutputModel retrieveOperationalterm(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDSalesProductRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductAndServiceAgreementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRProductAndServiceAgreementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductAndServiceAgreementUpdateInputModel request);
	
	BQOperationalTermUpdateOutputModel updateOperationalterm(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOperationalTermUpdateInputModel request);
	
}
