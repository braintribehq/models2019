/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPresentationLayerWithStyle of the Data Model iai.
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
{@link LayerOn}, 
{@link LayerFrozen}, 
{@link LayerBlocked}, 
{@link LayerStyles}, 

* It provides of then following operations (getters and setters)
{@link getLayerOn},
{@link getLayerFrozen},
{@link getLayerBlocked},
{@link getLayerStyles},
{@link setLayerOn},
{@link setLayerFrozen},
{@link setLayerBlocked},
{@link setLayerStyles},
 */

@Description("")

public interface IfcPresentationLayerWithStyle extends GenericEntity, ifc4.IfcPresentationLayerAssignment {

	EntityType<IfcPresentationLayerWithStyle> T = EntityTypes.T(IfcPresentationLayerWithStyle.class);

	/* Constants for each property name. */
	java.lang.String LayerOn = "LayerOn";
	java.lang.String LayerFrozen = "LayerFrozen";
	java.lang.String LayerBlocked = "LayerBlocked";
	java.lang.String LayerStyles = "LayerStyles";

	@Description("")
	@Mandatory
	ifc4.Tristate getLayerOn();
	void setLayerOn(ifc4.Tristate LayerOn);
	@Description("")
	@Mandatory
	ifc4.Tristate getLayerFrozen();
	void setLayerFrozen(ifc4.Tristate LayerFrozen);
	@Description("")
	@Mandatory
	ifc4.Tristate getLayerBlocked();
	void setLayerBlocked(ifc4.Tristate LayerBlocked);
	@Description("")
	
	java.util.List<ifc4.IfcPresentationStyle> getLayerStyles();
	void setLayerStyles(java.util.List<ifc4.IfcPresentationStyle> LayerStyles);

}
