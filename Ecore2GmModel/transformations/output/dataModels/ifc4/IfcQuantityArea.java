/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcQuantityArea of the Data Model iai.
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
{@link AreaValue}, 
{@link AreaValueAsString}, 
{@link Formula}, 

* It provides of then following operations (getters and setters)
{@link getAreaValue},
{@link getAreaValueAsString},
{@link getFormula},
{@link setAreaValue},
{@link setAreaValueAsString},
{@link setFormula},
 */

@Description("")

public interface IfcQuantityArea extends GenericEntity, ifc4.IfcPhysicalSimpleQuantity {

	EntityType<IfcQuantityArea> T = EntityTypes.T(IfcQuantityArea.class);

	/* Constants for each property name. */
	java.lang.String AreaValue = "AreaValue";
	java.lang.String AreaValueAsString = "AreaValueAsString";
	java.lang.String Formula = "Formula";

	@Description("")
	@Mandatory
	java.lang.Double getAreaValue();
	void setAreaValue(java.lang.Double AreaValue);
	@Description("")
	@Mandatory
	java.lang.String getAreaValueAsString();
	void setAreaValueAsString(java.lang.String AreaValueAsString);
	@Description("")
	@Mandatory
	java.lang.String getFormula();
	void setFormula(java.lang.String Formula);
}
