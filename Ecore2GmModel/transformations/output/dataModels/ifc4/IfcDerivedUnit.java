/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDerivedUnit of the Data Model iai.
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
{@link Elements}, 
{@link UnitType}, 
{@link UserDefinedType}, 

* It provides of then following operations (getters and setters)
{@link getElements},
{@link getUnitType},
{@link getUserDefinedType},
{@link setElements},
{@link setUnitType},
{@link setUserDefinedType},
 */

@Description("")

public interface IfcDerivedUnit extends GenericEntity, ifc4.IfcUnit {

	EntityType<IfcDerivedUnit> T = EntityTypes.T(IfcDerivedUnit.class);

	/* Constants for each property name. */
	java.lang.String Elements = "Elements";
	java.lang.String UnitType = "UnitType";
	java.lang.String UserDefinedType = "UserDefinedType";

	@Description("")
	
	java.util.List<ifc4.IfcDerivedUnitElement> getElements();
	void setElements(java.util.List<ifc4.IfcDerivedUnitElement> Elements);

	@Description("")
	@Mandatory
	ifc4.IfcDerivedUnitEnum getUnitType();
	void setUnitType(ifc4.IfcDerivedUnitEnum UnitType);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedType();
	void setUserDefinedType(java.lang.String UserDefinedType);
}
