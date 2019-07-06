/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Condition of the Data Model fhir.
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
{@link clinicalStatus}, 
{@link verificationStatus}, 
{@link category}, 
{@link severity}, 
{@link code}, 
{@link bodySite}, 
{@link subject}, 
{@link encounter}, 
{@link onsetAge}, 
{@link onsetPeriod}, 
{@link onsetRange}, 
{@link abatementAge}, 
{@link abatementPeriod}, 
{@link abatementRange}, 
{@link recorder}, 
{@link asserter}, 
{@link stage}, 
{@link evidence}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getClinicalStatus},
{@link getVerificationStatus},
{@link getCategory},
{@link getSeverity},
{@link getCode},
{@link getBodySite},
{@link getSubject},
{@link getEncounter},
{@link getOnsetAge},
{@link getOnsetPeriod},
{@link getOnsetRange},
{@link getAbatementAge},
{@link getAbatementPeriod},
{@link getAbatementRange},
{@link getRecorder},
{@link getAsserter},
{@link getStage},
{@link getEvidence},
{@link getNote},
{@link setIdentifier},
{@link setClinicalStatus},
{@link setVerificationStatus},
{@link setCategory},
{@link setSeverity},
{@link setCode},
{@link setBodySite},
{@link setSubject},
{@link setEncounter},
{@link setOnsetAge},
{@link setOnsetPeriod},
{@link setOnsetRange},
{@link setAbatementAge},
{@link setAbatementPeriod},
{@link setAbatementRange},
{@link setRecorder},
{@link setAsserter},
{@link setStage},
{@link setEvidence},
{@link setNote},
 */

@Description("A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.If the element is present, it must have either a @value, an @id, or extensions")

public interface Condition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Condition> T = EntityTypes.T(Condition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String clinicalStatus = "clinicalStatus";
	java.lang.String verificationStatus = "verificationStatus";
	java.lang.String category = "category";
	java.lang.String severity = "severity";
	java.lang.String code = "code";
	java.lang.String bodySite = "bodySite";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String onsetAge = "onsetAge";
	java.lang.String onsetPeriod = "onsetPeriod";
	java.lang.String onsetRange = "onsetRange";
	java.lang.String abatementAge = "abatementAge";
	java.lang.String abatementPeriod = "abatementPeriod";
	java.lang.String abatementRange = "abatementRange";
	java.lang.String recorder = "recorder";
	java.lang.String asserter = "asserter";
	java.lang.String stage = "stage";
	java.lang.String evidence = "evidence";
	java.lang.String note = "note";

	@Description("Business identifiers assigned to this condition by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The clinical status of the condition.")
	@Mandatory
	fhir.CodeableConcept getClinicalStatus();
	void setClinicalStatus(fhir.CodeableConcept clinicalStatus);
	@Description("The verification status to support the clinical status of the condition.")
	@Mandatory
	fhir.CodeableConcept getVerificationStatus();
	void setVerificationStatus(fhir.CodeableConcept verificationStatus);
	@Description("A category assigned to the condition.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("A subjective assessment of the severity of the condition as evaluated by the clinician.")
	@Mandatory
	fhir.CodeableConcept getSeverity();
	void setSeverity(fhir.CodeableConcept severity);
	@Description("Identification of the condition, problem or diagnosis.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The anatomical location where this condition manifests itself.")
	
	java.util.List<fhir.CodeableConcept> getBodySite();
	void setBodySite(java.util.List<fhir.CodeableConcept> bodySite);

	@Description("Indicates the patient or group who the condition record is associated with.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The Encounter during which this Condition was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Age getOnsetAge();
	void setOnsetAge(fhir.Age onsetAge);
	@Description("")
	@Mandatory
	fhir.Period getOnsetPeriod();
	void setOnsetPeriod(fhir.Period onsetPeriod);
	@Description("")
	@Mandatory
	fhir.Range getOnsetRange();
	void setOnsetRange(fhir.Range onsetRange);
	@Description("")
	@Mandatory
	fhir.Age getAbatementAge();
	void setAbatementAge(fhir.Age abatementAge);
	@Description("")
	@Mandatory
	fhir.Period getAbatementPeriod();
	void setAbatementPeriod(fhir.Period abatementPeriod);
	@Description("")
	@Mandatory
	fhir.Range getAbatementRange();
	void setAbatementRange(fhir.Range abatementRange);
	@Description("Individual who recorded the record and takes responsibility for its content.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRecorder();
	void setRecorder(com.braintribe.model.generic.GenericEntity recorder);
	@Description("Individual who is making the condition statement.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAsserter();
	void setAsserter(com.braintribe.model.generic.GenericEntity asserter);
	@Description("Clinical stage or grade of a condition. May include formal severity assessments.")
	
	java.util.List<fhir.ConditionStage> getStage();
	void setStage(java.util.List<fhir.ConditionStage> stage);

	@Description("Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.")
	
	java.util.List<fhir.ConditionEvidence> getEvidence();
	void setEvidence(java.util.List<fhir.ConditionEvidence> evidence);

	@Description("Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
