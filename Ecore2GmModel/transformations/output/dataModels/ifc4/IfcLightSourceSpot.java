/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLightSourceSpot of the Data Model iai.
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
{@link Orientation}, 
{@link ConcentrationExponent}, 
{@link ConcentrationExponentAsString}, 
{@link SpreadAngle}, 
{@link SpreadAngleAsString}, 
{@link BeamWidthAngle}, 
{@link BeamWidthAngleAsString}, 

* It provides of then following operations (getters and setters)
{@link getOrientation},
{@link getConcentrationExponent},
{@link getConcentrationExponentAsString},
{@link getSpreadAngle},
{@link getSpreadAngleAsString},
{@link getBeamWidthAngle},
{@link getBeamWidthAngleAsString},
{@link setOrientation},
{@link setConcentrationExponent},
{@link setConcentrationExponentAsString},
{@link setSpreadAngle},
{@link setSpreadAngleAsString},
{@link setBeamWidthAngle},
{@link setBeamWidthAngleAsString},
 */

@Description("")

public interface IfcLightSourceSpot extends GenericEntity, ifc4.IfcLightSourcePositional {

	EntityType<IfcLightSourceSpot> T = EntityTypes.T(IfcLightSourceSpot.class);

	/* Constants for each property name. */
	java.lang.String Orientation = "Orientation";
	java.lang.String ConcentrationExponent = "ConcentrationExponent";
	java.lang.String ConcentrationExponentAsString = "ConcentrationExponentAsString";
	java.lang.String SpreadAngle = "SpreadAngle";
	java.lang.String SpreadAngleAsString = "SpreadAngleAsString";
	java.lang.String BeamWidthAngle = "BeamWidthAngle";
	java.lang.String BeamWidthAngleAsString = "BeamWidthAngleAsString";

	@Description("")
	@Mandatory
	ifc4.IfcDirection getOrientation();
	void setOrientation(ifc4.IfcDirection Orientation);
	@Description("")
	@Mandatory
	java.lang.Double getConcentrationExponent();
	void setConcentrationExponent(java.lang.Double ConcentrationExponent);
	@Description("")
	@Mandatory
	java.lang.String getConcentrationExponentAsString();
	void setConcentrationExponentAsString(java.lang.String ConcentrationExponentAsString);
	@Description("")
	@Mandatory
	java.lang.Double getSpreadAngle();
	void setSpreadAngle(java.lang.Double SpreadAngle);
	@Description("")
	@Mandatory
	java.lang.String getSpreadAngleAsString();
	void setSpreadAngleAsString(java.lang.String SpreadAngleAsString);
	@Description("")
	@Mandatory
	java.lang.Double getBeamWidthAngle();
	void setBeamWidthAngle(java.lang.Double BeamWidthAngle);
	@Description("")
	@Mandatory
	java.lang.String getBeamWidthAngleAsString();
	void setBeamWidthAngleAsString(java.lang.String BeamWidthAngleAsString);
}
