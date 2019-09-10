/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.AgreeTerms;

@BianRestController
public class SalesProductApiController {

	@Autowired
	SalesProductApiService service;
	
	@AgreeTerms.Activate
	public BianResponse<SDSalesProductActivateOutputModel> activate(@RequestBody BianRequest<SDSalesProductActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@AgreeTerms.Configure
	public BianResponse<SDSalesProductConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSalesProductConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Control
	public BianResponse<CRProductAndServiceAgreementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductAndServiceAgreementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Evaluate
	public BianResponse<CRProductAndServiceAgreementEvaluateOutputModel> evaluate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProductAndServiceAgreementEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationalterm")
	@AgreeTerms.Evaluate
	public BianResponse<BQOperationalTermEvaluateOutputModel> evaluateOperationalterm(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOperationalTermEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluateOperationalterm(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationalterm")
	@AgreeTerms.Exchange
	public BianResponse<BQOperationalTermExchangeOutputModel> exchangeOperationalterm(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationalTermExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeOperationalterm(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@AgreeTerms.Feedback
	public BianResponse<SDSalesProductFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSalesProductFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationalterm")
	@AgreeTerms.Grant
	public BianResponse<BQOperationalTermGrantOutputModel> grantOperationalterm(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationalTermGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantOperationalterm(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationalterm")
	@AgreeTerms.Retrieve
	public BianResponse<BQOperationalTermRetrieveOutputModel> retrieveOperationalterm(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOperationalterm(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@AgreeTerms.RetrieveSD
	public BianResponse<SDSalesProductRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@AgreeTerms.Retrieve
	public BianResponse<CRProductAndServiceAgreementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@AgreeTerms.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@AgreeTerms.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@AgreeTerms.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@AgreeTerms.Update
	public BianResponse<CRProductAndServiceAgreementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductAndServiceAgreementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("operationalterm")
	@AgreeTerms.Update
	public BianResponse<BQOperationalTermUpdateOutputModel> updateOperationalterm(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOperationalTermUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOperationalterm(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
