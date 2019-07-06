/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Appointment of the Data Model fhir.
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
{@link cancelationReason}, 
{@link serviceCategory}, 
{@link serviceType}, 
{@link specialty}, 
{@link appointmentType}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link supportingInformation}, 
{@link slot}, 
{@link basedOn}, 
{@link participant}, 
{@link requestedPeriod}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCancelationReason},
{@link getServiceCategory},
{@link getServiceType},
{@link getSpecialty},
{@link getAppointmentType},
{@link getReasonCode},
{@link getReasonReference},
{@link getSupportingInformation},
{@link getSlot},
{@link getBasedOn},
{@link getParticipant},
{@link getRequestedPeriod},
{@link setIdentifier},
{@link setCancelationReason},
{@link setServiceCategory},
{@link setServiceType},
{@link setSpecialty},
{@link setAppointmentType},
{@link setReasonCode},
{@link setReasonReference},
{@link setSupportingInformation},
{@link setSlot},
{@link setBasedOn},
{@link setParticipant},
{@link setRequestedPeriod},
 */

@Description("A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).If the element is present, it must have either a @value, an @id, or extensions")

public interface Appointment extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Appointment> T = EntityTypes.T(Appointment.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String cancelationReason = "cancelationReason";
	java.lang.String serviceCategory = "serviceCategory";
	java.lang.String serviceType = "serviceType";
	java.lang.String specialty = "specialty";
	java.lang.String appointmentType = "appointmentType";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String supportingInformation = "supportingInformation";
	java.lang.String slot = "slot";
	java.lang.String basedOn = "basedOn";
	java.lang.String participant = "participant";
	java.lang.String requestedPeriod = "requestedPeriod";

	@Description("This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The coded reason for the appointment being cancelled. This is often used in reporting/billing/futher processing to determine if further actions are required, or specific fees apply.")
	@Mandatory
	fhir.CodeableConcept getCancelationReason();
	void setCancelationReason(fhir.CodeableConcept cancelationReason);
	@Description("A broad categorization of the service that is to be performed during this appointment.")
	
	java.util.List<fhir.CodeableConcept> getServiceCategory();
	void setServiceCategory(java.util.List<fhir.CodeableConcept> serviceCategory);

	@Description("The specific service that is to be performed during this appointment.")
	
	java.util.List<fhir.CodeableConcept> getServiceType();
	void setServiceType(java.util.List<fhir.CodeableConcept> serviceType);

	@Description("The specialty of a practitioner that would be required to perform the service requested in this appointment.")
	
	java.util.List<fhir.CodeableConcept> getSpecialty();
	void setSpecialty(java.util.List<fhir.CodeableConcept> specialty);

	@Description("The style of appointment or patient that has been booked in the slot (not service type).")
	@Mandatory
	fhir.CodeableConcept getAppointmentType();
	void setAppointmentType(fhir.CodeableConcept appointmentType);
	@Description("The coded reason that this appointment is being scheduled. This is more clinical than administrative.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Reason the appointment has been scheduled to take place, as specified using information from another resource. When the patient arrives and the encounter begins it may be used as the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Additional information to support the appointment provided when making the appointment.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInformation();
	void setSupportingInformation(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInformation);

	@Description("The slots from the participants' schedules that will be filled by the appointment.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSlot();
	void setSlot(java.util.List<com.braintribe.model.generic.GenericEntity> slot);

	@Description("The service request this appointment is allocated to assess (e.g. incoming referral or procedure request).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("List of participants involved in the appointment.")
	
	java.util.List<fhir.AppointmentParticipant> getParticipant();
	void setParticipant(java.util.List<fhir.AppointmentParticipant> participant);

	@Description("A set of date ranges (potentially including times) that the appointment is preferred to be scheduled within.The duration (usually in minutes) could also be provided to indicate the length of the appointment to fill and populate the start/end times for the actual allocated time. However, in other situations the duration may be calculated by the scheduling system.")
	
	java.util.List<fhir.Period> getRequestedPeriod();
	void setRequestedPeriod(java.util.List<fhir.Period> requestedPeriod);

}
