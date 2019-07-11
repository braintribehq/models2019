/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBoundaryNodeCondition of the Data Model iai.
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
{@link TranslationalStiffnessX}, 
{@link TranslationalStiffnessY}, 
{@link TranslationalStiffnessZ}, 
{@link RotationalStiffnessX}, 
{@link RotationalStiffnessY}, 
{@link RotationalStiffnessZ}, 

* It provides of then following operations (getters and setters)
{@link getTranslationalStiffnessX},
{@link getTranslationalStiffnessY},
{@link getTranslationalStiffnessZ},
{@link getRotationalStiffnessX},
{@link getRotationalStiffnessY},
{@link getRotationalStiffnessZ},
{@link setTranslationalStiffnessX},
{@link setTranslationalStiffnessY},
{@link setTranslationalStiffnessZ},
{@link setRotationalStiffnessX},
{@link setRotationalStiffnessY},
{@link setRotationalStiffnessZ},
 */

@Description("")

public interface IfcBoundaryNodeCondition extends GenericEntity, ifc4.IfcBoundaryCondition {

	EntityType<IfcBoundaryNodeCondition> T = EntityTypes.T(IfcBoundaryNodeCondition.class);

	/* Constants for each property name. */
	java.lang.String TranslationalStiffnessX = "TranslationalStiffnessX";
	java.lang.String TranslationalStiffnessY = "TranslationalStiffnessY";
	java.lang.String TranslationalStiffnessZ = "TranslationalStiffnessZ";
	java.lang.String RotationalStiffnessX = "RotationalStiffnessX";
	java.lang.String RotationalStiffnessY = "RotationalStiffnessY";
	java.lang.String RotationalStiffnessZ = "RotationalStiffnessZ";

	@Description("")
	@Mandatory
	ifc4.IfcTranslationalStiffnessSelect getTranslationalStiffnessX();
	void setTranslationalStiffnessX(ifc4.IfcTranslationalStiffnessSelect TranslationalStiffnessX);
	@Description("")
	@Mandatory
	ifc4.IfcTranslationalStiffnessSelect getTranslationalStiffnessY();
	void setTranslationalStiffnessY(ifc4.IfcTranslationalStiffnessSelect TranslationalStiffnessY);
	@Description("")
	@Mandatory
	ifc4.IfcTranslationalStiffnessSelect getTranslationalStiffnessZ();
	void setTranslationalStiffnessZ(ifc4.IfcTranslationalStiffnessSelect TranslationalStiffnessZ);
	@Description("")
	@Mandatory
	ifc4.IfcRotationalStiffnessSelect getRotationalStiffnessX();
	void setRotationalStiffnessX(ifc4.IfcRotationalStiffnessSelect RotationalStiffnessX);
	@Description("")
	@Mandatory
	ifc4.IfcRotationalStiffnessSelect getRotationalStiffnessY();
	void setRotationalStiffnessY(ifc4.IfcRotationalStiffnessSelect RotationalStiffnessY);
	@Description("")
	@Mandatory
	ifc4.IfcRotationalStiffnessSelect getRotationalStiffnessZ();
	void setRotationalStiffnessZ(ifc4.IfcRotationalStiffnessSelect RotationalStiffnessZ);
}
