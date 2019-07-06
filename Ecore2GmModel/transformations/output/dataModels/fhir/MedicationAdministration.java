/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationAdministration of the Data Model fhir.
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
{@link statusReason}, 
{@link category}, 
{@link medicationCodeableConcept}, 
{@link medicationReference}, 
{@link subject}, 
{@link context}, 
{@link supportingInformation}, 
{@link effectivePeriod}, 
{@link performer}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link request}, 
{@link device}, 
{@link note}, 
{@link dosage}, 
{@link eventHistory}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPartOf},
{@link getStatusReason},
{@link getCategory},
{@link getMedicationCodeableConcept},
{@link getMedicationReference},
{@link getSubject},
{@link getContext},
{@link getSupportingInformation},
{@link getEffectivePeriod},
{@link getPerformer},
{@link getReasonCode},
{@link getReasonReference},
{@link getRequest},
{@link getDevice},
{@link getNote},
{@link getDosage},
{@link getEventHistory},
{@link setIdentifier},
{@link setPartOf},
{@link setStatusReason},
{@link setCategory},
{@link setMedicationCodeableConcept},
{@link setMedicationReference},
{@link setSubject},
{@link setContext},
{@link setSupportingInformation},
{@link setEffectivePeriod},
{@link setPerformer},
{@link setReasonCode},
{@link setReasonReference},
{@link setRequest},
{@link setDevice},
{@link setNote},
{@link setDosage},
{@link setEventHistory},
 */

@Description("Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicationAdministration extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicationAdministration> T = EntityTypes.T(MedicationAdministration.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String partOf = "partOf";
	java.lang.String statusReason = "statusReason";
	java.lang.String category = "category";
	java.lang.String medicationCodeableConcept = "medicationCodeableConcept";
	java.lang.String medicationReference = "medicationReference";
	java.lang.String subject = "subject";
	java.lang.String context = "context";
	java.lang.String supportingInformation = "supportingInformation";
	java.lang.String effectivePeriod = "effectivePeriod";
	java.lang.String performer = "performer";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String request = "request";
	java.lang.String device = "device";
	java.lang.String note = "note";
	java.lang.String dosage = "dosage";
	java.lang.String eventHistory = "eventHistory";

	@Description("Identifiers associated with this Medication Administration that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate. They are business identifiers assigned to this resource by the performer or other systems and remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A larger event of which this particular event is a component or step.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("A code indicating why the administration was not performed.")
	
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
	@Description("The person or animal or group receiving the medication.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The visit, admission, or other contact between patient and health care provider during which the medication administration was performed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getContext();
	void setContext(com.braintribe.model.generic.GenericEntity context);
	@Description("Additional information (for example, patient height and weight) that supports the administration of the medication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInformation();
	void setSupportingInformation(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInformation);

	@Description("")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("Indicates who or what performed the medication administration and how they were involved.")
	
	java.util.List<fhir.MedicationAdministrationPerformer> getPerformer();
	void setPerformer(java.util.List<fhir.MedicationAdministrationPerformer> performer);

	@Description("A code indicating why the medication was given.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Condition or observation that supports why the medication was administered.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("The original request, instruction or authority to perform the administration.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequest();
	void setRequest(com.braintribe.model.generic.GenericEntity request);
	@Description("The device used in administering the medication to the patient.  For example, a particular infusion pump.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDevice();
	void setDevice(java.util.List<com.braintribe.model.generic.GenericEntity> device);

	@Description("Extra information about the medication administration that is not conveyed by the other attributes.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Describes the medication dosage information details e.g. dose, rate, site, route, etc.")
	@Mandatory
	fhir.MedicationAdministrationDosage getDosage();
	void setDosage(fhir.MedicationAdministrationDosage dosage);
	@Description("A summary of the events of interest that have occurred, such as when the administration was verified.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEventHistory();
	void setEventHistory(java.util.List<com.braintribe.model.generic.GenericEntity> eventHistory);

}
