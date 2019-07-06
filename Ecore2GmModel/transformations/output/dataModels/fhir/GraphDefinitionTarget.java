/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type GraphDefinitionTarget of the Data Model fhir.
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
{@link compartment}, 
{@link link}, 

* It provides of then following operations (getters and setters)
{@link getCompartment},
{@link getLink},
{@link setCompartment},
{@link setLink},
 */

@Description("A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.")

public interface GraphDefinitionTarget extends GenericEntity, fhir.BackboneElement {

	EntityType<GraphDefinitionTarget> T = EntityTypes.T(GraphDefinitionTarget.class);

	/* Constants for each property name. */
	java.lang.String compartment = "compartment";
	java.lang.String link = "link";

	@Description("Compartment Consistency Rules.")
	
	java.util.List<fhir.GraphDefinitionCompartment> getCompartment();
	void setCompartment(java.util.List<fhir.GraphDefinitionCompartment> compartment);

	@Description("Additional links from target resource.")
	
	java.util.List<fhir.GraphDefinitionLink> getLink();
	void setLink(java.util.List<fhir.GraphDefinitionLink> link);

}
