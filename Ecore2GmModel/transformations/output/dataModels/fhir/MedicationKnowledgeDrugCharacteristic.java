/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgeDrugCharacteristic of the Data Model fhir.
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
{@link valueCodeableConcept}, 
{@link valueQuantity}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getValueCodeableConcept},
{@link getValueQuantity},
{@link setType},
{@link setValueCodeableConcept},
{@link setValueQuantity},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgeDrugCharacteristic extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgeDrugCharacteristic> T = EntityTypes.T(MedicationKnowledgeDrugCharacteristic.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String valueCodeableConcept = "valueCodeableConcept";
	java.lang.String valueQuantity = "valueQuantity";

	@Description("A code specifying which characteristic of the medicine is being described (for example, colour, shape, imprint).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getValueCodeableConcept();
	void setValueCodeableConcept(fhir.CodeableConcept valueCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Quantity getValueQuantity();
	void setValueQuantity(fhir.Quantity valueQuantity);
}
