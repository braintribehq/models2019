/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CodeSystemConcept of the Data Model fhir.
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
{@link designation}, 
{@link property}, 
{@link concept}, 

* It provides of then following operations (getters and setters)
{@link getDesignation},
{@link getProperty},
{@link getConcept},
{@link setDesignation},
{@link setProperty},
{@link setConcept},
 */

@Description("The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.")

public interface CodeSystemConcept extends GenericEntity, fhir.BackboneElement {

	EntityType<CodeSystemConcept> T = EntityTypes.T(CodeSystemConcept.class);

	/* Constants for each property name. */
	java.lang.String designation = "designation";
	java.lang.String property = "property";
	java.lang.String concept = "concept";

	@Description("Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.")
	
	java.util.List<fhir.CodeSystemDesignation> getDesignation();
	void setDesignation(java.util.List<fhir.CodeSystemDesignation> designation);

	@Description("A property value for this concept.")
	
	java.util.List<fhir.CodeSystemProperty1> getProperty();
	void setProperty(java.util.List<fhir.CodeSystemProperty1> property);

	@Description("Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.")
	
	java.util.List<fhir.CodeSystemConcept> getConcept();
	void setConcept(java.util.List<fhir.CodeSystemConcept> concept);

}
