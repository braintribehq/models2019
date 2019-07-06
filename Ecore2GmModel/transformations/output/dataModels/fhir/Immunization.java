/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Immunization of the Data Model fhir.
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
{@link statusReason}, 
{@link vaccineCode}, 
{@link patient}, 
{@link encounter}, 
{@link reportOrigin}, 
{@link location}, 
{@link manufacturer}, 
{@link site}, 
{@link route}, 
{@link doseQuantity}, 
{@link performer}, 
{@link note}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link subpotentReason}, 
{@link education}, 
{@link programEligibility}, 
{@link fundingSource}, 
{@link reaction}, 
{@link protocolApplied}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getStatusReason},
{@link getVaccineCode},
{@link getPatient},
{@link getEncounter},
{@link getReportOrigin},
{@link getLocation},
{@link getManufacturer},
{@link getSite},
{@link getRoute},
{@link getDoseQuantity},
{@link getPerformer},
{@link getNote},
{@link getReasonCode},
{@link getReasonReference},
{@link getSubpotentReason},
{@link getEducation},
{@link getProgramEligibility},
{@link getFundingSource},
{@link getReaction},
{@link getProtocolApplied},
{@link setIdentifier},
{@link setStatusReason},
{@link setVaccineCode},
{@link setPatient},
{@link setEncounter},
{@link setReportOrigin},
{@link setLocation},
{@link setManufacturer},
{@link setSite},
{@link setRoute},
{@link setDoseQuantity},
{@link setPerformer},
{@link setNote},
{@link setReasonCode},
{@link setReasonReference},
{@link setSubpotentReason},
{@link setEducation},
{@link setProgramEligibility},
{@link setFundingSource},
{@link setReaction},
{@link setProtocolApplied},
 */

@Description("Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.If the element is present, it must have either a @value, an @id, or extensions")

public interface Immunization extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Immunization> T = EntityTypes.T(Immunization.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String statusReason = "statusReason";
	java.lang.String vaccineCode = "vaccineCode";
	java.lang.String patient = "patient";
	java.lang.String encounter = "encounter";
	java.lang.String reportOrigin = "reportOrigin";
	java.lang.String location = "location";
	java.lang.String manufacturer = "manufacturer";
	java.lang.String site = "site";
	java.lang.String route = "route";
	java.lang.String doseQuantity = "doseQuantity";
	java.lang.String performer = "performer";
	java.lang.String note = "note";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String subpotentReason = "subpotentReason";
	java.lang.String education = "education";
	java.lang.String programEligibility = "programEligibility";
	java.lang.String fundingSource = "fundingSource";
	java.lang.String reaction = "reaction";
	java.lang.String protocolApplied = "protocolApplied";

	@Description("A unique identifier assigned to this immunization record.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Indicates the reason the immunization event was not performed.")
	@Mandatory
	fhir.CodeableConcept getStatusReason();
	void setStatusReason(fhir.CodeableConcept statusReason);
	@Description("Vaccine that was administered or was to be administered.")
	@Mandatory
	fhir.CodeableConcept getVaccineCode();
	void setVaccineCode(fhir.CodeableConcept vaccineCode);
	@Description("The patient who either received or did not receive the immunization.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("The visit or admission or other contact between patient and health care provider the immunization was performed as part of.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("The source of the data when the report of the immunization event is not based on information from the person who administered the vaccine.")
	@Mandatory
	fhir.CodeableConcept getReportOrigin();
	void setReportOrigin(fhir.CodeableConcept reportOrigin);
	@Description("The service delivery location where the vaccine administration occurred.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("Name of vaccine manufacturer.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManufacturer();
	void setManufacturer(com.braintribe.model.generic.GenericEntity manufacturer);
	@Description("Body site where vaccine was administered.")
	@Mandatory
	fhir.CodeableConcept getSite();
	void setSite(fhir.CodeableConcept site);
	@Description("The path by which the vaccine product is taken into the body.")
	@Mandatory
	fhir.CodeableConcept getRoute();
	void setRoute(fhir.CodeableConcept route);
	@Description("The quantity of vaccine product that was administered.")
	@Mandatory
	fhir.Quantity getDoseQuantity();
	void setDoseQuantity(fhir.Quantity doseQuantity);
	@Description("Indicates who performed the immunization event.")
	
	java.util.List<fhir.ImmunizationPerformer> getPerformer();
	void setPerformer(java.util.List<fhir.ImmunizationPerformer> performer);

	@Description("Extra information about the immunization that is not conveyed by the other attributes.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Reasons why the vaccine was administered.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Condition, Observation or DiagnosticReport that supports why the immunization was administered.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Reason why a dose is considered to be subpotent.")
	
	java.util.List<fhir.CodeableConcept> getSubpotentReason();
	void setSubpotentReason(java.util.List<fhir.CodeableConcept> subpotentReason);

	@Description("Educational material presented to the patient (or guardian) at the time of vaccine administration.")
	
	java.util.List<fhir.ImmunizationEducation> getEducation();
	void setEducation(java.util.List<fhir.ImmunizationEducation> education);

	@Description("Indicates a patient's eligibility for a funding program.")
	
	java.util.List<fhir.CodeableConcept> getProgramEligibility();
	void setProgramEligibility(java.util.List<fhir.CodeableConcept> programEligibility);

	@Description("Indicates the source of the vaccine actually administered. This may be different than the patient eligibility (e.g. the patient may be eligible for a publically purchased vaccine but due to inventory issues, vaccine purchased with private funds was actually administered).")
	@Mandatory
	fhir.CodeableConcept getFundingSource();
	void setFundingSource(fhir.CodeableConcept fundingSource);
	@Description("Categorical data indicating that an adverse event is associated in time to an immunization.")
	
	java.util.List<fhir.ImmunizationReaction> getReaction();
	void setReaction(java.util.List<fhir.ImmunizationReaction> reaction);

	@Description("The protocol (set of recommendations) being followed by the provider who administered the dose.")
	
	java.util.List<fhir.ImmunizationProtocolApplied> getProtocolApplied();
	void setProtocolApplied(java.util.List<fhir.ImmunizationProtocolApplied> protocolApplied);

}
