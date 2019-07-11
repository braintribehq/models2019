/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTShapeProfileDef of the Data Model iai.
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
{@link FlangeEdgeRadius}, 
{@link FlangeEdgeRadiusAsString}, 
{@link WebEdgeRadius}, 
{@link WebEdgeRadiusAsString}, 
{@link WebSlope}, 
{@link WebSlopeAsString}, 
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
{@link getFlangeEdgeRadius},
{@link getFlangeEdgeRadiusAsString},
{@link getWebEdgeRadius},
{@link getWebEdgeRadiusAsString},
{@link getWebSlope},
{@link getWebSlopeAsString},
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
{@link setFlangeEdgeRadius},
{@link setFlangeEdgeRadiusAsString},
{@link setWebEdgeRadius},
{@link setWebEdgeRadiusAsString},
{@link setWebSlope},
{@link setWebSlopeAsString},
{@link setFlangeSlope},
{@link setFlangeSlopeAsString},
 */

@Description("")

public interface IfcTShapeProfileDef extends GenericEntity, ifc4.IfcParameterizedProfileDef {

	EntityType<IfcTShapeProfileDef> T = EntityTypes.T(IfcTShapeProfileDef.class);

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
	java.lang.String FlangeEdgeRadius = "FlangeEdgeRadius";
	java.lang.String FlangeEdgeRadiusAsString = "FlangeEdgeRadiusAsString";
	java.lang.String WebEdgeRadius = "WebEdgeRadius";
	java.lang.String WebEdgeRadiusAsString = "WebEdgeRadiusAsString";
	java.lang.String WebSlope = "WebSlope";
	java.lang.String WebSlopeAsString = "WebSlopeAsString";
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
	java.lang.Double getFlangeEdgeRadius();
	void setFlangeEdgeRadius(java.lang.Double FlangeEdgeRadius);
	@Description("")
	@Mandatory
	java.lang.String getFlangeEdgeRadiusAsString();
	void setFlangeEdgeRadiusAsString(java.lang.String FlangeEdgeRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getWebEdgeRadius();
	void setWebEdgeRadius(java.lang.Double WebEdgeRadius);
	@Description("")
	@Mandatory
	java.lang.String getWebEdgeRadiusAsString();
	void setWebEdgeRadiusAsString(java.lang.String WebEdgeRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getWebSlope();
	void setWebSlope(java.lang.Double WebSlope);
	@Description("")
	@Mandatory
	java.lang.String getWebSlopeAsString();
	void setWebSlopeAsString(java.lang.String WebSlopeAsString);
	@Description("")
	@Mandatory
	java.lang.Double getFlangeSlope();
	void setFlangeSlope(java.lang.Double FlangeSlope);
	@Description("")
	@Mandatory
	java.lang.String getFlangeSlopeAsString();
	void setFlangeSlopeAsString(java.lang.String FlangeSlopeAsString);
}
