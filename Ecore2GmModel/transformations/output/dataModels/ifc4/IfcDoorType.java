/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDoorType of the Data Model iai.
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
{@link PredefinedType}, 
{@link OperationType}, 
{@link ParameterTakesPrecedence}, 
{@link UserDefinedOperationType}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getOperationType},
{@link getParameterTakesPrecedence},
{@link getUserDefinedOperationType},
{@link setPredefinedType},
{@link setOperationType},
{@link setParameterTakesPrecedence},
{@link setUserDefinedOperationType},
 */

@Description("")

public interface IfcDoorType extends GenericEntity, ifc4.IfcBuildingElementType {

	EntityType<IfcDoorType> T = EntityTypes.T(IfcDoorType.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String OperationType = "OperationType";
	java.lang.String ParameterTakesPrecedence = "ParameterTakesPrecedence";
	java.lang.String UserDefinedOperationType = "UserDefinedOperationType";

	@Description("")
	@Mandatory
	ifc4.IfcDoorTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcDoorTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcDoorTypeOperationEnum getOperationType();
	void setOperationType(ifc4.IfcDoorTypeOperationEnum OperationType);
	@Description("")
	@Mandatory
	ifc4.Tristate getParameterTakesPrecedence();
	void setParameterTakesPrecedence(ifc4.Tristate ParameterTakesPrecedence);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedOperationType();
	void setUserDefinedOperationType(java.lang.String UserDefinedOperationType);
}
