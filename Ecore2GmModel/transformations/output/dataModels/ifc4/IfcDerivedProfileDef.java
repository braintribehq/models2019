/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDerivedProfileDef of the Data Model iai.
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
{@link ParentProfile}, 
{@link Operator}, 
{@link Label}, 

* It provides of then following operations (getters and setters)
{@link getParentProfile},
{@link getOperator},
{@link getLabel},
{@link setParentProfile},
{@link setOperator},
{@link setLabel},
 */

@Description("")

public interface IfcDerivedProfileDef extends GenericEntity, ifc4.IfcProfileDef {

	EntityType<IfcDerivedProfileDef> T = EntityTypes.T(IfcDerivedProfileDef.class);

	/* Constants for each property name. */
	java.lang.String ParentProfile = "ParentProfile";
	java.lang.String Operator = "Operator";
	java.lang.String Label = "Label";

	@Description("")
	@Mandatory
	ifc4.IfcProfileDef getParentProfile();
	void setParentProfile(ifc4.IfcProfileDef ParentProfile);
	@Description("")
	@Mandatory
	ifc4.IfcCartesianTransformationOperator2D getOperator();
	void setOperator(ifc4.IfcCartesianTransformationOperator2D Operator);
	@Description("")
	@Mandatory
	java.lang.String getLabel();
	void setLabel(java.lang.String Label);
}
