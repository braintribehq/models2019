/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRoundedRectangleProfileDef of the Data Model iai.
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
{@link RoundingRadius}, 
{@link RoundingRadiusAsString}, 

* It provides of then following operations (getters and setters)
{@link getRoundingRadius},
{@link getRoundingRadiusAsString},
{@link setRoundingRadius},
{@link setRoundingRadiusAsString},
 */

@Description("")

public interface IfcRoundedRectangleProfileDef extends GenericEntity, ifc4.IfcRectangleProfileDef {

	EntityType<IfcRoundedRectangleProfileDef> T = EntityTypes.T(IfcRoundedRectangleProfileDef.class);

	/* Constants for each property name. */
	java.lang.String RoundingRadius = "RoundingRadius";
	java.lang.String RoundingRadiusAsString = "RoundingRadiusAsString";

	@Description("")
	@Mandatory
	java.lang.Double getRoundingRadius();
	void setRoundingRadius(java.lang.Double RoundingRadius);
	@Description("")
	@Mandatory
	java.lang.String getRoundingRadiusAsString();
	void setRoundingRadiusAsString(java.lang.String RoundingRadiusAsString);
}
