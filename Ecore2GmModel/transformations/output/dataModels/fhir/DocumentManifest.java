/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DocumentManifest of the Data Model fhir.
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
{@link masterIdentifier}, 
{@link identifier}, 
{@link type}, 
{@link subject}, 
{@link author}, 
{@link recipient}, 
{@link content}, 
{@link related}, 

* It provides of then following operations (getters and setters)
{@link getMasterIdentifier},
{@link getIdentifier},
{@link getType},
{@link getSubject},
{@link getAuthor},
{@link getRecipient},
{@link getContent},
{@link getRelated},
{@link setMasterIdentifier},
{@link setIdentifier},
{@link setType},
{@link setSubject},
{@link setAuthor},
{@link setRecipient},
{@link setContent},
{@link setRelated},
 */

@Description("A collection of documents compiled for a purpose together with metadata that applies to the collection.If the element is present, it must have either a @value, an @id, or extensions")

public interface DocumentManifest extends GenericEntity, fhir.FhirDomainResource {

	EntityType<DocumentManifest> T = EntityTypes.T(DocumentManifest.class);

	/* Constants for each property name. */
	java.lang.String masterIdentifier = "masterIdentifier";
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String subject = "subject";
	java.lang.String author = "author";
	java.lang.String recipient = "recipient";
	java.lang.String content = "content";
	java.lang.String related = "related";

	@Description("A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.")
	@Mandatory
	fhir.Identifier getMasterIdentifier();
	void setMasterIdentifier(fhir.Identifier masterIdentifier);
	@Description("Other identifiers associated with the document manifest, including version independent  identifiers.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The code specifying the type of clinical activity that resulted in placing the associated content into the DocumentManifest.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Identifies who is the author of the manifest. Manifest author is not necessarly the author of the references included.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAuthor();
	void setAuthor(java.util.List<com.braintribe.model.generic.GenericEntity> author);

	@Description("A patient, practitioner, or organization for which this set of documents is intended.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRecipient();
	void setRecipient(java.util.List<com.braintribe.model.generic.GenericEntity> recipient);

	@Description("The list of Resources that consist of the parts of this manifest.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getContent();
	void setContent(java.util.List<com.braintribe.model.generic.GenericEntity> content);

	@Description("Related identifiers or resources associated with the DocumentManifest.")
	
	java.util.List<fhir.DocumentManifestRelated> getRelated();
	void setRelated(java.util.List<fhir.DocumentManifestRelated> related);

}
