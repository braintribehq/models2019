/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ValueSetExpansion of the Data Model fhir.
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
{@link parameter}, 
{@link contains}, 

* It provides of then following operations (getters and setters)
{@link getParameter},
{@link getContains},
{@link setParameter},
{@link setContains},
 */

@Description("A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).")

public interface ValueSetExpansion extends GenericEntity, fhir.BackboneElement {

	EntityType<ValueSetExpansion> T = EntityTypes.T(ValueSetExpansion.class);

	/* Constants for each property name. */
	java.lang.String parameter = "parameter";
	java.lang.String contains = "contains";

	@Description("A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.")
	
	java.util.List<fhir.ValueSetParameter> getParameter();
	void setParameter(java.util.List<fhir.ValueSetParameter> parameter);

	@Description("The codes that are contained in the value set expansion.")
	
	java.util.List<fhir.ValueSetContains> getContains();
	void setContains(java.util.List<fhir.ValueSetContains> contains);

}
