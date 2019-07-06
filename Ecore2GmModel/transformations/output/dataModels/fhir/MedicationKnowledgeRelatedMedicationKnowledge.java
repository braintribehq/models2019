/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgeRelatedMedicationKnowledge of the Data Model fhir.
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
{@link reference}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getReference},
{@link setType},
{@link setReference},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgeRelatedMedicationKnowledge extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgeRelatedMedicationKnowledge> T = EntityTypes.T(MedicationKnowledgeRelatedMedicationKnowledge.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String reference = "reference";

	@Description("The category of the associated medication knowledge reference.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Associated documentation about the associated medication knowledge.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReference();
	void setReference(java.util.List<com.braintribe.model.generic.GenericEntity> reference);

}
