/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCylindricalSurface of the Data Model iai.
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
{@link Radius}, 
{@link RadiusAsString}, 

* It provides of then following operations (getters and setters)
{@link getRadius},
{@link getRadiusAsString},
{@link setRadius},
{@link setRadiusAsString},
 */

@Description("")

public interface IfcCylindricalSurface extends GenericEntity, ifc4.IfcElementarySurface {

	EntityType<IfcCylindricalSurface> T = EntityTypes.T(IfcCylindricalSurface.class);

	/* Constants for each property name. */
	java.lang.String Radius = "Radius";
	java.lang.String RadiusAsString = "RadiusAsString";

	@Description("")
	@Mandatory
	java.lang.Double getRadius();
	void setRadius(java.lang.Double Radius);
	@Description("")
	@Mandatory
	java.lang.String getRadiusAsString();
	void setRadiusAsString(java.lang.String RadiusAsString);
}
