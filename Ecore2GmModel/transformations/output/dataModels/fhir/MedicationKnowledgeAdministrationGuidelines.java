/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgeAdministrationGuidelines of the Data Model fhir.
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
{@link dosage}, 
{@link indicationCodeableConcept}, 
{@link indicationReference}, 
{@link patientCharacteristics}, 

* It provides of then following operations (getters and setters)
{@link getDosage},
{@link getIndicationCodeableConcept},
{@link getIndicationReference},
{@link getPatientCharacteristics},
{@link setDosage},
{@link setIndicationCodeableConcept},
{@link setIndicationReference},
{@link setPatientCharacteristics},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgeAdministrationGuidelines extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgeAdministrationGuidelines> T = EntityTypes.T(MedicationKnowledgeAdministrationGuidelines.class);

	/* Constants for each property name. */
	java.lang.String dosage = "dosage";
	java.lang.String indicationCodeableConcept = "indicationCodeableConcept";
	java.lang.String indicationReference = "indicationReference";
	java.lang.String patientCharacteristics = "patientCharacteristics";

	@Description("Dosage for the medication for the specific guidelines.")
	
	java.util.List<fhir.MedicationKnowledgeDosage> getDosage();
	void setDosage(java.util.List<fhir.MedicationKnowledgeDosage> dosage);

	@Description("")
	@Mandatory
	fhir.CodeableConcept getIndicationCodeableConcept();
	void setIndicationCodeableConcept(fhir.CodeableConcept indicationCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getIndicationReference();
	void setIndicationReference(com.braintribe.model.generic.GenericEntity indicationReference);
	@Description("Characteristics of the patient that are relevant to the administration guidelines (for example, height, weight, gender, etc.).")
	
	java.util.List<fhir.MedicationKnowledgePatientCharacteristics> getPatientCharacteristics();
	void setPatientCharacteristics(java.util.List<fhir.MedicationKnowledgePatientCharacteristics> patientCharacteristics);

}
