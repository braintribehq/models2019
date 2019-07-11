/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcQuantityLength of the Data Model iai.
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
{@link LengthValue}, 
{@link LengthValueAsString}, 
{@link Formula}, 

* It provides of then following operations (getters and setters)
{@link getLengthValue},
{@link getLengthValueAsString},
{@link getFormula},
{@link setLengthValue},
{@link setLengthValueAsString},
{@link setFormula},
 */

@Description("")

public interface IfcQuantityLength extends GenericEntity, ifc4.IfcPhysicalSimpleQuantity {

	EntityType<IfcQuantityLength> T = EntityTypes.T(IfcQuantityLength.class);

	/* Constants for each property name. */
	java.lang.String LengthValue = "LengthValue";
	java.lang.String LengthValueAsString = "LengthValueAsString";
	java.lang.String Formula = "Formula";

	@Description("")
	@Mandatory
	java.lang.Double getLengthValue();
	void setLengthValue(java.lang.Double LengthValue);
	@Description("")
	@Mandatory
	java.lang.String getLengthValueAsString();
	void setLengthValueAsString(java.lang.String LengthValueAsString);
	@Description("")
	@Mandatory
	java.lang.String getFormula();
	void setFormula(java.lang.String Formula);
}
