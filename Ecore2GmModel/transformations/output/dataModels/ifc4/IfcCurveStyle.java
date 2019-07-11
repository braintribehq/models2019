/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCurveStyle of the Data Model iai.
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
{@link CurveFont}, 
{@link CurveWidth}, 
{@link CurveColour}, 
{@link ModelOrDraughting}, 

* It provides of then following operations (getters and setters)
{@link getCurveFont},
{@link getCurveWidth},
{@link getCurveColour},
{@link getModelOrDraughting},
{@link setCurveFont},
{@link setCurveWidth},
{@link setCurveColour},
{@link setModelOrDraughting},
 */

@Description("")

public interface IfcCurveStyle extends GenericEntity, ifc4.IfcPresentationStyle, ifc4.IfcPresentationStyleSelect {

	EntityType<IfcCurveStyle> T = EntityTypes.T(IfcCurveStyle.class);

	/* Constants for each property name. */
	java.lang.String CurveFont = "CurveFont";
	java.lang.String CurveWidth = "CurveWidth";
	java.lang.String CurveColour = "CurveColour";
	java.lang.String ModelOrDraughting = "ModelOrDraughting";

	@Description("")
	@Mandatory
	ifc4.IfcCurveFontOrScaledCurveFontSelect getCurveFont();
	void setCurveFont(ifc4.IfcCurveFontOrScaledCurveFontSelect CurveFont);
	@Description("")
	@Mandatory
	ifc4.IfcSizeSelect getCurveWidth();
	void setCurveWidth(ifc4.IfcSizeSelect CurveWidth);
	@Description("")
	@Mandatory
	ifc4.IfcColour getCurveColour();
	void setCurveColour(ifc4.IfcColour CurveColour);
	@Description("")
	@Mandatory
	ifc4.Tristate getModelOrDraughting();
	void setModelOrDraughting(ifc4.Tristate ModelOrDraughting);
}
