/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcUShapeProfileDef of the Data Model iai.
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
{@link FlangeWidth}, 
{@link FlangeWidthAsString}, 
{@link WebThickness}, 
{@link WebThicknessAsString}, 
{@link FlangeThickness}, 
{@link FlangeThicknessAsString}, 
{@link FilletRadius}, 
{@link FilletRadiusAsString}, 
{@link EdgeRadius}, 
{@link EdgeRadiusAsString}, 
{@link FlangeSlope}, 
{@link FlangeSlopeAsString}, 

* It provides of then following operations (getters and setters)
{@link getDepth},
{@link getDepthAsString},
{@link getFlangeWidth},
{@link getFlangeWidthAsString},
{@link getWebThickness},
{@link getWebThicknessAsString},
{@link getFlangeThickness},
{@link getFlangeThicknessAsString},
{@link getFilletRadius},
{@link getFilletRadiusAsString},
{@link getEdgeRadius},
{@link getEdgeRadiusAsString},
{@link getFlangeSlope},
{@link getFlangeSlopeAsString},
{@link setDepth},
{@link setDepthAsString},
{@link setFlangeWidth},
{@link setFlangeWidthAsString},
{@link setWebThickness},
{@link setWebThicknessAsString},
{@link setFlangeThickness},
{@link setFlangeThicknessAsString},
{@link setFilletRadius},
{@link setFilletRadiusAsString},
{@link setEdgeRadius},
{@link setEdgeRadiusAsString},
{@link setFlangeSlope},
{@link setFlangeSlopeAsString},
 */

@Description("")

public interface IfcUShapeProfileDef extends GenericEntity, ifc4.IfcParameterizedProfileDef {

	EntityType<IfcUShapeProfileDef> T = EntityTypes.T(IfcUShapeProfileDef.class);

	/* Constants for each property name. */
	java.lang.String Depth = "Depth";
	java.lang.String DepthAsString = "DepthAsString";
	java.lang.String FlangeWidth = "FlangeWidth";
	java.lang.String FlangeWidthAsString = "FlangeWidthAsString";
	java.lang.String WebThickness = "WebThickness";
	java.lang.String WebThicknessAsString = "WebThicknessAsString";
	java.lang.String FlangeThickness = "FlangeThickness";
	java.lang.String FlangeThicknessAsString = "FlangeThicknessAsString";
	java.lang.String FilletRadius = "FilletRadius";
	java.lang.String FilletRadiusAsString = "FilletRadiusAsString";
	java.lang.String EdgeRadius = "EdgeRadius";
	java.lang.String EdgeRadiusAsString = "EdgeRadiusAsString";
	java.lang.String FlangeSlope = "FlangeSlope";
	java.lang.String FlangeSlopeAsString = "FlangeSlopeAsString";

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
	java.lang.Double getFlangeWidth();
	void setFlangeWidth(java.lang.Double FlangeWidth);
	@Description("")
	@Mandatory
	java.lang.String getFlangeWidthAsString();
	void setFlangeWidthAsString(java.lang.String FlangeWidthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getWebThickness();
	void setWebThickness(java.lang.Double WebThickness);
	@Description("")
	@Mandatory
	java.lang.String getWebThicknessAsString();
	void setWebThicknessAsString(java.lang.String WebThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getFlangeThickness();
	void setFlangeThickness(java.lang.Double FlangeThickness);
	@Description("")
	@Mandatory
	java.lang.String getFlangeThicknessAsString();
	void setFlangeThicknessAsString(java.lang.String FlangeThicknessAsString);
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
	java.lang.Double getFlangeSlope();
	void setFlangeSlope(java.lang.Double FlangeSlope);
	@Description("")
	@Mandatory
	java.lang.String getFlangeSlopeAsString();
	void setFlangeSlopeAsString(java.lang.String FlangeSlopeAsString);
}
