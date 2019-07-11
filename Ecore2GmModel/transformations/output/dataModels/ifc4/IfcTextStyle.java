/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTextStyle of the Data Model iai.
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
{@link TextCharacterAppearance}, 
{@link TextStyle}, 
{@link TextFontStyle}, 
{@link ModelOrDraughting}, 

* It provides of then following operations (getters and setters)
{@link getTextCharacterAppearance},
{@link getTextStyle},
{@link getTextFontStyle},
{@link getModelOrDraughting},
{@link setTextCharacterAppearance},
{@link setTextStyle},
{@link setTextFontStyle},
{@link setModelOrDraughting},
 */

@Description("")

public interface IfcTextStyle extends GenericEntity, ifc4.IfcPresentationStyle, ifc4.IfcPresentationStyleSelect {

	EntityType<IfcTextStyle> T = EntityTypes.T(IfcTextStyle.class);

	/* Constants for each property name. */
	java.lang.String TextCharacterAppearance = "TextCharacterAppearance";
	java.lang.String TextStyle = "TextStyle";
	java.lang.String TextFontStyle = "TextFontStyle";
	java.lang.String ModelOrDraughting = "ModelOrDraughting";

	@Description("")
	@Mandatory
	ifc4.IfcTextStyleForDefinedFont getTextCharacterAppearance();
	void setTextCharacterAppearance(ifc4.IfcTextStyleForDefinedFont TextCharacterAppearance);
	@Description("")
	@Mandatory
	ifc4.IfcTextStyleTextModel getTextStyle();
	void setTextStyle(ifc4.IfcTextStyleTextModel TextStyle);
	@Description("")
	@Mandatory
	ifc4.IfcTextFontSelect getTextFontStyle();
	void setTextFontStyle(ifc4.IfcTextFontSelect TextFontStyle);
	@Description("")
	@Mandatory
	ifc4.Tristate getModelOrDraughting();
	void setModelOrDraughting(ifc4.Tristate ModelOrDraughting);
}
