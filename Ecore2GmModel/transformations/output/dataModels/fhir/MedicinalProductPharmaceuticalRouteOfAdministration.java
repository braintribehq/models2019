/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductPharmaceuticalRouteOfAdministration of the Data Model fhir.
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
{@link code}, 
{@link firstDose}, 
{@link maxSingleDose}, 
{@link maxDosePerDay}, 
{@link maxDosePerTreatmentPeriod}, 
{@link maxTreatmentPeriod}, 
{@link targetSpecies}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getFirstDose},
{@link getMaxSingleDose},
{@link getMaxDosePerDay},
{@link getMaxDosePerTreatmentPeriod},
{@link getMaxTreatmentPeriod},
{@link getTargetSpecies},
{@link setCode},
{@link setFirstDose},
{@link setMaxSingleDose},
{@link setMaxDosePerDay},
{@link setMaxDosePerTreatmentPeriod},
{@link setMaxTreatmentPeriod},
{@link setTargetSpecies},
 */

@Description("A pharmaceutical product described in terms of its composition and dose form.")

public interface MedicinalProductPharmaceuticalRouteOfAdministration extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductPharmaceuticalRouteOfAdministration> T = EntityTypes.T(MedicinalProductPharmaceuticalRouteOfAdministration.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String firstDose = "firstDose";
	java.lang.String maxSingleDose = "maxSingleDose";
	java.lang.String maxDosePerDay = "maxDosePerDay";
	java.lang.String maxDosePerTreatmentPeriod = "maxDosePerTreatmentPeriod";
	java.lang.String maxTreatmentPeriod = "maxTreatmentPeriod";
	java.lang.String targetSpecies = "targetSpecies";

	@Description("Coded expression for the route.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The first dose (dose quantity) administered in humans can be specified, for a product under investigation, using a numerical value and its unit of measurement.")
	@Mandatory
	fhir.Quantity getFirstDose();
	void setFirstDose(fhir.Quantity firstDose);
	@Description("The maximum single dose that can be administered as per the protocol of a clinical trial can be specified using a numerical value and its unit of measurement.")
	@Mandatory
	fhir.Quantity getMaxSingleDose();
	void setMaxSingleDose(fhir.Quantity maxSingleDose);
	@Description("The maximum dose per day (maximum dose quantity to be administered in any one 24-h period) that can be administered as per the protocol referenced in the clinical trial authorisation.")
	@Mandatory
	fhir.Quantity getMaxDosePerDay();
	void setMaxDosePerDay(fhir.Quantity maxDosePerDay);
	@Description("The maximum dose per treatment period that can be administered as per the protocol referenced in the clinical trial authorisation.")
	@Mandatory
	fhir.Ratio getMaxDosePerTreatmentPeriod();
	void setMaxDosePerTreatmentPeriod(fhir.Ratio maxDosePerTreatmentPeriod);
	@Description("The maximum treatment period during which an Investigational Medicinal Product can be administered as per the protocol referenced in the clinical trial authorisation.")
	@Mandatory
	fhir.Duration getMaxTreatmentPeriod();
	void setMaxTreatmentPeriod(fhir.Duration maxTreatmentPeriod);
	@Description("A species for which this route applies.")
	
	java.util.List<fhir.MedicinalProductPharmaceuticalTargetSpecies> getTargetSpecies();
	void setTargetSpecies(java.util.List<fhir.MedicinalProductPharmaceuticalTargetSpecies> targetSpecies);

}
