/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationRequestSubstitution of the Data Model fhir.
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
{@link allowedCodeableConcept}, 
{@link reason}, 

* It provides of then following operations (getters and setters)
{@link getAllowedCodeableConcept},
{@link getReason},
{@link setAllowedCodeableConcept},
{@link setReason},
 */

@Description("An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called 'MedicationRequest' rather than 'MedicationPrescription' or 'MedicationOrder' to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.")

public interface MedicationRequestSubstitution extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationRequestSubstitution> T = EntityTypes.T(MedicationRequestSubstitution.class);

	/* Constants for each property name. */
	java.lang.String allowedCodeableConcept = "allowedCodeableConcept";
	java.lang.String reason = "reason";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getAllowedCodeableConcept();
	void setAllowedCodeableConcept(fhir.CodeableConcept allowedCodeableConcept);
	@Description("Indicates the reason for the substitution, or why substitution must or must not be performed.")
	@Mandatory
	fhir.CodeableConcept getReason();
	void setReason(fhir.CodeableConcept reason);
}
