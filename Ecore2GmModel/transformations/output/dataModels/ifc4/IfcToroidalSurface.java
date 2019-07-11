/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcToroidalSurface of the Data Model iai.
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
{@link MajorRadius}, 
{@link MajorRadiusAsString}, 
{@link MinorRadius}, 
{@link MinorRadiusAsString}, 

* It provides of then following operations (getters and setters)
{@link getMajorRadius},
{@link getMajorRadiusAsString},
{@link getMinorRadius},
{@link getMinorRadiusAsString},
{@link setMajorRadius},
{@link setMajorRadiusAsString},
{@link setMinorRadius},
{@link setMinorRadiusAsString},
 */

@Description("")

public interface IfcToroidalSurface extends GenericEntity, ifc4.IfcElementarySurface {

	EntityType<IfcToroidalSurface> T = EntityTypes.T(IfcToroidalSurface.class);

	/* Constants for each property name. */
	java.lang.String MajorRadius = "MajorRadius";
	java.lang.String MajorRadiusAsString = "MajorRadiusAsString";
	java.lang.String MinorRadius = "MinorRadius";
	java.lang.String MinorRadiusAsString = "MinorRadiusAsString";

	@Description("")
	@Mandatory
	java.lang.Double getMajorRadius();
	void setMajorRadius(java.lang.Double MajorRadius);
	@Description("")
	@Mandatory
	java.lang.String getMajorRadiusAsString();
	void setMajorRadiusAsString(java.lang.String MajorRadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getMinorRadius();
	void setMinorRadius(java.lang.Double MinorRadius);
	@Description("")
	@Mandatory
	java.lang.String getMinorRadiusAsString();
	void setMinorRadiusAsString(java.lang.String MinorRadiusAsString);
}
