/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ContractValuedItem of the Data Model fhir.
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
{@link entityCodeableConcept}, 
{@link entityReference}, 
{@link identifier}, 
{@link quantity}, 
{@link unitPrice}, 
{@link net}, 
{@link responsible}, 
{@link recipient}, 

* It provides of then following operations (getters and setters)
{@link getEntityCodeableConcept},
{@link getEntityReference},
{@link getIdentifier},
{@link getQuantity},
{@link getUnitPrice},
{@link getNet},
{@link getResponsible},
{@link getRecipient},
{@link setEntityCodeableConcept},
{@link setEntityReference},
{@link setIdentifier},
{@link setQuantity},
{@link setUnitPrice},
{@link setNet},
{@link setResponsible},
{@link setRecipient},
 */

@Description("Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.")

public interface ContractValuedItem extends GenericEntity, fhir.BackboneElement {

	EntityType<ContractValuedItem> T = EntityTypes.T(ContractValuedItem.class);

	/* Constants for each property name. */
	java.lang.String entityCodeableConcept = "entityCodeableConcept";
	java.lang.String entityReference = "entityReference";
	java.lang.String identifier = "identifier";
	java.lang.String quantity = "quantity";
	java.lang.String unitPrice = "unitPrice";
	java.lang.String net = "net";
	java.lang.String responsible = "responsible";
	java.lang.String recipient = "recipient";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getEntityCodeableConcept();
	void setEntityCodeableConcept(fhir.CodeableConcept entityCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEntityReference();
	void setEntityReference(com.braintribe.model.generic.GenericEntity entityReference);
	@Description("Identifies a Contract Valued Item instance.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Specifies the units by which the Contract Valued Item is measured or counted, and quantifies the countable or measurable Contract Valued Item instances.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("A Contract Valued Item unit valuation measure.")
	@Mandatory
	fhir.Money getUnitPrice();
	void setUnitPrice(fhir.Money unitPrice);
	@Description("Expresses the product of the Contract Valued Item unitQuantity and the unitPriceAmt. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.")
	@Mandatory
	fhir.Money getNet();
	void setNet(fhir.Money net);
	@Description("Who will make payment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getResponsible();
	void setResponsible(com.braintribe.model.generic.GenericEntity responsible);
	@Description("Who will receive payment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRecipient();
	void setRecipient(com.braintribe.model.generic.GenericEntity recipient);
}
