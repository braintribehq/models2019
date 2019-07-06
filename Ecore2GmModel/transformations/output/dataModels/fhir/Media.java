/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Media of the Data Model fhir.
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
{@link partOf}, 
{@link type}, 
{@link modality}, 
{@link view}, 
{@link subject}, 
{@link encounter}, 
{@link createdPeriod}, 
{@link operator}, 
{@link reasonCode}, 
{@link bodySite}, 
{@link device}, 
{@link content}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getPartOf},
{@link getType},
{@link getModality},
{@link getView},
{@link getSubject},
{@link getEncounter},
{@link getCreatedPeriod},
{@link getOperator},
{@link getReasonCode},
{@link getBodySite},
{@link getDevice},
{@link getContent},
{@link getNote},
{@link setIdentifier},
{@link setBasedOn},
{@link setPartOf},
{@link setType},
{@link setModality},
{@link setView},
{@link setSubject},
{@link setEncounter},
{@link setCreatedPeriod},
{@link setOperator},
{@link setReasonCode},
{@link setBodySite},
{@link setDevice},
{@link setContent},
{@link setNote},
 */

@Description("A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.If the element is present, it must have either a @value, an @id, or extensions")

public interface Media extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Media> T = EntityTypes.T(Media.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String partOf = "partOf";
	java.lang.String type = "type";
	java.lang.String modality = "modality";
	java.lang.String view = "view";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String createdPeriod = "createdPeriod";
	java.lang.String operator = "operator";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String bodySite = "bodySite";
	java.lang.String device = "device";
	java.lang.String content = "content";
	java.lang.String note = "note";

	@Description("Identifiers associated with the image - these may include identifiers for the image itself, identifiers for the context of its collection (e.g. series ids) and context ids such as accession numbers or other workflow identifiers.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A procedure that is fulfilled in whole or in part by the creation of this media.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("A larger event of which this particular event is a component or step.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("A code that classifies whether the media is an image, video or audio recording or some other media category.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Details of the type of the media - usually, how it was acquired (what type of device). If images sourced from a DICOM system, are wrapped in a Media resource, then this is the modality.")
	@Mandatory
	fhir.CodeableConcept getModality();
	void setModality(fhir.CodeableConcept modality);
	@Description("The name of the imaging view e.g. Lateral or Antero-posterior (AP).")
	@Mandatory
	fhir.CodeableConcept getView();
	void setView(fhir.CodeableConcept view);
	@Description("Who/What this Media is a record of.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The encounter that establishes the context for this media.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Period getCreatedPeriod();
	void setCreatedPeriod(fhir.Period createdPeriod);
	@Description("The person who administered the collection of the image.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOperator();
	void setOperator(com.braintribe.model.generic.GenericEntity operator);
	@Description("Describes why the event occurred in coded or textual form.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates the site on the subject's body where the observation was made (i.e. the target site).")
	@Mandatory
	fhir.CodeableConcept getBodySite();
	void setBodySite(fhir.CodeableConcept bodySite);
	@Description("The device used to collect the media.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDevice();
	void setDevice(com.braintribe.model.generic.GenericEntity device);
	@Description("The actual content of the media - inline or by direct reference to the media source file.")
	@Mandatory
	fhir.Attachment getContent();
	void setContent(fhir.Attachment content);
	@Description("Comments made about the media by the performer, subject or other participants.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
