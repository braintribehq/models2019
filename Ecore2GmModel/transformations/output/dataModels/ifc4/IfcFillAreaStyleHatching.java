/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcFillAreaStyleHatching of the Data Model iai.
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
{@link HatchLineAppearance}, 
{@link StartOfNextHatchLine}, 
{@link PointOfReferenceHatchLine}, 
{@link PatternStart}, 
{@link HatchLineAngle}, 
{@link HatchLineAngleAsString}, 

* It provides of then following operations (getters and setters)
{@link getHatchLineAppearance},
{@link getStartOfNextHatchLine},
{@link getPointOfReferenceHatchLine},
{@link getPatternStart},
{@link getHatchLineAngle},
{@link getHatchLineAngleAsString},
{@link setHatchLineAppearance},
{@link setStartOfNextHatchLine},
{@link setPointOfReferenceHatchLine},
{@link setPatternStart},
{@link setHatchLineAngle},
{@link setHatchLineAngleAsString},
 */

@Description("")

public interface IfcFillAreaStyleHatching extends GenericEntity, ifc4.IfcGeometricRepresentationItem, ifc4.IfcFillStyleSelect {

	EntityType<IfcFillAreaStyleHatching> T = EntityTypes.T(IfcFillAreaStyleHatching.class);

	/* Constants for each property name. */
	java.lang.String HatchLineAppearance = "HatchLineAppearance";
	java.lang.String StartOfNextHatchLine = "StartOfNextHatchLine";
	java.lang.String PointOfReferenceHatchLine = "PointOfReferenceHatchLine";
	java.lang.String PatternStart = "PatternStart";
	java.lang.String HatchLineAngle = "HatchLineAngle";
	java.lang.String HatchLineAngleAsString = "HatchLineAngleAsString";

	@Description("")
	@Mandatory
	ifc4.IfcCurveStyle getHatchLineAppearance();
	void setHatchLineAppearance(ifc4.IfcCurveStyle HatchLineAppearance);
	@Description("")
	@Mandatory
	ifc4.IfcHatchLineDistanceSelect getStartOfNextHatchLine();
	void setStartOfNextHatchLine(ifc4.IfcHatchLineDistanceSelect StartOfNextHatchLine);
	@Description("")
	@Mandatory
	ifc4.IfcCartesianPoint getPointOfReferenceHatchLine();
	void setPointOfReferenceHatchLine(ifc4.IfcCartesianPoint PointOfReferenceHatchLine);
	@Description("")
	@Mandatory
	ifc4.IfcCartesianPoint getPatternStart();
	void setPatternStart(ifc4.IfcCartesianPoint PatternStart);
	@Description("")
	@Mandatory
	java.lang.Double getHatchLineAngle();
	void setHatchLineAngle(java.lang.Double HatchLineAngle);
	@Description("")
	@Mandatory
	java.lang.String getHatchLineAngleAsString();
	void setHatchLineAngleAsString(java.lang.String HatchLineAngleAsString);
}
