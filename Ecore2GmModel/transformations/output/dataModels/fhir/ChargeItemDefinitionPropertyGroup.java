/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ChargeItemDefinitionPropertyGroup of the Data Model fhir.
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
{@link applicability}, 
{@link priceComponent}, 

* It provides of then following operations (getters and setters)
{@link getApplicability},
{@link getPriceComponent},
{@link setApplicability},
{@link setPriceComponent},
 */

@Description("The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.")

public interface ChargeItemDefinitionPropertyGroup extends GenericEntity, fhir.BackboneElement {

	EntityType<ChargeItemDefinitionPropertyGroup> T = EntityTypes.T(ChargeItemDefinitionPropertyGroup.class);

	/* Constants for each property name. */
	java.lang.String applicability = "applicability";
	java.lang.String priceComponent = "priceComponent";

	@Description("Expressions that describe applicability criteria for the priceComponent.")
	
	java.util.List<fhir.ChargeItemDefinitionApplicability> getApplicability();
	void setApplicability(java.util.List<fhir.ChargeItemDefinitionApplicability> applicability);

	@Description("The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the prices have been calculated.")
	
	java.util.List<fhir.ChargeItemDefinitionPriceComponent> getPriceComponent();
	void setPriceComponent(java.util.List<fhir.ChargeItemDefinitionPriceComponent> priceComponent);

}
