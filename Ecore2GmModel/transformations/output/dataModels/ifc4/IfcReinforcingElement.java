/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcReinforcingElement of the Data Model iai.
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
{@link SteelGrade}, 

* It provides of then following operations (getters and setters)
{@link getSteelGrade},
{@link setSteelGrade},
 */

@Description("")

public interface IfcReinforcingElement extends GenericEntity, ifc4.IfcElementComponent {

	EntityType<IfcReinforcingElement> T = EntityTypes.T(IfcReinforcingElement.class);

	/* Constants for each property name. */
	java.lang.String SteelGrade = "SteelGrade";

	@Description("")
	@Mandatory
	java.lang.String getSteelGrade();
	void setSteelGrade(java.lang.String SteelGrade);
}
