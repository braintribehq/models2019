/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTextStyleForDefinedFont of the Data Model iai.
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
{@link Colour}, 
{@link BackgroundColour}, 

* It provides of then following operations (getters and setters)
{@link getColour},
{@link getBackgroundColour},
{@link setColour},
{@link setBackgroundColour},
 */

@Description("")

public interface IfcTextStyleForDefinedFont extends GenericEntity, ifc4.IfcPresentationItem {

	EntityType<IfcTextStyleForDefinedFont> T = EntityTypes.T(IfcTextStyleForDefinedFont.class);

	/* Constants for each property name. */
	java.lang.String Colour = "Colour";
	java.lang.String BackgroundColour = "BackgroundColour";

	@Description("")
	@Mandatory
	ifc4.IfcColour getColour();
	void setColour(ifc4.IfcColour Colour);
	@Description("")
	@Mandatory
	ifc4.IfcColour getBackgroundColour();
	void setBackgroundColour(ifc4.IfcColour BackgroundColour);
}
