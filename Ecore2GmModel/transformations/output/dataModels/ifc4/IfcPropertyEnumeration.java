/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertyEnumeration of the Data Model iai.
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
{@link Name}, 
{@link EnumerationValues}, 
{@link Unit}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getEnumerationValues},
{@link getUnit},
{@link setName},
{@link setEnumerationValues},
{@link setUnit},
 */

@Description("")

public interface IfcPropertyEnumeration extends GenericEntity, ifc4.IfcPropertyAbstraction {

	EntityType<IfcPropertyEnumeration> T = EntityTypes.T(IfcPropertyEnumeration.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String EnumerationValues = "EnumerationValues";
	java.lang.String Unit = "Unit";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	
	java.util.List<ifc4.IfcValue> getEnumerationValues();
	void setEnumerationValues(java.util.List<ifc4.IfcValue> EnumerationValues);

	@Description("")
	@Mandatory
	ifc4.IfcUnit getUnit();
	void setUnit(ifc4.IfcUnit Unit);
}
