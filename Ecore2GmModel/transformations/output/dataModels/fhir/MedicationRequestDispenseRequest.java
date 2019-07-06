/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationRequestDispenseRequest of the Data Model fhir.
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
{@link initialFill}, 
{@link dispenseInterval}, 
{@link validityPeriod}, 
{@link quantity}, 
{@link expectedSupplyDuration}, 
{@link performer}, 

* It provides of then following operations (getters and setters)
{@link getInitialFill},
{@link getDispenseInterval},
{@link getValidityPeriod},
{@link getQuantity},
{@link getExpectedSupplyDuration},
{@link getPerformer},
{@link setInitialFill},
{@link setDispenseInterval},
{@link setValidityPeriod},
{@link setQuantity},
{@link setExpectedSupplyDuration},
{@link setPerformer},
 */

@Description("An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called 'MedicationRequest' rather than 'MedicationPrescription' or 'MedicationOrder' to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.")

public interface MedicationRequestDispenseRequest extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationRequestDispenseRequest> T = EntityTypes.T(MedicationRequestDispenseRequest.class);

	/* Constants for each property name. */
	java.lang.String initialFill = "initialFill";
	java.lang.String dispenseInterval = "dispenseInterval";
	java.lang.String validityPeriod = "validityPeriod";
	java.lang.String quantity = "quantity";
	java.lang.String expectedSupplyDuration = "expectedSupplyDuration";
	java.lang.String performer = "performer";

	@Description("Indicates the quantity or duration for the first dispense of the medication.")
	@Mandatory
	fhir.MedicationRequestInitialFill getInitialFill();
	void setInitialFill(fhir.MedicationRequestInitialFill initialFill);
	@Description("The minimum period of time that must occur between dispenses of the medication.")
	@Mandatory
	fhir.Duration getDispenseInterval();
	void setDispenseInterval(fhir.Duration dispenseInterval);
	@Description("This indicates the validity period of a prescription (stale dating the Prescription).")
	@Mandatory
	fhir.Period getValidityPeriod();
	void setValidityPeriod(fhir.Period validityPeriod);
	@Description("The amount that is to be dispensed for one fill.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.")
	@Mandatory
	fhir.Duration getExpectedSupplyDuration();
	void setExpectedSupplyDuration(fhir.Duration expectedSupplyDuration);
	@Description("Indicates the intended dispensing Organization specified by the prescriber.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPerformer();
	void setPerformer(com.braintribe.model.generic.GenericEntity performer);
}
