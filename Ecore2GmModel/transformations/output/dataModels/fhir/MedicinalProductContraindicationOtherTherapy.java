/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductContraindicationOtherTherapy of the Data Model fhir.
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
{@link therapyRelationshipType}, 
{@link medicationCodeableConcept}, 
{@link medicationReference}, 

* It provides of then following operations (getters and setters)
{@link getTherapyRelationshipType},
{@link getMedicationCodeableConcept},
{@link getMedicationReference},
{@link setTherapyRelationshipType},
{@link setMedicationCodeableConcept},
{@link setMedicationReference},
 */

@Description("The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory purposes.")

public interface MedicinalProductContraindicationOtherTherapy extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductContraindicationOtherTherapy> T = EntityTypes.T(MedicinalProductContraindicationOtherTherapy.class);

	/* Constants for each property name. */
	java.lang.String therapyRelationshipType = "therapyRelationshipType";
	java.lang.String medicationCodeableConcept = "medicationCodeableConcept";
	java.lang.String medicationReference = "medicationReference";

	@Description("The type of relationship between the medicinal product indication or contraindication and another therapy.")
	@Mandatory
	fhir.CodeableConcept getTherapyRelationshipType();
	void setTherapyRelationshipType(fhir.CodeableConcept therapyRelationshipType);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getMedicationCodeableConcept();
	void setMedicationCodeableConcept(fhir.CodeableConcept medicationCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getMedicationReference();
	void setMedicationReference(com.braintribe.model.generic.GenericEntity medicationReference);
}
