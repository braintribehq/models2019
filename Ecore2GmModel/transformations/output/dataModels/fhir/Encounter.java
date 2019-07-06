/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Encounter of the Data Model fhir.
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
{@link statusHistory}, 
{@link class_}, 
{@link classHistory}, 
{@link type}, 
{@link serviceType}, 
{@link priority}, 
{@link subject}, 
{@link episodeOfCare}, 
{@link basedOn}, 
{@link participant}, 
{@link appointment}, 
{@link period}, 
{@link length}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link diagnosis}, 
{@link account}, 
{@link hospitalization}, 
{@link location}, 
{@link serviceProvider}, 
{@link partOf}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getStatusHistory},
{@link getClass_},
{@link getClassHistory},
{@link getType},
{@link getServiceType},
{@link getPriority},
{@link getSubject},
{@link getEpisodeOfCare},
{@link getBasedOn},
{@link getParticipant},
{@link getAppointment},
{@link getPeriod},
{@link getLength},
{@link getReasonCode},
{@link getReasonReference},
{@link getDiagnosis},
{@link getAccount},
{@link getHospitalization},
{@link getLocation},
{@link getServiceProvider},
{@link getPartOf},
{@link setIdentifier},
{@link setStatusHistory},
{@link setClass_},
{@link setClassHistory},
{@link setType},
{@link setServiceType},
{@link setPriority},
{@link setSubject},
{@link setEpisodeOfCare},
{@link setBasedOn},
{@link setParticipant},
{@link setAppointment},
{@link setPeriod},
{@link setLength},
{@link setReasonCode},
{@link setReasonReference},
{@link setDiagnosis},
{@link setAccount},
{@link setHospitalization},
{@link setLocation},
{@link setServiceProvider},
{@link setPartOf},
 */

@Description("An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.If the element is present, it must have either a @value, an @id, or extensions")

public interface Encounter extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Encounter> T = EntityTypes.T(Encounter.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String statusHistory = "statusHistory";
	java.lang.String class_ = "class_";
	java.lang.String classHistory = "classHistory";
	java.lang.String type = "type";
	java.lang.String serviceType = "serviceType";
	java.lang.String priority = "priority";
	java.lang.String subject = "subject";
	java.lang.String episodeOfCare = "episodeOfCare";
	java.lang.String basedOn = "basedOn";
	java.lang.String participant = "participant";
	java.lang.String appointment = "appointment";
	java.lang.String period = "period";
	java.lang.String length = "length";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String diagnosis = "diagnosis";
	java.lang.String account = "account";
	java.lang.String hospitalization = "hospitalization";
	java.lang.String location = "location";
	java.lang.String serviceProvider = "serviceProvider";
	java.lang.String partOf = "partOf";

	@Description("Identifier(s) by which this encounter is known.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them.")
	
	java.util.List<fhir.EncounterStatusHistory> getStatusHistory();
	void setStatusHistory(java.util.List<fhir.EncounterStatusHistory> statusHistory);

	@Description("Concepts representing classification of patient encounter such as ambulatory (outpatient), inpatient, emergency, home health or others due to local variations.")
	@Mandatory
	fhir.Coding getClass_();
	void setClass_(fhir.Coding class_);
	@Description("The class history permits the tracking of the encounters transitions without needing to go  through the resource history.  This would be used for a case where an admission starts of as an emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting a new encounter ensures that any lab/diagnostic results can more easily follow the patient and not require re-processing and not get lost or cancelled during a kind of discharge from emergency to inpatient.")
	
	java.util.List<fhir.EncounterClassHistory> getClassHistory();
	void setClassHistory(java.util.List<fhir.EncounterClassHistory> classHistory);

	@Description("Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("Broad categorization of the service that is to be provided (e.g. cardiology).")
	@Mandatory
	fhir.CodeableConcept getServiceType();
	void setServiceType(fhir.CodeableConcept serviceType);
	@Description("Indicates the urgency of the encounter.")
	@Mandatory
	fhir.CodeableConcept getPriority();
	void setPriority(fhir.CodeableConcept priority);
	@Description("The patient or group present at the encounter.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEpisodeOfCare();
	void setEpisodeOfCare(java.util.List<com.braintribe.model.generic.GenericEntity> episodeOfCare);

	@Description("The request this encounter satisfies (e.g. incoming referral or procedure request).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("The list of people responsible for providing the service.")
	
	java.util.List<fhir.EncounterParticipant> getParticipant();
	void setParticipant(java.util.List<fhir.EncounterParticipant> participant);

	@Description("The appointment that scheduled this encounter.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAppointment();
	void setAppointment(java.util.List<com.braintribe.model.generic.GenericEntity> appointment);

	@Description("The start and end time of the encounter.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Quantity of time the encounter lasted. This excludes the time during leaves of absence.")
	@Mandatory
	fhir.Duration getLength();
	void setLength(fhir.Duration length);
	@Description("Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("The list of diagnosis relevant to this encounter.")
	
	java.util.List<fhir.EncounterDiagnosis> getDiagnosis();
	void setDiagnosis(java.util.List<fhir.EncounterDiagnosis> diagnosis);

	@Description("The set of accounts that may be used for billing for this Encounter.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAccount();
	void setAccount(java.util.List<com.braintribe.model.generic.GenericEntity> account);

	@Description("Details about the admission to a healthcare service.")
	@Mandatory
	fhir.EncounterHospitalization getHospitalization();
	void setHospitalization(fhir.EncounterHospitalization hospitalization);
	@Description("List of locations where  the patient has been during this encounter.")
	
	java.util.List<fhir.EncounterLocation> getLocation();
	void setLocation(java.util.List<fhir.EncounterLocation> location);

	@Description("The organization that is primarily responsible for this Encounter's services. This MAY be the same as the organization on the Patient record, however it could be different, such as if the actor performing the services was from an external organization (which may be billed seperately) for an external consultation.  Refer to the example bundle showing an abbreviated set of Encounters for a colonoscopy.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getServiceProvider();
	void setServiceProvider(com.braintribe.model.generic.GenericEntity serviceProvider);
	@Description("Another Encounter of which this encounter is a part of (administratively or in time).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPartOf();
	void setPartOf(com.braintribe.model.generic.GenericEntity partOf);
}
