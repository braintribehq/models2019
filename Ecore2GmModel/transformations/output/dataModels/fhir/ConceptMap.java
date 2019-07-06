/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ConceptMap of the Data Model fhir.
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
{@link contact}, 
{@link useContext}, 
{@link jurisdiction}, 
{@link group}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getGroup},
{@link setIdentifier},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setGroup},
 */

@Description("A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.If the element is present, it must have either a @value, an @id, or extensions")

public interface ConceptMap extends GenericEntity, fhir.FhirDomainResource {

	EntityType<ConceptMap> T = EntityTypes.T(ConceptMap.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String group = "group";

	@Description("A formal identifier that is used to identify this concept map when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate concept map instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the concept map is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("A group of mappings that all have the same source and target system.")
	
	java.util.List<fhir.ConceptMapGroup> getGroup();
	void setGroup(java.util.List<fhir.ConceptMapGroup> group);

}
