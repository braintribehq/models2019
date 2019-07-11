/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDoorPanelProperties of the Data Model iai.
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
{@link PanelDepth}, 
{@link PanelDepthAsString}, 
{@link PanelOperation}, 
{@link PanelWidth}, 
{@link PanelWidthAsString}, 
{@link PanelPosition}, 
{@link ShapeAspectStyle}, 

* It provides of then following operations (getters and setters)
{@link getPanelDepth},
{@link getPanelDepthAsString},
{@link getPanelOperation},
{@link getPanelWidth},
{@link getPanelWidthAsString},
{@link getPanelPosition},
{@link getShapeAspectStyle},
{@link setPanelDepth},
{@link setPanelDepthAsString},
{@link setPanelOperation},
{@link setPanelWidth},
{@link setPanelWidthAsString},
{@link setPanelPosition},
{@link setShapeAspectStyle},
 */

@Description("")

public interface IfcDoorPanelProperties extends GenericEntity, ifc4.IfcPreDefinedPropertySet {

	EntityType<IfcDoorPanelProperties> T = EntityTypes.T(IfcDoorPanelProperties.class);

	/* Constants for each property name. */
	java.lang.String PanelDepth = "PanelDepth";
	java.lang.String PanelDepthAsString = "PanelDepthAsString";
	java.lang.String PanelOperation = "PanelOperation";
	java.lang.String PanelWidth = "PanelWidth";
	java.lang.String PanelWidthAsString = "PanelWidthAsString";
	java.lang.String PanelPosition = "PanelPosition";
	java.lang.String ShapeAspectStyle = "ShapeAspectStyle";

	@Description("")
	@Mandatory
	java.lang.Double getPanelDepth();
	void setPanelDepth(java.lang.Double PanelDepth);
	@Description("")
	@Mandatory
	java.lang.String getPanelDepthAsString();
	void setPanelDepthAsString(java.lang.String PanelDepthAsString);
	@Description("")
	@Mandatory
	ifc4.IfcDoorPanelOperationEnum getPanelOperation();
	void setPanelOperation(ifc4.IfcDoorPanelOperationEnum PanelOperation);
	@Description("")
	@Mandatory
	java.lang.Double getPanelWidth();
	void setPanelWidth(java.lang.Double PanelWidth);
	@Description("")
	@Mandatory
	java.lang.String getPanelWidthAsString();
	void setPanelWidthAsString(java.lang.String PanelWidthAsString);
	@Description("")
	@Mandatory
	ifc4.IfcDoorPanelPositionEnum getPanelPosition();
	void setPanelPosition(ifc4.IfcDoorPanelPositionEnum PanelPosition);
	@Description("")
	@Mandatory
	ifc4.IfcShapeAspect getShapeAspectStyle();
	void setShapeAspectStyle(ifc4.IfcShapeAspect ShapeAspectStyle);
}
