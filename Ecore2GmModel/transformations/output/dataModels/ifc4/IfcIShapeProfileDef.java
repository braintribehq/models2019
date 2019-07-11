/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcIShapeProfileDef of the Data Model iai.
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
{@link OverallWidth}, 
{@link OverallWidthAsString}, 
{@link OverallDepth}, 
{@link OverallDepthAsString}, 
{@link WebThickness}, 
{@link WebThicknessAsString}, 
{@link FlangeThickness}, 
{@link FlangeThicknessAsString}, 
{@link FilletRadius}, 
{@link FilletRadiusAsString}, 
{@link FlangeEdgeRadius}, 
{@link FlangeEdgeRadiusAsString}, 
{@link FlangeSlope}, 
{@link FlangeSlopeAsString}, 

* It provides of then following operations (getters and setters)
{@link getOverallWidth},
{@link getOverallWidthAsString},
{@link getOverallDepth},
{@link getOverallDepthAsString},
{@link getWebThickness},
{@link getWebThicknessAsString},
{@link getFlangeThickness},
{@link getFlangeThicknessAsString},
{@link getFilletRadius},
{@link getFilletRadiusAsString},
{@link getFlangeEdgeRadius},
{@link getFlangeEdgeRadiusAsString},
{@link getFlangeSlope},
{@link getFlangeSlopeAsString},
{@link setOverallWidth},
{@link setOverallWidthAsString},
{@link setOverallDepth},
{@link setOverallDepthAsString},
{@link setWebThickness},
{@link setWebThicknessAsString},
{@link setFlangeThickness},
{@link setFlangeThicknessAsString},
{@link setFilletRadius},
{@link setFilletRadiusAsString},
{@link setFlangeEdgeRadius},
{@link setFlangeEdgeRadiusAsString},
{@link setFlangeSlope},
{@link setFlangeSlopeAsString},
 */

@Description("")

public interface IfcIShapeProfileDef extends GenericEntity, ifc4.IfcParameterizedProfileDef {

	EntityType<IfcIShapeProfileDef> T = EntityTypes.T(IfcIShapeProfileDef.class);

	/* Constants for each property name. */
	java.lang.String OverallWidth = "OverallWidth";
	java.lang.String OverallWidthAsString = "OverallWidthAsString";
	java.lang.String OverallDepth = "OverallDepth";
	java.lang.String OverallDepthAsString = "OverallDepthAsString";
	java.lang.String WebThickness = "WebThickness";
	java.lang.String WebThicknessAsString = "WebThicknessAsString";
	java.lang.String FlangeThickness = "FlangeThickness";
	java.lang.String FlangeThicknessAsString = "FlangeThicknessAsString";
	java.lang.String FilletRadius = "FilletRadius";
	java.lang.String FilletRadiusAsString = "FilletRadiusAsString";
	java.lang.String FlangeEdgeRadius = "FlangeEdgeRadius";
	java.lang.String FlangeEdgeRadiusAsString = "FlangeEdgeRadiusAsString";
	java.lang.String FlangeSlope = "FlangeSlope";
	java.lang.String FlangeSlopeAsString = "FlangeSlopeAsString";

	@Description("")
	@Mandatory
	java.lang.Double getOverallWidth();
	void setOverallWidth(java.lang.Double OverallWidth);
	@Description("")
	@Mandatory
	java.lang.String getOverallWidthAsString();
	void setOverallWidthAsString(java.lang.String OverallWidthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getOverallDepth();
	void setOverallDepth(java.lang.Double OverallDepth);
	@Description("")
	@Mandatory
	java.lang.String getOverallDepthAsString();
	void setOverallDepthAsString(java.lang.String OverallDepthAsString);
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
	java.lang.Double getFlangeSlope();
	void setFlangeSlope(java.lang.Double FlangeSlope);
	@Description("")
	@Mandatory
	java.lang.String getFlangeSlopeAsString();
	void setFlangeSlopeAsString(java.lang.String FlangeSlopeAsString);
}
