/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBuildingStorey of the Data Model iai.
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
{@link Elevation}, 
{@link ElevationAsString}, 

* It provides of then following operations (getters and setters)
{@link getElevation},
{@link getElevationAsString},
{@link setElevation},
{@link setElevationAsString},
 */

@Description("")

public interface IfcBuildingStorey extends GenericEntity, ifc4.IfcSpatialStructureElement {

	EntityType<IfcBuildingStorey> T = EntityTypes.T(IfcBuildingStorey.class);

	/* Constants for each property name. */
	java.lang.String Elevation = "Elevation";
	java.lang.String ElevationAsString = "ElevationAsString";

	@Description("")
	@Mandatory
	java.lang.Double getElevation();
	void setElevation(java.lang.Double Elevation);
	@Description("")
	@Mandatory
	java.lang.String getElevationAsString();
	void setElevationAsString(java.lang.String ElevationAsString);
}
