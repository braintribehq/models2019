/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCsgPrimitive3D of the Data Model iai.
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
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getPosition},
{@link getDim},
{@link setPosition},
{@link setDim},
 */

@Description("")

public interface IfcCsgPrimitive3D extends GenericEntity, ifc4.IfcGeometricRepresentationItem, ifc4.IfcBooleanOperand, ifc4.IfcCsgSelect {

	EntityType<IfcCsgPrimitive3D> T = EntityTypes.T(IfcCsgPrimitive3D.class);

	/* Constants for each property name. */
	java.lang.String Position = "Position";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcAxis2Placement3D getPosition();
	void setPosition(ifc4.IfcAxis2Placement3D Position);
	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
