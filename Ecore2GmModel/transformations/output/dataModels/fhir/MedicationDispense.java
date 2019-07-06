/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationDispense of the Data Model fhir.
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
{@link partOf}, 
{@link statusReasonCodeableConcept}, 
{@link statusReasonReference}, 
{@link category}, 
{@link medicationCodeableConcept}, 
{@link medicationReference}, 
{@link subject}, 
{@link context}, 
{@link supportingInformation}, 
{@link performer}, 
{@link location}, 
{@link authorizingPrescription}, 
{@link type}, 
{@link quantity}, 
{@link daysSupply}, 
{@link destination}, 
{@link receiver}, 
{@link note}, 
{@link dosageInstruction}, 
{@link substitution}, 
{@link detectedIssue}, 
{@link eventHistory}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPartOf},
{@link getStatusReasonCodeableConcept},
{@link getStatusReasonReference},
{@link getCategory},
{@link getMedicationCodeableConcept},
{@link getMedicationReference},
{@link getSubject},
{@link getContext},
{@link getSupportingInformation},
{@link getPerformer},
{@link getLocation},
{@link getAuthorizingPrescription},
{@link getType},
{@link getQuantity},
{@link getDaysSupply},
{@link getDestination},
{@link getReceiver},
{@link getNote},
{@link getDosageInstruction},
{@link getSubstitution},
{@link getDetectedIssue},
{@link getEventHistory},
{@link setIdentifier},
{@link setPartOf},
{@link setStatusReasonCodeableConcept},
{@link setStatusReasonReference},
{@link setCategory},
{@link setMedicationCodeableConcept},
{@link setMedicationReference},
{@link setSubject},
{@link setContext},
{@link setSupportingInformation},
{@link setPerformer},
{@link setLocation},
{@link setAuthorizingPrescription},
{@link setType},
{@link setQuantity},
{@link setDaysSupply},
{@link setDestination},
{@link setReceiver},
{@link setNote},
{@link setDosageInstruction},
{@link setSubstitution},
{@link setDetectedIssue},
{@link setEventHistory},
 */

@Description("Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicationDispense extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicationDispense> T = EntityTypes.T(MedicationDispense.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String partOf = "partOf";
	java.lang.String statusReasonCodeableConcept = "statusReasonCodeableConcept";
	java.lang.String statusReasonReference = "statusReasonReference";
	java.lang.String category = "category";
	java.lang.String medicationCodeableConcept = "medicationCodeableConcept";
	java.lang.String medicationReference = "medicationReference";
	java.lang.String subject = "subject";
	java.lang.String context = "context";
	java.lang.String supportingInformation = "supportingInformation";
	java.lang.String performer = "performer";
	java.lang.String location = "location";
	java.lang.String authorizingPrescription = "authorizingPrescription";
	java.lang.String type = "type";
	java.lang.String quantity = "quantity";
	java.lang.String daysSupply = "daysSupply";
	java.lang.String destination = "destination";
	java.lang.String receiver = "receiver";
	java.lang.String note = "note";
	java.lang.String dosageInstruction = "dosageInstruction";
	java.lang.String substitution = "substitution";
	java.lang.String detectedIssue = "detectedIssue";
	java.lang.String eventHistory = "eventHistory";

	@Description("Identifiers associated with this Medication Dispense that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The procedure that trigger the dispense.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("")
	@Mandatory
	fhir.CodeableConcept getStatusReasonCodeableConcept();
	void setStatusReasonCodeableConcept(fhir.CodeableConcept statusReasonCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getStatusReasonReference();
	void setStatusReasonReference(com.braintribe.model.generic.GenericEntity statusReasonReference);
	@Description("Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getMedicationCodeableConcept();
	void setMedicationCodeableConcept(fhir.CodeableConcept medicationCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getMedicationReference();
	void setMedicationReference(com.braintribe.model.generic.GenericEntity medicationReference);
	@Description("A link to a resource representing the person or the group to whom the medication will be given.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The encounter or episode of care that establishes the context for this event.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getContext();
	void setContext(com.braintribe.model.generic.GenericEntity context);
	@Description("Additional information that supports the medication being dispensed.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInformation();
	void setSupportingInformation(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInformation);

	@Description("Indicates who or what performed the event.")
	
	java.util.List<fhir.MedicationDispensePerformer> getPerformer();
	void setPerformer(java.util.List<fhir.MedicationDispensePerformer> performer);

	@Description("The principal physical location where the dispense was performed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("Indicates the medication order that is being dispensed against.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAuthorizingPrescription();
	void setAuthorizingPrescription(java.util.List<com.braintribe.model.generic.GenericEntity> authorizingPrescription);

	@Description("Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The amount of medication that has been dispensed. Includes unit of measure.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("The amount of medication expressed as a timing amount.")
	@Mandatory
	fhir.Quantity getDaysSupply();
	void setDaysSupply(fhir.Quantity daysSupply);
	@Description("Identification of the facility/location where the medication was shipped to, as part of the dispense event.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDestination();
	void setDestination(com.braintribe.model.generic.GenericEntity destination);
	@Description("Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReceiver();
	void setReceiver(java.util.List<com.braintribe.model.generic.GenericEntity> receiver);

	@Description("Extra information about the dispense that could not be conveyed in the other attributes.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Indicates how the medication is to be used by the patient.")
	
	java.util.List<fhir.Dosage> getDosageInstruction();
	void setDosageInstruction(java.util.List<fhir.Dosage> dosageInstruction);

	@Description("Indicates whether or not substitution was made as part of the dispense.  In some cases, substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done.")
	@Mandatory
	fhir.MedicationDispenseSubstitution getSubstitution();
	void setSubstitution(fhir.MedicationDispenseSubstitution substitution);
	@Description("Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. drug-drug interaction, duplicate therapy, dosage alert etc.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDetectedIssue();
	void setDetectedIssue(java.util.List<com.braintribe.model.generic.GenericEntity> detectedIssue);

	@Description("A summary of the events of interest that have occurred, such as when the dispense was verified.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEventHistory();
	void setEventHistory(java.util.List<com.braintribe.model.generic.GenericEntity> eventHistory);

}
