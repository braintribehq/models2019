/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EffectEvidenceSynthesis of the Data Model fhir.
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
{@link synthesisType}, 
{@link studyType}, 
{@link population}, 
{@link exposure}, 
{@link exposureAlternative}, 
{@link outcome}, 
{@link sampleSize}, 
{@link resultsByExposure}, 
{@link effectEstimate}, 
{@link certainty}, 

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
{@link getSynthesisType},
{@link getStudyType},
{@link getPopulation},
{@link getExposure},
{@link getExposureAlternative},
{@link getOutcome},
{@link getSampleSize},
{@link getResultsByExposure},
{@link getEffectEstimate},
{@link getCertainty},
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
{@link setSynthesisType},
{@link setStudyType},
{@link setPopulation},
{@link setExposure},
{@link setExposureAlternative},
{@link setOutcome},
{@link setSampleSize},
{@link setResultsByExposure},
{@link setEffectEstimate},
{@link setCertainty},
 */

@Description("The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.If the element is present, it must have either a @value, an @id, or extensions")

public interface EffectEvidenceSynthesis extends GenericEntity, fhir.FhirDomainResource {

	EntityType<EffectEvidenceSynthesis> T = EntityTypes.T(EffectEvidenceSynthesis.class);

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
	java.lang.String synthesisType = "synthesisType";
	java.lang.String studyType = "studyType";
	java.lang.String population = "population";
	java.lang.String exposure = "exposure";
	java.lang.String exposureAlternative = "exposureAlternative";
	java.lang.String outcome = "outcome";
	java.lang.String sampleSize = "sampleSize";
	java.lang.String resultsByExposure = "resultsByExposure";
	java.lang.String effectEstimate = "effectEstimate";
	java.lang.String certainty = "certainty";

	@Description("A formal identifier that is used to identify this effect evidence synthesis when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("A human-readable string to clarify or explain concepts about the resource.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate effect evidence synthesis instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the effect evidence synthesis is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The period during which the effect evidence synthesis content was or is planned to be in active use.")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("Descriptive topics related to the content of the EffectEvidenceSynthesis. Topics provide a high-level categorization grouping types of EffectEvidenceSynthesiss that can be useful for filtering and searching.")
	
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

	@Description("Type of synthesis eg meta-analysis.")
	@Mandatory
	fhir.CodeableConcept getSynthesisType();
	void setSynthesisType(fhir.CodeableConcept synthesisType);
	@Description("Type of study eg randomized trial.")
	@Mandatory
	fhir.CodeableConcept getStudyType();
	void setStudyType(fhir.CodeableConcept studyType);
	@Description("A reference to a EvidenceVariable resource that defines the population for the research.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPopulation();
	void setPopulation(com.braintribe.model.generic.GenericEntity population);
	@Description("A reference to a EvidenceVariable resource that defines the exposure for the research.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getExposure();
	void setExposure(com.braintribe.model.generic.GenericEntity exposure);
	@Description("A reference to a EvidenceVariable resource that defines the comparison exposure for the research.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getExposureAlternative();
	void setExposureAlternative(com.braintribe.model.generic.GenericEntity exposureAlternative);
	@Description("A reference to a EvidenceVariable resomece that defines the outcome for the research.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOutcome();
	void setOutcome(com.braintribe.model.generic.GenericEntity outcome);
	@Description("A description of the size of the sample involved in the synthesis.")
	@Mandatory
	fhir.EffectEvidenceSynthesisSampleSize getSampleSize();
	void setSampleSize(fhir.EffectEvidenceSynthesisSampleSize sampleSize);
	@Description("A description of the results for each exposure considered in the effect estimate.")
	
	java.util.List<fhir.EffectEvidenceSynthesisResultsByExposure> getResultsByExposure();
	void setResultsByExposure(java.util.List<fhir.EffectEvidenceSynthesisResultsByExposure> resultsByExposure);

	@Description("The estimated effect of the exposure variant.")
	
	java.util.List<fhir.EffectEvidenceSynthesisEffectEstimate> getEffectEstimate();
	void setEffectEstimate(java.util.List<fhir.EffectEvidenceSynthesisEffectEstimate> effectEstimate);

	@Description("A description of the certainty of the effect estimate.")
	
	java.util.List<fhir.EffectEvidenceSynthesisCertainty> getCertainty();
	void setCertainty(java.util.List<fhir.EffectEvidenceSynthesisCertainty> certainty);

}
