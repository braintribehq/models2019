/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcOrientedEdge of the Data Model iai.
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
{@link EdgeElement}, 
{@link Orientation}, 

* It provides of then following operations (getters and setters)
{@link getEdgeElement},
{@link getOrientation},
{@link setEdgeElement},
{@link setOrientation},
 */

@Description("")

public interface IfcOrientedEdge extends GenericEntity, ifc4.IfcEdge {

	EntityType<IfcOrientedEdge> T = EntityTypes.T(IfcOrientedEdge.class);

	/* Constants for each property name. */
	java.lang.String EdgeElement = "EdgeElement";
	java.lang.String Orientation = "Orientation";

	@Description("")
	@Mandatory
	ifc4.IfcEdge getEdgeElement();
	void setEdgeElement(ifc4.IfcEdge EdgeElement);
	@Description("")
	@Mandatory
	ifc4.Tristate getOrientation();
	void setOrientation(ifc4.Tristate Orientation);
}
