/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClinicalImpression of the Data Model fhir.
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
{@link statusReason}, 
{@link code}, 
{@link subject}, 
{@link encounter}, 
{@link effectivePeriod}, 
{@link assessor}, 
{@link previous}, 
{@link problem}, 
{@link investigation}, 
{@link finding}, 
{@link prognosisCodeableConcept}, 
{@link prognosisReference}, 
{@link supportingInfo}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getStatusReason},
{@link getCode},
{@link getSubject},
{@link getEncounter},
{@link getEffectivePeriod},
{@link getAssessor},
{@link getPrevious},
{@link getProblem},
{@link getInvestigation},
{@link getFinding},
{@link getPrognosisCodeableConcept},
{@link getPrognosisReference},
{@link getSupportingInfo},
{@link getNote},
{@link setIdentifier},
{@link setStatusReason},
{@link setCode},
{@link setSubject},
{@link setEncounter},
{@link setEffectivePeriod},
{@link setAssessor},
{@link setPrevious},
{@link setProblem},
{@link setInvestigation},
{@link setFinding},
{@link setPrognosisCodeableConcept},
{@link setPrognosisReference},
{@link setSupportingInfo},
{@link setNote},
 */

@Description("A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called 'ClinicalImpression' rather than 'ClinicalAssessment' to avoid confusion with the recording of assessment tools such as Apgar score.If the element is present, it must have either a @value, an @id, or extensions")

public interface ClinicalImpression extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ClinicalImpression> T = EntityTypes.T(ClinicalImpression.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String statusReason = "statusReason";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String effectivePeriod = "effectivePeriod";
	java.lang.String assessor = "assessor";
	java.lang.String previous = "previous";
	java.lang.String problem = "problem";
	java.lang.String investigation = "investigation";
	java.lang.String finding = "finding";
	java.lang.String prognosisCodeableConcept = "prognosisCodeableConcept";
	java.lang.String prognosisReference = "prognosisReference";
	java.lang.String supportingInfo = "supportingInfo";
	java.lang.String note = "note";

	@Description("Business identifiers assigned to this clinical impression by the performer or other systems which remain constant as the resource is updated and propagates from server to server.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Captures the reason for the current state of the ClinicalImpression.")
	@Mandatory
	fhir.CodeableConcept getStatusReason();
	void setStatusReason(fhir.CodeableConcept statusReason);
	@Description("Categorizes the type of clinical assessment performed.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The patient or group of individuals assessed as part of this record.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The Encounter during which this ClinicalImpression was created or to which the creation of this record is tightly associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("The clinician performing the assessment.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAssessor();
	void setAssessor(com.braintribe.model.generic.GenericEntity assessor);
	@Description("A reference to the last assessment that was conducted on this patient. Assessments are often/usually ongoing in nature; a care provider (practitioner or team) will make new assessments on an ongoing basis as new data arises or the patient's conditions changes.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPrevious();
	void setPrevious(com.braintribe.model.generic.GenericEntity previous);
	@Description("A list of the relevant problems/conditions for a patient.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getProblem();
	void setProblem(java.util.List<com.braintribe.model.generic.GenericEntity> problem);

	@Description("One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations varies greatly depending on the type and context of the assessment. These investigations may include data generated during the assessment process, or data previously generated and recorded that is pertinent to the outcomes.")
	
	java.util.List<fhir.ClinicalImpressionInvestigation> getInvestigation();
	void setInvestigation(java.util.List<fhir.ClinicalImpressionInvestigation> investigation);

	@Description("Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.")
	
	java.util.List<fhir.ClinicalImpressionFinding> getFinding();
	void setFinding(java.util.List<fhir.ClinicalImpressionFinding> finding);

	@Description("Estimate of likely outcome.")
	
	java.util.List<fhir.CodeableConcept> getPrognosisCodeableConcept();
	void setPrognosisCodeableConcept(java.util.List<fhir.CodeableConcept> prognosisCodeableConcept);

	@Description("RiskAssessment expressing likely outcome.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPrognosisReference();
	void setPrognosisReference(java.util.List<com.braintribe.model.generic.GenericEntity> prognosisReference);

	@Description("Information supporting the clinical impression.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSupportingInfo();
	void setSupportingInfo(java.util.List<com.braintribe.model.generic.GenericEntity> supportingInfo);

	@Description("Commentary about the impression, typically recorded after the impression itself was made, though supplemental notes by the original author could also appear.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
