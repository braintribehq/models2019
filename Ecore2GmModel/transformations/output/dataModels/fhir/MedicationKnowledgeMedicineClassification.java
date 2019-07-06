/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgeMedicineClassification of the Data Model fhir.
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
{@link classification}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getClassification},
{@link setType},
{@link setClassification},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgeMedicineClassification extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgeMedicineClassification> T = EntityTypes.T(MedicationKnowledgeMedicineClassification.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String classification = "classification";

	@Description("The type of category for the medication (for example, therapeutic classification, therapeutic sub-classification).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Specific category assigned to the medication (e.g. anti-infective, anti-hypertensive, antibiotic, etc.).")
	
	java.util.List<fhir.CodeableConcept> getClassification();
	void setClassification(java.util.List<fhir.CodeableConcept> classification);

}
