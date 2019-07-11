/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcWindowStyle of the Data Model iai.
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
{@link ConstructionType}, 
{@link OperationType}, 
{@link ParameterTakesPrecedence}, 
{@link Sizeable}, 

* It provides of then following operations (getters and setters)
{@link getConstructionType},
{@link getOperationType},
{@link getParameterTakesPrecedence},
{@link getSizeable},
{@link setConstructionType},
{@link setOperationType},
{@link setParameterTakesPrecedence},
{@link setSizeable},
 */

@Description("")

public interface IfcWindowStyle extends GenericEntity, ifc4.IfcTypeProduct {

	EntityType<IfcWindowStyle> T = EntityTypes.T(IfcWindowStyle.class);

	/* Constants for each property name. */
	java.lang.String ConstructionType = "ConstructionType";
	java.lang.String OperationType = "OperationType";
	java.lang.String ParameterTakesPrecedence = "ParameterTakesPrecedence";
	java.lang.String Sizeable = "Sizeable";

	@Description("")
	@Mandatory
	ifc4.IfcWindowStyleConstructionEnum getConstructionType();
	void setConstructionType(ifc4.IfcWindowStyleConstructionEnum ConstructionType);
	@Description("")
	@Mandatory
	ifc4.IfcWindowStyleOperationEnum getOperationType();
	void setOperationType(ifc4.IfcWindowStyleOperationEnum OperationType);
	@Description("")
	@Mandatory
	ifc4.Tristate getParameterTakesPrecedence();
	void setParameterTakesPrecedence(ifc4.Tristate ParameterTakesPrecedence);
	@Description("")
	@Mandatory
	ifc4.Tristate getSizeable();
	void setSizeable(ifc4.Tristate Sizeable);
}
