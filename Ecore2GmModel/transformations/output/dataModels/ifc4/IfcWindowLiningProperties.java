/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcWindowLiningProperties of the Data Model iai.
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
{@link TransomThickness}, 
{@link TransomThicknessAsString}, 
{@link MullionThickness}, 
{@link MullionThicknessAsString}, 
{@link FirstTransomOffset}, 
{@link FirstTransomOffsetAsString}, 
{@link SecondTransomOffset}, 
{@link SecondTransomOffsetAsString}, 
{@link FirstMullionOffset}, 
{@link FirstMullionOffsetAsString}, 
{@link SecondMullionOffset}, 
{@link SecondMullionOffsetAsString}, 
{@link ShapeAspectStyle}, 
{@link LiningOffset}, 
{@link LiningOffsetAsString}, 
{@link LiningToPanelOffsetX}, 
{@link LiningToPanelOffsetXAsString}, 
{@link LiningToPanelOffsetY}, 
{@link LiningToPanelOffsetYAsString}, 

* It provides of then following operations (getters and setters)
{@link getLiningDepth},
{@link getLiningDepthAsString},
{@link getLiningThickness},
{@link getLiningThicknessAsString},
{@link getTransomThickness},
{@link getTransomThicknessAsString},
{@link getMullionThickness},
{@link getMullionThicknessAsString},
{@link getFirstTransomOffset},
{@link getFirstTransomOffsetAsString},
{@link getSecondTransomOffset},
{@link getSecondTransomOffsetAsString},
{@link getFirstMullionOffset},
{@link getFirstMullionOffsetAsString},
{@link getSecondMullionOffset},
{@link getSecondMullionOffsetAsString},
{@link getShapeAspectStyle},
{@link getLiningOffset},
{@link getLiningOffsetAsString},
{@link getLiningToPanelOffsetX},
{@link getLiningToPanelOffsetXAsString},
{@link getLiningToPanelOffsetY},
{@link getLiningToPanelOffsetYAsString},
{@link setLiningDepth},
{@link setLiningDepthAsString},
{@link setLiningThickness},
{@link setLiningThicknessAsString},
{@link setTransomThickness},
{@link setTransomThicknessAsString},
{@link setMullionThickness},
{@link setMullionThicknessAsString},
{@link setFirstTransomOffset},
{@link setFirstTransomOffsetAsString},
{@link setSecondTransomOffset},
{@link setSecondTransomOffsetAsString},
{@link setFirstMullionOffset},
{@link setFirstMullionOffsetAsString},
{@link setSecondMullionOffset},
{@link setSecondMullionOffsetAsString},
{@link setShapeAspectStyle},
{@link setLiningOffset},
{@link setLiningOffsetAsString},
{@link setLiningToPanelOffsetX},
{@link setLiningToPanelOffsetXAsString},
{@link setLiningToPanelOffsetY},
{@link setLiningToPanelOffsetYAsString},
 */

@Description("")

public interface IfcWindowLiningProperties extends GenericEntity, ifc4.IfcPreDefinedPropertySet {

	EntityType<IfcWindowLiningProperties> T = EntityTypes.T(IfcWindowLiningProperties.class);

	/* Constants for each property name. */
	java.lang.String LiningDepth = "LiningDepth";
	java.lang.String LiningDepthAsString = "LiningDepthAsString";
	java.lang.String LiningThickness = "LiningThickness";
	java.lang.String LiningThicknessAsString = "LiningThicknessAsString";
	java.lang.String TransomThickness = "TransomThickness";
	java.lang.String TransomThicknessAsString = "TransomThicknessAsString";
	java.lang.String MullionThickness = "MullionThickness";
	java.lang.String MullionThicknessAsString = "MullionThicknessAsString";
	java.lang.String FirstTransomOffset = "FirstTransomOffset";
	java.lang.String FirstTransomOffsetAsString = "FirstTransomOffsetAsString";
	java.lang.String SecondTransomOffset = "SecondTransomOffset";
	java.lang.String SecondTransomOffsetAsString = "SecondTransomOffsetAsString";
	java.lang.String FirstMullionOffset = "FirstMullionOffset";
	java.lang.String FirstMullionOffsetAsString = "FirstMullionOffsetAsString";
	java.lang.String SecondMullionOffset = "SecondMullionOffset";
	java.lang.String SecondMullionOffsetAsString = "SecondMullionOffsetAsString";
	java.lang.String ShapeAspectStyle = "ShapeAspectStyle";
	java.lang.String LiningOffset = "LiningOffset";
	java.lang.String LiningOffsetAsString = "LiningOffsetAsString";
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
	java.lang.Double getTransomThickness();
	void setTransomThickness(java.lang.Double TransomThickness);
	@Description("")
	@Mandatory
	java.lang.String getTransomThicknessAsString();
	void setTransomThicknessAsString(java.lang.String TransomThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getMullionThickness();
	void setMullionThickness(java.lang.Double MullionThickness);
	@Description("")
	@Mandatory
	java.lang.String getMullionThicknessAsString();
	void setMullionThicknessAsString(java.lang.String MullionThicknessAsString);
	@Description("")
	@Mandatory
	java.lang.Double getFirstTransomOffset();
	void setFirstTransomOffset(java.lang.Double FirstTransomOffset);
	@Description("")
	@Mandatory
	java.lang.String getFirstTransomOffsetAsString();
	void setFirstTransomOffsetAsString(java.lang.String FirstTransomOffsetAsString);
	@Description("")
	@Mandatory
	java.lang.Double getSecondTransomOffset();
	void setSecondTransomOffset(java.lang.Double SecondTransomOffset);
	@Description("")
	@Mandatory
	java.lang.String getSecondTransomOffsetAsString();
	void setSecondTransomOffsetAsString(java.lang.String SecondTransomOffsetAsString);
	@Description("")
	@Mandatory
	java.lang.Double getFirstMullionOffset();
	void setFirstMullionOffset(java.lang.Double FirstMullionOffset);
	@Description("")
	@Mandatory
	java.lang.String getFirstMullionOffsetAsString();
	void setFirstMullionOffsetAsString(java.lang.String FirstMullionOffsetAsString);
	@Description("")
	@Mandatory
	java.lang.Double getSecondMullionOffset();
	void setSecondMullionOffset(java.lang.Double SecondMullionOffset);
	@Description("")
	@Mandatory
	java.lang.String getSecondMullionOffsetAsString();
	void setSecondMullionOffsetAsString(java.lang.String SecondMullionOffsetAsString);
	@Description("")
	@Mandatory
	ifc4.IfcShapeAspect getShapeAspectStyle();
	void setShapeAspectStyle(ifc4.IfcShapeAspect ShapeAspectStyle);
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
