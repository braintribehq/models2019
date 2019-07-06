/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ValueSetInclude of the Data Model fhir.
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
{@link concept}, 
{@link filter}, 

* It provides of then following operations (getters and setters)
{@link getConcept},
{@link getFilter},
{@link setConcept},
{@link setFilter},
 */

@Description("A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).")

public interface ValueSetInclude extends GenericEntity, fhir.BackboneElement {

	EntityType<ValueSetInclude> T = EntityTypes.T(ValueSetInclude.class);

	/* Constants for each property name. */
	java.lang.String concept = "concept";
	java.lang.String filter = "filter";

	@Description("Specifies a concept to be included or excluded.")
	
	java.util.List<fhir.ValueSetConcept> getConcept();
	void setConcept(java.util.List<fhir.ValueSetConcept> concept);

	@Description("Select concepts by specify a matching criterion based on the properties (including relationships) defined by the system, or on filters defined by the system. If multiple filters are specified, they SHALL all be true.")
	
	java.util.List<fhir.ValueSetFilter> getFilter();
	void setFilter(java.util.List<fhir.ValueSetFilter> filter);

}
