/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CodeSystem of the Data Model fhir.
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
{@link filter}, 
{@link property}, 
{@link concept}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getFilter},
{@link getProperty},
{@link getConcept},
{@link setIdentifier},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setFilter},
{@link setProperty},
{@link setConcept},
 */

@Description("The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.If the element is present, it must have either a @value, an @id, or extensions")

public interface CodeSystem extends GenericEntity, fhir.FhirDomainResource {

	EntityType<CodeSystem> T = EntityTypes.T(CodeSystem.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String filter = "filter";
	java.lang.String property = "property";
	java.lang.String concept = "concept";

	@Description("A formal identifier that is used to identify this code system when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate code system instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the code system is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("A filter that can be used in a value set compose statement when selecting concepts using a filter.")
	
	java.util.List<fhir.CodeSystemFilter> getFilter();
	void setFilter(java.util.List<fhir.CodeSystemFilter> filter);

	@Description("A property defines an additional slot through which additional information can be provided about a concept.")
	
	java.util.List<fhir.CodeSystemProperty> getProperty();
	void setProperty(java.util.List<fhir.CodeSystemProperty> property);

	@Description("Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.")
	
	java.util.List<fhir.CodeSystemConcept> getConcept();
	void setConcept(java.util.List<fhir.CodeSystemConcept> concept);

}
