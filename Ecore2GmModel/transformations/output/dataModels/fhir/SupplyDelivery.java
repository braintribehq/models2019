/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SupplyDelivery of the Data Model fhir.
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
{@link basedOn}, 
{@link partOf}, 
{@link patient}, 
{@link type}, 
{@link suppliedItem}, 
{@link occurrencePeriod}, 
{@link occurrenceTiming}, 
{@link supplier}, 
{@link destination}, 
{@link receiver}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getPartOf},
{@link getPatient},
{@link getType},
{@link getSuppliedItem},
{@link getOccurrencePeriod},
{@link getOccurrenceTiming},
{@link getSupplier},
{@link getDestination},
{@link getReceiver},
{@link setIdentifier},
{@link setBasedOn},
{@link setPartOf},
{@link setPatient},
{@link setType},
{@link setSuppliedItem},
{@link setOccurrencePeriod},
{@link setOccurrenceTiming},
{@link setSupplier},
{@link setDestination},
{@link setReceiver},
 */

@Description("Record of delivery of what is supplied.If the element is present, it must have either a @value, an @id, or extensions")

public interface SupplyDelivery extends GenericEntity, fhir.FhirDomainResource {

	EntityType<SupplyDelivery> T = EntityTypes.T(SupplyDelivery.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String partOf = "partOf";
	java.lang.String patient = "patient";
	java.lang.String type = "type";
	java.lang.String suppliedItem = "suppliedItem";
	java.lang.String occurrencePeriod = "occurrencePeriod";
	java.lang.String occurrenceTiming = "occurrenceTiming";
	java.lang.String supplier = "supplier";
	java.lang.String destination = "destination";
	java.lang.String receiver = "receiver";

	@Description("Identifier for the supply delivery event that is used to identify it across multiple disparate systems.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A plan, proposal or order that is fulfilled in whole or in part by this event.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("A larger event of which this particular event is a component or step.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("A link to a resource representing the person whom the delivered item is for.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The item that is being delivered or has been supplied.")
	@Mandatory
	fhir.SupplyDeliverySuppliedItem getSuppliedItem();
	void setSuppliedItem(fhir.SupplyDeliverySuppliedItem suppliedItem);
	@Description("")
	@Mandatory
	fhir.Period getOccurrencePeriod();
	void setOccurrencePeriod(fhir.Period occurrencePeriod);
	@Description("")
	@Mandatory
	fhir.Timing getOccurrenceTiming();
	void setOccurrenceTiming(fhir.Timing occurrenceTiming);
	@Description("The individual responsible for dispensing the medication, supplier or device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSupplier();
	void setSupplier(com.braintribe.model.generic.GenericEntity supplier);
	@Description("Identification of the facility/location where the Supply was shipped to, as part of the dispense event.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDestination();
	void setDestination(com.braintribe.model.generic.GenericEntity destination);
	@Description("Identifies the person who picked up the Supply.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReceiver();
	void setReceiver(java.util.List<com.braintribe.model.generic.GenericEntity> receiver);

}
