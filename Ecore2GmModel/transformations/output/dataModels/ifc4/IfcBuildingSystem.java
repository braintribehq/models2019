/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBuildingSystem of the Data Model iai.
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
{@link PredefinedType}, 
{@link LongName}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getLongName},
{@link setPredefinedType},
{@link setLongName},
 */

@Description("")

public interface IfcBuildingSystem extends GenericEntity, ifc4.IfcSystem {

	EntityType<IfcBuildingSystem> T = EntityTypes.T(IfcBuildingSystem.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String LongName = "LongName";

	@Description("")
	@Mandatory
	ifc4.IfcBuildingSystemTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcBuildingSystemTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.lang.String getLongName();
	void setLongName(java.lang.String LongName);
}
