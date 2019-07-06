/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type VerificationResultValidator of the Data Model fhir.
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
{@link organization}, 
{@link attestationSignature}, 

* It provides of then following operations (getters and setters)
{@link getOrganization},
{@link getAttestationSignature},
{@link setOrganization},
{@link setAttestationSignature},
 */

@Description("Describes validation requirements, source(s), status and dates for one or more elements.")

public interface VerificationResultValidator extends GenericEntity, fhir.BackboneElement {

	EntityType<VerificationResultValidator> T = EntityTypes.T(VerificationResultValidator.class);

	/* Constants for each property name. */
	java.lang.String organization = "organization";
	java.lang.String attestationSignature = "attestationSignature";

	@Description("Reference to the organization validating information.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOrganization();
	void setOrganization(com.braintribe.model.generic.GenericEntity organization);
	@Description("Signed assertion by the validator that they have validated the information.")
	@Mandatory
	fhir.Signature getAttestationSignature();
	void setAttestationSignature(fhir.Signature attestationSignature);
}
