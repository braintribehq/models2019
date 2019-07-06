/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImmunizationRecommendationRecommendation of the Data Model fhir.
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
{@link vaccineCode}, 
{@link targetDisease}, 
{@link contraindicatedVaccineCode}, 
{@link forecastStatus}, 
{@link forecastReason}, 
{@link dateCriterion}, 
{@link supportingImmunization}, 
{@link supportingPatientInformation}, 

* It provides of then following operations (getters and setters)
{@link getVaccineCode},
{@link getTargetDisease},
{@link getContraindicatedVaccineCode},
{@link getForecastStatus},
{@link getForecastReason},
{@link getDateCriterion},
{@link getSupportingImmunization},
{@link getSupportingPatientInformation},
{@link setVaccineCode},
{@link setTargetDisease},
{@link setContraindicatedVaccineCode},
{@link setForecastStatus},
{@link setForecastReason},
{@link setDateCriterion},
{@link setSupportingImmunization},
{@link setSupportingPatientInformation},
 */

@Description("A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.")

public interface ImmunizationRecommendationRecommendation extends GenericEntity, fhir.BackboneElement {

	EntityType<ImmunizationRecommendationRecommendation> T = EntityTypes.T(ImmunizationRecommendationRecommendation.class);

	/* Constants for each property name. */
	java.lang.String vaccineCode = "vaccineCode";
	java.lang.String targetDisease = "targetDisease";
	java.lang.String contraindicatedVaccineCode = "contraindicatedVaccineCode";
	java.lang.String forecastStatus = "forecastStatus";
	java.lang.String forecastReason = "forecastReason";
	java.lang.String dateCriterion = "dateCriterion";
	java.lang.String supportingImmunization = "supportingImmunization";
	java.lang.String supportingPatientInformation = "supportingPatientInformation";

	@Description("Vaccine(s) or vaccine group that pertain to the recommendation.")
	
	java.util.List<fhir.CodeableConcept> getVaccineCode();
	void setVaccineCode(java.util.List<fhir.CodeableConcept> vaccineCode);

	@Description("The targeted disease for the recommendation.")
	@Mandatory
	fhir.CodeableConcept getTargetDisease();
	void setTargetDisease(fhir.CodeableConcept targetDisease);
	@Description("Vaccine(s) which should not be used to fulfill the recommendation.")
	
	java.util.List<fhir.CodeableConcept> getContraindicatedVaccineCode();
	void setContraindicatedVaccineCode(java.util.List<fhir.CodeableConcept> contraindicatedVaccineCode);

	@Description("Indicates the patient status with respect to the path to immunity for the target disease.")
	@Mandatory
	fhir.CodeableConcept getForecastStatus();
	void setForecastStatus(fhir.CodeableConcept forecastStatus);
	@Description("The reason for the assigned forecast status.")
	
	java.util.List<fhir.CodeableConcept> getForecastReason();
	void setForecastReason(java.util.List<fhir.CodeableConcept> forecastReason);

	@Description("Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.")
	
	java.util.List<fhir.ImmunizationRecommendationDateCriterion> getDateCriterion();
	void setDateCriterion(java.util.List<fhir.ImmunizationRecommendationDateCriterion> dateCriterion);

	@Description("Immunization event history and/or evaluation that supports the status and recommendation.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingImmunization();
	void setSupportingImmunization(java.util.List<com.braintribe.model.generic.GenericEntity> supportingImmunization);

	@Description("Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingPatientInformation();
	void setSupportingPatientInformation(java.util.List<com.braintribe.model.generic.GenericEntity> supportingPatientInformation);

}
