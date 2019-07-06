/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Evidence of the Data Model fhir.
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
{@link note}, 
{@link useContext}, 
{@link jurisdiction}, 
{@link effectivePeriod}, 
{@link topic}, 
{@link author}, 
{@link editor}, 
{@link reviewer}, 
{@link endorser}, 
{@link relatedArtifact}, 
{@link exposureBackground}, 
{@link exposureVariant}, 
{@link outcome}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getContact},
{@link getNote},
{@link getUseContext},
{@link getJurisdiction},
{@link getEffectivePeriod},
{@link getTopic},
{@link getAuthor},
{@link getEditor},
{@link getReviewer},
{@link getEndorser},
{@link getRelatedArtifact},
{@link getExposureBackground},
{@link getExposureVariant},
{@link getOutcome},
{@link setIdentifier},
{@link setContact},
{@link setNote},
{@link setUseContext},
{@link setJurisdiction},
{@link setEffectivePeriod},
{@link setTopic},
{@link setAuthor},
{@link setEditor},
{@link setReviewer},
{@link setEndorser},
{@link setRelatedArtifact},
{@link setExposureBackground},
{@link setExposureVariant},
{@link setOutcome},
 */

@Description("The Evidence resource describes the conditional state (population and any exposures being compared within the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.If the element is present, it must have either a @value, an @id, or extensions")

public interface Evidence extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Evidence> T = EntityTypes.T(Evidence.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String contact = "contact";
	java.lang.String note = "note";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String effectivePeriod = "effectivePeriod";
	java.lang.String topic = "topic";
	java.lang.String author = "author";
	java.lang.String editor = "editor";
	java.lang.String reviewer = "reviewer";
	java.lang.String endorser = "endorser";
	java.lang.String relatedArtifact = "relatedArtifact";
	java.lang.String exposureBackground = "exposureBackground";
	java.lang.String exposureVariant = "exposureVariant";
	java.lang.String outcome = "outcome";

	@Description("A formal identifier that is used to identify this evidence when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("A human-readable string to clarify or explain concepts about the resource.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the evidence is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The period during which the evidence content was or is planned to be in active use.")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("Descriptive topics related to the content of the Evidence. Topics provide a high-level categorization grouping types of Evidences that can be useful for filtering and searching.")
	
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

	@Description("A reference to a EvidenceVariable resource that defines the population for the research.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getExposureBackground();
	void setExposureBackground(com.braintribe.model.generic.GenericEntity exposureBackground);
	@Description("A reference to a EvidenceVariable resource that defines the exposure for the research.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getExposureVariant();
	void setExposureVariant(java.util.List<com.braintribe.model.generic.GenericEntity> exposureVariant);

	@Description("A reference to a EvidenceVariable resomece that defines the outcome for the research.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getOutcome();
	void setOutcome(java.util.List<com.braintribe.model.generic.GenericEntity> outcome);

}
