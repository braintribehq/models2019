/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRevolvedAreaSolid of the Data Model iai.
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
{@link Axis}, 
{@link Angle}, 
{@link AngleAsString}, 

* It provides of then following operations (getters and setters)
{@link getAxis},
{@link getAngle},
{@link getAngleAsString},
{@link setAxis},
{@link setAngle},
{@link setAngleAsString},
 */

@Description("")

public interface IfcRevolvedAreaSolid extends GenericEntity, ifc4.IfcSweptAreaSolid {

	EntityType<IfcRevolvedAreaSolid> T = EntityTypes.T(IfcRevolvedAreaSolid.class);

	/* Constants for each property name. */
	java.lang.String Axis = "Axis";
	java.lang.String Angle = "Angle";
	java.lang.String AngleAsString = "AngleAsString";

	@Description("")
	@Mandatory
	ifc4.IfcAxis1Placement getAxis();
	void setAxis(ifc4.IfcAxis1Placement Axis);
	@Description("")
	@Mandatory
	java.lang.Double getAngle();
	void setAngle(java.lang.Double Angle);
	@Description("")
	@Mandatory
	java.lang.String getAngleAsString();
	void setAngleAsString(java.lang.String AngleAsString);
}
