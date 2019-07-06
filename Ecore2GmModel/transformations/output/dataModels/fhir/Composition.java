/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Composition of the Data Model fhir.
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
{@link type}, 
{@link category}, 
{@link subject}, 
{@link encounter}, 
{@link author}, 
{@link attester}, 
{@link custodian}, 
{@link relatesTo}, 
{@link event}, 
{@link section}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getType},
{@link getCategory},
{@link getSubject},
{@link getEncounter},
{@link getAuthor},
{@link getAttester},
{@link getCustodian},
{@link getRelatesTo},
{@link getEvent},
{@link getSection},
{@link setIdentifier},
{@link setType},
{@link setCategory},
{@link setSubject},
{@link setEncounter},
{@link setAuthor},
{@link setAttester},
{@link setCustodian},
{@link setRelatesTo},
{@link setEvent},
{@link setSection},
 */

@Description("A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).If the element is present, it must have either a @value, an @id, or extensions")

public interface Composition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Composition> T = EntityTypes.T(Composition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String type = "type";
	java.lang.String category = "category";
	java.lang.String subject = "subject";
	java.lang.String encounter = "encounter";
	java.lang.String author = "author";
	java.lang.String attester = "attester";
	java.lang.String custodian = "custodian";
	java.lang.String relatesTo = "relatesTo";
	java.lang.String event = "event";
	java.lang.String section = "section";

	@Description("A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Describes the clinical encounter or type of care this documentation is associated with.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("Identifies who is responsible for the information in the composition, not necessarily who typed it in.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAuthor();
	void setAuthor(java.util.List<com.braintribe.model.generic.GenericEntity> author);

	@Description("A participant who has attested to the accuracy of the composition/document.")
	
	java.util.List<fhir.CompositionAttester> getAttester();
	void setAttester(java.util.List<fhir.CompositionAttester> attester);

	@Description("Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCustodian();
	void setCustodian(com.braintribe.model.generic.GenericEntity custodian);
	@Description("Relationships that this composition has with other compositions or documents that already exist.")
	
	java.util.List<fhir.CompositionRelatesTo> getRelatesTo();
	void setRelatesTo(java.util.List<fhir.CompositionRelatesTo> relatesTo);

	@Description("The clinical service, such as a colonoscopy or an appendectomy, being documented.")
	
	java.util.List<fhir.CompositionEvent> getEvent();
	void setEvent(java.util.List<fhir.CompositionEvent> event);

	@Description("The root of the sections that make up the composition.")
	
	java.util.List<fhir.CompositionSection> getSection();
	void setSection(java.util.List<fhir.CompositionSection> section);

}
