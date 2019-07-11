/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBooleanResult of the Data Model iai.
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
{@link Operator}, 
{@link FirstOperand}, 
{@link SecondOperand}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getOperator},
{@link getFirstOperand},
{@link getSecondOperand},
{@link getDim},
{@link setOperator},
{@link setFirstOperand},
{@link setSecondOperand},
{@link setDim},
 */

@Description("")

public interface IfcBooleanResult extends GenericEntity, ifc4.IfcGeometricRepresentationItem, ifc4.IfcBooleanOperand, ifc4.IfcCsgSelect {

	EntityType<IfcBooleanResult> T = EntityTypes.T(IfcBooleanResult.class);

	/* Constants for each property name. */
	java.lang.String Operator = "Operator";
	java.lang.String FirstOperand = "FirstOperand";
	java.lang.String SecondOperand = "SecondOperand";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcBooleanOperator getOperator();
	void setOperator(ifc4.IfcBooleanOperator Operator);
	@Description("")
	@Mandatory
	ifc4.IfcBooleanOperand getFirstOperand();
	void setFirstOperand(ifc4.IfcBooleanOperand FirstOperand);
	@Description("")
	@Mandatory
	ifc4.IfcBooleanOperand getSecondOperand();
	void setSecondOperand(ifc4.IfcBooleanOperand SecondOperand);
	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
