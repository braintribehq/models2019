/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type InvoiceLineItem of the Data Model fhir.
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
{@link chargeItemReference}, 
{@link chargeItemCodeableConcept}, 
{@link priceComponent}, 

* It provides of then following operations (getters and setters)
{@link getChargeItemReference},
{@link getChargeItemCodeableConcept},
{@link getPriceComponent},
{@link setChargeItemReference},
{@link setChargeItemCodeableConcept},
{@link setPriceComponent},
 */

@Description("Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.")

public interface InvoiceLineItem extends GenericEntity, fhir.BackboneElement {

	EntityType<InvoiceLineItem> T = EntityTypes.T(InvoiceLineItem.class);

	/* Constants for each property name. */
	java.lang.String chargeItemReference = "chargeItemReference";
	java.lang.String chargeItemCodeableConcept = "chargeItemCodeableConcept";
	java.lang.String priceComponent = "priceComponent";

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getChargeItemReference();
	void setChargeItemReference(com.braintribe.model.generic.GenericEntity chargeItemReference);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getChargeItemCodeableConcept();
	void setChargeItemCodeableConcept(fhir.CodeableConcept chargeItemCodeableConcept);
	@Description("The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. The priceComponent element can be used to offer transparency to the recipient of the Invoice as to how the prices have been calculated.")
	
	java.util.List<fhir.InvoicePriceComponent> getPriceComponent();
	void setPriceComponent(java.util.List<fhir.InvoicePriceComponent> priceComponent);

}
