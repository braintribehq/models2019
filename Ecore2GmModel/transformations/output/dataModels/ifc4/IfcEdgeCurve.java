/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcEdgeCurve of the Data Model iai.
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
{@link EdgeGeometry}, 
{@link SameSense}, 

* It provides of then following operations (getters and setters)
{@link getEdgeGeometry},
{@link getSameSense},
{@link setEdgeGeometry},
{@link setSameSense},
 */

@Description("")

public interface IfcEdgeCurve extends GenericEntity, ifc4.IfcEdge, ifc4.IfcCurveOrEdgeCurve {

	EntityType<IfcEdgeCurve> T = EntityTypes.T(IfcEdgeCurve.class);

	/* Constants for each property name. */
	java.lang.String EdgeGeometry = "EdgeGeometry";
	java.lang.String SameSense = "SameSense";

	@Description("")
	@Mandatory
	ifc4.IfcCurve getEdgeGeometry();
	void setEdgeGeometry(ifc4.IfcCurve EdgeGeometry);
	@Description("")
	@Mandatory
	ifc4.Tristate getSameSense();
	void setSameSense(ifc4.Tristate SameSense);
}
