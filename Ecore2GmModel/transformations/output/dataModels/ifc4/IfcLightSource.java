/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLightSource of the Data Model iai.
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
{@link LightColour}, 
{@link AmbientIntensity}, 
{@link AmbientIntensityAsString}, 
{@link Intensity}, 
{@link IntensityAsString}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getLightColour},
{@link getAmbientIntensity},
{@link getAmbientIntensityAsString},
{@link getIntensity},
{@link getIntensityAsString},
{@link setName},
{@link setLightColour},
{@link setAmbientIntensity},
{@link setAmbientIntensityAsString},
{@link setIntensity},
{@link setIntensityAsString},
 */

@Description("")

public interface IfcLightSource extends GenericEntity, ifc4.IfcGeometricRepresentationItem {

	EntityType<IfcLightSource> T = EntityTypes.T(IfcLightSource.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String LightColour = "LightColour";
	java.lang.String AmbientIntensity = "AmbientIntensity";
	java.lang.String AmbientIntensityAsString = "AmbientIntensityAsString";
	java.lang.String Intensity = "Intensity";
	java.lang.String IntensityAsString = "IntensityAsString";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	ifc4.IfcColourRgb getLightColour();
	void setLightColour(ifc4.IfcColourRgb LightColour);
	@Description("")
	@Mandatory
	java.lang.Double getAmbientIntensity();
	void setAmbientIntensity(java.lang.Double AmbientIntensity);
	@Description("")
	@Mandatory
	java.lang.String getAmbientIntensityAsString();
	void setAmbientIntensityAsString(java.lang.String AmbientIntensityAsString);
	@Description("")
	@Mandatory
	java.lang.Double getIntensity();
	void setIntensity(java.lang.Double Intensity);
	@Description("")
	@Mandatory
	java.lang.String getIntensityAsString();
	void setIntensityAsString(java.lang.String IntensityAsString);
}
