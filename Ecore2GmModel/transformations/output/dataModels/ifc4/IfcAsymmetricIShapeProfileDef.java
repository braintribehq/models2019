/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcAsymmetricIShapeProfileDef of the Data Model iai.
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
{@link BottomFlangeWidth}, 
{@link BottomFlangeWidthAsString}, 
{@link OverallDepth}, 
{@link OverallDepthAsString}, 
{@link WebThickness}, 
{@link WebThicknessAsString}, 
{@link BottomFlangeThickness}, 
{@link BottomFlangeThicknessAsString}, 
{@link BottomFlangeFilletRadius}, 
{@link BottomFlangeFilletRadiusAsString}, 
{@link TopFlangeWidth}, 
{@link TopFlangeWidthAsString}, 
{@link TopFlangeThickness}, 
{@link TopFlangeThicknessAsString}, 
{@link TopFlangeFilletRadius}, 
{@link TopFlangeFilletRadiusAsString}, 
{@link BottomFlangeEdgeRadius}, 
{@link BottomFlangeEdgeRadiusAsString}, 
{@link BottomFlangeSlope}, 
{@link BottomFlangeSlopeAsString}, 
{@link TopFlangeEdgeRadius}, 
{@link TopFlangeEdgeRadiusAsString}, 
{@link TopFlangeSlope}, 
{@link TopFlangeSlopeAsString}, 

* It provides of then following operations (getters and setters)
{@link getBottomFlangeWidth},
{@link getBottomFlangeWidthAsString},
{@link getOverallDepth},
{@link getOverallDepthAsString},
{@link getWebThickness},
{@link getWebThicknessAsString},
{@link getBottomFlangeThickness},
{@link getBottomFlangeThicknessAsString},
{@link getBottomFlangeFilletRadius},
{@link getBottomFlangeFilletRadiusAsString},
{@link getTopFlangeWidth},
{@link getTopFlangeWidthAsString},
{@link getTopFlangeThickness},
{@link getTopFlangeThicknessAsString},
{@link getTopFlangeFilletRadius},
{@link getTopFlangeFilletRadiusAsString},
{@link getBottomFlangeEdgeRadius},
{@link getBottomFlangeEdgeRadiusAsString},
{@link getBottomFlangeSlope},
{@link getBottomFlangeSlopeAsString},
{@link getTopFlangeEdgeRadius},
{@link getTopFlangeEdgeRadiusAsString},
{@link getTopFlangeSlope},
{@link getTopFlangeSlopeAsString},
{@link setBottomFlangeWidth},
{@link setBottomFlangeWidthAsString},
{@link setOverallDepth},
{@link setOverallDepthAsString},
{@link setWebThickness},
{@link setWebThicknessAsString},
{@link setBottomFlangeThickness},
{@link setBottomFlangeThicknessAsString},
{@link setBottomFlangeFilletRadius},
{@link setBottomFlangeFilletRadiusAsString},
{@link setTopFlangeWidth},
{@link setTopFlangeWidthAsString},
{@link setTopFlangeThickness},
{@link setTopFlangeThicknessAsString},
{@link setTopFlangeFilletRadius},
{@link setTopFlangeFilletRadiusAsString},
{@link setBottomFlangeEdgeRadius},
{@link setBottomFlangeEdgeRadiusAsString},
{@link setBottomFlangeSlope},
{@link setBottomFlangeSlopeAsString},
{@link setTopFlangeEdgeRadius},
{@link setTopFlangeEdgeRadiusAsString},
{@link setTopFlangeSlope},
{@link setTopFlangeSlopeAsString},
 */

@Description("")

public interface IfcAsymmetricIShapeProfileDef extends GenericEntity, ifc4.IfcParameterizedProfileDef {

	EntityType<IfcAsymmetricIShapeProfileDef> T = EntityTypes.T(IfcAsymmetricIShapeProfileDef.class);

	/* Constants for each property name. */
	java.lang.String BottomFlangeWidth = "BottomFlangeWidth";
	java.lang.String BottomFlangeWidthAsString = "BottomFlangeWidthAsString";
	java.lang.String OverallDepth = "OverallDepth";
	java.lang.String OverallDepthAsString = "OverallDepthAsString";
	java.lang.String WebThickness = "WebThickness";
	java.lang.String WebThicknessAsString = "WebThicknessAsString";
	java.lang.String BottomFlangeThickness = "BottomFlangeThickness";
	java.lang.String BottomFlangeThicknessAsString = "BottomFlangeThicknessAsString";
	java.lang.String BottomFlangeFilletRadius = "BottomFlangeFilletRadius";
	java.lang.String BottomFlangeFilletRadiusAsString = "BottomFlangeFilletRadiusAsString";
	java.lang.String TopFlangeWidth = "TopFlangeWidth";
	java.lang.String TopFlangeWidthAsString = "TopFlangeWidthAsString";
	java.lang.String TopFlangeThickness = "TopFlangeThickness";
	java.lang.String TopFlangeThicknessAsString = "TopFlangeThicknessAsString";
	java.lang.String TopFlangeFilletRadius = "TopFlangeFilletRadius";
	java.lang.String TopFlangeFilletRadiusAsString = "TopFlangeFilletRadiusAsString";
	java.lang.String BottomFlangeEdgeRadius = "BottomFlangeEdgeRadius";
	java.lang.String BottomFlangeEdgeRadiusAsString = "BottomFlangeEdgeRadiusAsString";
	java.lang.String BottomFlangeSlope = "BottomFlangeSlope";
	java.lang.String BottomFlangeSlopeAsString = "BottomFlangeSlopeAsString";
	java.lang.String TopFlangeEdgeRadius = "TopFlangeEdgeRadius";
	java.lang.String TopFlangeEdgeRadiusAsString = "TopFlangeEdgeRadiusAsString";
	java.lang.String TopFlangeSlope = "TopFlangeSlope";
	java.lang.String TopFlangeSlopeAsString = "TopFlangeSlopeAsString";

	@Description("")
	@Mandatory
	java.lang.Double getBottomFlangeWidth();
	void setBottomFlangeWidth(java.lang.Double BottomFlangeWidth);
	@Description("")
	@Mandatory
	java.lang.String getBottomFlangeWidthAsString();
	void setBottomFlangeWidthAsString(java.lang.String BottomFlangeWidthAsString);
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
	java.lang.Double getBottomFlangeThickness();
	void setBottomFlangeThickness(java.lang.Double BottomFlangeThickness);
	@Description("")
	@Mandatory
	java.lang.String getBottomFlangeThicknessAsString();
	void setBottomFlangeThicknessAsString(java.lang.String BottomFlangeThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getBottomFlangeFilletRadius();
	void setBottomFlangeFilletRadius(java.lang.Double BottomFlangeFilletRadius);
	@Description("")
	@Mandatory
	java.lang.String getBottomFlangeFilletRadiusAsString();
	void setBottomFlangeFilletRadiusAsString(java.lang.String BottomFlangeFilletRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTopFlangeWidth();
	void setTopFlangeWidth(java.lang.Double TopFlangeWidth);
	@Description("")
	@Mandatory
	java.lang.String getTopFlangeWidthAsString();
	void setTopFlangeWidthAsString(java.lang.String TopFlangeWidthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTopFlangeThickness();
	void setTopFlangeThickness(java.lang.Double TopFlangeThickness);
	@Description("")
	@Mandatory
	java.lang.String getTopFlangeThicknessAsString();
	void setTopFlangeThicknessAsString(java.lang.String TopFlangeThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTopFlangeFilletRadius();
	void setTopFlangeFilletRadius(java.lang.Double TopFlangeFilletRadius);
	@Description("")
	@Mandatory
	java.lang.String getTopFlangeFilletRadiusAsString();
	void setTopFlangeFilletRadiusAsString(java.lang.String TopFlangeFilletRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getBottomFlangeEdgeRadius();
	void setBottomFlangeEdgeRadius(java.lang.Double BottomFlangeEdgeRadius);
	@Description("")
	@Mandatory
	java.lang.String getBottomFlangeEdgeRadiusAsString();
	void setBottomFlangeEdgeRadiusAsString(java.lang.String BottomFlangeEdgeRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getBottomFlangeSlope();
	void setBottomFlangeSlope(java.lang.Double BottomFlangeSlope);
	@Description("")
	@Mandatory
	java.lang.String getBottomFlangeSlopeAsString();
	void setBottomFlangeSlopeAsString(java.lang.String BottomFlangeSlopeAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTopFlangeEdgeRadius();
	void setTopFlangeEdgeRadius(java.lang.Double TopFlangeEdgeRadius);
	@Description("")
	@Mandatory
	java.lang.String getTopFlangeEdgeRadiusAsString();
	void setTopFlangeEdgeRadiusAsString(java.lang.String TopFlangeEdgeRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTopFlangeSlope();
	void setTopFlangeSlope(java.lang.Double TopFlangeSlope);
	@Description("")
	@Mandatory
	java.lang.String getTopFlangeSlopeAsString();
	void setTopFlangeSlopeAsString(java.lang.String TopFlangeSlopeAsString);
}
