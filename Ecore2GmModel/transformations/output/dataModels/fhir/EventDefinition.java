/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EventDefinition of the Data Model fhir.
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
{@link subjectCodeableConcept}, 
{@link subjectReference}, 
{@link contact}, 
{@link useContext}, 
{@link jurisdiction}, 
{@link effectivePeriod}, 
{@link topic}, 
{@link author}, 
{@link editor}, 
{@link reviewer}, 
{@link endorser}, 
{@link relatedArtifact}, 
{@link trigger}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getSubjectCodeableConcept},
{@link getSubjectReference},
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getEffectivePeriod},
{@link getTopic},
{@link getAuthor},
{@link getEditor},
{@link getReviewer},
{@link getEndorser},
{@link getRelatedArtifact},
{@link getTrigger},
{@link setIdentifier},
{@link setSubjectCodeableConcept},
{@link setSubjectReference},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setEffectivePeriod},
{@link setTopic},
{@link setAuthor},
{@link setEditor},
{@link setReviewer},
{@link setEndorser},
{@link setRelatedArtifact},
{@link setTrigger},
 */

@Description("The EventDefinition resource provides a reusable description of when a particular event can occur.If the element is present, it must have either a @value, an @id, or extensions")

public interface EventDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<EventDefinition> T = EntityTypes.T(EventDefinition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String subjectCodeableConcept = "subjectCodeableConcept";
	java.lang.String subjectReference = "subjectReference";
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String effectivePeriod = "effectivePeriod";
	java.lang.String topic = "topic";
	java.lang.String author = "author";
	java.lang.String editor = "editor";
	java.lang.String reviewer = "reviewer";
	java.lang.String endorser = "endorser";
	java.lang.String relatedArtifact = "relatedArtifact";
	java.lang.String trigger = "trigger";

	@Description("A formal identifier that is used to identify this event definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("")
	@Mandatory
	fhir.CodeableConcept getSubjectCodeableConcept();
	void setSubjectCodeableConcept(fhir.CodeableConcept subjectCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubjectReference();
	void setSubjectReference(com.braintribe.model.generic.GenericEntity subjectReference);
	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate event definition instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the event definition is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The period during which the event definition content was or is planned to be in active use.")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("Descriptive topics related to the module. Topics provide a high-level categorization of the module that can be useful for filtering and searching.")
	
	java.util.List<fhir.CodeableConcept> getTopic();
	void setTopic(java.util.List<fhir.CodeableConcept> topic);

	@Description("An individiual or organization primarily involved in the creation and maintenance of the content.")
	
	java.util.List<fhir.ContactDetail> getAuthor();
	void setAuthor(java.util.List<fhir.ContactDetail> author);

	@Description("An individual or organization primarily responsible for internal coherence of the content.")
	
	java.util.List<fhir.ContactDetail> getEditor();
	void setEditor(java.util.List<fhir.ContactDetail> editor);

	@Description("An individual or organization primarily responsible for review of some aspect of the content.")
	
	java.util.List<fhir.ContactDetail> getReviewer();
	void setReviewer(java.util.List<fhir.ContactDetail> reviewer);

	@Description("An individual or organization responsible for officially endorsing the content for use in some setting.")
	
	java.util.List<fhir.ContactDetail> getEndorser();
	void setEndorser(java.util.List<fhir.ContactDetail> endorser);

	@Description("Related resources such as additional documentation, justification, or bibliographic references.")
	
	java.util.List<fhir.RelatedArtifact> getRelatedArtifact();
	void setRelatedArtifact(java.util.List<fhir.RelatedArtifact> relatedArtifact);

	@Description("The trigger element defines when the event occurs. If more than one trigger condition is specified, the event fires whenever any one of the trigger conditions is met.")
	
	java.util.List<fhir.TriggerDefinition> getTrigger();
	void setTrigger(java.util.List<fhir.TriggerDefinition> trigger);

}
