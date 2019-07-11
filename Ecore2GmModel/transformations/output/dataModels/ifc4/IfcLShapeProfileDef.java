/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLShapeProfileDef of the Data Model iai.
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
{@link Thickness}, 
{@link ThicknessAsString}, 
{@link FilletRadius}, 
{@link FilletRadiusAsString}, 
{@link EdgeRadius}, 
{@link EdgeRadiusAsString}, 
{@link LegSlope}, 
{@link LegSlopeAsString}, 

* It provides of then following operations (getters and setters)
{@link getDepth},
{@link getDepthAsString},
{@link getWidth},
{@link getWidthAsString},
{@link getThickness},
{@link getThicknessAsString},
{@link getFilletRadius},
{@link getFilletRadiusAsString},
{@link getEdgeRadius},
{@link getEdgeRadiusAsString},
{@link getLegSlope},
{@link getLegSlopeAsString},
{@link setDepth},
{@link setDepthAsString},
{@link setWidth},
{@link setWidthAsString},
{@link setThickness},
{@link setThicknessAsString},
{@link setFilletRadius},
{@link setFilletRadiusAsString},
{@link setEdgeRadius},
{@link setEdgeRadiusAsString},
{@link setLegSlope},
{@link setLegSlopeAsString},
 */

@Description("")

public interface IfcLShapeProfileDef extends GenericEntity, ifc4.IfcParameterizedProfileDef {

	EntityType<IfcLShapeProfileDef> T = EntityTypes.T(IfcLShapeProfileDef.class);

	/* Constants for each property name. */
	java.lang.String Depth = "Depth";
	java.lang.String DepthAsString = "DepthAsString";
	java.lang.String Width = "Width";
	java.lang.String WidthAsString = "WidthAsString";
	java.lang.String Thickness = "Thickness";
	java.lang.String ThicknessAsString = "ThicknessAsString";
	java.lang.String FilletRadius = "FilletRadius";
	java.lang.String FilletRadiusAsString = "FilletRadiusAsString";
	java.lang.String EdgeRadius = "EdgeRadius";
	java.lang.String EdgeRadiusAsString = "EdgeRadiusAsString";
	java.lang.String LegSlope = "LegSlope";
	java.lang.String LegSlopeAsString = "LegSlopeAsString";

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
	java.lang.Double getThickness();
	void setThickness(java.lang.Double Thickness);
	@Description("")
	@Mandatory
	java.lang.String getThicknessAsString();
	void setThicknessAsString(java.lang.String ThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getFilletRadius();
	void setFilletRadius(java.lang.Double FilletRadius);
	@Description("")
	@Mandatory
	java.lang.String getFilletRadiusAsString();
	void setFilletRadiusAsString(java.lang.String FilletRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getEdgeRadius();
	void setEdgeRadius(java.lang.Double EdgeRadius);
	@Description("")
	@Mandatory
	java.lang.String getEdgeRadiusAsString();
	void setEdgeRadiusAsString(java.lang.String EdgeRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLegSlope();
	void setLegSlope(java.lang.Double LegSlope);
	@Description("")
	@Mandatory
	java.lang.String getLegSlopeAsString();
	void setLegSlopeAsString(java.lang.String LegSlopeAsString);
}
