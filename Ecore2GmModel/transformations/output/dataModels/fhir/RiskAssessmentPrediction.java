/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RiskAssessmentPrediction of the Data Model fhir.
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
{@link outcome}, 
{@link probabilityRange}, 
{@link qualitativeRisk}, 
{@link whenPeriod}, 
{@link whenRange}, 

* It provides of then following operations (getters and setters)
{@link getOutcome},
{@link getProbabilityRange},
{@link getQualitativeRisk},
{@link getWhenPeriod},
{@link getWhenRange},
{@link setOutcome},
{@link setProbabilityRange},
{@link setQualitativeRisk},
{@link setWhenPeriod},
{@link setWhenRange},
 */

@Description("An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.")

public interface RiskAssessmentPrediction extends GenericEntity, fhir.BackboneElement {

	EntityType<RiskAssessmentPrediction> T = EntityTypes.T(RiskAssessmentPrediction.class);

	/* Constants for each property name. */
	java.lang.String outcome = "outcome";
	java.lang.String probabilityRange = "probabilityRange";
	java.lang.String qualitativeRisk = "qualitativeRisk";
	java.lang.String whenPeriod = "whenPeriod";
	java.lang.String whenRange = "whenRange";

	@Description("One of the potential outcomes for the patient (e.g. remission, death,  a particular condition).")
	@Mandatory
	fhir.CodeableConcept getOutcome();
	void setOutcome(fhir.CodeableConcept outcome);
	@Description("")
	@Mandatory
	fhir.Range getProbabilityRange();
	void setProbabilityRange(fhir.Range probabilityRange);
	@Description("Indicates how likely the outcome is (in the specified timeframe), expressed as a qualitative value (e.g. low, medium, or high).")
	@Mandatory
	fhir.CodeableConcept getQualitativeRisk();
	void setQualitativeRisk(fhir.CodeableConcept qualitativeRisk);
	@Description("")
	@Mandatory
	fhir.Period getWhenPeriod();
	void setWhenPeriod(fhir.Period whenPeriod);
	@Description("")
	@Mandatory
	fhir.Range getWhenRange();
	void setWhenRange(fhir.Range whenRange);
}
