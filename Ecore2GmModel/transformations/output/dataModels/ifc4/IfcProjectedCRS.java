/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcProjectedCRS of the Data Model iai.
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
{@link MapProjection}, 
{@link MapZone}, 
{@link MapUnit}, 

* It provides of then following operations (getters and setters)
{@link getMapProjection},
{@link getMapZone},
{@link getMapUnit},
{@link setMapProjection},
{@link setMapZone},
{@link setMapUnit},
 */

@Description("")

public interface IfcProjectedCRS extends GenericEntity, ifc4.IfcCoordinateReferenceSystem {

	EntityType<IfcProjectedCRS> T = EntityTypes.T(IfcProjectedCRS.class);

	/* Constants for each property name. */
	java.lang.String MapProjection = "MapProjection";
	java.lang.String MapZone = "MapZone";
	java.lang.String MapUnit = "MapUnit";

	@Description("")
	@Mandatory
	java.lang.String getMapProjection();
	void setMapProjection(java.lang.String MapProjection);
	@Description("")
	@Mandatory
	java.lang.String getMapZone();
	void setMapZone(java.lang.String MapZone);
	@Description("")
	@Mandatory
	ifc4.IfcNamedUnit getMapUnit();
	void setMapUnit(ifc4.IfcNamedUnit MapUnit);
}
