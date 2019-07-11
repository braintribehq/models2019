/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcQuantityTime of the Data Model iai.
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
{@link TimeValue}, 
{@link TimeValueAsString}, 
{@link Formula}, 

* It provides of then following operations (getters and setters)
{@link getTimeValue},
{@link getTimeValueAsString},
{@link getFormula},
{@link setTimeValue},
{@link setTimeValueAsString},
{@link setFormula},
 */

@Description("")

public interface IfcQuantityTime extends GenericEntity, ifc4.IfcPhysicalSimpleQuantity {

	EntityType<IfcQuantityTime> T = EntityTypes.T(IfcQuantityTime.class);

	/* Constants for each property name. */
	java.lang.String TimeValue = "TimeValue";
	java.lang.String TimeValueAsString = "TimeValueAsString";
	java.lang.String Formula = "Formula";

	@Description("")
	@Mandatory
	java.lang.Double getTimeValue();
	void setTimeValue(java.lang.Double TimeValue);
	@Description("")
	@Mandatory
	java.lang.String getTimeValueAsString();
	void setTimeValueAsString(java.lang.String TimeValueAsString);
	@Description("")
	@Mandatory
	java.lang.String getFormula();
	void setFormula(java.lang.String Formula);
}
