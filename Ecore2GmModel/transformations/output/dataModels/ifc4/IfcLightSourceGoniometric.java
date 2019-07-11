/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLightSourceGoniometric of the Data Model iai.
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
{@link Position}, 
{@link ColourAppearance}, 
{@link ColourTemperature}, 
{@link ColourTemperatureAsString}, 
{@link LuminousFlux}, 
{@link LuminousFluxAsString}, 
{@link LightEmissionSource}, 
{@link LightDistributionDataSource}, 

* It provides of then following operations (getters and setters)
{@link getPosition},
{@link getColourAppearance},
{@link getColourTemperature},
{@link getColourTemperatureAsString},
{@link getLuminousFlux},
{@link getLuminousFluxAsString},
{@link getLightEmissionSource},
{@link getLightDistributionDataSource},
{@link setPosition},
{@link setColourAppearance},
{@link setColourTemperature},
{@link setColourTemperatureAsString},
{@link setLuminousFlux},
{@link setLuminousFluxAsString},
{@link setLightEmissionSource},
{@link setLightDistributionDataSource},
 */

@Description("")

public interface IfcLightSourceGoniometric extends GenericEntity, ifc4.IfcLightSource {

	EntityType<IfcLightSourceGoniometric> T = EntityTypes.T(IfcLightSourceGoniometric.class);

	/* Constants for each property name. */
	java.lang.String Position = "Position";
	java.lang.String ColourAppearance = "ColourAppearance";
	java.lang.String ColourTemperature = "ColourTemperature";
	java.lang.String ColourTemperatureAsString = "ColourTemperatureAsString";
	java.lang.String LuminousFlux = "LuminousFlux";
	java.lang.String LuminousFluxAsString = "LuminousFluxAsString";
	java.lang.String LightEmissionSource = "LightEmissionSource";
	java.lang.String LightDistributionDataSource = "LightDistributionDataSource";

	@Description("")
	@Mandatory
	ifc4.IfcAxis2Placement3D getPosition();
	void setPosition(ifc4.IfcAxis2Placement3D Position);
	@Description("")
	@Mandatory
	ifc4.IfcColourRgb getColourAppearance();
	void setColourAppearance(ifc4.IfcColourRgb ColourAppearance);
	@Description("")
	@Mandatory
	java.lang.Double getColourTemperature();
	void setColourTemperature(java.lang.Double ColourTemperature);
	@Description("")
	@Mandatory
	java.lang.String getColourTemperatureAsString();
	void setColourTemperatureAsString(java.lang.String ColourTemperatureAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLuminousFlux();
	void setLuminousFlux(java.lang.Double LuminousFlux);
	@Description("")
	@Mandatory
	java.lang.String getLuminousFluxAsString();
	void setLuminousFluxAsString(java.lang.String LuminousFluxAsString);
	@Description("")
	@Mandatory
	ifc4.IfcLightEmissionSourceEnum getLightEmissionSource();
	void setLightEmissionSource(ifc4.IfcLightEmissionSourceEnum LightEmissionSource);
	@Description("")
	@Mandatory
	ifc4.IfcLightDistributionDataSourceSelect getLightDistributionDataSource();
	void setLightDistributionDataSource(ifc4.IfcLightDistributionDataSourceSelect LightDistributionDataSource);
}
