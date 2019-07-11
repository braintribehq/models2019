/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcWindowType of the Data Model iai.
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
{@link PartitioningType}, 
{@link ParameterTakesPrecedence}, 
{@link UserDefinedPartitioningType}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getPartitioningType},
{@link getParameterTakesPrecedence},
{@link getUserDefinedPartitioningType},
{@link setPredefinedType},
{@link setPartitioningType},
{@link setParameterTakesPrecedence},
{@link setUserDefinedPartitioningType},
 */

@Description("")

public interface IfcWindowType extends GenericEntity, ifc4.IfcBuildingElementType {

	EntityType<IfcWindowType> T = EntityTypes.T(IfcWindowType.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String PartitioningType = "PartitioningType";
	java.lang.String ParameterTakesPrecedence = "ParameterTakesPrecedence";
	java.lang.String UserDefinedPartitioningType = "UserDefinedPartitioningType";

	@Description("")
	@Mandatory
	ifc4.IfcWindowTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcWindowTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcWindowTypePartitioningEnum getPartitioningType();
	void setPartitioningType(ifc4.IfcWindowTypePartitioningEnum PartitioningType);
	@Description("")
	@Mandatory
	ifc4.Tristate getParameterTakesPrecedence();
	void setParameterTakesPrecedence(ifc4.Tristate ParameterTakesPrecedence);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedPartitioningType();
	void setUserDefinedPartitioningType(java.lang.String UserDefinedPartitioningType);
}
