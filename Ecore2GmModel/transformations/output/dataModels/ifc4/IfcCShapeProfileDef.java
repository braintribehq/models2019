/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCShapeProfileDef of the Data Model iai.
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
{@link Depth}, 
{@link DepthAsString}, 
{@link Width}, 
{@link WidthAsString}, 
{@link WallThickness}, 
{@link WallThicknessAsString}, 
{@link Girth}, 
{@link GirthAsString}, 
{@link InternalFilletRadius}, 
{@link InternalFilletRadiusAsString}, 

* It provides of then following operations (getters and setters)
{@link getDepth},
{@link getDepthAsString},
{@link getWidth},
{@link getWidthAsString},
{@link getWallThickness},
{@link getWallThicknessAsString},
{@link getGirth},
{@link getGirthAsString},
{@link getInternalFilletRadius},
{@link getInternalFilletRadiusAsString},
{@link setDepth},
{@link setDepthAsString},
{@link setWidth},
{@link setWidthAsString},
{@link setWallThickness},
{@link setWallThicknessAsString},
{@link setGirth},
{@link setGirthAsString},
{@link setInternalFilletRadius},
{@link setInternalFilletRadiusAsString},
 */

@Description("")

public interface IfcCShapeProfileDef extends GenericEntity, ifc4.IfcParameterizedProfileDef {

	EntityType<IfcCShapeProfileDef> T = EntityTypes.T(IfcCShapeProfileDef.class);

	/* Constants for each property name. */
	java.lang.String Depth = "Depth";
	java.lang.String DepthAsString = "DepthAsString";
	java.lang.String Width = "Width";
	java.lang.String WidthAsString = "WidthAsString";
	java.lang.String WallThickness = "WallThickness";
	java.lang.String WallThicknessAsString = "WallThicknessAsString";
	java.lang.String Girth = "Girth";
	java.lang.String GirthAsString = "GirthAsString";
	java.lang.String InternalFilletRadius = "InternalFilletRadius";
	java.lang.String InternalFilletRadiusAsString = "InternalFilletRadiusAsString";

	@Description("")
	@Mandatory
	java.lang.Double getDepth();
	void setDepth(java.lang.Double Depth);
	@Description("")
	@Mandatory
	java.lang.String getDepthAsString();
	void setDepthAsString(java.lang.String DepthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getWidth();
	void setWidth(java.lang.Double Width);
	@Description("")
	@Mandatory
	java.lang.String getWidthAsString();
	void setWidthAsString(java.lang.String WidthAsString);
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
	java.lang.Double getGirth();
	void setGirth(java.lang.Double Girth);
	@Description("")
	@Mandatory
	java.lang.String getGirthAsString();
	void setGirthAsString(java.lang.String GirthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getInternalFilletRadius();
	void setInternalFilletRadius(java.lang.Double InternalFilletRadius);
	@Description("")
	@Mandatory
	java.lang.String getInternalFilletRadiusAsString();
	void setInternalFilletRadiusAsString(java.lang.String InternalFilletRadiusAsString);
}
