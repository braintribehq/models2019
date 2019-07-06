/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DocumentReference of the Data Model fhir.
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
{@link category}, 
{@link subject}, 
{@link author}, 
{@link authenticator}, 
{@link custodian}, 
{@link relatesTo}, 
{@link securityLabel}, 
{@link content}, 
{@link context}, 

* It provides of then following operations (getters and setters)
{@link getMasterIdentifier},
{@link getIdentifier},
{@link getType},
{@link getCategory},
{@link getSubject},
{@link getAuthor},
{@link getAuthenticator},
{@link getCustodian},
{@link getRelatesTo},
{@link getSecurityLabel},
{@link getContent},
{@link getContext},
{@link setMasterIdentifier},
{@link setIdentifier},
{@link setType},
{@link setCategory},
{@link setSubject},
{@link setAuthor},
{@link setAuthenticator},
{@link setCustodian},
{@link setRelatesTo},
{@link setSecurityLabel},
{@link setContent},
{@link setContext},
 */

@Description("A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.If the element is present, it must have either a @value, an @id, or extensions")

public interface DocumentReference extends GenericEntity, fhir.FhirDomainResource {

	EntityType<DocumentReference> T = EntityTypes.T(DocumentReference.class);

	/* Constants for each property name. */
	java.lang.String masterIdentifier = "masterIdentifier";
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String category = "category";
	java.lang.String subject = "subject";
	java.lang.String author = "author";
	java.lang.String authenticator = "authenticator";
	java.lang.String custodian = "custodian";
	java.lang.String relatesTo = "relatesTo";
	java.lang.String securityLabel = "securityLabel";
	java.lang.String content = "content";
	java.lang.String context = "context";

	@Description("Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.")
	@Mandatory
	fhir.Identifier getMasterIdentifier();
	void setMasterIdentifier(fhir.Identifier masterIdentifier);
	@Description("Other identifiers associated with the document, including version independent identifiers.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Specifies the particular kind of document referenced  (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the document referenced.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("A categorization for the type of document referenced - helps for indexing and searching. This may be implied by or derived from the code specified in the DocumentReference.type.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Identifies who is responsible for adding the information to the document.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAuthor();
	void setAuthor(java.util.List<com.braintribe.model.generic.GenericEntity> author);

	@Description("Which person or organization authenticates that this document is valid.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAuthenticator();
	void setAuthenticator(com.braintribe.model.generic.GenericEntity authenticator);
	@Description("Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCustodian();
	void setCustodian(com.braintribe.model.generic.GenericEntity custodian);
	@Description("Relationships that this document has with other document references that already exist.")
	
	java.util.List<fhir.DocumentReferenceRelatesTo> getRelatesTo();
	void setRelatesTo(java.util.List<fhir.DocumentReferenceRelatesTo> relatesTo);

	@Description("A set of Security-Tag codes specifying the level of privacy/security of the Document. Note that DocumentReference.meta.security contains the security labels of the 'reference' to the document, while DocumentReference.securityLabel contains a snapshot of the security labels on the document the reference refers to.")
	
	java.util.List<fhir.CodeableConcept> getSecurityLabel();
	void setSecurityLabel(java.util.List<fhir.CodeableConcept> securityLabel);

	@Description("The document and format referenced. There may be multiple content element repetitions, each with a different format.")
	
	java.util.List<fhir.DocumentReferenceContent> getContent();
	void setContent(java.util.List<fhir.DocumentReferenceContent> content);

	@Description("The clinical context in which the document was prepared.")
	@Mandatory
	fhir.DocumentReferenceContext getContext();
	void setContext(fhir.DocumentReferenceContext context);
}
