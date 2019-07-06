/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CapabilityStatementRest of the Data Model fhir.
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
{@link security}, 
{@link resource}, 
{@link interaction}, 
{@link searchParam}, 
{@link operation}, 

* It provides of then following operations (getters and setters)
{@link getSecurity},
{@link getResource},
{@link getInteraction},
{@link getSearchParam},
{@link getOperation},
{@link setSecurity},
{@link setResource},
{@link setInteraction},
{@link setSearchParam},
{@link setOperation},
 */

@Description("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")

public interface CapabilityStatementRest extends GenericEntity, fhir.BackboneElement {

	EntityType<CapabilityStatementRest> T = EntityTypes.T(CapabilityStatementRest.class);

	/* Constants for each property name. */
	java.lang.String security = "security";
	java.lang.String resource = "resource";
	java.lang.String interaction = "interaction";
	java.lang.String searchParam = "searchParam";
	java.lang.String operation = "operation";

	@Description("Information about security implementation from an interface perspective - what a client needs to know.")
	@Mandatory
	fhir.CapabilityStatementSecurity getSecurity();
	void setSecurity(fhir.CapabilityStatementSecurity security);
	@Description("A specification of the restful capabilities of the solution for a specific resource type.")
	
	java.util.List<fhir.FhirCapabilityStatementResource> getResource();
	void setResource(java.util.List<fhir.FhirCapabilityStatementResource> resource);

	@Description("A specification of restful operations supported by the system.")
	
	java.util.List<fhir.CapabilityStatementInteraction1> getInteraction();
	void setInteraction(java.util.List<fhir.CapabilityStatementInteraction1> interaction);

	@Description("Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation.")
	
	java.util.List<fhir.CapabilityStatementSearchParam> getSearchParam();
	void setSearchParam(java.util.List<fhir.CapabilityStatementSearchParam> searchParam);

	@Description("Definition of an operation or a named query together with its parameters and their meaning and type.")
	
	java.util.List<fhir.CapabilityStatementOperation> getOperation();
	void setOperation(java.util.List<fhir.CapabilityStatementOperation> operation);

}
