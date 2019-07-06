/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ChargeItemDefinitionPriceComponent of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link code}, 
{@link amount}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getAmount},
{@link setCode},
{@link setAmount},
 */

@Description("The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.")

public interface ChargeItemDefinitionPriceComponent extends GenericEntity, fhir.BackboneElement {

	EntityType<ChargeItemDefinitionPriceComponent> T = EntityTypes.T(ChargeItemDefinitionPriceComponent.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String amount = "amount";

	@Description("A code that identifies the component. Codes may be used to differentiate between kinds of taxes, surcharges, discounts etc.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The amount calculated for this component.")
	@Mandatory
	fhir.Money getAmount();
	void setAmount(fhir.Money amount);
}
