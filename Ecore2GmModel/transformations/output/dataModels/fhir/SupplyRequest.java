/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SupplyRequest of the Data Model fhir.
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
{@link identifier}, 
{@link category}, 
{@link itemCodeableConcept}, 
{@link itemReference}, 
{@link quantity}, 
{@link parameter}, 
{@link occurrencePeriod}, 
{@link occurrenceTiming}, 
{@link requester}, 
{@link supplier}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link deliverFrom}, 
{@link deliverTo}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCategory},
{@link getItemCodeableConcept},
{@link getItemReference},
{@link getQuantity},
{@link getParameter},
{@link getOccurrencePeriod},
{@link getOccurrenceTiming},
{@link getRequester},
{@link getSupplier},
{@link getReasonCode},
{@link getReasonReference},
{@link getDeliverFrom},
{@link getDeliverTo},
{@link setIdentifier},
{@link setCategory},
{@link setItemCodeableConcept},
{@link setItemReference},
{@link setQuantity},
{@link setParameter},
{@link setOccurrencePeriod},
{@link setOccurrenceTiming},
{@link setRequester},
{@link setSupplier},
{@link setReasonCode},
{@link setReasonReference},
{@link setDeliverFrom},
{@link setDeliverTo},
 */

@Description("A record of a request for a medication, substance or device used in the healthcare setting.If the element is present, it must have either a @value, an @id, or extensions")

public interface SupplyRequest extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SupplyRequest> T = EntityTypes.T(SupplyRequest.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String category = "category";
	java.lang.String itemCodeableConcept = "itemCodeableConcept";
	java.lang.String itemReference = "itemReference";
	java.lang.String quantity = "quantity";
	java.lang.String parameter = "parameter";
	java.lang.String occurrencePeriod = "occurrencePeriod";
	java.lang.String occurrenceTiming = "occurrenceTiming";
	java.lang.String requester = "requester";
	java.lang.String supplier = "supplier";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String deliverFrom = "deliverFrom";
	java.lang.String deliverTo = "deliverTo";

	@Description("Business identifiers assigned to this SupplyRequest by the author and/or other systems. These identifiers remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getItemCodeableConcept();
	void setItemCodeableConcept(fhir.CodeableConcept itemCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getItemReference();
	void setItemReference(com.braintribe.model.generic.GenericEntity itemReference);
	@Description("The amount that is being ordered of the indicated item.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("Specific parameters for the ordered item.  For example, the size of the indicated item.")
	
	java.util.List<fhir.SupplyRequestParameter> getParameter();
	void setParameter(java.util.List<fhir.SupplyRequestParameter> parameter);

	@Description("")
	@Mandatory
	fhir.Period getOccurrencePeriod();
	void setOccurrencePeriod(fhir.Period occurrencePeriod);
	@Description("")
	@Mandatory
	fhir.Timing getOccurrenceTiming();
	void setOccurrenceTiming(fhir.Timing occurrenceTiming);
	@Description("The device, practitioner, etc. who initiated the request.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequester();
	void setRequester(com.braintribe.model.generic.GenericEntity requester);
	@Description("Who is intended to fulfill the request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupplier();
	void setSupplier(java.util.List<com.braintribe.model.generic.GenericEntity> supplier);

	@Description("The reason why the supply item was requested.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("The reason why the supply item was requested.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Where the supply is expected to come from.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDeliverFrom();
	void setDeliverFrom(com.braintribe.model.generic.GenericEntity deliverFrom);
	@Description("Where the supply is destined to go.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDeliverTo();
	void setDeliverTo(com.braintribe.model.generic.GenericEntity deliverTo);
}
