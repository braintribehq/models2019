/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RequestGroup of the Data Model fhir.
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
{@link code}, 
{@link subject}, 
{@link encounter}, 
{@link author}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link note}, 
{@link action}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getReplaces},
{@link getGroupIdentifier},
{@link getCode},
{@link getSubject},
{@link getEncounter},
{@link getAuthor},
{@link getReasonCode},
{@link getReasonReference},
{@link getNote},
{@link getAction},
{@link setIdentifier},
{@link setBasedOn},
{@link setReplaces},
{@link setGroupIdentifier},
{@link setCode},
{@link setSubject},
{@link setEncounter},
{@link setAuthor},
{@link setReasonCode},
{@link setReasonReference},
{@link setNote},
{@link setAction},
 */

@Description("A group of related requests that can be used to capture intended activities that have inter-dependencies such as 'give this medication after that one'.If the element is present, it must have either a @value, an @id, or extensions")

public interface RequestGroup extends GenericEntity, fhir.FhirDomainResource {

	EntityType<RequestGroup> T = EntityTypes.T(RequestGroup.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String replaces = "replaces";
	java.lang.String groupIdentifier = "groupIdentifier";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String author = "author";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String note = "note";
	java.lang.String action = "action";

	@Description("Allows a service to provide a unique, business identifier for the request.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A plan, proposal or order that is fulfilled in whole or in part by this request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("Completed or terminated request(s) whose function is taken by this new request.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReplaces();
	void setReplaces(java.util.List<com.braintribe.model.generic.GenericEntity> replaces);

	@Description("A shared identifier common to all requests that were authorized more or less simultaneously by a single author, representing the identifier of the requisition, prescription or similar form.")
	@Mandatory
	fhir.Identifier getGroupIdentifier();
	void setGroupIdentifier(fhir.Identifier groupIdentifier);
	@Description("A code that identifies what the overall request group is.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The subject for which the request group was created.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Describes the context of the request group, if any.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Provides a reference to the author of the request group.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthor();
	void setAuthor(com.braintribe.model.generic.GenericEntity author);
	@Description("Describes the reason for the request group in coded or textual form.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates another resource whose existence justifies this request group.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Provides a mechanism to communicate additional information about the response.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("The actions, if any, produced by the evaluation of the artifact.")
	
	java.util.List<fhir.RequestGroupAction> getAction();
	void setAction(java.util.List<fhir.RequestGroupAction> action);

}
