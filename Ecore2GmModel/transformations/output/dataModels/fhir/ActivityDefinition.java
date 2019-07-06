/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ActivityDefinition of the Data Model fhir.
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
{@link code}, 
{@link timingTiming}, 
{@link timingAge}, 
{@link timingPeriod}, 
{@link timingRange}, 
{@link timingDuration}, 
{@link location}, 
{@link participant}, 
{@link productReference}, 
{@link productCodeableConcept}, 
{@link quantity}, 
{@link dosage}, 
{@link bodySite}, 
{@link specimenRequirement}, 
{@link observationRequirement}, 
{@link observationResultRequirement}, 
{@link dynamicValue}, 

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
{@link getCode},
{@link getTimingTiming},
{@link getTimingAge},
{@link getTimingPeriod},
{@link getTimingRange},
{@link getTimingDuration},
{@link getLocation},
{@link getParticipant},
{@link getProductReference},
{@link getProductCodeableConcept},
{@link getQuantity},
{@link getDosage},
{@link getBodySite},
{@link getSpecimenRequirement},
{@link getObservationRequirement},
{@link getObservationResultRequirement},
{@link getDynamicValue},
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
{@link setCode},
{@link setTimingTiming},
{@link setTimingAge},
{@link setTimingPeriod},
{@link setTimingRange},
{@link setTimingDuration},
{@link setLocation},
{@link setParticipant},
{@link setProductReference},
{@link setProductCodeableConcept},
{@link setQuantity},
{@link setDosage},
{@link setBodySite},
{@link setSpecimenRequirement},
{@link setObservationRequirement},
{@link setObservationResultRequirement},
{@link setDynamicValue},
 */

@Description("This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.If the element is present, it must have either a @value, an @id, or extensions")

public interface ActivityDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ActivityDefinition> T = EntityTypes.T(ActivityDefinition.class);

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
	java.lang.String code = "code";
	java.lang.String timingTiming = "timingTiming";
	java.lang.String timingAge = "timingAge";
	java.lang.String timingPeriod = "timingPeriod";
	java.lang.String timingRange = "timingRange";
	java.lang.String timingDuration = "timingDuration";
	java.lang.String location = "location";
	java.lang.String participant = "participant";
	java.lang.String productReference = "productReference";
	java.lang.String productCodeableConcept = "productCodeableConcept";
	java.lang.String quantity = "quantity";
	java.lang.String dosage = "dosage";
	java.lang.String bodySite = "bodySite";
	java.lang.String specimenRequirement = "specimenRequirement";
	java.lang.String observationRequirement = "observationRequirement";
	java.lang.String observationResultRequirement = "observationResultRequirement";
	java.lang.String dynamicValue = "dynamicValue";

	@Description("A formal identifier that is used to identify this activity definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
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

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate activity definition instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the activity definition is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("The period during which the activity definition content was or is planned to be in active use.")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("Descriptive topics related to the content of the activity. Topics provide a high-level categorization of the activity that can be useful for filtering and searching.")
	
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

	@Description("Detailed description of the type of activity; e.g. What lab test, what procedure, what kind of encounter.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("")
	@Mandatory
	fhir.Timing getTimingTiming();
	void setTimingTiming(fhir.Timing timingTiming);
	@Description("")
	@Mandatory
	fhir.Age getTimingAge();
	void setTimingAge(fhir.Age timingAge);
	@Description("")
	@Mandatory
	fhir.Period getTimingPeriod();
	void setTimingPeriod(fhir.Period timingPeriod);
	@Description("")
	@Mandatory
	fhir.Range getTimingRange();
	void setTimingRange(fhir.Range timingRange);
	@Description("")
	@Mandatory
	fhir.Duration getTimingDuration();
	void setTimingDuration(fhir.Duration timingDuration);
	@Description("Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("Indicates who should participate in performing the action described.")
	
	java.util.List<fhir.ActivityDefinitionParticipant> getParticipant();
	void setParticipant(java.util.List<fhir.ActivityDefinitionParticipant> participant);

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProductReference();
	void setProductReference(com.braintribe.model.generic.GenericEntity productReference);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getProductCodeableConcept();
	void setProductCodeableConcept(fhir.CodeableConcept productCodeableConcept);
	@Description("Identifies the quantity expected to be consumed at once (per dose, per meal, etc.).")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("Provides detailed dosage instructions in the same way that they are described for MedicationRequest resources.")
	
	java.util.List<fhir.Dosage> getDosage();
	void setDosage(java.util.List<fhir.Dosage> dosage);

	@Description("Indicates the sites on the subject's body where the procedure should be performed (I.e. the target sites).")
	
	java.util.List<fhir.CodeableConcept> getBodySite();
	void setBodySite(java.util.List<fhir.CodeableConcept> bodySite);

	@Description("Defines specimen requirements for the action to be performed, such as required specimens for a lab test.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSpecimenRequirement();
	void setSpecimenRequirement(java.util.List<com.braintribe.model.generic.GenericEntity> specimenRequirement);

	@Description("Defines observation requirements for the action to be performed, such as body weight or surface area.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getObservationRequirement();
	void setObservationRequirement(java.util.List<com.braintribe.model.generic.GenericEntity> observationRequirement);

	@Description("Defines the observations that are expected to be produced by the action.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getObservationResultRequirement();
	void setObservationResultRequirement(java.util.List<com.braintribe.model.generic.GenericEntity> observationResultRequirement);

	@Description("Dynamic values that will be evaluated to produce values for elements of the resulting resource. For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic value would be used to specify an expression that calculated the weight, and the path on the request resource that would contain the result.")
	
	java.util.List<fhir.ActivityDefinitionDynamicValue> getDynamicValue();
	void setDynamicValue(java.util.List<fhir.ActivityDefinitionDynamicValue> dynamicValue);

}
