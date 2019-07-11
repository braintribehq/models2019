/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSweptDiskSolidPolygonal of the Data Model iai.
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
{@link FilletRadius}, 
{@link FilletRadiusAsString}, 

* It provides of then following operations (getters and setters)
{@link getFilletRadius},
{@link getFilletRadiusAsString},
{@link setFilletRadius},
{@link setFilletRadiusAsString},
 */

@Description("")

public interface IfcSweptDiskSolidPolygonal extends GenericEntity, ifc4.IfcSweptDiskSolid {

	EntityType<IfcSweptDiskSolidPolygonal> T = EntityTypes.T(IfcSweptDiskSolidPolygonal.class);

	/* Constants for each property name. */
	java.lang.String FilletRadius = "FilletRadius";
	java.lang.String FilletRadiusAsString = "FilletRadiusAsString";

	@Description("")
	@Mandatory
	java.lang.Double getFilletRadius();
	void setFilletRadius(java.lang.Double FilletRadius);
	@Description("")
	@Mandatory
	java.lang.String getFilletRadiusAsString();
	void setFilletRadiusAsString(java.lang.String FilletRadiusAsString);
}
