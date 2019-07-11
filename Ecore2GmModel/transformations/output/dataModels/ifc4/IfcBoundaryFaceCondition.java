/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBoundaryFaceCondition of the Data Model iai.
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
{@link TranslationalStiffnessByAreaX}, 
{@link TranslationalStiffnessByAreaY}, 
{@link TranslationalStiffnessByAreaZ}, 

* It provides of then following operations (getters and setters)
{@link getTranslationalStiffnessByAreaX},
{@link getTranslationalStiffnessByAreaY},
{@link getTranslationalStiffnessByAreaZ},
{@link setTranslationalStiffnessByAreaX},
{@link setTranslationalStiffnessByAreaY},
{@link setTranslationalStiffnessByAreaZ},
 */

@Description("")

public interface IfcBoundaryFaceCondition extends GenericEntity, ifc4.IfcBoundaryCondition {

	EntityType<IfcBoundaryFaceCondition> T = EntityTypes.T(IfcBoundaryFaceCondition.class);

	/* Constants for each property name. */
	java.lang.String TranslationalStiffnessByAreaX = "TranslationalStiffnessByAreaX";
	java.lang.String TranslationalStiffnessByAreaY = "TranslationalStiffnessByAreaY";
	java.lang.String TranslationalStiffnessByAreaZ = "TranslationalStiffnessByAreaZ";

	@Description("")
	@Mandatory
	ifc4.IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaX();
	void setTranslationalStiffnessByAreaX(ifc4.IfcModulusOfSubgradeReactionSelect TranslationalStiffnessByAreaX);
	@Description("")
	@Mandatory
	ifc4.IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaY();
	void setTranslationalStiffnessByAreaY(ifc4.IfcModulusOfSubgradeReactionSelect TranslationalStiffnessByAreaY);
	@Description("")
	@Mandatory
	ifc4.IfcModulusOfSubgradeReactionSelect getTranslationalStiffnessByAreaZ();
	void setTranslationalStiffnessByAreaZ(ifc4.IfcModulusOfSubgradeReactionSelect TranslationalStiffnessByAreaZ);
}
