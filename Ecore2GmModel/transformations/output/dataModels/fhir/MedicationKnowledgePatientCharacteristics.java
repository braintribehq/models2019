/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgePatientCharacteristics of the Data Model fhir.
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
{@link characteristicCodeableConcept}, 
{@link characteristicQuantity}, 

* It provides of then following operations (getters and setters)
{@link getCharacteristicCodeableConcept},
{@link getCharacteristicQuantity},
{@link setCharacteristicCodeableConcept},
{@link setCharacteristicQuantity},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgePatientCharacteristics extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgePatientCharacteristics> T = EntityTypes.T(MedicationKnowledgePatientCharacteristics.class);

	/* Constants for each property name. */
	java.lang.String characteristicCodeableConcept = "characteristicCodeableConcept";
	java.lang.String characteristicQuantity = "characteristicQuantity";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getCharacteristicCodeableConcept();
	void setCharacteristicCodeableConcept(fhir.CodeableConcept characteristicCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Quantity getCharacteristicQuantity();
	void setCharacteristicQuantity(fhir.Quantity characteristicQuantity);
}
