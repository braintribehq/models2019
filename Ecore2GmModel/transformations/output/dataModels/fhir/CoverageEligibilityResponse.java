/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CoverageEligibilityResponse of the Data Model fhir.
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
{@link patient}, 
{@link servicedPeriod}, 
{@link requestor}, 
{@link request}, 
{@link insurer}, 
{@link insurance}, 
{@link form}, 
{@link error}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPatient},
{@link getServicedPeriod},
{@link getRequestor},
{@link getRequest},
{@link getInsurer},
{@link getInsurance},
{@link getForm},
{@link getError},
{@link setIdentifier},
{@link setPatient},
{@link setServicedPeriod},
{@link setRequestor},
{@link setRequest},
{@link setInsurer},
{@link setInsurance},
{@link setForm},
{@link setError},
 */

@Description("This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.If the element is present, it must have either a @value, an @id, or extensions")

public interface CoverageEligibilityResponse extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CoverageEligibilityResponse> T = EntityTypes.T(CoverageEligibilityResponse.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String patient = "patient";
	java.lang.String servicedPeriod = "servicedPeriod";
	java.lang.String requestor = "requestor";
	java.lang.String request = "request";
	java.lang.String insurer = "insurer";
	java.lang.String insurance = "insurance";
	java.lang.String form = "form";
	java.lang.String error = "error";

	@Description("A unique identifier assigned to this coverage eligiblity request.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("")
	@Mandatory
	fhir.Period getServicedPeriod();
	void setServicedPeriod(fhir.Period servicedPeriod);
	@Description("The provider which is responsible for the request.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequestor();
	void setRequestor(com.braintribe.model.generic.GenericEntity requestor);
	@Description("Reference to the original request resource.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequest();
	void setRequest(com.braintribe.model.generic.GenericEntity request);
	@Description("The Insurer who issued the coverage in question and is the author of the response.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInsurer();
	void setInsurer(com.braintribe.model.generic.GenericEntity insurer);
	@Description("Financial instruments for reimbursement for the health care products and services.")
	
	java.util.List<fhir.CoverageEligibilityResponseInsurance> getInsurance();
	void setInsurance(java.util.List<fhir.CoverageEligibilityResponseInsurance> insurance);

	@Description("A code for the form to be used for printing the content.")
	@Mandatory
	fhir.CodeableConcept getForm();
	void setForm(fhir.CodeableConcept form);
	@Description("Errors encountered during the processing of the request.")
	
	java.util.List<fhir.CoverageEligibilityResponseError> getError();
	void setError(java.util.List<fhir.CoverageEligibilityResponseError> error);

}
