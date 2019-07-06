/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type StructureMapGroup of the Data Model fhir.
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
{@link input}, 
{@link rule}, 

* It provides of then following operations (getters and setters)
{@link getInput},
{@link getRule},
{@link setInput},
{@link setRule},
 */

@Description("A Map of relationships between 2 structures that can be used to transform data.")

public interface StructureMapGroup extends GenericEntity, fhir.BackboneElement {

	EntityType<StructureMapGroup> T = EntityTypes.T(StructureMapGroup.class);

	/* Constants for each property name. */
	java.lang.String input = "input";
	java.lang.String rule = "rule";

	@Description("A name assigned to an instance of data. The instance must be provided when the mapping is invoked.")
	
	java.util.List<fhir.StructureMapInput> getInput();
	void setInput(java.util.List<fhir.StructureMapInput> input);

	@Description("Transform Rule from source to target.")
	
	java.util.List<fhir.StructureMapRule> getRule();
	void setRule(java.util.List<fhir.StructureMapRule> rule);

}
