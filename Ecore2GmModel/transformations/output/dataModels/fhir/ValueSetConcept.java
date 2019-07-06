/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ValueSetConcept of the Data Model fhir.
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
{@link designation}, 

* It provides of then following operations (getters and setters)
{@link getDesignation},
{@link setDesignation},
 */

@Description("A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).")

public interface ValueSetConcept extends GenericEntity, fhir.BackboneElement {

	EntityType<ValueSetConcept> T = EntityTypes.T(ValueSetConcept.class);

	/* Constants for each property name. */
	java.lang.String designation = "designation";

	@Description("Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.")
	
	java.util.List<fhir.ValueSetDesignation> getDesignation();
	void setDesignation(java.util.List<fhir.ValueSetDesignation> designation);

}
