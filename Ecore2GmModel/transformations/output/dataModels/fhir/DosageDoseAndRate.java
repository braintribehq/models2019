/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DosageDoseAndRate of the Data Model fhir.
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
{@link doseRange}, 
{@link doseQuantity}, 
{@link rateRatio}, 
{@link rateRange}, 
{@link rateQuantity}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getDoseRange},
{@link getDoseQuantity},
{@link getRateRatio},
{@link getRateRange},
{@link getRateQuantity},
{@link setType},
{@link setDoseRange},
{@link setDoseQuantity},
{@link setRateRatio},
{@link setRateRange},
{@link setRateQuantity},
 */

@Description("Indicates how the medication is/was taken or should be taken by the patient.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface DosageDoseAndRate extends GenericEntity, fhir.BackboneElement {

	EntityType<DosageDoseAndRate> T = EntityTypes.T(DosageDoseAndRate.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String doseRange = "doseRange";
	java.lang.String doseQuantity = "doseQuantity";
	java.lang.String rateRatio = "rateRatio";
	java.lang.String rateRange = "rateRange";
	java.lang.String rateQuantity = "rateQuantity";

	@Description("The kind of dose or rate specified, for example, ordered or calculated.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("")
	@Mandatory
	fhir.Range getDoseRange();
	void setDoseRange(fhir.Range doseRange);
	@Description("")
	@Mandatory
	fhir.Quantity getDoseQuantity();
	void setDoseQuantity(fhir.Quantity doseQuantity);
	@Description("")
	@Mandatory
	fhir.Ratio getRateRatio();
	void setRateRatio(fhir.Ratio rateRatio);
	@Description("")
	@Mandatory
	fhir.Range getRateRange();
	void setRateRange(fhir.Range rateRange);
	@Description("")
	@Mandatory
	fhir.Quantity getRateQuantity();
	void setRateQuantity(fhir.Quantity rateQuantity);
}
