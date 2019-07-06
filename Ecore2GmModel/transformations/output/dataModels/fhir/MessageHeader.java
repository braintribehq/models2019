/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageHeader of the Data Model fhir.
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
{@link eventCoding}, 
{@link destination}, 
{@link sender}, 
{@link enterer}, 
{@link author}, 
{@link source}, 
{@link responsible}, 
{@link reason}, 
{@link response}, 
{@link focus}, 

* It provides of then following operations (getters and setters)
{@link getEventCoding},
{@link getDestination},
{@link getSender},
{@link getEnterer},
{@link getAuthor},
{@link getSource},
{@link getResponsible},
{@link getReason},
{@link getResponse},
{@link getFocus},
{@link setEventCoding},
{@link setDestination},
{@link setSender},
{@link setEnterer},
{@link setAuthor},
{@link setSource},
{@link setResponsible},
{@link setReason},
{@link setResponse},
{@link setFocus},
 */

@Description("The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.If the element is present, it must have either a @value, an @id, or extensions")

public interface MessageHeader extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MessageHeader> T = EntityTypes.T(MessageHeader.class);

	/* Constants for each property name. */
	java.lang.String eventCoding = "eventCoding";
	java.lang.String destination = "destination";
	java.lang.String sender = "sender";
	java.lang.String enterer = "enterer";
	java.lang.String author = "author";
	java.lang.String source = "source";
	java.lang.String responsible = "responsible";
	java.lang.String reason = "reason";
	java.lang.String response = "response";
	java.lang.String focus = "focus";

	@Description("")
	@Mandatory
	fhir.Coding getEventCoding();
	void setEventCoding(fhir.Coding eventCoding);
	@Description("The destination application which the message is intended for.")
	
	java.util.List<fhir.MessageHeaderDestination> getDestination();
	void setDestination(java.util.List<fhir.MessageHeaderDestination> destination);

	@Description("Identifies the sending system to allow the use of a trust relationship.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSender();
	void setSender(com.braintribe.model.generic.GenericEntity sender);
	@Description("The person or device that performed the data entry leading to this message. When there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEnterer();
	void setEnterer(com.braintribe.model.generic.GenericEntity enterer);
	@Description("The logical author of the message - the person or device that decided the described event should happen. When there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
	@Description("The source application from which this message originated.")
	@Mandatory
	fhir.MessageHeaderSource getSource();
	void setSource(fhir.MessageHeaderSource source);
	@Description("The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getResponsible();
	void setResponsible(com.braintribe.model.generic.GenericEntity responsible);
	@Description("Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message.")
	@Mandatory
	fhir.CodeableConcept getReason();
	void setReason(fhir.CodeableConcept reason);
	@Description("Information about the message that this message is a response to.  Only present if this message is a response.")
	@Mandatory
	fhir.MessageHeaderResponse getResponse();
	void setResponse(fhir.MessageHeaderResponse response);
	@Description("The actual data of the message - a reference to the root/focus class of the event.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getFocus();
	void setFocus(java.util.List<com.braintribe.model.generic.GenericEntity> focus);

}
