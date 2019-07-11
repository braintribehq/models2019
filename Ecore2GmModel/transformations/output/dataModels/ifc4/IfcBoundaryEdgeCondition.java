/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBoundaryEdgeCondition of the Data Model iai.
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
{@link TranslationalStiffnessByLengthX}, 
{@link TranslationalStiffnessByLengthY}, 
{@link TranslationalStiffnessByLengthZ}, 
{@link RotationalStiffnessByLengthX}, 
{@link RotationalStiffnessByLengthY}, 
{@link RotationalStiffnessByLengthZ}, 

* It provides of then following operations (getters and setters)
{@link getTranslationalStiffnessByLengthX},
{@link getTranslationalStiffnessByLengthY},
{@link getTranslationalStiffnessByLengthZ},
{@link getRotationalStiffnessByLengthX},
{@link getRotationalStiffnessByLengthY},
{@link getRotationalStiffnessByLengthZ},
{@link setTranslationalStiffnessByLengthX},
{@link setTranslationalStiffnessByLengthY},
{@link setTranslationalStiffnessByLengthZ},
{@link setRotationalStiffnessByLengthX},
{@link setRotationalStiffnessByLengthY},
{@link setRotationalStiffnessByLengthZ},
 */

@Description("")

public interface IfcBoundaryEdgeCondition extends GenericEntity, ifc4.IfcBoundaryCondition {

	EntityType<IfcBoundaryEdgeCondition> T = EntityTypes.T(IfcBoundaryEdgeCondition.class);

	/* Constants for each property name. */
	java.lang.String TranslationalStiffnessByLengthX = "TranslationalStiffnessByLengthX";
	java.lang.String TranslationalStiffnessByLengthY = "TranslationalStiffnessByLengthY";
	java.lang.String TranslationalStiffnessByLengthZ = "TranslationalStiffnessByLengthZ";
	java.lang.String RotationalStiffnessByLengthX = "RotationalStiffnessByLengthX";
	java.lang.String RotationalStiffnessByLengthY = "RotationalStiffnessByLengthY";
	java.lang.String RotationalStiffnessByLengthZ = "RotationalStiffnessByLengthZ";

	@Description("")
	@Mandatory
	ifc4.IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthX();
	void setTranslationalStiffnessByLengthX(ifc4.IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthX);
	@Description("")
	@Mandatory
	ifc4.IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthY();
	void setTranslationalStiffnessByLengthY(ifc4.IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthY);
	@Description("")
	@Mandatory
	ifc4.IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthZ();
	void setTranslationalStiffnessByLengthZ(ifc4.IfcModulusOfTranslationalSubgradeReactionSelect TranslationalStiffnessByLengthZ);
	@Description("")
	@Mandatory
	ifc4.IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthX();
	void setRotationalStiffnessByLengthX(ifc4.IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthX);
	@Description("")
	@Mandatory
	ifc4.IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthY();
	void setRotationalStiffnessByLengthY(ifc4.IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthY);
	@Description("")
	@Mandatory
	ifc4.IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthZ();
	void setRotationalStiffnessByLengthZ(ifc4.IfcModulusOfRotationalSubgradeReactionSelect RotationalStiffnessByLengthZ);
}
