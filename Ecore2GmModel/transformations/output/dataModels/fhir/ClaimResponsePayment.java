/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimResponsePayment of the Data Model fhir.
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
{@link type}, 
{@link adjustment}, 
{@link adjustmentReason}, 
{@link amount}, 
{@link identifier}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getAdjustment},
{@link getAdjustmentReason},
{@link getAmount},
{@link getIdentifier},
{@link setType},
{@link setAdjustment},
{@link setAdjustmentReason},
{@link setAmount},
{@link setIdentifier},
 */

@Description("This resource provides the adjudication details from the processing of a Claim resource.")

public interface ClaimResponsePayment extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimResponsePayment> T = EntityTypes.T(ClaimResponsePayment.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String adjustment = "adjustment";
	java.lang.String adjustmentReason = "adjustmentReason";
	java.lang.String amount = "amount";
	java.lang.String identifier = "identifier";

	@Description("Whether this represents partial or complete payment of the benefits payable.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Total amount of all adjustments to this payment included in this transaction which are not related to this claim's adjudication.")
	@Mandatory
	fhir.Money getAdjustment();
	void setAdjustment(fhir.Money adjustment);
	@Description("Reason for the payment adjustment.")
	@Mandatory
	fhir.CodeableConcept getAdjustmentReason();
	void setAdjustmentReason(fhir.CodeableConcept adjustmentReason);
	@Description("Benefits payable less any payment adjustment.")
	@Mandatory
	fhir.Money getAmount();
	void setAmount(fhir.Money amount);
	@Description("Issuer's unique identifier for the payment instrument.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
}
