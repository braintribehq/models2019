/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Amount of the Data Model iso20022.
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
{@link currencyIdentifierSet}, 

* It provides of then following operations (getters and setters)
{@link getCurrencyIdentifierSet},
{@link setCurrencyIdentifierSet},
 */

@Description("A number of monetary units specified in a currency where the unit of currency is explicit or implied.")

public interface Amount extends GenericEntity, iso20022.Decimal {

	EntityType<Amount> T = EntityTypes.T(Amount.class);

	/* Constants for each property name. */
	java.lang.String currencyIdentifierSet = "currencyIdentifierSet";

	@Description("specifies the allowed currencies that can be used to qualify this amount")
	@Mandatory
	iso20022.DataType getCurrencyIdentifierSet();
	void setCurrencyIdentifierSet(iso20022.DataType currencyIdentifierSet);
}
