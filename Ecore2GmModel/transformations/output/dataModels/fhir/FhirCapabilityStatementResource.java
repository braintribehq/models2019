/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type FhirCapabilityStatementResource of the Data Model fhir.
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
{@link interaction}, 
{@link searchParam}, 
{@link operation}, 

* It provides of then following operations (getters and setters)
{@link getInteraction},
{@link getSearchParam},
{@link getOperation},
{@link setInteraction},
{@link setSearchParam},
{@link setOperation},
 */

@Description("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")

public interface FhirCapabilityStatementResource extends GenericEntity, fhir.BackboneElement {

	EntityType<FhirCapabilityStatementResource> T = EntityTypes.T(FhirCapabilityStatementResource.class);

	/* Constants for each property name. */
	java.lang.String interaction = "interaction";
	java.lang.String searchParam = "searchParam";
	java.lang.String operation = "operation";

	@Description("Identifies a restful operation supported by the solution.")
	
	java.util.List<fhir.CapabilityStatementInteraction> getInteraction();
	void setInteraction(java.util.List<fhir.CapabilityStatementInteraction> interaction);

	@Description("Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.")
	
	java.util.List<fhir.CapabilityStatementSearchParam> getSearchParam();
	void setSearchParam(java.util.List<fhir.CapabilityStatementSearchParam> searchParam);

	@Description("Definition of an operation or a named query together with its parameters and their meaning and type. Consult the definition of the operation for details about how to invoke the operation, and the parameters.")
	
	java.util.List<fhir.CapabilityStatementOperation> getOperation();
	void setOperation(java.util.List<fhir.CapabilityStatementOperation> operation);

}
