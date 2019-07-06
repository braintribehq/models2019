/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ImagingStudySeries of the Data Model fhir.
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
{@link modality}, 
{@link endpoint}, 
{@link bodySite}, 
{@link laterality}, 
{@link specimen}, 
{@link performer}, 
{@link instance}, 

* It provides of then following operations (getters and setters)
{@link getModality},
{@link getEndpoint},
{@link getBodySite},
{@link getLaterality},
{@link getSpecimen},
{@link getPerformer},
{@link getInstance},
{@link setModality},
{@link setEndpoint},
{@link setBodySite},
{@link setLaterality},
{@link setSpecimen},
{@link setPerformer},
{@link setInstance},
 */

@Description("Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.")

public interface ImagingStudySeries extends GenericEntity, fhir.BackboneElement {

	EntityType<ImagingStudySeries> T = EntityTypes.T(ImagingStudySeries.class);

	/* Constants for each property name. */
	java.lang.String modality = "modality";
	java.lang.String endpoint = "endpoint";
	java.lang.String bodySite = "bodySite";
	java.lang.String laterality = "laterality";
	java.lang.String specimen = "specimen";
	java.lang.String performer = "performer";
	java.lang.String instance = "instance";

	@Description("The modality of this series sequence.")
	@Mandatory
	fhir.Coding getModality();
	void setModality(fhir.Coding modality);
	@Description("The network service providing access (e.g., query, view, or retrieval) for this series. See implementation notes for information about using DICOM endpoints. A series-level endpoint, if present, has precedence over a study-level endpoint with the same Endpoint.connectionType.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getEndpoint();
	void setEndpoint(java.util.List<com.braintribe.model.generic.GenericEntity> endpoint);

	@Description("The anatomic structures examined. See DICOM Part 16 Annex L (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html) for DICOM to SNOMED-CT mappings. The bodySite may indicate the laterality of body part imaged; if so, it shall be consistent with any content of ImagingStudy.series.laterality.")
	@Mandatory
	fhir.Coding getBodySite();
	void setBodySite(fhir.Coding bodySite);
	@Description("The laterality of the (possibly paired) anatomic structures examined. E.g., the left knee, both lungs, or unpaired abdomen. If present, shall be consistent with any laterality information indicated in ImagingStudy.series.bodySite.")
	@Mandatory
	fhir.Coding getLaterality();
	void setLaterality(fhir.Coding laterality);
	@Description("The specimen imaged, e.g., for whole slide imaging of a biopsy.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getSpecimen();
	void setSpecimen(java.util.List<com.braintribe.model.generic.GenericEntity> specimen);

	@Description("Indicates who or what performed the series and how they were involved.")
	
	java.util.List<fhir.ImagingStudyPerformer> getPerformer();
	void setPerformer(java.util.List<fhir.ImagingStudyPerformer> performer);

	@Description("A single SOP instance within the series, e.g. an image, or presentation state.")
	
	java.util.List<fhir.ImagingStudyInstance> getInstance();
	void setInstance(java.util.List<fhir.ImagingStudyInstance> instance);

}
