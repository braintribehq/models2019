/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcQuantityWeight of the Data Model iai.
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
{@link WeightValue}, 
{@link WeightValueAsString}, 
{@link Formula}, 

* It provides of then following operations (getters and setters)
{@link getWeightValue},
{@link getWeightValueAsString},
{@link getFormula},
{@link setWeightValue},
{@link setWeightValueAsString},
{@link setFormula},
 */

@Description("")

public interface IfcQuantityWeight extends GenericEntity, ifc4.IfcPhysicalSimpleQuantity {

	EntityType<IfcQuantityWeight> T = EntityTypes.T(IfcQuantityWeight.class);

	/* Constants for each property name. */
	java.lang.String WeightValue = "WeightValue";
	java.lang.String WeightValueAsString = "WeightValueAsString";
	java.lang.String Formula = "Formula";

	@Description("")
	@Mandatory
	java.lang.Double getWeightValue();
	void setWeightValue(java.lang.Double WeightValue);
	@Description("")
	@Mandatory
	java.lang.String getWeightValueAsString();
	void setWeightValueAsString(java.lang.String WeightValueAsString);
	@Description("")
	@Mandatory
	java.lang.String getFormula();
	void setFormula(java.lang.String Formula);
}
