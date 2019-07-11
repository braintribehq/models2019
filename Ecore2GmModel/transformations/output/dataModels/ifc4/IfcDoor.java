/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDoor of the Data Model iai.
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
{@link OverallHeight}, 
{@link OverallHeightAsString}, 
{@link OverallWidth}, 
{@link OverallWidthAsString}, 
{@link PredefinedType}, 
{@link OperationType}, 
{@link UserDefinedOperationType}, 

* It provides of then following operations (getters and setters)
{@link getOverallHeight},
{@link getOverallHeightAsString},
{@link getOverallWidth},
{@link getOverallWidthAsString},
{@link getPredefinedType},
{@link getOperationType},
{@link getUserDefinedOperationType},
{@link setOverallHeight},
{@link setOverallHeightAsString},
{@link setOverallWidth},
{@link setOverallWidthAsString},
{@link setPredefinedType},
{@link setOperationType},
{@link setUserDefinedOperationType},
 */

@Description("")

public interface IfcDoor extends GenericEntity, ifc4.IfcBuildingElement {

	EntityType<IfcDoor> T = EntityTypes.T(IfcDoor.class);

	/* Constants for each property name. */
	java.lang.String OverallHeight = "OverallHeight";
	java.lang.String OverallHeightAsString = "OverallHeightAsString";
	java.lang.String OverallWidth = "OverallWidth";
	java.lang.String OverallWidthAsString = "OverallWidthAsString";
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String OperationType = "OperationType";
	java.lang.String UserDefinedOperationType = "UserDefinedOperationType";

	@Description("")
	@Mandatory
	java.lang.Double getOverallHeight();
	void setOverallHeight(java.lang.Double OverallHeight);
	@Description("")
	@Mandatory
	java.lang.String getOverallHeightAsString();
	void setOverallHeightAsString(java.lang.String OverallHeightAsString);
	@Description("")
	@Mandatory
	java.lang.Double getOverallWidth();
	void setOverallWidth(java.lang.Double OverallWidth);
	@Description("")
	@Mandatory
	java.lang.String getOverallWidthAsString();
	void setOverallWidthAsString(java.lang.String OverallWidthAsString);
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
	java.lang.String getUserDefinedOperationType();
	void setUserDefinedOperationType(java.lang.String UserDefinedOperationType);
}
