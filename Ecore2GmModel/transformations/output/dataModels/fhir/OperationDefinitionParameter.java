/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type OperationDefinitionParameter of the Data Model fhir.
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
{@link binding}, 
{@link referencedFrom}, 
{@link part}, 

* It provides of then following operations (getters and setters)
{@link getBinding},
{@link getReferencedFrom},
{@link getPart},
{@link setBinding},
{@link setReferencedFrom},
{@link setPart},
 */

@Description("A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).")

public interface OperationDefinitionParameter extends GenericEntity, fhir.BackboneElement {

	EntityType<OperationDefinitionParameter> T = EntityTypes.T(OperationDefinitionParameter.class);

	/* Constants for each property name. */
	java.lang.String binding = "binding";
	java.lang.String referencedFrom = "referencedFrom";
	java.lang.String part = "part";

	@Description("Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).")
	@Mandatory
	fhir.OperationDefinitionBinding getBinding();
	void setBinding(fhir.OperationDefinitionBinding binding);
	@Description("Identifies other resource parameters within the operation invocation that are expected to resolve to this resource.")
	
	java.util.List<fhir.OperationDefinitionReferencedFrom> getReferencedFrom();
	void setReferencedFrom(java.util.List<fhir.OperationDefinitionReferencedFrom> referencedFrom);

	@Description("The parts of a nested Parameter.")
	
	java.util.List<fhir.OperationDefinitionParameter> getPart();
	void setPart(java.util.List<fhir.OperationDefinitionParameter> part);

}
