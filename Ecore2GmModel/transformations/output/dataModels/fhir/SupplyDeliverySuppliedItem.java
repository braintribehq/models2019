/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SupplyDeliverySuppliedItem of the Data Model fhir.
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
{@link quantity}, 
{@link itemCodeableConcept}, 
{@link itemReference}, 

* It provides of then following operations (getters and setters)
{@link getQuantity},
{@link getItemCodeableConcept},
{@link getItemReference},
{@link setQuantity},
{@link setItemCodeableConcept},
{@link setItemReference},
 */

@Description("Record of delivery of what is supplied.")

public interface SupplyDeliverySuppliedItem extends GenericEntity, fhir.BackboneElement {

	EntityType<SupplyDeliverySuppliedItem> T = EntityTypes.T(SupplyDeliverySuppliedItem.class);

	/* Constants for each property name. */
	java.lang.String quantity = "quantity";
	java.lang.String itemCodeableConcept = "itemCodeableConcept";
	java.lang.String itemReference = "itemReference";

	@Description("The amount of supply that has been dispensed. Includes unit of measure.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getItemCodeableConcept();
	void setItemCodeableConcept(fhir.CodeableConcept itemCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getItemReference();
	void setItemReference(com.braintribe.model.generic.GenericEntity itemReference);
}
