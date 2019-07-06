/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimResponseSubDetail1 of the Data Model fhir.
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
{@link productOrService}, 
{@link modifier}, 
{@link quantity}, 
{@link unitPrice}, 
{@link net}, 
{@link adjudication}, 

* It provides of then following operations (getters and setters)
{@link getProductOrService},
{@link getModifier},
{@link getQuantity},
{@link getUnitPrice},
{@link getNet},
{@link getAdjudication},
{@link setProductOrService},
{@link setModifier},
{@link setQuantity},
{@link setUnitPrice},
{@link setNet},
{@link setAdjudication},
 */

@Description("This resource provides the adjudication details from the processing of a Claim resource.")

public interface ClaimResponseSubDetail1 extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimResponseSubDetail1> T = EntityTypes.T(ClaimResponseSubDetail1.class);

	/* Constants for each property name. */
	java.lang.String productOrService = "productOrService";
	java.lang.String modifier = "modifier";
	java.lang.String quantity = "quantity";
	java.lang.String unitPrice = "unitPrice";
	java.lang.String net = "net";
	java.lang.String adjudication = "adjudication";

	@Description("When the value is a group code then this item collects a set of related claim details, otherwise this contains the product, service, drug or other billing code for the item.")
	@Mandatory
	fhir.CodeableConcept getProductOrService();
	void setProductOrService(fhir.CodeableConcept productOrService);
	@Description("Item typification or modifiers codes to convey additional context for the product or service.")
	
	java.util.List<fhir.CodeableConcept> getModifier();
	void setModifier(java.util.List<fhir.CodeableConcept> modifier);

	@Description("The number of repetitions of a service or product.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("If the item is not a group then this is the fee for the product or service, otherwise this is the total of the fees for the details of the group.")
	@Mandatory
	fhir.Money getUnitPrice();
	void setUnitPrice(fhir.Money unitPrice);
	@Description("The quantity times the unit price for an additional service or product or charge.")
	@Mandatory
	fhir.Money getNet();
	void setNet(fhir.Money net);
	@Description("The adjudication results.")
	
	java.util.List<fhir.ClaimResponseAdjudication> getAdjudication();
	void setAdjudication(java.util.List<fhir.ClaimResponseAdjudication> adjudication);

}
