/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Rate of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link baseValue}, 
{@link baseUnitCode}, 

* It provides of then following operations (getters and setters)
{@link getBaseValue},
{@link getBaseUnitCode},
{@link setBaseValue},
{@link setBaseUnitCode},
 */

@Description("A quantity or amount measured with respect to another measured quantity or amount")

public interface Rate extends GenericEntity, iso20022.Decimal {

	EntityType<Rate> T = EntityTypes.T(Rate.class);

	/* Constants for each property name. */
	java.lang.String baseValue = "baseValue";
	java.lang.String baseUnitCode = "baseUnitCode";

	@Description("specifies the ratio between the base value and the actual value")
	@Mandatory
	java.lang.Double getBaseValue();
	void setBaseValue(java.lang.Double baseValue);
	@Description("specifies unit code required to qualify this rate")
	@Mandatory
	java.lang.String getBaseUnitCode();
	void setBaseUnitCode(java.lang.String baseUnitCode);
}
