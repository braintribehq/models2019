/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationRequestInitialFill of the Data Model fhir.
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
{@link quantity}, 
{@link duration}, 

* It provides of then following operations (getters and setters)
{@link getQuantity},
{@link getDuration},
{@link setQuantity},
{@link setDuration},
 */

@Description("An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called 'MedicationRequest' rather than 'MedicationPrescription' or 'MedicationOrder' to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.")

public interface MedicationRequestInitialFill extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationRequestInitialFill> T = EntityTypes.T(MedicationRequestInitialFill.class);

	/* Constants for each property name. */
	java.lang.String quantity = "quantity";
	java.lang.String duration = "duration";

	@Description("The amount or quantity to provide as part of the first dispense.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("The length of time that the first dispense is expected to last.")
	@Mandatory
	fhir.Duration getDuration();
	void setDuration(fhir.Duration duration);
}
