/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EnrollmentResponse of the Data Model fhir.
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
{@link request}, 
{@link organization}, 
{@link requestProvider}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getRequest},
{@link getOrganization},
{@link getRequestProvider},
{@link setIdentifier},
{@link setRequest},
{@link setOrganization},
{@link setRequestProvider},
 */

@Description("This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.If the element is present, it must have either a @value, an @id, or extensions")

public interface EnrollmentResponse extends GenericEntity, fhir.FhirDomainResource {

	EntityType<EnrollmentResponse> T = EntityTypes.T(EnrollmentResponse.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String request = "request";
	java.lang.String organization = "organization";
	java.lang.String requestProvider = "requestProvider";

	@Description("The Response business identifier.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Original request resource reference.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequest();
	void setRequest(com.braintribe.model.generic.GenericEntity request);
	@Description("The Insurer who produced this adjudicated response.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOrganization();
	void setOrganization(com.braintribe.model.generic.GenericEntity organization);
	@Description("The practitioner who is responsible for the services rendered to the patient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequestProvider();
	void setRequestProvider(com.braintribe.model.generic.GenericEntity requestProvider);
}
