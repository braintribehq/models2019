/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLightDistributionData of the Data Model iai.
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
{@link MainPlaneAngle}, 
{@link MainPlaneAngleAsString}, 
{@link SecondaryPlaneAngle}, 
{@link SecondaryPlaneAngleAsString}, 
{@link LuminousIntensity}, 
{@link LuminousIntensityAsString}, 

* It provides of then following operations (getters and setters)
{@link getMainPlaneAngle},
{@link getMainPlaneAngleAsString},
{@link getSecondaryPlaneAngle},
{@link getSecondaryPlaneAngleAsString},
{@link getLuminousIntensity},
{@link getLuminousIntensityAsString},
{@link setMainPlaneAngle},
{@link setMainPlaneAngleAsString},
{@link setSecondaryPlaneAngle},
{@link setSecondaryPlaneAngleAsString},
{@link setLuminousIntensity},
{@link setLuminousIntensityAsString},
 */

@Description("")

public interface IfcLightDistributionData extends GenericEntity {

	EntityType<IfcLightDistributionData> T = EntityTypes.T(IfcLightDistributionData.class);

	/* Constants for each property name. */
	java.lang.String MainPlaneAngle = "MainPlaneAngle";
	java.lang.String MainPlaneAngleAsString = "MainPlaneAngleAsString";
	java.lang.String SecondaryPlaneAngle = "SecondaryPlaneAngle";
	java.lang.String SecondaryPlaneAngleAsString = "SecondaryPlaneAngleAsString";
	java.lang.String LuminousIntensity = "LuminousIntensity";
	java.lang.String LuminousIntensityAsString = "LuminousIntensityAsString";

	@Description("")
	@Mandatory
	java.lang.Double getMainPlaneAngle();
	void setMainPlaneAngle(java.lang.Double MainPlaneAngle);
	@Description("")
	@Mandatory
	java.lang.String getMainPlaneAngleAsString();
	void setMainPlaneAngleAsString(java.lang.String MainPlaneAngleAsString);
	@Description("")
	
	java.util.List<java.lang.Double> getSecondaryPlaneAngle();
	void setSecondaryPlaneAngle(java.util.List<java.lang.Double> SecondaryPlaneAngle);

	@Description("")
	
	java.util.List<java.lang.String> getSecondaryPlaneAngleAsString();
	void setSecondaryPlaneAngleAsString(java.util.List<java.lang.String> SecondaryPlaneAngleAsString);

	@Description("")
	
	java.util.List<java.lang.Double> getLuminousIntensity();
	void setLuminousIntensity(java.util.List<java.lang.Double> LuminousIntensity);

	@Description("")
	
	java.util.List<java.lang.String> getLuminousIntensityAsString();
	void setLuminousIntensityAsString(java.util.List<java.lang.String> LuminousIntensityAsString);

}
