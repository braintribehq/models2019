/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BodyStructure of the Data Model fhir.
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
{@link morphology}, 
{@link location}, 
{@link locationQualifier}, 
{@link image}, 
{@link patient}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getMorphology},
{@link getLocation},
{@link getLocationQualifier},
{@link getImage},
{@link getPatient},
{@link setIdentifier},
{@link setMorphology},
{@link setLocation},
{@link setLocationQualifier},
{@link setImage},
{@link setPatient},
 */

@Description("Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.If the element is present, it must have either a @value, an @id, or extensions")

public interface BodyStructure extends GenericEntity, fhir.FhirDomainResource {

	EntityType<BodyStructure> T = EntityTypes.T(BodyStructure.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String morphology = "morphology";
	java.lang.String location = "location";
	java.lang.String locationQualifier = "locationQualifier";
	java.lang.String image = "image";
	java.lang.String patient = "patient";

	@Description("Identifier for this instance of the anatomical structure.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The kind of structure being represented by the body structure at `BodyStructure.location`.  This can define both normal and abnormal morphologies.")
	@Mandatory
	fhir.CodeableConcept getMorphology();
	void setMorphology(fhir.CodeableConcept morphology);
	@Description("The anatomical location or region of the specimen, lesion, or body structure.")
	@Mandatory
	fhir.CodeableConcept getLocation();
	void setLocation(fhir.CodeableConcept location);
	@Description("Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.")
	
	java.util.List<fhir.CodeableConcept> getLocationQualifier();
	void setLocationQualifier(java.util.List<fhir.CodeableConcept> locationQualifier);

	@Description("Image or images used to identify a location.")
	
	java.util.List<fhir.Attachment> getImage();
	void setImage(java.util.List<fhir.Attachment> image);

	@Description("The person to which the body site belongs.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
}
