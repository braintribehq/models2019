/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DiagnosticReport of the Data Model fhir.
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
{@link category}, 
{@link code}, 
{@link subject}, 
{@link encounter}, 
{@link effectivePeriod}, 
{@link performer}, 
{@link resultsInterpreter}, 
{@link specimen}, 
{@link result}, 
{@link imagingStudy}, 
{@link media}, 
{@link conclusionCode}, 
{@link presentedForm}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getCategory},
{@link getCode},
{@link getSubject},
{@link getEncounter},
{@link getEffectivePeriod},
{@link getPerformer},
{@link getResultsInterpreter},
{@link getSpecimen},
{@link getResult},
{@link getImagingStudy},
{@link getMedia},
{@link getConclusionCode},
{@link getPresentedForm},
{@link setIdentifier},
{@link setBasedOn},
{@link setCategory},
{@link setCode},
{@link setSubject},
{@link setEncounter},
{@link setEffectivePeriod},
{@link setPerformer},
{@link setResultsInterpreter},
{@link setSpecimen},
{@link setResult},
{@link setImagingStudy},
{@link setMedia},
{@link setConclusionCode},
{@link setPresentedForm},
 */

@Description("The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.If the element is present, it must have either a @value, an @id, or extensions")

public interface DiagnosticReport extends GenericEntity, fhir.FhirDomainResource {

	EntityType<DiagnosticReport> T = EntityTypes.T(DiagnosticReport.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String effectivePeriod = "effectivePeriod";
	java.lang.String performer = "performer";
	java.lang.String resultsInterpreter = "resultsInterpreter";
	java.lang.String specimen = "specimen";
	java.lang.String result = "result";
	java.lang.String imagingStudy = "imagingStudy";
	java.lang.String media = "media";
	java.lang.String conclusionCode = "conclusionCode";
	java.lang.String presentedForm = "presentedForm";

	@Description("Identifiers assigned to this report by the performer or other systems.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Details concerning a service requested.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("A code that classifies the clinical discipline, department or diagnostic service that created the report (e.g. cardiology, biochemistry, hematology, MRI). This is used for searching, sorting and display purposes.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("A code or name that describes this diagnostic report.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The subject of the report. Usually, but not always, this is a patient. However, diagnostic services also perform analyses on specimens collected from a variety of other sources.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The healthcare event  (e.g. a patient and healthcare provider interaction) which this DiagnosticReport is about.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("The diagnostic service that is responsible for issuing the report.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPerformer();
	void setPerformer(java.util.List<com.braintribe.model.generic.GenericEntity> performer);

	@Description("The practitioner or organization that is responsible for the report's conclusions and interpretations.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getResultsInterpreter();
	void setResultsInterpreter(java.util.List<com.braintribe.model.generic.GenericEntity> resultsInterpreter);

	@Description("Details about the specimens on which this diagnostic report is based.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSpecimen();
	void setSpecimen(java.util.List<com.braintribe.model.generic.GenericEntity> specimen);

	@Description("[Observations](observation.html)  that are part of this diagnostic report.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getResult();
	void setResult(java.util.List<com.braintribe.model.generic.GenericEntity> result);

	@Description("One or more links to full details of any imaging performed during the diagnostic investigation. Typically, this is imaging performed by DICOM enabled modalities, but this is not required. A fully enabled PACS viewer can use this information to provide views of the source images.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getImagingStudy();
	void setImagingStudy(java.util.List<com.braintribe.model.generic.GenericEntity> imagingStudy);

	@Description("A list of key images associated with this report. The images are generally created during the diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of interest).")
	
	java.util.List<fhir.DiagnosticReportMedia> getMedia();
	void setMedia(java.util.List<fhir.DiagnosticReportMedia> media);

	@Description("One or more codes that represent the summary conclusion (interpretation/impression) of the diagnostic report.")
	
	java.util.List<fhir.CodeableConcept> getConclusionCode();
	void setConclusionCode(java.util.List<fhir.CodeableConcept> conclusionCode);

	@Description("Rich text representation of the entire result as issued by the diagnostic service. Multiple formats are allowed but they SHALL be semantically equivalent.")
	
	java.util.List<fhir.Attachment> getPresentedForm();
	void setPresentedForm(java.util.List<fhir.Attachment> presentedForm);

}
