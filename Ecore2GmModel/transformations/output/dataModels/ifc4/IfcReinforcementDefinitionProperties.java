/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcReinforcementDefinitionProperties of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link DefinitionType}, 
{@link ReinforcementSectionDefinitions}, 

* It provides of then following operations (getters and setters)
{@link getDefinitionType},
{@link getReinforcementSectionDefinitions},
{@link setDefinitionType},
{@link setReinforcementSectionDefinitions},
 */

@Description("")

public interface IfcReinforcementDefinitionProperties extends GenericEntity, ifc4.IfcPreDefinedPropertySet {

	EntityType<IfcReinforcementDefinitionProperties> T = EntityTypes.T(IfcReinforcementDefinitionProperties.class);

	/* Constants for each property name. */
	java.lang.String DefinitionType = "DefinitionType";
	java.lang.String ReinforcementSectionDefinitions = "ReinforcementSectionDefinitions";

	@Description("")
	@Mandatory
	java.lang.String getDefinitionType();
	void setDefinitionType(java.lang.String DefinitionType);
	@Description("")
	
	java.util.List<ifc4.IfcSectionReinforcementProperties> getReinforcementSectionDefinitions();
	void setReinforcementSectionDefinitions(java.util.List<ifc4.IfcSectionReinforcementProperties> ReinforcementSectionDefinitions);

}
