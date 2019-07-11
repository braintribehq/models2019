/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcWindowPanelProperties of the Data Model iai.
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
{@link OperationType}, 
{@link PanelPosition}, 
{@link FrameDepth}, 
{@link FrameDepthAsString}, 
{@link FrameThickness}, 
{@link FrameThicknessAsString}, 
{@link ShapeAspectStyle}, 

* It provides of then following operations (getters and setters)
{@link getOperationType},
{@link getPanelPosition},
{@link getFrameDepth},
{@link getFrameDepthAsString},
{@link getFrameThickness},
{@link getFrameThicknessAsString},
{@link getShapeAspectStyle},
{@link setOperationType},
{@link setPanelPosition},
{@link setFrameDepth},
{@link setFrameDepthAsString},
{@link setFrameThickness},
{@link setFrameThicknessAsString},
{@link setShapeAspectStyle},
 */

@Description("")

public interface IfcWindowPanelProperties extends GenericEntity, ifc4.IfcPreDefinedPropertySet {

	EntityType<IfcWindowPanelProperties> T = EntityTypes.T(IfcWindowPanelProperties.class);

	/* Constants for each property name. */
	java.lang.String OperationType = "OperationType";
	java.lang.String PanelPosition = "PanelPosition";
	java.lang.String FrameDepth = "FrameDepth";
	java.lang.String FrameDepthAsString = "FrameDepthAsString";
	java.lang.String FrameThickness = "FrameThickness";
	java.lang.String FrameThicknessAsString = "FrameThicknessAsString";
	java.lang.String ShapeAspectStyle = "ShapeAspectStyle";

	@Description("")
	@Mandatory
	ifc4.IfcWindowPanelOperationEnum getOperationType();
	void setOperationType(ifc4.IfcWindowPanelOperationEnum OperationType);
	@Description("")
	@Mandatory
	ifc4.IfcWindowPanelPositionEnum getPanelPosition();
	void setPanelPosition(ifc4.IfcWindowPanelPositionEnum PanelPosition);
	@Description("")
	@Mandatory
	java.lang.Double getFrameDepth();
	void setFrameDepth(java.lang.Double FrameDepth);
	@Description("")
	@Mandatory
	java.lang.String getFrameDepthAsString();
	void setFrameDepthAsString(java.lang.String FrameDepthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getFrameThickness();
	void setFrameThickness(java.lang.Double FrameThickness);
	@Description("")
	@Mandatory
	java.lang.String getFrameThicknessAsString();
	void setFrameThicknessAsString(java.lang.String FrameThicknessAsString);
	@Description("")
	@Mandatory
	ifc4.IfcShapeAspect getShapeAspectStyle();
	void setShapeAspectStyle(ifc4.IfcShapeAspect ShapeAspectStyle);
}
