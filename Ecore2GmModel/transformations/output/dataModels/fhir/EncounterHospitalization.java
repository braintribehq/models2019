/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EncounterHospitalization of the Data Model fhir.
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
{@link preAdmissionIdentifier}, 
{@link origin}, 
{@link admitSource}, 
{@link reAdmission}, 
{@link dietPreference}, 
{@link specialCourtesy}, 
{@link specialArrangement}, 
{@link destination}, 
{@link dischargeDisposition}, 

* It provides of then following operations (getters and setters)
{@link getPreAdmissionIdentifier},
{@link getOrigin},
{@link getAdmitSource},
{@link getReAdmission},
{@link getDietPreference},
{@link getSpecialCourtesy},
{@link getSpecialArrangement},
{@link getDestination},
{@link getDischargeDisposition},
{@link setPreAdmissionIdentifier},
{@link setOrigin},
{@link setAdmitSource},
{@link setReAdmission},
{@link setDietPreference},
{@link setSpecialCourtesy},
{@link setSpecialArrangement},
{@link setDestination},
{@link setDischargeDisposition},
 */

@Description("An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.")

public interface EncounterHospitalization extends GenericEntity, fhir.BackboneElement {

	EntityType<EncounterHospitalization> T = EntityTypes.T(EncounterHospitalization.class);

	/* Constants for each property name. */
	java.lang.String preAdmissionIdentifier = "preAdmissionIdentifier";
	java.lang.String origin = "origin";
	java.lang.String admitSource = "admitSource";
	java.lang.String reAdmission = "reAdmission";
	java.lang.String dietPreference = "dietPreference";
	java.lang.String specialCourtesy = "specialCourtesy";
	java.lang.String specialArrangement = "specialArrangement";
	java.lang.String destination = "destination";
	java.lang.String dischargeDisposition = "dischargeDisposition";

	@Description("Pre-admission identifier.")
	@Mandatory
	fhir.Identifier getPreAdmissionIdentifier();
	void setPreAdmissionIdentifier(fhir.Identifier preAdmissionIdentifier);
	@Description("The location/organization from which the patient came before admission.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOrigin();
	void setOrigin(com.braintribe.model.generic.GenericEntity origin);
	@Description("From where patient was admitted (physician referral, transfer).")
	@Mandatory
	fhir.CodeableConcept getAdmitSource();
	void setAdmitSource(fhir.CodeableConcept admitSource);
	@Description("Whether this hospitalization is a readmission and why if known.")
	@Mandatory
	fhir.CodeableConcept getReAdmission();
	void setReAdmission(fhir.CodeableConcept reAdmission);
	@Description("Diet preferences reported by the patient.")
	
	java.util.List<fhir.CodeableConcept> getDietPreference();
	void setDietPreference(java.util.List<fhir.CodeableConcept> dietPreference);

	@Description("Special courtesies (VIP, board member).")
	
	java.util.List<fhir.CodeableConcept> getSpecialCourtesy();
	void setSpecialCourtesy(java.util.List<fhir.CodeableConcept> specialCourtesy);

	@Description("Any special requests that have been made for this hospitalization encounter, such as the provision of specific equipment or other things.")
	
	java.util.List<fhir.CodeableConcept> getSpecialArrangement();
	void setSpecialArrangement(java.util.List<fhir.CodeableConcept> specialArrangement);

	@Description("Location/organization to which the patient is discharged.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDestination();
	void setDestination(com.braintribe.model.generic.GenericEntity destination);
	@Description("Category or kind of location after discharge.")
	@Mandatory
	fhir.CodeableConcept getDischargeDisposition();
	void setDischargeDisposition(fhir.CodeableConcept dischargeDisposition);
}
