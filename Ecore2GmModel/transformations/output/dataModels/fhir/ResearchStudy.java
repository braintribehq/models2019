/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ResearchStudy of the Data Model fhir.
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
{@link protocol}, 
{@link partOf}, 
{@link primaryPurposeType}, 
{@link phase}, 
{@link category}, 
{@link focus}, 
{@link condition}, 
{@link contact}, 
{@link relatedArtifact}, 
{@link keyword}, 
{@link location}, 
{@link enrollment}, 
{@link period}, 
{@link sponsor}, 
{@link principalInvestigator}, 
{@link site}, 
{@link reasonStopped}, 
{@link note}, 
{@link arm}, 
{@link objective}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getProtocol},
{@link getPartOf},
{@link getPrimaryPurposeType},
{@link getPhase},
{@link getCategory},
{@link getFocus},
{@link getCondition},
{@link getContact},
{@link getRelatedArtifact},
{@link getKeyword},
{@link getLocation},
{@link getEnrollment},
{@link getPeriod},
{@link getSponsor},
{@link getPrincipalInvestigator},
{@link getSite},
{@link getReasonStopped},
{@link getNote},
{@link getArm},
{@link getObjective},
{@link setIdentifier},
{@link setProtocol},
{@link setPartOf},
{@link setPrimaryPurposeType},
{@link setPhase},
{@link setCategory},
{@link setFocus},
{@link setCondition},
{@link setContact},
{@link setRelatedArtifact},
{@link setKeyword},
{@link setLocation},
{@link setEnrollment},
{@link setPeriod},
{@link setSponsor},
{@link setPrincipalInvestigator},
{@link setSite},
{@link setReasonStopped},
{@link setNote},
{@link setArm},
{@link setObjective},
 */

@Description("A process where a researcher or organization plans and then executes a series of steps intended to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy, comparative effectiveness and other information about medications, devices, therapies and other interventional and investigative techniques.  A ResearchStudy involves the gathering of information about human or animal subjects.If the element is present, it must have either a @value, an @id, or extensions")

public interface ResearchStudy extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ResearchStudy> T = EntityTypes.T(ResearchStudy.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String protocol = "protocol";
	java.lang.String partOf = "partOf";
	java.lang.String primaryPurposeType = "primaryPurposeType";
	java.lang.String phase = "phase";
	java.lang.String category = "category";
	java.lang.String focus = "focus";
	java.lang.String condition = "condition";
	java.lang.String contact = "contact";
	java.lang.String relatedArtifact = "relatedArtifact";
	java.lang.String keyword = "keyword";
	java.lang.String location = "location";
	java.lang.String enrollment = "enrollment";
	java.lang.String period = "period";
	java.lang.String sponsor = "sponsor";
	java.lang.String principalInvestigator = "principalInvestigator";
	java.lang.String site = "site";
	java.lang.String reasonStopped = "reasonStopped";
	java.lang.String note = "note";
	java.lang.String arm = "arm";
	java.lang.String objective = "objective";

	@Description("Identifiers assigned to this research study by the sponsor or other systems.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The set of steps expected to be performed as part of the execution of the study.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getProtocol();
	void setProtocol(java.util.List<com.braintribe.model.generic.GenericEntity> protocol);

	@Description("A larger research study of which this particular study is a component or step.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("The type of study based upon the intent of the study's activities. A classification of the intent of the study.")
	@Mandatory
	fhir.CodeableConcept getPrimaryPurposeType();
	void setPrimaryPurposeType(fhir.CodeableConcept primaryPurposeType);
	@Description("The stage in the progression of a therapy from initial experimental use in humans in clinical trials to post-market evaluation.")
	@Mandatory
	fhir.CodeableConcept getPhase();
	void setPhase(fhir.CodeableConcept phase);
	@Description("Codes categorizing the type of study such as investigational vs. observational, type of blinding, type of randomization, safety vs. efficacy, etc.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("The medication(s), food(s), therapy(ies), device(s) or other concerns or interventions that the study is seeking to gain more information about.")
	
	java.util.List<fhir.CodeableConcept> getFocus();
	void setFocus(java.util.List<fhir.CodeableConcept> focus);

	@Description("The condition that is the focus of the study.  For example, In a study to examine risk factors for Lupus, might have as an inclusion criterion 'healthy volunteer', but the target condition code would be a Lupus SNOMED code.")
	
	java.util.List<fhir.CodeableConcept> getCondition();
	void setCondition(java.util.List<fhir.CodeableConcept> condition);

	@Description("Contact details to assist a user in learning more about or engaging with the study.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("Citations, references and other related documents.")
	
	java.util.List<fhir.RelatedArtifact> getRelatedArtifact();
	void setRelatedArtifact(java.util.List<fhir.RelatedArtifact> relatedArtifact);

	@Description("Key terms to aid in searching for or filtering the study.")
	
	java.util.List<fhir.CodeableConcept> getKeyword();
	void setKeyword(java.util.List<fhir.CodeableConcept> keyword);

	@Description("Indicates a country, state or other region where the study is taking place.")
	
	java.util.List<fhir.CodeableConcept> getLocation();
	void setLocation(java.util.List<fhir.CodeableConcept> location);

	@Description("Reference to a Group that defines the criteria for and quantity of subjects participating in the study.  E.g. ' 200 female Europeans between the ages of 20 and 45 with early onset diabetes'.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEnrollment();
	void setEnrollment(java.util.List<com.braintribe.model.generic.GenericEntity> enrollment);

	@Description("Identifies the start date and the expected (or actual, depending on status) end date for the study.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("An organization that initiates the investigation and is legally responsible for the study.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSponsor();
	void setSponsor(com.braintribe.model.generic.GenericEntity sponsor);
	@Description("A researcher in a study who oversees multiple aspects of the study, such as concept development, protocol writing, protocol submission for IRB approval, participant recruitment, informed consent, data collection, analysis, interpretation and presentation.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPrincipalInvestigator();
	void setPrincipalInvestigator(com.braintribe.model.generic.GenericEntity principalInvestigator);
	@Description("A facility in which study activities are conducted.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSite();
	void setSite(java.util.List<com.braintribe.model.generic.GenericEntity> site);

	@Description("A description and/or code explaining the premature termination of the study.")
	@Mandatory
	fhir.CodeableConcept getReasonStopped();
	void setReasonStopped(fhir.CodeableConcept reasonStopped);
	@Description("Comments made about the study by the performer, subject or other participants.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up.")
	
	java.util.List<fhir.ResearchStudyArm> getArm();
	void setArm(java.util.List<fhir.ResearchStudyArm> arm);

	@Description("A goal that the study is aiming to achieve in terms of a scientific question to be answered by the analysis of data collected during the study.")
	
	java.util.List<fhir.ResearchStudyObjective> getObjective();
	void setObjective(java.util.List<fhir.ResearchStudyObjective> objective);

}
