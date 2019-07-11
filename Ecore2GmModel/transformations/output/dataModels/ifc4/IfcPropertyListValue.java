/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertyListValue of the Data Model iai.
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
{@link ListValues}, 
{@link Unit}, 

* It provides of then following operations (getters and setters)
{@link getListValues},
{@link getUnit},
{@link setListValues},
{@link setUnit},
 */

@Description("")

public interface IfcPropertyListValue extends GenericEntity, ifc4.IfcSimpleProperty {

	EntityType<IfcPropertyListValue> T = EntityTypes.T(IfcPropertyListValue.class);

	/* Constants for each property name. */
	java.lang.String ListValues = "ListValues";
	java.lang.String Unit = "Unit";

	@Description("")
	
	java.util.List<ifc4.IfcValue> getListValues();
	void setListValues(java.util.List<ifc4.IfcValue> ListValues);

	@Description("")
	@Mandatory
	ifc4.IfcUnit getUnit();
	void setUnit(ifc4.IfcUnit Unit);
}
