/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImmunizationEvaluation of the Data Model fhir.
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
{@link identifier}, 
{@link patient}, 
{@link authority}, 
{@link targetDisease}, 
{@link immunizationEvent}, 
{@link doseStatus}, 
{@link doseStatusReason}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPatient},
{@link getAuthority},
{@link getTargetDisease},
{@link getImmunizationEvent},
{@link getDoseStatus},
{@link getDoseStatusReason},
{@link setIdentifier},
{@link setPatient},
{@link setAuthority},
{@link setTargetDisease},
{@link setImmunizationEvent},
{@link setDoseStatus},
{@link setDoseStatusReason},
 */

@Description("Describes a comparison of an immunization event against published recommendations to determine if the administration is 'valid' in relation to those  recommendations.If the element is present, it must have either a @value, an @id, or extensions")

public interface ImmunizationEvaluation extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ImmunizationEvaluation> T = EntityTypes.T(ImmunizationEvaluation.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String patient = "patient";
	java.lang.String authority = "authority";
	java.lang.String targetDisease = "targetDisease";
	java.lang.String immunizationEvent = "immunizationEvent";
	java.lang.String doseStatus = "doseStatus";
	java.lang.String doseStatusReason = "doseStatusReason";

	@Description("A unique identifier assigned to this immunization evaluation record.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The individual for whom the evaluation is being done.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("Indicates the authority who published the protocol (e.g. ACIP).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthority();
	void setAuthority(com.braintribe.model.generic.GenericEntity authority);
	@Description("The vaccine preventable disease the dose is being evaluated against.")
	@Mandatory
	fhir.CodeableConcept getTargetDisease();
	void setTargetDisease(fhir.CodeableConcept targetDisease);
	@Description("The vaccine administration event being evaluated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getImmunizationEvent();
	void setImmunizationEvent(com.braintribe.model.generic.GenericEntity immunizationEvent);
	@Description("Indicates if the dose is valid or not valid with respect to the published recommendations.")
	@Mandatory
	fhir.CodeableConcept getDoseStatus();
	void setDoseStatus(fhir.CodeableConcept doseStatus);
	@Description("Provides an explanation as to why the vaccine administration event is valid or not relative to the published recommendations.")
	
	java.util.List<fhir.CodeableConcept> getDoseStatusReason();
	void setDoseStatusReason(java.util.List<fhir.CodeableConcept> doseStatusReason);

}
