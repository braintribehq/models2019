/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImagingStudy of the Data Model fhir.
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
{@link modality}, 
{@link subject}, 
{@link encounter}, 
{@link basedOn}, 
{@link referrer}, 
{@link interpreter}, 
{@link endpoint}, 
{@link procedureReference}, 
{@link procedureCode}, 
{@link location}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link note}, 
{@link series}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getModality},
{@link getSubject},
{@link getEncounter},
{@link getBasedOn},
{@link getReferrer},
{@link getInterpreter},
{@link getEndpoint},
{@link getProcedureReference},
{@link getProcedureCode},
{@link getLocation},
{@link getReasonCode},
{@link getReasonReference},
{@link getNote},
{@link getSeries},
{@link setIdentifier},
{@link setModality},
{@link setSubject},
{@link setEncounter},
{@link setBasedOn},
{@link setReferrer},
{@link setInterpreter},
{@link setEndpoint},
{@link setProcedureReference},
{@link setProcedureCode},
{@link setLocation},
{@link setReasonCode},
{@link setReasonReference},
{@link setNote},
{@link setSeries},
 */

@Description("Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.If the element is present, it must have either a @value, an @id, or extensions")

public interface ImagingStudy extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ImagingStudy> T = EntityTypes.T(ImagingStudy.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String modality = "modality";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String basedOn = "basedOn";
	java.lang.String referrer = "referrer";
	java.lang.String interpreter = "interpreter";
	java.lang.String endpoint = "endpoint";
	java.lang.String procedureReference = "procedureReference";
	java.lang.String procedureCode = "procedureCode";
	java.lang.String location = "location";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String note = "note";
	java.lang.String series = "series";

	@Description("Identifiers for the ImagingStudy such as DICOM Study Instance UID, and Accession Number.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A list of all the series.modality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19).")
	
	java.util.List<fhir.Coding> getModality();
	void setModality(java.util.List<fhir.Coding> modality);

	@Description("The subject, typically a patient, of the imaging study.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The healthcare event (e.g. a patient and healthcare provider interaction) during which this ImagingStudy is made.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("A list of the diagnostic requests that resulted in this imaging study being performed.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("The requesting/referring physician.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReferrer();
	void setReferrer(com.braintribe.model.generic.GenericEntity referrer);
	@Description("Who read the study and interpreted the images or other content.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getInterpreter();
	void setInterpreter(java.util.List<com.braintribe.model.generic.GenericEntity> interpreter);

	@Description("The network service providing access (e.g., query, view, or retrieval) for the study. See implementation notes for information about using DICOM endpoints. A study-level endpoint applies to each series in the study, unless overridden by a series-level endpoint with the same Endpoint.connectionType.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEndpoint();
	void setEndpoint(java.util.List<com.braintribe.model.generic.GenericEntity> endpoint);

	@Description("The procedure which this ImagingStudy was part of.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProcedureReference();
	void setProcedureReference(com.braintribe.model.generic.GenericEntity procedureReference);
	@Description("The code for the performed procedure type.")
	
	java.util.List<fhir.CodeableConcept> getProcedureCode();
	void setProcedureCode(java.util.List<fhir.CodeableConcept> procedureCode);

	@Description("The principal physical location where the ImagingStudy was performed.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("Description of clinical condition indicating why the ImagingStudy was requested.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates another resource whose existence justifies this Study.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Per the recommended DICOM mapping, this element is derived from the Study Description attribute (0008,1030). Observations or findings about the imaging study should be recorded in another resource, e.g. Observation, and not in this element.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Each study has one or more series of images or other content.")
	
	java.util.List<fhir.ImagingStudySeries> getSeries();
	void setSeries(java.util.List<fhir.ImagingStudySeries> series);

}
