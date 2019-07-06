/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimResponseError of the Data Model fhir.
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
{@link code}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link setCode},
 */

@Description("This resource provides the adjudication details from the processing of a Claim resource.")

public interface ClaimResponseError extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimResponseError> T = EntityTypes.T(ClaimResponseError.class);

	/* Constants for each property name. */
	java.lang.String code = "code";

	@Description("An error code, from a specified code system, which details why the claim could not be adjudicated.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
}
