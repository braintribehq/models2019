/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Quantity of the Data Model iso20022.
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
{@link unitCode}, 

* It provides of then following operations (getters and setters)
{@link getUnitCode},
{@link setUnitCode},
 */

@Description("A counted number of non-monetary units possibly including fractions")

public interface Quantity extends GenericEntity, iso20022.Decimal {

	EntityType<Quantity> T = EntityTypes.T(Quantity.class);

	/* Constants for each property name. */
	java.lang.String unitCode = "unitCode";

	@Description("qualifies the value of a Quantity")
	@Mandatory
	java.lang.String getUnitCode();
	void setUnitCode(java.lang.String unitCode);
}
