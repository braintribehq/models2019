/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ValueSetDesignation of the Data Model fhir.
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
{@link use}, 

* It provides of then following operations (getters and setters)
{@link getUse},
{@link setUse},
 */

@Description("A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).")

public interface ValueSetDesignation extends GenericEntity, fhir.BackboneElement {

	EntityType<ValueSetDesignation> T = EntityTypes.T(ValueSetDesignation.class);

	/* Constants for each property name. */
	java.lang.String use = "use";

	@Description("A code that represents types of uses of designations.")
	@Mandatory
	fhir.Coding getUse();
	void setUse(fhir.Coding use);
}
