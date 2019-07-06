/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CommunicationRequest of the Data Model fhir.
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
{@link replaces}, 
{@link groupIdentifier}, 
{@link statusReason}, 
{@link category}, 
{@link medium}, 
{@link subject}, 
{@link about}, 
{@link encounter}, 
{@link payload}, 
{@link occurrencePeriod}, 
{@link requester}, 
{@link recipient}, 
{@link sender}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getReplaces},
{@link getGroupIdentifier},
{@link getStatusReason},
{@link getCategory},
{@link getMedium},
{@link getSubject},
{@link getAbout},
{@link getEncounter},
{@link getPayload},
{@link getOccurrencePeriod},
{@link getRequester},
{@link getRecipient},
{@link getSender},
{@link getReasonCode},
{@link getReasonReference},
{@link getNote},
{@link setIdentifier},
{@link setBasedOn},
{@link setReplaces},
{@link setGroupIdentifier},
{@link setStatusReason},
{@link setCategory},
{@link setMedium},
{@link setSubject},
{@link setAbout},
{@link setEncounter},
{@link setPayload},
{@link setOccurrencePeriod},
{@link setRequester},
{@link setRecipient},
{@link setSender},
{@link setReasonCode},
{@link setReasonReference},
{@link setNote},
 */

@Description("A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.If the element is present, it must have either a @value, an @id, or extensions")

public interface CommunicationRequest extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CommunicationRequest> T = EntityTypes.T(CommunicationRequest.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String replaces = "replaces";
	java.lang.String groupIdentifier = "groupIdentifier";
	java.lang.String statusReason = "statusReason";
	java.lang.String category = "category";
	java.lang.String medium = "medium";
	java.lang.String subject = "subject";
	java.lang.String about = "about";
	java.lang.String encounter = "encounter";
	java.lang.String payload = "payload";
	java.lang.String occurrencePeriod = "occurrencePeriod";
	java.lang.String requester = "requester";
	java.lang.String recipient = "recipient";
	java.lang.String sender = "sender";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String note = "note";

	@Description("Business identifiers assigned to this communication request by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A plan or proposal that is fulfilled in whole or in part by this request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("Completed or terminated request(s) whose function is taken by this new request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReplaces();
	void setReplaces(java.util.List<com.braintribe.model.generic.GenericEntity> replaces);

	@Description("A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition, prescription or similar form.")
	@Mandatory
	fhir.Identifier getGroupIdentifier();
	void setGroupIdentifier(fhir.Identifier groupIdentifier);
	@Description("Captures the reason for the current state of the CommunicationRequest.")
	@Mandatory
	fhir.CodeableConcept getStatusReason();
	void setStatusReason(fhir.CodeableConcept statusReason);
	@Description("The type of message to be sent such as alert, notification, reminder, instruction, etc.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("A channel that was used for this communication (e.g. email, fax).")
	
	java.util.List<fhir.CodeableConcept> getMedium();
	void setMedium(java.util.List<fhir.CodeableConcept> medium);

	@Description("The patient or group that is the focus of this communication request.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Other resources that pertain to this communication request and to which this communication request should be associated.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAbout();
	void setAbout(java.util.List<com.braintribe.model.generic.GenericEntity> about);

	@Description("The Encounter during which this CommunicationRequest was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Text, attachment(s), or resource(s) to be communicated to the recipient.")
	
	java.util.List<fhir.CommunicationRequestPayload> getPayload();
	void setPayload(java.util.List<fhir.CommunicationRequestPayload> payload);

	@Description("")
	@Mandatory
	fhir.Period getOccurrencePeriod();
	void setOccurrencePeriod(fhir.Period occurrencePeriod);
	@Description("The device, individual, or organization who initiated the request and has responsibility for its activation.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRequester();
	void setRequester(com.braintribe.model.generic.GenericEntity requester);
	@Description("The entity (e.g. person, organization, clinical information system, device, group, or care team) which is the intended target of the communication.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRecipient();
	void setRecipient(java.util.List<com.braintribe.model.generic.GenericEntity> recipient);

	@Description("The entity (e.g. person, organization, clinical information system, or device) which is to be the source of the communication.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSender();
	void setSender(com.braintribe.model.generic.GenericEntity sender);
	@Description("Describes why the request is being made in coded or textual form.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates another resource whose existence justifies this request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Comments made about the request by the requester, sender, recipient, subject or other participants.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
