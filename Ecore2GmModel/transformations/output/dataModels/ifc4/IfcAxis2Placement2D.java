/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcAxis2Placement2D of the Data Model iai.
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
{@link RefDirection}, 

* It provides of then following operations (getters and setters)
{@link getRefDirection},
{@link setRefDirection},
 */

@Description("")

public interface IfcAxis2Placement2D extends GenericEntity, ifc4.IfcPlacement, ifc4.IfcAxis2Placement {

	EntityType<IfcAxis2Placement2D> T = EntityTypes.T(IfcAxis2Placement2D.class);

	/* Constants for each property name. */
	java.lang.String RefDirection = "RefDirection";

	@Description("")
	@Mandatory
	ifc4.IfcDirection getRefDirection();
	void setRefDirection(ifc4.IfcDirection RefDirection);
}
