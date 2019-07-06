/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClinicalImpressionFinding of the Data Model fhir.
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
{@link itemCodeableConcept}, 
{@link itemReference}, 

* It provides of then following operations (getters and setters)
{@link getItemCodeableConcept},
{@link getItemReference},
{@link setItemCodeableConcept},
{@link setItemReference},
 */

@Description("A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called 'ClinicalImpression' rather than 'ClinicalAssessment' to avoid confusion with the recording of assessment tools such as Apgar score.")

public interface ClinicalImpressionFinding extends GenericEntity, fhir.BackboneElement {

	EntityType<ClinicalImpressionFinding> T = EntityTypes.T(ClinicalImpressionFinding.class);

	/* Constants for each property name. */
	java.lang.String itemCodeableConcept = "itemCodeableConcept";
	java.lang.String itemReference = "itemReference";

	@Description("Specific text or code for finding or diagnosis, which may include ruled-out or resolved conditions.")
	@Mandatory
	fhir.CodeableConcept getItemCodeableConcept();
	void setItemCodeableConcept(fhir.CodeableConcept itemCodeableConcept);
	@Description("Specific reference for finding or diagnosis, which may include ruled-out or resolved conditions.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getItemReference();
	void setItemReference(com.braintribe.model.generic.GenericEntity itemReference);
}
