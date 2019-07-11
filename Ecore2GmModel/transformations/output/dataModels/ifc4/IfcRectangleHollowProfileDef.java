/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRectangleHollowProfileDef of the Data Model iai.
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
{@link WallThickness}, 
{@link WallThicknessAsString}, 
{@link InnerFilletRadius}, 
{@link InnerFilletRadiusAsString}, 
{@link OuterFilletRadius}, 
{@link OuterFilletRadiusAsString}, 

* It provides of then following operations (getters and setters)
{@link getWallThickness},
{@link getWallThicknessAsString},
{@link getInnerFilletRadius},
{@link getInnerFilletRadiusAsString},
{@link getOuterFilletRadius},
{@link getOuterFilletRadiusAsString},
{@link setWallThickness},
{@link setWallThicknessAsString},
{@link setInnerFilletRadius},
{@link setInnerFilletRadiusAsString},
{@link setOuterFilletRadius},
{@link setOuterFilletRadiusAsString},
 */

@Description("")

public interface IfcRectangleHollowProfileDef extends GenericEntity, ifc4.IfcRectangleProfileDef {

	EntityType<IfcRectangleHollowProfileDef> T = EntityTypes.T(IfcRectangleHollowProfileDef.class);

	/* Constants for each property name. */
	java.lang.String WallThickness = "WallThickness";
	java.lang.String WallThicknessAsString = "WallThicknessAsString";
	java.lang.String InnerFilletRadius = "InnerFilletRadius";
	java.lang.String InnerFilletRadiusAsString = "InnerFilletRadiusAsString";
	java.lang.String OuterFilletRadius = "OuterFilletRadius";
	java.lang.String OuterFilletRadiusAsString = "OuterFilletRadiusAsString";

	@Description("")
	@Mandatory
	java.lang.Double getWallThickness();
	void setWallThickness(java.lang.Double WallThickness);
	@Description("")
	@Mandatory
	java.lang.String getWallThicknessAsString();
	void setWallThicknessAsString(java.lang.String WallThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getInnerFilletRadius();
	void setInnerFilletRadius(java.lang.Double InnerFilletRadius);
	@Description("")
	@Mandatory
	java.lang.String getInnerFilletRadiusAsString();
	void setInnerFilletRadiusAsString(java.lang.String InnerFilletRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getOuterFilletRadius();
	void setOuterFilletRadius(java.lang.Double OuterFilletRadius);
	@Description("")
	@Mandatory
	java.lang.String getOuterFilletRadiusAsString();
	void setOuterFilletRadiusAsString(java.lang.String OuterFilletRadiusAsString);
}
