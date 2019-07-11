/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLine of the Data Model iai.
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
{@link Pnt}, 
{@link Dir}, 

* It provides of then following operations (getters and setters)
{@link getPnt},
{@link getDir},
{@link setPnt},
{@link setDir},
 */

@Description("")

public interface IfcLine extends GenericEntity, ifc4.IfcCurve {

	EntityType<IfcLine> T = EntityTypes.T(IfcLine.class);

	/* Constants for each property name. */
	java.lang.String Pnt = "Pnt";
	java.lang.String Dir = "Dir";

	@Description("")
	@Mandatory
	ifc4.IfcCartesianPoint getPnt();
	void setPnt(ifc4.IfcCartesianPoint Pnt);
	@Description("")
	@Mandatory
	ifc4.IfcVector getDir();
	void setDir(ifc4.IfcVector Dir);
}
