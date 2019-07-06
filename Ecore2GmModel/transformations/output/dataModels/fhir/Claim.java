/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Claim of the Data Model fhir.
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
{@link fundsReserve}, 
{@link related}, 
{@link prescription}, 
{@link originalPrescription}, 
{@link payee}, 
{@link referral}, 
{@link facility}, 
{@link careTeam}, 
{@link supportingInfo}, 
{@link diagnosis}, 
{@link procedure}, 
{@link insurance}, 
{@link accident}, 
{@link item}, 
{@link total}, 

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
{@link getFundsReserve},
{@link getRelated},
{@link getPrescription},
{@link getOriginalPrescription},
{@link getPayee},
{@link getReferral},
{@link getFacility},
{@link getCareTeam},
{@link getSupportingInfo},
{@link getDiagnosis},
{@link getProcedure},
{@link getInsurance},
{@link getAccident},
{@link getItem},
{@link getTotal},
{@link setIdentifier},
{@link setType},
{@link setSubType},
{@link setPatient},
{@link setBillablePeriod},
{@link setEnterer},
{@link setInsurer},
{@link setProvider},
{@link setPriority},
{@link setFundsReserve},
{@link setRelated},
{@link setPrescription},
{@link setOriginalPrescription},
{@link setPayee},
{@link setReferral},
{@link setFacility},
{@link setCareTeam},
{@link setSupportingInfo},
{@link setDiagnosis},
{@link setProcedure},
{@link setInsurance},
{@link setAccident},
{@link setItem},
{@link setTotal},
 */

@Description("A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.If the element is present, it must have either a @value, an @id, or extensions")

public interface Claim extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Claim> T = EntityTypes.T(Claim.class);

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
	java.lang.String fundsReserve = "fundsReserve";
	java.lang.String related = "related";
	java.lang.String prescription = "prescription";
	java.lang.String originalPrescription = "originalPrescription";
	java.lang.String payee = "payee";
	java.lang.String referral = "referral";
	java.lang.String facility = "facility";
	java.lang.String careTeam = "careTeam";
	java.lang.String supportingInfo = "supportingInfo";
	java.lang.String diagnosis = "diagnosis";
	java.lang.String procedure = "procedure";
	java.lang.String insurance = "insurance";
	java.lang.String accident = "accident";
	java.lang.String item = "item";
	java.lang.String total = "total";

	@Description("A unique identifier assigned to this claim.")
	
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
	@Description("The party to whom the professional services and/or products have been supplied or are being considered and for whom actual or forecast reimbursement is sought.")
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
	@Description("The Insurer who is target of the request.")
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
	fhir.CodeableConcept getFundsReserve();
	void setFundsReserve(fhir.CodeableConcept fundsReserve);
	@Description("Other claims which are related to this claim such as prior submissions or claims for related services or for the same event.")
	
	java.util.List<fhir.ClaimRelated> getRelated();
	void setRelated(java.util.List<fhir.ClaimRelated> related);

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
	fhir.ClaimPayee getPayee();
	void setPayee(fhir.ClaimPayee payee);
	@Description("A reference to a referral resource.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReferral();
	void setReferral(com.braintribe.model.generic.GenericEntity referral);
	@Description("Facility where the services were provided.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getFacility();
	void setFacility(com.braintribe.model.generic.GenericEntity facility);
	@Description("The members of the team who provided the products and services.")
	
	java.util.List<fhir.ClaimCareTeam> getCareTeam();
	void setCareTeam(java.util.List<fhir.ClaimCareTeam> careTeam);

	@Description("Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.")
	
	java.util.List<fhir.ClaimSupportingInfo> getSupportingInfo();
	void setSupportingInfo(java.util.List<fhir.ClaimSupportingInfo> supportingInfo);

	@Description("Information about diagnoses relevant to the claim items.")
	
	java.util.List<fhir.ClaimDiagnosis> getDiagnosis();
	void setDiagnosis(java.util.List<fhir.ClaimDiagnosis> diagnosis);

	@Description("Procedures performed on the patient relevant to the billing items with the claim.")
	
	java.util.List<fhir.ClaimProcedure> getProcedure();
	void setProcedure(java.util.List<fhir.ClaimProcedure> procedure);

	@Description("Financial instruments for reimbursement for the health care products and services specified on the claim.")
	
	java.util.List<fhir.ClaimInsurance> getInsurance();
	void setInsurance(java.util.List<fhir.ClaimInsurance> insurance);

	@Description("Details of an accident which resulted in injuries which required the products and services listed in the claim.")
	@Mandatory
	fhir.ClaimAccident getAccident();
	void setAccident(fhir.ClaimAccident accident);
	@Description("A claim line. Either a simple  product or service or a 'group' of details which can each be a simple items or groups of sub-details.")
	
	java.util.List<fhir.ClaimItem> getItem();
	void setItem(java.util.List<fhir.ClaimItem> item);

	@Description("The total value of the all the items in the claim.")
	@Mandatory
	fhir.Money getTotal();
	void setTotal(fhir.Money total);
}
