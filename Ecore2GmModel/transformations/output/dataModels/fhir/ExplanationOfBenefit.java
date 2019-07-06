/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ExplanationOfBenefit of the Data Model fhir.
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
{@link billablePeriod}, 
{@link enterer}, 
{@link insurer}, 
{@link provider}, 
{@link priority}, 
{@link fundsReserveRequested}, 
{@link fundsReserve}, 
{@link related}, 
{@link prescription}, 
{@link originalPrescription}, 
{@link payee}, 
{@link referral}, 
{@link facility}, 
{@link claim}, 
{@link claimResponse}, 
{@link preAuthRefPeriod}, 
{@link careTeam}, 
{@link supportingInfo}, 
{@link diagnosis}, 
{@link procedure}, 
{@link insurance}, 
{@link accident}, 
{@link item}, 
{@link addItem}, 
{@link adjudication}, 
{@link total}, 
{@link payment}, 
{@link formCode}, 
{@link form}, 
{@link processNote}, 
{@link benefitPeriod}, 
{@link benefitBalance}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getSubType},
{@link getPatient},
{@link getBillablePeriod},
{@link getEnterer},
{@link getInsurer},
{@link getProvider},
{@link getPriority},
{@link getFundsReserveRequested},
{@link getFundsReserve},
{@link getRelated},
{@link getPrescription},
{@link getOriginalPrescription},
{@link getPayee},
{@link getReferral},
{@link getFacility},
{@link getClaim},
{@link getClaimResponse},
{@link getPreAuthRefPeriod},
{@link getCareTeam},
{@link getSupportingInfo},
{@link getDiagnosis},
{@link getProcedure},
{@link getInsurance},
{@link getAccident},
{@link getItem},
{@link getAddItem},
{@link getAdjudication},
{@link getTotal},
{@link getPayment},
{@link getFormCode},
{@link getForm},
{@link getProcessNote},
{@link getBenefitPeriod},
{@link getBenefitBalance},
{@link setIdentifier},
{@link setType},
{@link setSubType},
{@link setPatient},
{@link setBillablePeriod},
{@link setEnterer},
{@link setInsurer},
{@link setProvider},
{@link setPriority},
{@link setFundsReserveRequested},
{@link setFundsReserve},
{@link setRelated},
{@link setPrescription},
{@link setOriginalPrescription},
{@link setPayee},
{@link setReferral},
{@link setFacility},
{@link setClaim},
{@link setClaimResponse},
{@link setPreAuthRefPeriod},
{@link setCareTeam},
{@link setSupportingInfo},
{@link setDiagnosis},
{@link setProcedure},
{@link setInsurance},
{@link setAccident},
{@link setItem},
{@link setAddItem},
{@link setAdjudication},
{@link setTotal},
{@link setPayment},
{@link setFormCode},
{@link setForm},
{@link setProcessNote},
{@link setBenefitPeriod},
{@link setBenefitBalance},
 */

@Description("This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.If the element is present, it must have either a @value, an @id, or extensions")

public interface ExplanationOfBenefit extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ExplanationOfBenefit> T = EntityTypes.T(ExplanationOfBenefit.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String subType = "subType";
	java.lang.String patient = "patient";
	java.lang.String billablePeriod = "billablePeriod";
	java.lang.String enterer = "enterer";
	java.lang.String insurer = "insurer";
	java.lang.String provider = "provider";
	java.lang.String priority = "priority";
	java.lang.String fundsReserveRequested = "fundsReserveRequested";
	java.lang.String fundsReserve = "fundsReserve";
	java.lang.String related = "related";
	java.lang.String prescription = "prescription";
	java.lang.String originalPrescription = "originalPrescription";
	java.lang.String payee = "payee";
	java.lang.String referral = "referral";
	java.lang.String facility = "facility";
	java.lang.String claim = "claim";
	java.lang.String claimResponse = "claimResponse";
	java.lang.String preAuthRefPeriod = "preAuthRefPeriod";
	java.lang.String careTeam = "careTeam";
	java.lang.String supportingInfo = "supportingInfo";
	java.lang.String diagnosis = "diagnosis";
	java.lang.String procedure = "procedure";
	java.lang.String insurance = "insurance";
	java.lang.String accident = "accident";
	java.lang.String item = "item";
	java.lang.String addItem = "addItem";
	java.lang.String adjudication = "adjudication";
	java.lang.String total = "total";
	java.lang.String payment = "payment";
	java.lang.String formCode = "formCode";
	java.lang.String form = "form";
	java.lang.String processNote = "processNote";
	java.lang.String benefitPeriod = "benefitPeriod";
	java.lang.String benefitBalance = "benefitBalance";

	@Description("A unique identifier assigned to this explanation of benefit.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The category of claim, e.g. oral, pharmacy, vision, institutional, professional.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("A finer grained suite of claim type codes which may convey additional information such as Inpatient vs Outpatient and/or a specialty service.")
	@Mandatory
	fhir.CodeableConcept getSubType();
	void setSubType(fhir.CodeableConcept subType);
	@Description("The party to whom the professional services and/or products have been supplied or are being considered and for whom actual for forecast reimbursement is sought.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("The period for which charges are being submitted.")
	@Mandatory
	fhir.Period getBillablePeriod();
	void setBillablePeriod(fhir.Period billablePeriod);
	@Description("Individual who created the claim, predetermination or preauthorization.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEnterer();
	void setEnterer(com.braintribe.model.generic.GenericEntity enterer);
	@Description("The party responsible for authorization, adjudication and reimbursement.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInsurer();
	void setInsurer(com.braintribe.model.generic.GenericEntity insurer);
	@Description("The provider which is responsible for the claim, predetermination or preauthorization.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProvider();
	void setProvider(com.braintribe.model.generic.GenericEntity provider);
	@Description("The provider-required urgency of processing the request. Typical values include: stat, routine deferred.")
	@Mandatory
	fhir.CodeableConcept getPriority();
	void setPriority(fhir.CodeableConcept priority);
	@Description("A code to indicate whether and for whom funds are to be reserved for future claims.")
	@Mandatory
	fhir.CodeableConcept getFundsReserveRequested();
	void setFundsReserveRequested(fhir.CodeableConcept fundsReserveRequested);
	@Description("A code, used only on a response to a preauthorization, to indicate whether the benefits payable have been reserved and for whom.")
	@Mandatory
	fhir.CodeableConcept getFundsReserve();
	void setFundsReserve(fhir.CodeableConcept fundsReserve);
	@Description("Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.")
	
	java.util.List<fhir.ExplanationOfBenefitRelated> getRelated();
	void setRelated(java.util.List<fhir.ExplanationOfBenefitRelated> related);

	@Description("Prescription to support the dispensing of pharmacy, device or vision products.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPrescription();
	void setPrescription(com.braintribe.model.generic.GenericEntity prescription);
	@Description("Original prescription which has been superseded by this prescription to support the dispensing of pharmacy services, medications or products.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOriginalPrescription();
	void setOriginalPrescription(com.braintribe.model.generic.GenericEntity originalPrescription);
	@Description("The party to be reimbursed for cost of the products and services according to the terms of the policy.")
	@Mandatory
	fhir.ExplanationOfBenefitPayee getPayee();
	void setPayee(fhir.ExplanationOfBenefitPayee payee);
	@Description("A reference to a referral resource.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReferral();
	void setReferral(com.braintribe.model.generic.GenericEntity referral);
	@Description("Facility where the services were provided.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getFacility();
	void setFacility(com.braintribe.model.generic.GenericEntity facility);
	@Description("The business identifier for the instance of the adjudication request: claim predetermination or preauthorization.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getClaim();
	void setClaim(com.braintribe.model.generic.GenericEntity claim);
	@Description("The business identifier for the instance of the adjudication response: claim, predetermination or preauthorization response.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getClaimResponse();
	void setClaimResponse(com.braintribe.model.generic.GenericEntity claimResponse);
	@Description("The timeframe during which the supplied preauthorization reference may be quoted on claims to obtain the adjudication as provided.")
	
	java.util.List<fhir.Period> getPreAuthRefPeriod();
	void setPreAuthRefPeriod(java.util.List<fhir.Period> preAuthRefPeriod);

	@Description("The members of the team who provided the products and services.")
	
	java.util.List<fhir.ExplanationOfBenefitCareTeam> getCareTeam();
	void setCareTeam(java.util.List<fhir.ExplanationOfBenefitCareTeam> careTeam);

	@Description("Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.")
	
	java.util.List<fhir.ExplanationOfBenefitSupportingInfo> getSupportingInfo();
	void setSupportingInfo(java.util.List<fhir.ExplanationOfBenefitSupportingInfo> supportingInfo);

	@Description("Information about diagnoses relevant to the claim items.")
	
	java.util.List<fhir.ExplanationOfBenefitDiagnosis> getDiagnosis();
	void setDiagnosis(java.util.List<fhir.ExplanationOfBenefitDiagnosis> diagnosis);

	@Description("Procedures performed on the patient relevant to the billing items with the claim.")
	
	java.util.List<fhir.ExplanationOfBenefitProcedure> getProcedure();
	void setProcedure(java.util.List<fhir.ExplanationOfBenefitProcedure> procedure);

	@Description("Financial instruments for reimbursement for the health care products and services specified on the claim.")
	
	java.util.List<fhir.ExplanationOfBenefitInsurance> getInsurance();
	void setInsurance(java.util.List<fhir.ExplanationOfBenefitInsurance> insurance);

	@Description("Details of a accident which resulted in injuries which required the products and services listed in the claim.")
	@Mandatory
	fhir.ExplanationOfBenefitAccident getAccident();
	void setAccident(fhir.ExplanationOfBenefitAccident accident);
	@Description("A claim line. Either a simple (a product or service) or a 'group' of details which can also be a simple items or groups of sub-details.")
	
	java.util.List<fhir.ExplanationOfBenefitItem> getItem();
	void setItem(java.util.List<fhir.ExplanationOfBenefitItem> item);

	@Description("The first-tier service adjudications for payor added product or service lines.")
	
	java.util.List<fhir.ExplanationOfBenefitAddItem> getAddItem();
	void setAddItem(java.util.List<fhir.ExplanationOfBenefitAddItem> addItem);

	@Description("The adjudication results which are presented at the header level rather than at the line-item or add-item levels.")
	
	java.util.List<fhir.ExplanationOfBenefitAdjudication> getAdjudication();
	void setAdjudication(java.util.List<fhir.ExplanationOfBenefitAdjudication> adjudication);

	@Description("Categorized monetary totals for the adjudication.")
	
	java.util.List<fhir.ExplanationOfBenefitTotal> getTotal();
	void setTotal(java.util.List<fhir.ExplanationOfBenefitTotal> total);

	@Description("Payment details for the adjudication of the claim.")
	@Mandatory
	fhir.ExplanationOfBenefitPayment getPayment();
	void setPayment(fhir.ExplanationOfBenefitPayment payment);
	@Description("A code for the form to be used for printing the content.")
	@Mandatory
	fhir.CodeableConcept getFormCode();
	void setFormCode(fhir.CodeableConcept formCode);
	@Description("The actual form, by reference or inclusion, for printing the content or an EOB.")
	@Mandatory
	fhir.Attachment getForm();
	void setForm(fhir.Attachment form);
	@Description("A note that describes or explains adjudication results in a human readable form.")
	
	java.util.List<fhir.ExplanationOfBenefitProcessNote> getProcessNote();
	void setProcessNote(java.util.List<fhir.ExplanationOfBenefitProcessNote> processNote);

	@Description("The term of the benefits documented in this response.")
	@Mandatory
	fhir.Period getBenefitPeriod();
	void setBenefitPeriod(fhir.Period benefitPeriod);
	@Description("Balance by Benefit Category.")
	
	java.util.List<fhir.ExplanationOfBenefitBenefitBalance> getBenefitBalance();
	void setBenefitBalance(java.util.List<fhir.ExplanationOfBenefitBenefitBalance> benefitBalance);

}
