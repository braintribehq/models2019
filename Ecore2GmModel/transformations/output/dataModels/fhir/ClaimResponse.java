/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimResponse of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link identifier}, 
{@link type}, 
{@link subType}, 
{@link patient}, 
{@link insurer}, 
{@link requestor}, 
{@link request}, 
{@link preAuthPeriod}, 
{@link payeeType}, 
{@link item}, 
{@link addItem}, 
{@link adjudication}, 
{@link total}, 
{@link payment}, 
{@link fundsReserve}, 
{@link formCode}, 
{@link form}, 
{@link processNote}, 
{@link communicationRequest}, 
{@link insurance}, 
{@link error}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getSubType},
{@link getPatient},
{@link getInsurer},
{@link getRequestor},
{@link getRequest},
{@link getPreAuthPeriod},
{@link getPayeeType},
{@link getItem},
{@link getAddItem},
{@link getAdjudication},
{@link getTotal},
{@link getPayment},
{@link getFundsReserve},
{@link getFormCode},
{@link getForm},
{@link getProcessNote},
{@link getCommunicationRequest},
{@link getInsurance},
{@link getError},
{@link setIdentifier},
{@link setType},
{@link setSubType},
{@link setPatient},
{@link setInsurer},
{@link setRequestor},
{@link setRequest},
{@link setPreAuthPeriod},
{@link setPayeeType},
{@link setItem},
{@link setAddItem},
{@link setAdjudication},
{@link setTotal},
{@link setPayment},
{@link setFundsReserve},
{@link setFormCode},
{@link setForm},
{@link setProcessNote},
{@link setCommunicationRequest},
{@link setInsurance},
{@link setError},
 */

@Description("This resource provides the adjudication details from the processing of a Claim resource.If the element is present, it must have either a @value, an @id, or extensions")

public interface ClaimResponse extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ClaimResponse> T = EntityTypes.T(ClaimResponse.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String subType = "subType";
	java.lang.String patient = "patient";
	java.lang.String insurer = "insurer";
	java.lang.String requestor = "requestor";
	java.lang.String request = "request";
	java.lang.String preAuthPeriod = "preAuthPeriod";
	java.lang.String payeeType = "payeeType";
	java.lang.String item = "item";
	java.lang.String addItem = "addItem";
	java.lang.String adjudication = "adjudication";
	java.lang.String total = "total";
	java.lang.String payment = "payment";
	java.lang.String fundsReserve = "fundsReserve";
	java.lang.String formCode = "formCode";
	java.lang.String form = "form";
	java.lang.String processNote = "processNote";
	java.lang.String communicationRequest = "communicationRequest";
	java.lang.String insurance = "insurance";
	java.lang.String error = "error";

	@Description("A unique identifier assigned to this claim response.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a specialty service.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a specialty service.")
	@Mandatory
	fhir.CodeableConcept getSubType();
	void setSubType(fhir.CodeableConcept subType);
	@Description("The party to whom the professional services and/or products have been supplied or are being considered and for whom actual for facast reimbursement is sought.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("The party responsible for authorization, adjudication and reimbursement.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInsurer();
	void setInsurer(com.braintribe.model.generic.GenericEntity insurer);
	@Description("The provider which is responsible for the claim, predetermination or preauthorization.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequestor();
	void setRequestor(com.braintribe.model.generic.GenericEntity requestor);
	@Description("Original request resource reference.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequest();
	void setRequest(com.braintribe.model.generic.GenericEntity request);
	@Description("The time frame during which this authorization is effective.")
	@Mandatory
	fhir.Period getPreAuthPeriod();
	void setPreAuthPeriod(fhir.Period preAuthPeriod);
	@Description("Type of Party to be reimbursed: subscriber, provider, other.")
	@Mandatory
	fhir.CodeableConcept getPayeeType();
	void setPayeeType(fhir.CodeableConcept payeeType);
	@Description("A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.")
	
	java.util.List<fhir.ClaimResponseItem> getItem();
	void setItem(java.util.List<fhir.ClaimResponseItem> item);

	@Description("The first-tier service adjudications for payor added product or service lines.")
	
	java.util.List<fhir.ClaimResponseAddItem> getAddItem();
	void setAddItem(java.util.List<fhir.ClaimResponseAddItem> addItem);

	@Description("The adjudication results which are presented at the header level rather than at the line-item or add-item levels.")
	
	java.util.List<fhir.ClaimResponseAdjudication> getAdjudication();
	void setAdjudication(java.util.List<fhir.ClaimResponseAdjudication> adjudication);

	@Description("Categorized monetary totals for the adjudication.")
	
	java.util.List<fhir.ClaimResponseTotal> getTotal();
	void setTotal(java.util.List<fhir.ClaimResponseTotal> total);

	@Description("Payment details for the adjudication of the claim.")
	@Mandatory
	fhir.ClaimResponsePayment getPayment();
	void setPayment(fhir.ClaimResponsePayment payment);
	@Description("A code, used only on a response to a preauthorization, to indicate whether the benefits payable have been reserved and for whom.")
	@Mandatory
	fhir.CodeableConcept getFundsReserve();
	void setFundsReserve(fhir.CodeableConcept fundsReserve);
	@Description("A code for the form to be used for printing the content.")
	@Mandatory
	fhir.CodeableConcept getFormCode();
	void setFormCode(fhir.CodeableConcept formCode);
	@Description("The actual form, by reference or inclusion, for printing the content or an EOB.")
	@Mandatory
	fhir.Attachment getForm();
	void setForm(fhir.Attachment form);
	@Description("A note that describes or explains adjudication results in a human readable form.")
	
	java.util.List<fhir.ClaimResponseProcessNote> getProcessNote();
	void setProcessNote(java.util.List<fhir.ClaimResponseProcessNote> processNote);

	@Description("Request for additional supporting or authorizing information.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getCommunicationRequest();
	void setCommunicationRequest(java.util.List<com.braintribe.model.generic.GenericEntity> communicationRequest);

	@Description("Financial instruments for reimbursement for the health care products and services specified on the claim.")
	
	java.util.List<fhir.ClaimResponseInsurance> getInsurance();
	void setInsurance(java.util.List<fhir.ClaimResponseInsurance> insurance);

	@Description("Errors encountered during the processing of the adjudication.")
	
	java.util.List<fhir.ClaimResponseError> getError();
	void setError(java.util.List<fhir.ClaimResponseError> error);

}
