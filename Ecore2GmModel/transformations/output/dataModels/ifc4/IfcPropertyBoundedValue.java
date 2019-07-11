/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertyBoundedValue of the Data Model iai.
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
{@link UpperBoundValue}, 
{@link LowerBoundValue}, 
{@link Unit}, 
{@link SetPointValue}, 

* It provides of then following operations (getters and setters)
{@link getUpperBoundValue},
{@link getLowerBoundValue},
{@link getUnit},
{@link getSetPointValue},
{@link setUpperBoundValue},
{@link setLowerBoundValue},
{@link setUnit},
{@link setSetPointValue},
 */

@Description("")

public interface IfcPropertyBoundedValue extends GenericEntity, ifc4.IfcSimpleProperty {

	EntityType<IfcPropertyBoundedValue> T = EntityTypes.T(IfcPropertyBoundedValue.class);

	/* Constants for each property name. */
	java.lang.String UpperBoundValue = "UpperBoundValue";
	java.lang.String LowerBoundValue = "LowerBoundValue";
	java.lang.String Unit = "Unit";
	java.lang.String SetPointValue = "SetPointValue";

	@Description("")
	@Mandatory
	ifc4.IfcValue getUpperBoundValue();
	void setUpperBoundValue(ifc4.IfcValue UpperBoundValue);
	@Description("")
	@Mandatory
	ifc4.IfcValue getLowerBoundValue();
	void setLowerBoundValue(ifc4.IfcValue LowerBoundValue);
	@Description("")
	@Mandatory
	ifc4.IfcUnit getUnit();
	void setUnit(ifc4.IfcUnit Unit);
	@Description("")
	@Mandatory
	ifc4.IfcValue getSetPointValue();
	void setSetPointValue(ifc4.IfcValue SetPointValue);
}
