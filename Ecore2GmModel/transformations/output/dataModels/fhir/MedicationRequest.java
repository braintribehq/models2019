/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationRequest of the Data Model fhir.
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
{@link category}, 
{@link reportedReference}, 
{@link medicationCodeableConcept}, 
{@link medicationReference}, 
{@link subject}, 
{@link encounter}, 
{@link supportingInformation}, 
{@link requester}, 
{@link performer}, 
{@link performerType}, 
{@link recorder}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link basedOn}, 
{@link groupIdentifier}, 
{@link courseOfTherapyType}, 
{@link insurance}, 
{@link note}, 
{@link dosageInstruction}, 
{@link dispenseRequest}, 
{@link substitution}, 
{@link priorPrescription}, 
{@link detectedIssue}, 
{@link eventHistory}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getStatusReason},
{@link getCategory},
{@link getReportedReference},
{@link getMedicationCodeableConcept},
{@link getMedicationReference},
{@link getSubject},
{@link getEncounter},
{@link getSupportingInformation},
{@link getRequester},
{@link getPerformer},
{@link getPerformerType},
{@link getRecorder},
{@link getReasonCode},
{@link getReasonReference},
{@link getBasedOn},
{@link getGroupIdentifier},
{@link getCourseOfTherapyType},
{@link getInsurance},
{@link getNote},
{@link getDosageInstruction},
{@link getDispenseRequest},
{@link getSubstitution},
{@link getPriorPrescription},
{@link getDetectedIssue},
{@link getEventHistory},
{@link setIdentifier},
{@link setStatusReason},
{@link setCategory},
{@link setReportedReference},
{@link setMedicationCodeableConcept},
{@link setMedicationReference},
{@link setSubject},
{@link setEncounter},
{@link setSupportingInformation},
{@link setRequester},
{@link setPerformer},
{@link setPerformerType},
{@link setRecorder},
{@link setReasonCode},
{@link setReasonReference},
{@link setBasedOn},
{@link setGroupIdentifier},
{@link setCourseOfTherapyType},
{@link setInsurance},
{@link setNote},
{@link setDosageInstruction},
{@link setDispenseRequest},
{@link setSubstitution},
{@link setPriorPrescription},
{@link setDetectedIssue},
{@link setEventHistory},
 */

@Description("An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called 'MedicationRequest' rather than 'MedicationPrescription' or 'MedicationOrder' to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicationRequest extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicationRequest> T = EntityTypes.T(MedicationRequest.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String statusReason = "statusReason";
	java.lang.String category = "category";
	java.lang.String reportedReference = "reportedReference";
	java.lang.String medicationCodeableConcept = "medicationCodeableConcept";
	java.lang.String medicationReference = "medicationReference";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String supportingInformation = "supportingInformation";
	java.lang.String requester = "requester";
	java.lang.String performer = "performer";
	java.lang.String performerType = "performerType";
	java.lang.String recorder = "recorder";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String basedOn = "basedOn";
	java.lang.String groupIdentifier = "groupIdentifier";
	java.lang.String courseOfTherapyType = "courseOfTherapyType";
	java.lang.String insurance = "insurance";
	java.lang.String note = "note";
	java.lang.String dosageInstruction = "dosageInstruction";
	java.lang.String dispenseRequest = "dispenseRequest";
	java.lang.String substitution = "substitution";
	java.lang.String priorPrescription = "priorPrescription";
	java.lang.String detectedIssue = "detectedIssue";
	java.lang.String eventHistory = "eventHistory";

	@Description("Identifiers associated with this medication request that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Captures the reason for the current state of the MedicationRequest.")
	@Mandatory
	fhir.CodeableConcept getStatusReason();
	void setStatusReason(fhir.CodeableConcept statusReason);
	@Description("Indicates the type of medication request (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReportedReference();
	void setReportedReference(com.braintribe.model.generic.GenericEntity reportedReference);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getMedicationCodeableConcept();
	void setMedicationCodeableConcept(fhir.CodeableConcept medicationCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getMedicationReference();
	void setMedicationReference(com.braintribe.model.generic.GenericEntity medicationReference);
	@Description("A link to a resource representing the person or set of individuals to whom the medication will be given.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The Encounter during which this [x] was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Include additional information (for example, patient height and weight) that supports the ordering of the medication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInformation();
	void setSupportingInformation(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInformation);

	@Description("The individual, organization, or device that initiated the request and has responsibility for its activation.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequester();
	void setRequester(com.braintribe.model.generic.GenericEntity requester);
	@Description("The specified desired performer of the medication treatment (e.g. the performer of the medication administration).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPerformer();
	void setPerformer(com.braintribe.model.generic.GenericEntity performer);
	@Description("Indicates the type of performer of the administration of the medication.")
	@Mandatory
	fhir.CodeableConcept getPerformerType();
	void setPerformerType(fhir.CodeableConcept performerType);
	@Description("The person who entered the order on behalf of another individual for example in the case of a verbal or a telephone order.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRecorder();
	void setRecorder(com.braintribe.model.generic.GenericEntity recorder);
	@Description("The reason or the indication for ordering or not ordering the medication.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Condition or observation that supports why the medication was ordered.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("A plan or request that is fulfilled in whole or in part by this medication request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition or prescription.")
	@Mandatory
	fhir.Identifier getGroupIdentifier();
	void setGroupIdentifier(fhir.Identifier groupIdentifier);
	@Description("The description of the overall patte3rn of the administration of the medication to the patient.")
	@Mandatory
	fhir.CodeableConcept getCourseOfTherapyType();
	void setCourseOfTherapyType(fhir.CodeableConcept courseOfTherapyType);
	@Description("Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be required for delivering the requested service.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getInsurance();
	void setInsurance(java.util.List<com.braintribe.model.generic.GenericEntity> insurance);

	@Description("Extra information about the prescription that could not be conveyed by the other attributes.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Indicates how the medication is to be used by the patient.")
	
	java.util.List<fhir.Dosage> getDosageInstruction();
	void setDosageInstruction(java.util.List<fhir.Dosage> dosageInstruction);

	@Description("Indicates the specific details for the dispense or medication supply part of a medication request (also known as a Medication Prescription or Medication Order).  Note that this information is not always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.")
	@Mandatory
	fhir.MedicationRequestDispenseRequest getDispenseRequest();
	void setDispenseRequest(fhir.MedicationRequestDispenseRequest dispenseRequest);
	@Description("Indicates whether or not substitution can or should be part of the dispense. In some cases, substitution must happen, in other cases substitution must not happen. This block explains the prescriber's intent. If nothing is specified substitution may be done.")
	@Mandatory
	fhir.MedicationRequestSubstitution getSubstitution();
	void setSubstitution(fhir.MedicationRequestSubstitution substitution);
	@Description("A link to a resource representing an earlier order related order or prescription.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPriorPrescription();
	void setPriorPrescription(com.braintribe.model.generic.GenericEntity priorPrescription);
	@Description("Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, duplicate therapy, dosage alert etc.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDetectedIssue();
	void setDetectedIssue(java.util.List<com.braintribe.model.generic.GenericEntity> detectedIssue);

	@Description("Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEventHistory();
	void setEventHistory(java.util.List<com.braintribe.model.generic.GenericEntity> eventHistory);

}
