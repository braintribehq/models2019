/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Procedure of the Data Model fhir.
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
{@link basedOn}, 
{@link partOf}, 
{@link statusReason}, 
{@link category}, 
{@link code}, 
{@link subject}, 
{@link encounter}, 
{@link performedPeriod}, 
{@link performedAge}, 
{@link performedRange}, 
{@link recorder}, 
{@link asserter}, 
{@link performer}, 
{@link location}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link bodySite}, 
{@link outcome}, 
{@link report}, 
{@link complication}, 
{@link complicationDetail}, 
{@link followUp}, 
{@link note}, 
{@link focalDevice}, 
{@link usedReference}, 
{@link usedCode}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getPartOf},
{@link getStatusReason},
{@link getCategory},
{@link getCode},
{@link getSubject},
{@link getEncounter},
{@link getPerformedPeriod},
{@link getPerformedAge},
{@link getPerformedRange},
{@link getRecorder},
{@link getAsserter},
{@link getPerformer},
{@link getLocation},
{@link getReasonCode},
{@link getReasonReference},
{@link getBodySite},
{@link getOutcome},
{@link getReport},
{@link getComplication},
{@link getComplicationDetail},
{@link getFollowUp},
{@link getNote},
{@link getFocalDevice},
{@link getUsedReference},
{@link getUsedCode},
{@link setIdentifier},
{@link setBasedOn},
{@link setPartOf},
{@link setStatusReason},
{@link setCategory},
{@link setCode},
{@link setSubject},
{@link setEncounter},
{@link setPerformedPeriod},
{@link setPerformedAge},
{@link setPerformedRange},
{@link setRecorder},
{@link setAsserter},
{@link setPerformer},
{@link setLocation},
{@link setReasonCode},
{@link setReasonReference},
{@link setBodySite},
{@link setOutcome},
{@link setReport},
{@link setComplication},
{@link setComplicationDetail},
{@link setFollowUp},
{@link setNote},
{@link setFocalDevice},
{@link setUsedReference},
{@link setUsedCode},
 */

@Description("An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or less invasive like long term services, counseling, or hypnotherapy.If the element is present, it must have either a @value, an @id, or extensions")

public interface Procedure extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Procedure> T = EntityTypes.T(Procedure.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String partOf = "partOf";
	java.lang.String statusReason = "statusReason";
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String performedPeriod = "performedPeriod";
	java.lang.String performedAge = "performedAge";
	java.lang.String performedRange = "performedRange";
	java.lang.String recorder = "recorder";
	java.lang.String asserter = "asserter";
	java.lang.String performer = "performer";
	java.lang.String location = "location";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String bodySite = "bodySite";
	java.lang.String outcome = "outcome";
	java.lang.String report = "report";
	java.lang.String complication = "complication";
	java.lang.String complicationDetail = "complicationDetail";
	java.lang.String followUp = "followUp";
	java.lang.String note = "note";
	java.lang.String focalDevice = "focalDevice";
	java.lang.String usedReference = "usedReference";
	java.lang.String usedCode = "usedCode";

	@Description("Business identifiers assigned to this procedure by the performer or other systems which remain constant as the resource is updated and is propagated from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A reference to a resource that contains details of the request for this procedure.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("A larger event of which this particular procedure is a component or step.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("Captures the reason for the current state of the procedure.")
	@Mandatory
	fhir.CodeableConcept getStatusReason();
	void setStatusReason(fhir.CodeableConcept statusReason);
	@Description("A code that classifies the procedure for searching, sorting and display purposes (e.g. 'Surgical Procedure').")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. 'Laparoscopic Appendectomy').")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The person, animal or group on which the procedure was performed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The Encounter during which this Procedure was created or performed or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Period getPerformedPeriod();
	void setPerformedPeriod(fhir.Period performedPeriod);
	@Description("")
	@Mandatory
	fhir.Age getPerformedAge();
	void setPerformedAge(fhir.Age performedAge);
	@Description("")
	@Mandatory
	fhir.Range getPerformedRange();
	void setPerformedRange(fhir.Range performedRange);
	@Description("Individual who recorded the record and takes responsibility for its content.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRecorder();
	void setRecorder(com.braintribe.model.generic.GenericEntity recorder);
	@Description("Individual who is making the procedure statement.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAsserter();
	void setAsserter(com.braintribe.model.generic.GenericEntity asserter);
	@Description("Limited to 'real' people rather than equipment.")
	
	java.util.List<fhir.ProcedurePerformer> getPerformer();
	void setPerformer(java.util.List<fhir.ProcedurePerformer> performer);

	@Description("The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("The coded reason why the procedure was performed. This may be a coded entity of some type, or may simply be present as text.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("The justification of why the procedure was performed.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Detailed and structured anatomical location information. Multiple locations are allowed - e.g. multiple punch biopsies of a lesion.")
	
	java.util.List<fhir.CodeableConcept> getBodySite();
	void setBodySite(java.util.List<fhir.CodeableConcept> bodySite);

	@Description("The outcome of the procedure - did it resolve the reasons for the procedure being performed?")
	@Mandatory
	fhir.CodeableConcept getOutcome();
	void setOutcome(fhir.CodeableConcept outcome);
	@Description("This could be a histology result, pathology report, surgical report, etc.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReport();
	void setReport(java.util.List<com.braintribe.model.generic.GenericEntity> report);

	@Description("Any complications that occurred during the procedure, or in the immediate post-performance period. These are generally tracked separately from the notes, which will typically describe the procedure itself rather than any 'post procedure' issues.")
	
	java.util.List<fhir.CodeableConcept> getComplication();
	void setComplication(java.util.List<fhir.CodeableConcept> complication);

	@Description("Any complications that occurred during the procedure, or in the immediate post-performance period.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getComplicationDetail();
	void setComplicationDetail(java.util.List<com.braintribe.model.generic.GenericEntity> complicationDetail);

	@Description("If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note or could potentially be more complex, in which case the CarePlan resource can be used.")
	
	java.util.List<fhir.CodeableConcept> getFollowUp();
	void setFollowUp(java.util.List<fhir.CodeableConcept> followUp);

	@Description("Any other notes and comments about the procedure.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.")
	
	java.util.List<fhir.ProcedureFocalDevice> getFocalDevice();
	void setFocalDevice(java.util.List<fhir.ProcedureFocalDevice> focalDevice);

	@Description("Identifies medications, devices and any other substance used as part of the procedure.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getUsedReference();
	void setUsedReference(java.util.List<com.braintribe.model.generic.GenericEntity> usedReference);

	@Description("Identifies coded items that were used as part of the procedure.")
	
	java.util.List<fhir.CodeableConcept> getUsedCode();
	void setUsedCode(java.util.List<fhir.CodeableConcept> usedCode);

}
