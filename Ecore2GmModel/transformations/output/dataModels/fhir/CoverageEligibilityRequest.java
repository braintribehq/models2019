/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageEligibilityRequest of the Data Model fhir.
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
{@link priority}, 
{@link patient}, 
{@link servicedPeriod}, 
{@link enterer}, 
{@link provider}, 
{@link insurer}, 
{@link facility}, 
{@link supportingInfo}, 
{@link insurance}, 
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPriority},
{@link getPatient},
{@link getServicedPeriod},
{@link getEnterer},
{@link getProvider},
{@link getInsurer},
{@link getFacility},
{@link getSupportingInfo},
{@link getInsurance},
{@link getItem},
{@link setIdentifier},
{@link setPriority},
{@link setPatient},
{@link setServicedPeriod},
{@link setEnterer},
{@link setProvider},
{@link setInsurer},
{@link setFacility},
{@link setSupportingInfo},
{@link setInsurance},
{@link setItem},
 */

@Description("The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.If the element is present, it must have either a @value, an @id, or extensions")

public interface CoverageEligibilityRequest extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CoverageEligibilityRequest> T = EntityTypes.T(CoverageEligibilityRequest.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String priority = "priority";
	java.lang.String patient = "patient";
	java.lang.String servicedPeriod = "servicedPeriod";
	java.lang.String enterer = "enterer";
	java.lang.String provider = "provider";
	java.lang.String insurer = "insurer";
	java.lang.String facility = "facility";
	java.lang.String supportingInfo = "supportingInfo";
	java.lang.String insurance = "insurance";
	java.lang.String item = "item";

	@Description("A unique identifier assigned to this coverage eligiblity request.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("When the requestor expects the processor to complete processing.")
	@Mandatory
	fhir.CodeableConcept getPriority();
	void setPriority(fhir.CodeableConcept priority);
	@Description("The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("")
	@Mandatory
	fhir.Period getServicedPeriod();
	void setServicedPeriod(fhir.Period servicedPeriod);
	@Description("Person who created the request.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEnterer();
	void setEnterer(com.braintribe.model.generic.GenericEntity enterer);
	@Description("The provider which is responsible for the request.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProvider();
	void setProvider(com.braintribe.model.generic.GenericEntity provider);
	@Description("The Insurer who issued the coverage in question and is the recipient of the request.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInsurer();
	void setInsurer(com.braintribe.model.generic.GenericEntity insurer);
	@Description("Facility where the services are intended to be provided.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getFacility();
	void setFacility(com.braintribe.model.generic.GenericEntity facility);
	@Description("Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.")
	
	java.util.List<fhir.CoverageEligibilityRequestSupportingInfo> getSupportingInfo();
	void setSupportingInfo(java.util.List<fhir.CoverageEligibilityRequestSupportingInfo> supportingInfo);

	@Description("Financial instruments for reimbursement for the health care products and services.")
	
	java.util.List<fhir.CoverageEligibilityRequestInsurance> getInsurance();
	void setInsurance(java.util.List<fhir.CoverageEligibilityRequestInsurance> insurance);

	@Description("Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.")
	
	java.util.List<fhir.CoverageEligibilityRequestItem> getItem();
	void setItem(java.util.List<fhir.CoverageEligibilityRequestItem> item);

}
