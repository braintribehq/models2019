/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSurfaceOfLinearExtrusion of the Data Model iai.
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
{@link ExtrudedDirection}, 
{@link Depth}, 
{@link DepthAsString}, 

* It provides of then following operations (getters and setters)
{@link getExtrudedDirection},
{@link getDepth},
{@link getDepthAsString},
{@link setExtrudedDirection},
{@link setDepth},
{@link setDepthAsString},
 */

@Description("")

public interface IfcSurfaceOfLinearExtrusion extends GenericEntity, ifc4.IfcSweptSurface {

	EntityType<IfcSurfaceOfLinearExtrusion> T = EntityTypes.T(IfcSurfaceOfLinearExtrusion.class);

	/* Constants for each property name. */
	java.lang.String ExtrudedDirection = "ExtrudedDirection";
	java.lang.String Depth = "Depth";
	java.lang.String DepthAsString = "DepthAsString";

	@Description("")
	@Mandatory
	ifc4.IfcDirection getExtrudedDirection();
	void setExtrudedDirection(ifc4.IfcDirection ExtrudedDirection);
	@Description("")
	@Mandatory
	java.lang.Double getDepth();
	void setDepth(java.lang.Double Depth);
	@Description("")
	@Mandatory
	java.lang.String getDepthAsString();
	void setDepthAsString(java.lang.String DepthAsString);
}
