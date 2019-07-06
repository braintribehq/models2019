/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BundleResponse of the Data Model fhir.
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
{@link outcome}, 

* It provides of then following operations (getters and setters)
{@link getOutcome},
{@link setOutcome},
 */

@Description("A container for a collection of resources.")

public interface BundleResponse extends GenericEntity, fhir.BackboneElement {

	EntityType<BundleResponse> T = EntityTypes.T(BundleResponse.class);

	/* Constants for each property name. */
	java.lang.String outcome = "outcome";

	@Description("An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction.")
	@Mandatory
	fhir.FhirResourceContainer getOutcome();
	void setOutcome(fhir.FhirResourceContainer outcome);
}
