/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PlanDefinition of the Data Model fhir.
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
{@link type}, 
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
{@link goal}, 
{@link action}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
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
{@link getGoal},
{@link getAction},
{@link setIdentifier},
{@link setType},
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
{@link setGoal},
{@link setAction},
 */

@Description("This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.If the element is present, it must have either a @value, an @id, or extensions")

public interface PlanDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<PlanDefinition> T = EntityTypes.T(PlanDefinition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
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
	java.lang.String goal = "goal";
	java.lang.String action = "action";

	@Description("A formal identifier that is used to identify this plan definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A high-level category for the plan definition that distinguishes the kinds of systems that would be interested in the plan definition.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
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

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate plan definition instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the plan definition is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The period during which the plan definition content was or is planned to be in active use.")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("Descriptive topics related to the content of the plan definition. Topics provide a high-level categorization of the definition that can be useful for filtering and searching.")
	
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

	@Description("Related artifacts such as additional documentation, justification, or bibliographic references.")
	
	java.util.List<fhir.RelatedArtifact> getRelatedArtifact();
	void setRelatedArtifact(java.util.List<fhir.RelatedArtifact> relatedArtifact);

	@Description("Goals that describe what the activities within the plan are intended to achieve. For example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.")
	
	java.util.List<fhir.PlanDefinitionGoal> getGoal();
	void setGoal(java.util.List<fhir.PlanDefinitionGoal> goal);

	@Description("An action or group of actions to be taken as part of the plan.")
	
	java.util.List<fhir.PlanDefinitionAction> getAction();
	void setAction(java.util.List<fhir.PlanDefinitionAction> action);

}
