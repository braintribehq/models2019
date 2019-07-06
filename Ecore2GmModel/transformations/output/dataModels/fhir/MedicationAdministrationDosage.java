/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationAdministrationDosage of the Data Model fhir.
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
{@link site}, 
{@link route}, 
{@link method}, 
{@link dose}, 
{@link rateRatio}, 
{@link rateQuantity}, 

* It provides of then following operations (getters and setters)
{@link getSite},
{@link getRoute},
{@link getMethod},
{@link getDose},
{@link getRateRatio},
{@link getRateQuantity},
{@link setSite},
{@link setRoute},
{@link setMethod},
{@link setDose},
{@link setRateRatio},
{@link setRateQuantity},
 */

@Description("Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.")

public interface MedicationAdministrationDosage extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationAdministrationDosage> T = EntityTypes.T(MedicationAdministrationDosage.class);

	/* Constants for each property name. */
	java.lang.String site = "site";
	java.lang.String route = "route";
	java.lang.String method = "method";
	java.lang.String dose = "dose";
	java.lang.String rateRatio = "rateRatio";
	java.lang.String rateQuantity = "rateQuantity";

	@Description("A coded specification of the anatomic site where the medication first entered the body.  For example, 'left arm'.")
	@Mandatory
	fhir.CodeableConcept getSite();
	void setSite(fhir.CodeableConcept site);
	@Description("A code specifying the route or physiological path of administration of a therapeutic agent into or onto the patient.  For example, topical, intravenous, etc.")
	@Mandatory
	fhir.CodeableConcept getRoute();
	void setRoute(fhir.CodeableConcept route);
	@Description("A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
	@Description("The amount of the medication given at one administration event.   Use this value when the administration is essentially an instantaneous event such as a swallowing a tablet or giving an injection.")
	@Mandatory
	fhir.Quantity getDose();
	void setDose(fhir.Quantity dose);
	@Description("")
	@Mandatory
	fhir.Ratio getRateRatio();
	void setRateRatio(fhir.Ratio rateRatio);
	@Description("")
	@Mandatory
	fhir.Quantity getRateQuantity();
	void setRateQuantity(fhir.Quantity rateQuantity);
}
