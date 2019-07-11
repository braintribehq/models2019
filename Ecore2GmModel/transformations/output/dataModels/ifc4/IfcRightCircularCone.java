/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRightCircularCone of the Data Model iai.
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
{@link Height}, 
{@link HeightAsString}, 
{@link BottomRadius}, 
{@link BottomRadiusAsString}, 

* It provides of then following operations (getters and setters)
{@link getHeight},
{@link getHeightAsString},
{@link getBottomRadius},
{@link getBottomRadiusAsString},
{@link setHeight},
{@link setHeightAsString},
{@link setBottomRadius},
{@link setBottomRadiusAsString},
 */

@Description("")

public interface IfcRightCircularCone extends GenericEntity, ifc4.IfcCsgPrimitive3D {

	EntityType<IfcRightCircularCone> T = EntityTypes.T(IfcRightCircularCone.class);

	/* Constants for each property name. */
	java.lang.String Height = "Height";
	java.lang.String HeightAsString = "HeightAsString";
	java.lang.String BottomRadius = "BottomRadius";
	java.lang.String BottomRadiusAsString = "BottomRadiusAsString";

	@Description("")
	@Mandatory
	java.lang.Double getHeight();
	void setHeight(java.lang.Double Height);
	@Description("")
	@Mandatory
	java.lang.String getHeightAsString();
	void setHeightAsString(java.lang.String HeightAsString);
	@Description("")
	@Mandatory
	java.lang.Double getBottomRadius();
	void setBottomRadius(java.lang.Double BottomRadius);
	@Description("")
	@Mandatory
	java.lang.String getBottomRadiusAsString();
	void setBottomRadiusAsString(java.lang.String BottomRadiusAsString);
}
