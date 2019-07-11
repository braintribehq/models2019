/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDoorLiningProperties of the Data Model iai.
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
{@link LiningDepth}, 
{@link LiningDepthAsString}, 
{@link LiningThickness}, 
{@link LiningThicknessAsString}, 
{@link ThresholdDepth}, 
{@link ThresholdDepthAsString}, 
{@link ThresholdThickness}, 
{@link ThresholdThicknessAsString}, 
{@link TransomThickness}, 
{@link TransomThicknessAsString}, 
{@link TransomOffset}, 
{@link TransomOffsetAsString}, 
{@link LiningOffset}, 
{@link LiningOffsetAsString}, 
{@link ThresholdOffset}, 
{@link ThresholdOffsetAsString}, 
{@link CasingThickness}, 
{@link CasingThicknessAsString}, 
{@link CasingDepth}, 
{@link CasingDepthAsString}, 
{@link ShapeAspectStyle}, 
{@link LiningToPanelOffsetX}, 
{@link LiningToPanelOffsetXAsString}, 
{@link LiningToPanelOffsetY}, 
{@link LiningToPanelOffsetYAsString}, 

* It provides of then following operations (getters and setters)
{@link getLiningDepth},
{@link getLiningDepthAsString},
{@link getLiningThickness},
{@link getLiningThicknessAsString},
{@link getThresholdDepth},
{@link getThresholdDepthAsString},
{@link getThresholdThickness},
{@link getThresholdThicknessAsString},
{@link getTransomThickness},
{@link getTransomThicknessAsString},
{@link getTransomOffset},
{@link getTransomOffsetAsString},
{@link getLiningOffset},
{@link getLiningOffsetAsString},
{@link getThresholdOffset},
{@link getThresholdOffsetAsString},
{@link getCasingThickness},
{@link getCasingThicknessAsString},
{@link getCasingDepth},
{@link getCasingDepthAsString},
{@link getShapeAspectStyle},
{@link getLiningToPanelOffsetX},
{@link getLiningToPanelOffsetXAsString},
{@link getLiningToPanelOffsetY},
{@link getLiningToPanelOffsetYAsString},
{@link setLiningDepth},
{@link setLiningDepthAsString},
{@link setLiningThickness},
{@link setLiningThicknessAsString},
{@link setThresholdDepth},
{@link setThresholdDepthAsString},
{@link setThresholdThickness},
{@link setThresholdThicknessAsString},
{@link setTransomThickness},
{@link setTransomThicknessAsString},
{@link setTransomOffset},
{@link setTransomOffsetAsString},
{@link setLiningOffset},
{@link setLiningOffsetAsString},
{@link setThresholdOffset},
{@link setThresholdOffsetAsString},
{@link setCasingThickness},
{@link setCasingThicknessAsString},
{@link setCasingDepth},
{@link setCasingDepthAsString},
{@link setShapeAspectStyle},
{@link setLiningToPanelOffsetX},
{@link setLiningToPanelOffsetXAsString},
{@link setLiningToPanelOffsetY},
{@link setLiningToPanelOffsetYAsString},
 */

@Description("")

public interface IfcDoorLiningProperties extends GenericEntity, ifc4.IfcPreDefinedPropertySet {

	EntityType<IfcDoorLiningProperties> T = EntityTypes.T(IfcDoorLiningProperties.class);

	/* Constants for each property name. */
	java.lang.String LiningDepth = "LiningDepth";
	java.lang.String LiningDepthAsString = "LiningDepthAsString";
	java.lang.String LiningThickness = "LiningThickness";
	java.lang.String LiningThicknessAsString = "LiningThicknessAsString";
	java.lang.String ThresholdDepth = "ThresholdDepth";
	java.lang.String ThresholdDepthAsString = "ThresholdDepthAsString";
	java.lang.String ThresholdThickness = "ThresholdThickness";
	java.lang.String ThresholdThicknessAsString = "ThresholdThicknessAsString";
	java.lang.String TransomThickness = "TransomThickness";
	java.lang.String TransomThicknessAsString = "TransomThicknessAsString";
	java.lang.String TransomOffset = "TransomOffset";
	java.lang.String TransomOffsetAsString = "TransomOffsetAsString";
	java.lang.String LiningOffset = "LiningOffset";
	java.lang.String LiningOffsetAsString = "LiningOffsetAsString";
	java.lang.String ThresholdOffset = "ThresholdOffset";
	java.lang.String ThresholdOffsetAsString = "ThresholdOffsetAsString";
	java.lang.String CasingThickness = "CasingThickness";
	java.lang.String CasingThicknessAsString = "CasingThicknessAsString";
	java.lang.String CasingDepth = "CasingDepth";
	java.lang.String CasingDepthAsString = "CasingDepthAsString";
	java.lang.String ShapeAspectStyle = "ShapeAspectStyle";
	java.lang.String LiningToPanelOffsetX = "LiningToPanelOffsetX";
	java.lang.String LiningToPanelOffsetXAsString = "LiningToPanelOffsetXAsString";
	java.lang.String LiningToPanelOffsetY = "LiningToPanelOffsetY";
	java.lang.String LiningToPanelOffsetYAsString = "LiningToPanelOffsetYAsString";

	@Description("")
	@Mandatory
	java.lang.Double getLiningDepth();
	void setLiningDepth(java.lang.Double LiningDepth);
	@Description("")
	@Mandatory
	java.lang.String getLiningDepthAsString();
	void setLiningDepthAsString(java.lang.String LiningDepthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLiningThickness();
	void setLiningThickness(java.lang.Double LiningThickness);
	@Description("")
	@Mandatory
	java.lang.String getLiningThicknessAsString();
	void setLiningThicknessAsString(java.lang.String LiningThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getThresholdDepth();
	void setThresholdDepth(java.lang.Double ThresholdDepth);
	@Description("")
	@Mandatory
	java.lang.String getThresholdDepthAsString();
	void setThresholdDepthAsString(java.lang.String ThresholdDepthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getThresholdThickness();
	void setThresholdThickness(java.lang.Double ThresholdThickness);
	@Description("")
	@Mandatory
	java.lang.String getThresholdThicknessAsString();
	void setThresholdThicknessAsString(java.lang.String ThresholdThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTransomThickness();
	void setTransomThickness(java.lang.Double TransomThickness);
	@Description("")
	@Mandatory
	java.lang.String getTransomThicknessAsString();
	void setTransomThicknessAsString(java.lang.String TransomThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTransomOffset();
	void setTransomOffset(java.lang.Double TransomOffset);
	@Description("")
	@Mandatory
	java.lang.String getTransomOffsetAsString();
	void setTransomOffsetAsString(java.lang.String TransomOffsetAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLiningOffset();
	void setLiningOffset(java.lang.Double LiningOffset);
	@Description("")
	@Mandatory
	java.lang.String getLiningOffsetAsString();
	void setLiningOffsetAsString(java.lang.String LiningOffsetAsString);
	@Description("")
	@Mandatory
	java.lang.Double getThresholdOffset();
	void setThresholdOffset(java.lang.Double ThresholdOffset);
	@Description("")
	@Mandatory
	java.lang.String getThresholdOffsetAsString();
	void setThresholdOffsetAsString(java.lang.String ThresholdOffsetAsString);
	@Description("")
	@Mandatory
	java.lang.Double getCasingThickness();
	void setCasingThickness(java.lang.Double CasingThickness);
	@Description("")
	@Mandatory
	java.lang.String getCasingThicknessAsString();
	void setCasingThicknessAsString(java.lang.String CasingThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getCasingDepth();
	void setCasingDepth(java.lang.Double CasingDepth);
	@Description("")
	@Mandatory
	java.lang.String getCasingDepthAsString();
	void setCasingDepthAsString(java.lang.String CasingDepthAsString);
	@Description("")
	@Mandatory
	ifc4.IfcShapeAspect getShapeAspectStyle();
	void setShapeAspectStyle(ifc4.IfcShapeAspect ShapeAspectStyle);
	@Description("")
	@Mandatory
	java.lang.Double getLiningToPanelOffsetX();
	void setLiningToPanelOffsetX(java.lang.Double LiningToPanelOffsetX);
	@Description("")
	@Mandatory
	java.lang.String getLiningToPanelOffsetXAsString();
	void setLiningToPanelOffsetXAsString(java.lang.String LiningToPanelOffsetXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLiningToPanelOffsetY();
	void setLiningToPanelOffsetY(java.lang.Double LiningToPanelOffsetY);
	@Description("")
	@Mandatory
	java.lang.String getLiningToPanelOffsetYAsString();
	void setLiningToPanelOffsetYAsString(java.lang.String LiningToPanelOffsetYAsString);
}
