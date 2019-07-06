/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type AdverseEvent of the Data Model fhir.
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
{@link category}, 
{@link event}, 
{@link subject}, 
{@link encounter}, 
{@link resultingCondition}, 
{@link location}, 
{@link seriousness}, 
{@link severity}, 
{@link outcome}, 
{@link recorder}, 
{@link contributor}, 
{@link suspectEntity}, 
{@link subjectMedicalHistory}, 
{@link referenceDocument}, 
{@link study}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCategory},
{@link getEvent},
{@link getSubject},
{@link getEncounter},
{@link getResultingCondition},
{@link getLocation},
{@link getSeriousness},
{@link getSeverity},
{@link getOutcome},
{@link getRecorder},
{@link getContributor},
{@link getSuspectEntity},
{@link getSubjectMedicalHistory},
{@link getReferenceDocument},
{@link getStudy},
{@link setIdentifier},
{@link setCategory},
{@link setEvent},
{@link setSubject},
{@link setEncounter},
{@link setResultingCondition},
{@link setLocation},
{@link setSeriousness},
{@link setSeverity},
{@link setOutcome},
{@link setRecorder},
{@link setContributor},
{@link setSuspectEntity},
{@link setSubjectMedicalHistory},
{@link setReferenceDocument},
{@link setStudy},
 */

@Description("Actual or  potential/avoided event causing unintended physical injury resulting from or contributed to by medical care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or hospitalization, or that results in death.If the element is present, it must have either a @value, an @id, or extensions")

public interface AdverseEvent extends GenericEntity, fhir.FhirDomainResource {

	EntityType<AdverseEvent> T = EntityTypes.T(AdverseEvent.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String category = "category";
	java.lang.String event = "event";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String resultingCondition = "resultingCondition";
	java.lang.String location = "location";
	java.lang.String seriousness = "seriousness";
	java.lang.String severity = "severity";
	java.lang.String outcome = "outcome";
	java.lang.String recorder = "recorder";
	java.lang.String contributor = "contributor";
	java.lang.String suspectEntity = "suspectEntity";
	java.lang.String subjectMedicalHistory = "subjectMedicalHistory";
	java.lang.String referenceDocument = "referenceDocument";
	java.lang.String study = "study";

	@Description("Business identifiers assigned to this adverse event by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("The overall type of event, intended for search and filtering purposes.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("This element defines the specific type of event that occurred or that was prevented from occurring.")
	@Mandatory
	fhir.CodeableConcept getEvent();
	void setEvent(fhir.CodeableConcept event);
	@Description("This subject or group impacted by the event.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The Encounter during which AdverseEvent was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Includes information about the reaction that occurred as a result of exposure to a substance (for example, a drug or a chemical).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getResultingCondition();
	void setResultingCondition(java.util.List<com.braintribe.model.generic.GenericEntity> resultingCondition);

	@Description("The information about where the adverse event occurred.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("Assessment whether this event was of real importance.")
	@Mandatory
	fhir.CodeableConcept getSeriousness();
	void setSeriousness(fhir.CodeableConcept seriousness);
	@Description("Describes the severity of the adverse event, in relation to the subject. Contrast to AdverseEvent.seriousness - a severe rash might not be serious, but a mild heart problem is.")
	@Mandatory
	fhir.CodeableConcept getSeverity();
	void setSeverity(fhir.CodeableConcept severity);
	@Description("Describes the type of outcome from the adverse event.")
	@Mandatory
	fhir.CodeableConcept getOutcome();
	void setOutcome(fhir.CodeableConcept outcome);
	@Description("Information on who recorded the adverse event.  May be the patient or a practitioner.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRecorder();
	void setRecorder(com.braintribe.model.generic.GenericEntity recorder);
	@Description("Parties that may or should contribute or have contributed information to the adverse event, which can consist of one or more activities.  Such information includes information leading to the decision to perform the activity and how to perform the activity (e.g. consultant), information that the activity itself seeks to reveal (e.g. informant of clinical history), or information about what activity was performed (e.g. informant witness).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getContributor();
	void setContributor(java.util.List<com.braintribe.model.generic.GenericEntity> contributor);

	@Description("Describes the entity that is suspected to have caused the adverse event.")
	
	java.util.List<fhir.AdverseEventSuspectEntity> getSuspectEntity();
	void setSuspectEntity(java.util.List<fhir.AdverseEventSuspectEntity> suspectEntity);

	@Description("AdverseEvent.subjectMedicalHistory.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSubjectMedicalHistory();
	void setSubjectMedicalHistory(java.util.List<com.braintribe.model.generic.GenericEntity> subjectMedicalHistory);

	@Description("AdverseEvent.referenceDocument.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReferenceDocument();
	void setReferenceDocument(java.util.List<com.braintribe.model.generic.GenericEntity> referenceDocument);

	@Description("AdverseEvent.study.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getStudy();
	void setStudy(java.util.List<com.braintribe.model.generic.GenericEntity> study);

}
