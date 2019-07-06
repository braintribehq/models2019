/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Specimen of the Data Model fhir.
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
{@link accessionIdentifier}, 
{@link type}, 
{@link subject}, 
{@link parent}, 
{@link request}, 
{@link collection}, 
{@link processing}, 
{@link container}, 
{@link condition}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getAccessionIdentifier},
{@link getType},
{@link getSubject},
{@link getParent},
{@link getRequest},
{@link getCollection},
{@link getProcessing},
{@link getContainer},
{@link getCondition},
{@link getNote},
{@link setIdentifier},
{@link setAccessionIdentifier},
{@link setType},
{@link setSubject},
{@link setParent},
{@link setRequest},
{@link setCollection},
{@link setProcessing},
{@link setContainer},
{@link setCondition},
{@link setNote},
 */

@Description("A sample to be used for analysis.If the element is present, it must have either a @value, an @id, or extensions")

public interface Specimen extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Specimen> T = EntityTypes.T(Specimen.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String accessionIdentifier = "accessionIdentifier";
	java.lang.String type = "type";
	java.lang.String subject = "subject";
	java.lang.String parent = "parent";
	java.lang.String request = "request";
	java.lang.String collection = "collection";
	java.lang.String processing = "processing";
	java.lang.String container = "container";
	java.lang.String condition = "condition";
	java.lang.String note = "note";

	@Description("Id for specimen.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.")
	@Mandatory
	fhir.Identifier getAccessionIdentifier();
	void setAccessionIdentifier(fhir.Identifier accessionIdentifier);
	@Description("The kind of material that forms the specimen.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Where the specimen came from. This may be from patient(s), from a location (e.g., the source of an environmental sample), or a sampling of a substance or a device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getParent();
	void setParent(java.util.List<com.braintribe.model.generic.GenericEntity> parent);

	@Description("Details concerning a service request that required a specimen to be collected.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRequest();
	void setRequest(java.util.List<com.braintribe.model.generic.GenericEntity> request);

	@Description("Details concerning the specimen collection.")
	@Mandatory
	fhir.SpecimenCollection getCollection();
	void setCollection(fhir.SpecimenCollection collection);
	@Description("Details concerning processing and processing steps for the specimen.")
	
	java.util.List<fhir.SpecimenProcessing> getProcessing();
	void setProcessing(java.util.List<fhir.SpecimenProcessing> processing);

	@Description("The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.")
	
	java.util.List<fhir.SpecimenContainer> getContainer();
	void setContainer(java.util.List<fhir.SpecimenContainer> container);

	@Description("A mode or state of being that describes the nature of the specimen.")
	
	java.util.List<fhir.CodeableConcept> getCondition();
	void setCondition(java.util.List<fhir.CodeableConcept> condition);

	@Description("To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
