/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCurveStyleFontAndScaling of the Data Model iai.
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
{@link Name}, 
{@link CurveFont}, 
{@link CurveFontScaling}, 
{@link CurveFontScalingAsString}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getCurveFont},
{@link getCurveFontScaling},
{@link getCurveFontScalingAsString},
{@link setName},
{@link setCurveFont},
{@link setCurveFontScaling},
{@link setCurveFontScalingAsString},
 */

@Description("")

public interface IfcCurveStyleFontAndScaling extends GenericEntity, ifc4.IfcPresentationItem, ifc4.IfcCurveFontOrScaledCurveFontSelect {

	EntityType<IfcCurveStyleFontAndScaling> T = EntityTypes.T(IfcCurveStyleFontAndScaling.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String CurveFont = "CurveFont";
	java.lang.String CurveFontScaling = "CurveFontScaling";
	java.lang.String CurveFontScalingAsString = "CurveFontScalingAsString";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	ifc4.IfcCurveStyleFontSelect getCurveFont();
	void setCurveFont(ifc4.IfcCurveStyleFontSelect CurveFont);
	@Description("")
	@Mandatory
	java.lang.Double getCurveFontScaling();
	void setCurveFontScaling(java.lang.Double CurveFontScaling);
	@Description("")
	@Mandatory
	java.lang.String getCurveFontScalingAsString();
	void setCurveFontScalingAsString(java.lang.String CurveFontScalingAsString);
}
