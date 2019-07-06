/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Substance of the Data Model fhir.
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
{@link category}, 
{@link code}, 
{@link instance}, 
{@link ingredient}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCategory},
{@link getCode},
{@link getInstance},
{@link getIngredient},
{@link setIdentifier},
{@link setCategory},
{@link setCode},
{@link setInstance},
{@link setIngredient},
 */

@Description("A homogeneous material with a definite composition.If the element is present, it must have either a @value, an @id, or extensions")

public interface Substance extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Substance> T = EntityTypes.T(Substance.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String instance = "instance";
	java.lang.String ingredient = "ingredient";

	@Description("Unique identifier for the substance.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("A code (or set of codes) that identify this substance.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.")
	
	java.util.List<fhir.SubstanceInstance> getInstance();
	void setInstance(java.util.List<fhir.SubstanceInstance> instance);

	@Description("A substance can be composed of other substances.")
	
	java.util.List<fhir.SubstanceIngredient> getIngredient();
	void setIngredient(java.util.List<fhir.SubstanceIngredient> ingredient);

}
