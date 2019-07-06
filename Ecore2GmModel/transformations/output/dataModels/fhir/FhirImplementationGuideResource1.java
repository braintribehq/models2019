/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type FhirImplementationGuideResource1 of the Data Model fhir.
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
{@link reference}, 

* It provides of then following operations (getters and setters)
{@link getReference},
{@link setReference},
 */

@Description("A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.")

public interface FhirImplementationGuideResource1 extends GenericEntity, fhir.BackboneElement {

	EntityType<FhirImplementationGuideResource1> T = EntityTypes.T(FhirImplementationGuideResource1.class);

	/* Constants for each property name. */
	java.lang.String reference = "reference";

	@Description("Where this resource is found.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReference();
	void setReference(com.braintribe.model.generic.GenericEntity reference);
}
