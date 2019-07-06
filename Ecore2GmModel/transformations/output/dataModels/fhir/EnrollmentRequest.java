/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EnrollmentRequest of the Data Model fhir.
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
{@link insurer}, 
{@link provider}, 
{@link candidate}, 
{@link coverage}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getInsurer},
{@link getProvider},
{@link getCandidate},
{@link getCoverage},
{@link setIdentifier},
{@link setInsurer},
{@link setProvider},
{@link setCandidate},
{@link setCoverage},
 */

@Description("This resource provides the insurance enrollment details to the insurer regarding a specified coverage.If the element is present, it must have either a @value, an @id, or extensions")

public interface EnrollmentRequest extends GenericEntity, fhir.FhirDomainResource {

	EntityType<EnrollmentRequest> T = EntityTypes.T(EnrollmentRequest.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String insurer = "insurer";
	java.lang.String provider = "provider";
	java.lang.String candidate = "candidate";
	java.lang.String coverage = "coverage";

	@Description("The Response business identifier.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The Insurer who is target  of the request.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInsurer();
	void setInsurer(com.braintribe.model.generic.GenericEntity insurer);
	@Description("The practitioner who is responsible for the services rendered to the patient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProvider();
	void setProvider(com.braintribe.model.generic.GenericEntity provider);
	@Description("Patient Resource.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCandidate();
	void setCandidate(com.braintribe.model.generic.GenericEntity candidate);
	@Description("Reference to the program or plan identification, underwriter or payor.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCoverage();
	void setCoverage(com.braintribe.model.generic.GenericEntity coverage);
}
