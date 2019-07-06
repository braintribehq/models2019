/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Communication of the Data Model fhir.
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
{@link inResponseTo}, 
{@link statusReason}, 
{@link category}, 
{@link medium}, 
{@link subject}, 
{@link topic}, 
{@link about}, 
{@link encounter}, 
{@link recipient}, 
{@link sender}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link payload}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getPartOf},
{@link getInResponseTo},
{@link getStatusReason},
{@link getCategory},
{@link getMedium},
{@link getSubject},
{@link getTopic},
{@link getAbout},
{@link getEncounter},
{@link getRecipient},
{@link getSender},
{@link getReasonCode},
{@link getReasonReference},
{@link getPayload},
{@link getNote},
{@link setIdentifier},
{@link setBasedOn},
{@link setPartOf},
{@link setInResponseTo},
{@link setStatusReason},
{@link setCategory},
{@link setMedium},
{@link setSubject},
{@link setTopic},
{@link setAbout},
{@link setEncounter},
{@link setRecipient},
{@link setSender},
{@link setReasonCode},
{@link setReasonReference},
{@link setPayload},
{@link setNote},
 */

@Description("An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency that was notified about a reportable condition.If the element is present, it must have either a @value, an @id, or extensions")

public interface Communication extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Communication> T = EntityTypes.T(Communication.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String partOf = "partOf";
	java.lang.String inResponseTo = "inResponseTo";
	java.lang.String statusReason = "statusReason";
	java.lang.String category = "category";
	java.lang.String medium = "medium";
	java.lang.String subject = "subject";
	java.lang.String topic = "topic";
	java.lang.String about = "about";
	java.lang.String encounter = "encounter";
	java.lang.String recipient = "recipient";
	java.lang.String sender = "sender";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String payload = "payload";
	java.lang.String note = "note";

	@Description("Business identifiers assigned to this communication by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("An order, proposal or plan fulfilled in whole or in part by this Communication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("Part of this action.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("Prior communication that this communication is in response to.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getInResponseTo();
	void setInResponseTo(java.util.List<com.braintribe.model.generic.GenericEntity> inResponseTo);

	@Description("Captures the reason for the current state of the Communication.")
	@Mandatory
	fhir.CodeableConcept getStatusReason();
	void setStatusReason(fhir.CodeableConcept statusReason);
	@Description("The type of message conveyed such as alert, notification, reminder, instruction, etc.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("A channel that was used for this communication (e.g. email, fax).")
	
	java.util.List<fhir.CodeableConcept> getMedium();
	void setMedium(java.util.List<fhir.CodeableConcept> medium);

	@Description("The patient or group that was the focus of this communication.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Description of the purpose/content, similar to a subject line in an email.")
	@Mandatory
	fhir.CodeableConcept getTopic();
	void setTopic(fhir.CodeableConcept topic);
	@Description("Other resources that pertain to this communication and to which this communication should be associated.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAbout();
	void setAbout(java.util.List<com.braintribe.model.generic.GenericEntity> about);

	@Description("The Encounter during which this Communication was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by an individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either receipts are not tracked (e.g. a mass mail-out) or a receipt is captured in aggregate (all emails confirmed received by a particular time).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRecipient();
	void setRecipient(java.util.List<com.braintribe.model.generic.GenericEntity> recipient);

	@Description("The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSender();
	void setSender(com.braintribe.model.generic.GenericEntity sender);
	@Description("The reason or justification for the communication.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates another resource whose existence justifies this communication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Text, attachment(s), or resource(s) that was communicated to the recipient.")
	
	java.util.List<fhir.CommunicationPayload> getPayload();
	void setPayload(java.util.List<fhir.CommunicationPayload> payload);

	@Description("Additional notes or commentary about the communication by the sender, receiver or other interested parties.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
