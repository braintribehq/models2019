/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceIngredient of the Data Model fhir.
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
{@link quantity}, 
{@link substanceCodeableConcept}, 
{@link substanceReference}, 

* It provides of then following operations (getters and setters)
{@link getQuantity},
{@link getSubstanceCodeableConcept},
{@link getSubstanceReference},
{@link setQuantity},
{@link setSubstanceCodeableConcept},
{@link setSubstanceReference},
 */

@Description("A homogeneous material with a definite composition.")

public interface SubstanceIngredient extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceIngredient> T = EntityTypes.T(SubstanceIngredient.class);

	/* Constants for each property name. */
	java.lang.String quantity = "quantity";
	java.lang.String substanceCodeableConcept = "substanceCodeableConcept";
	java.lang.String substanceReference = "substanceReference";

	@Description("The amount of the ingredient in the substance - a concentration ratio.")
	@Mandatory
	fhir.Ratio getQuantity();
	void setQuantity(fhir.Ratio quantity);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getSubstanceCodeableConcept();
	void setSubstanceCodeableConcept(fhir.CodeableConcept substanceCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubstanceReference();
	void setSubstanceReference(com.braintribe.model.generic.GenericEntity substanceReference);
}
