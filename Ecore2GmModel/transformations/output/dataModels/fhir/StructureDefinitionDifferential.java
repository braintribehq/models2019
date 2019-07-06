/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type StructureDefinitionDifferential of the Data Model fhir.
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
{@link element}, 

* It provides of then following operations (getters and setters)
{@link getElement},
{@link setElement},
 */

@Description("A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.")

public interface StructureDefinitionDifferential extends GenericEntity, fhir.BackboneElement {

	EntityType<StructureDefinitionDifferential> T = EntityTypes.T(StructureDefinitionDifferential.class);

	/* Constants for each property name. */
	java.lang.String element = "element";

	@Description("Captures constraints on each element within the resource.")
	
	java.util.List<fhir.ElementDefinition> getElement();
	void setElement(java.util.List<fhir.ElementDefinition> element);

}
