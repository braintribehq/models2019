/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NutritionOrderNutrient of the Data Model fhir.
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
{@link modifier}, 
{@link amount}, 

* It provides of then following operations (getters and setters)
{@link getModifier},
{@link getAmount},
{@link setModifier},
{@link setAmount},
 */

@Description("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")

public interface NutritionOrderNutrient extends GenericEntity, fhir.BackboneElement {

	EntityType<NutritionOrderNutrient> T = EntityTypes.T(NutritionOrderNutrient.class);

	/* Constants for each property name. */
	java.lang.String modifier = "modifier";
	java.lang.String amount = "amount";

	@Description("The nutrient that is being modified such as carbohydrate or sodium.")
	@Mandatory
	fhir.CodeableConcept getModifier();
	void setModifier(fhir.CodeableConcept modifier);
	@Description("The quantity of the specified nutrient to include in diet.")
	@Mandatory
	fhir.Quantity getAmount();
	void setAmount(fhir.Quantity amount);
}
