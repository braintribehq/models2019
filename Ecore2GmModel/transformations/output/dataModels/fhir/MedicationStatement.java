/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationStatement of the Data Model fhir.
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
{@link medicationCodeableConcept}, 
{@link medicationReference}, 
{@link subject}, 
{@link context}, 
{@link effectivePeriod}, 
{@link informationSource}, 
{@link derivedFrom}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link note}, 
{@link dosage}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getPartOf},
{@link getStatusReason},
{@link getCategory},
{@link getMedicationCodeableConcept},
{@link getMedicationReference},
{@link getSubject},
{@link getContext},
{@link getEffectivePeriod},
{@link getInformationSource},
{@link getDerivedFrom},
{@link getReasonCode},
{@link getReasonReference},
{@link getNote},
{@link getDosage},
{@link setIdentifier},
{@link setBasedOn},
{@link setPartOf},
{@link setStatusReason},
{@link setCategory},
{@link setMedicationCodeableConcept},
{@link setMedicationReference},
{@link setSubject},
{@link setContext},
{@link setEffectivePeriod},
{@link setInformationSource},
{@link setDerivedFrom},
{@link setReasonCode},
{@link setReasonReference},
{@link setNote},
{@link setDosage},
 */

@Description("A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicationStatement extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicationStatement> T = EntityTypes.T(MedicationStatement.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String partOf = "partOf";
	java.lang.String statusReason = "statusReason";
	java.lang.String category = "category";
	java.lang.String medicationCodeableConcept = "medicationCodeableConcept";
	java.lang.String medicationReference = "medicationReference";
	java.lang.String subject = "subject";
	java.lang.String context = "context";
	java.lang.String effectivePeriod = "effectivePeriod";
	java.lang.String informationSource = "informationSource";
	java.lang.String derivedFrom = "derivedFrom";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String note = "note";
	java.lang.String dosage = "dosage";

	@Description("Identifiers associated with this Medication Statement that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A plan, proposal or order that is fulfilled in whole or in part by this event.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("A larger event of which this particular event is a component or step.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("Captures the reason for the current state of the MedicationStatement.")
	
	java.util.List<fhir.CodeableConcept> getStatusReason();
	void setStatusReason(java.util.List<fhir.CodeableConcept> statusReason);

	@Description("Indicates where the medication is expected to be consumed or administered.")
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
	@Description("The person, animal or group who is/was taking the medication.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The encounter or episode of care that establishes the context for this MedicationStatement.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getContext();
	void setContext(com.braintribe.model.generic.GenericEntity context);
	@Description("")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("The person or organization that provided the information about the taking of this medication. Note: Use derivedFrom when a MedicationStatement is derived from other resources, e.g. Claim or MedicationRequest.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getInformationSource();
	void setInformationSource(com.braintribe.model.generic.GenericEntity informationSource);
	@Description("Allows linking the MedicationStatement to the underlying MedicationRequest, or to other information that supports or is used to derive the MedicationStatement.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDerivedFrom();
	void setDerivedFrom(java.util.List<com.braintribe.model.generic.GenericEntity> derivedFrom);

	@Description("A reason for why the medication is being/was taken.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Condition or observation that supports why the medication is being/was taken.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Provides extra information about the medication statement that is not conveyed by the other attributes.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Indicates how the medication is/was or should be taken by the patient.")
	
	java.util.List<fhir.Dosage> getDosage();
	void setDosage(java.util.List<fhir.Dosage> dosage);

}
