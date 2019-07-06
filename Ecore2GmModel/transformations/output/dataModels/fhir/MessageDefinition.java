/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageDefinition of the Data Model fhir.
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
{@link contact}, 
{@link useContext}, 
{@link jurisdiction}, 
{@link eventCoding}, 
{@link focus}, 
{@link allowedResponse}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getEventCoding},
{@link getFocus},
{@link getAllowedResponse},
{@link setIdentifier},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setEventCoding},
{@link setFocus},
{@link setAllowedResponse},
 */

@Description("Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.If the element is present, it must have either a @value, an @id, or extensions")

public interface MessageDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MessageDefinition> T = EntityTypes.T(MessageDefinition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String eventCoding = "eventCoding";
	java.lang.String focus = "focus";
	java.lang.String allowedResponse = "allowedResponse";

	@Description("A formal identifier that is used to identify this message definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate message definition instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the message definition is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("")
	@Mandatory
	fhir.Coding getEventCoding();
	void setEventCoding(fhir.Coding eventCoding);
	@Description("Identifies the resource (or resources) that are being addressed by the event.  For example, the Encounter for an admit message or two Account records for a merge.")
	
	java.util.List<fhir.MessageDefinitionFocus> getFocus();
	void setFocus(java.util.List<fhir.MessageDefinitionFocus> focus);

	@Description("Indicates what types of messages may be sent as an application-level response to this message.")
	
	java.util.List<fhir.MessageDefinitionAllowedResponse> getAllowedResponse();
	void setAllowedResponse(java.util.List<fhir.MessageDefinitionAllowedResponse> allowedResponse);

}
