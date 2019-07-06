/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type StructureDefinition of the Data Model fhir.
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
{@link keyword}, 
{@link mapping}, 
{@link context}, 
{@link snapshot}, 
{@link differential}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getContact},
{@link getUseContext},
{@link getJurisdiction},
{@link getKeyword},
{@link getMapping},
{@link getContext},
{@link getSnapshot},
{@link getDifferential},
{@link setIdentifier},
{@link setContact},
{@link setUseContext},
{@link setJurisdiction},
{@link setKeyword},
{@link setMapping},
{@link setContext},
{@link setSnapshot},
{@link setDifferential},
 */

@Description("A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.If the element is present, it must have either a @value, an @id, or extensions")

public interface StructureDefinition extends GenericEntity, fhir.FhirDomainResource {

	EntityType<StructureDefinition> T = EntityTypes.T(StructureDefinition.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String contact = "contact";
	java.lang.String useContext = "useContext";
	java.lang.String jurisdiction = "jurisdiction";
	java.lang.String keyword = "keyword";
	java.lang.String mapping = "mapping";
	java.lang.String context = "context";
	java.lang.String snapshot = "snapshot";
	java.lang.String differential = "differential";

	@Description("A formal identifier that is used to identify this structure definition when it is represented in other formats, or referenced in a specification, model, design or an instance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("Contact details to assist a user in finding and communicating with the publisher.")
	
	java.util.List<fhir.ContactDetail> getContact();
	void setContact(java.util.List<fhir.ContactDetail> contact);

	@Description("The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate structure definition instances.")
	
	java.util.List<fhir.UsageContext> getUseContext();
	void setUseContext(java.util.List<fhir.UsageContext> useContext);

	@Description("A legal or geographic region in which the structure definition is intended to be used.")
	
	java.util.List<fhir.CodeableConcept> getJurisdiction();
	void setJurisdiction(java.util.List<fhir.CodeableConcept> jurisdiction);

	@Description("A set of key words or terms from external terminologies that may be used to assist with indexing and searching of templates nby describing the use of this structure definition, or the content it describes.")
	
	java.util.List<fhir.Coding> getKeyword();
	void setKeyword(java.util.List<fhir.Coding> keyword);

	@Description("An external specification that the content is mapped to.")
	
	java.util.List<fhir.StructureDefinitionMapping> getMapping();
	void setMapping(java.util.List<fhir.StructureDefinitionMapping> mapping);

	@Description("Identifies the types of resource or data type elements to which the extension can be applied.")
	
	java.util.List<fhir.StructureDefinitionContext> getContext();
	void setContext(java.util.List<fhir.StructureDefinitionContext> context);

	@Description("A snapshot view is expressed in a standalone form that can be used and interpreted without considering the base StructureDefinition.")
	@Mandatory
	fhir.StructureDefinitionSnapshot getSnapshot();
	void setSnapshot(fhir.StructureDefinitionSnapshot snapshot);
	@Description("A differential view is expressed relative to the base StructureDefinition - a statement of differences that it applies.")
	@Mandatory
	fhir.StructureDefinitionDifferential getDifferential();
	void setDifferential(fhir.StructureDefinitionDifferential differential);
}
