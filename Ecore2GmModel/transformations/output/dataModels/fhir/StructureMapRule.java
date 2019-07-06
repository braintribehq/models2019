/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type StructureMapRule of the Data Model fhir.
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
{@link source}, 
{@link target}, 
{@link rule}, 
{@link dependent}, 

* It provides of then following operations (getters and setters)
{@link getSource},
{@link getTarget},
{@link getRule},
{@link getDependent},
{@link setSource},
{@link setTarget},
{@link setRule},
{@link setDependent},
 */

@Description("A Map of relationships between 2 structures that can be used to transform data.")

public interface StructureMapRule extends GenericEntity, fhir.BackboneElement {

	EntityType<StructureMapRule> T = EntityTypes.T(StructureMapRule.class);

	/* Constants for each property name. */
	java.lang.String source = "source";
	java.lang.String target = "target";
	java.lang.String rule = "rule";
	java.lang.String dependent = "dependent";

	@Description("Source inputs to the mapping.")
	
	java.util.List<fhir.StructureMapSource> getSource();
	void setSource(java.util.List<fhir.StructureMapSource> source);

	@Description("Content to create because of this mapping rule.")
	
	java.util.List<fhir.StructureMapTarget> getTarget();
	void setTarget(java.util.List<fhir.StructureMapTarget> target);

	@Description("Rules contained in this rule.")
	
	java.util.List<fhir.StructureMapRule> getRule();
	void setRule(java.util.List<fhir.StructureMapRule> rule);

	@Description("Which other rules to apply in the context of this rule.")
	
	java.util.List<fhir.StructureMapDependent> getDependent();
	void setDependent(java.util.List<fhir.StructureMapDependent> dependent);

}
