/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTextLiteral of the Data Model iai.
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
{@link Literal}, 
{@link Placement}, 
{@link Path}, 

* It provides of then following operations (getters and setters)
{@link getLiteral},
{@link getPlacement},
{@link getPath},
{@link setLiteral},
{@link setPlacement},
{@link setPath},
 */

@Description("")

public interface IfcTextLiteral extends GenericEntity, ifc4.IfcGeometricRepresentationItem {

	EntityType<IfcTextLiteral> T = EntityTypes.T(IfcTextLiteral.class);

	/* Constants for each property name. */
	java.lang.String Literal = "Literal";
	java.lang.String Placement = "Placement";
	java.lang.String Path = "Path";

	@Description("")
	@Mandatory
	java.lang.String getLiteral();
	void setLiteral(java.lang.String Literal);
	@Description("")
	@Mandatory
	ifc4.IfcAxis2Placement getPlacement();
	void setPlacement(ifc4.IfcAxis2Placement Placement);
	@Description("")
	@Mandatory
	ifc4.IfcTextPath getPath();
	void setPath(ifc4.IfcTextPath Path);
}
