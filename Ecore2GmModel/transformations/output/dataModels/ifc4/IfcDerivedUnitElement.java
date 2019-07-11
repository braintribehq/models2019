/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcDerivedUnitElement of the Data Model iai.
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
{@link Unit}, 
{@link Exponent}, 

* It provides of then following operations (getters and setters)
{@link getUnit},
{@link getExponent},
{@link setUnit},
{@link setExponent},
 */

@Description("")

public interface IfcDerivedUnitElement extends GenericEntity {

	EntityType<IfcDerivedUnitElement> T = EntityTypes.T(IfcDerivedUnitElement.class);

	/* Constants for each property name. */
	java.lang.String Unit = "Unit";
	java.lang.String Exponent = "Exponent";

	@Description("")
	@Mandatory
	ifc4.IfcNamedUnit getUnit();
	void setUnit(ifc4.IfcNamedUnit Unit);
	@Description("")
	@Mandatory
	java.lang.Long getExponent();
	void setExponent(java.lang.Long Exponent);
}
