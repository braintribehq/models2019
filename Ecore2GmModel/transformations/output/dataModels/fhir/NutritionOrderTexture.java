/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NutritionOrderTexture of the Data Model fhir.
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
{@link foodType}, 

* It provides of then following operations (getters and setters)
{@link getModifier},
{@link getFoodType},
{@link setModifier},
{@link setFoodType},
 */

@Description("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")

public interface NutritionOrderTexture extends GenericEntity, fhir.BackboneElement {

	EntityType<NutritionOrderTexture> T = EntityTypes.T(NutritionOrderTexture.class);

	/* Constants for each property name. */
	java.lang.String modifier = "modifier";
	java.lang.String foodType = "foodType";

	@Description("Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.")
	@Mandatory
	fhir.CodeableConcept getModifier();
	void setModifier(fhir.CodeableConcept modifier);
	@Description("The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.")
	@Mandatory
	fhir.CodeableConcept getFoodType();
	void setFoodType(fhir.CodeableConcept foodType);
}
