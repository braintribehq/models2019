/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NutritionOrderOralDiet of the Data Model fhir.
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
{@link type}, 
{@link schedule}, 
{@link nutrient}, 
{@link texture}, 
{@link fluidConsistencyType}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getSchedule},
{@link getNutrient},
{@link getTexture},
{@link getFluidConsistencyType},
{@link setType},
{@link setSchedule},
{@link setNutrient},
{@link setTexture},
{@link setFluidConsistencyType},
 */

@Description("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")

public interface NutritionOrderOralDiet extends GenericEntity, fhir.BackboneElement {

	EntityType<NutritionOrderOralDiet> T = EntityTypes.T(NutritionOrderOralDiet.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String schedule = "schedule";
	java.lang.String nutrient = "nutrient";
	java.lang.String texture = "texture";
	java.lang.String fluidConsistencyType = "fluidConsistencyType";

	@Description("The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.")
	
	java.util.List<fhir.CodeableConcept> getType();
	void setType(java.util.List<fhir.CodeableConcept> type);

	@Description("The time period and frequency at which the diet should be given.  The diet should be given for the combination of all schedules if more than one schedule is present.")
	
	java.util.List<fhir.Timing> getSchedule();
	void setSchedule(java.util.List<fhir.Timing> schedule);

	@Description("Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber or sodium) required for the oral diet.")
	
	java.util.List<fhir.NutritionOrderNutrient> getNutrient();
	void setNutrient(java.util.List<fhir.NutritionOrderNutrient> nutrient);

	@Description("Class that describes any texture modifications required for the patient to safely consume various types of solid foods.")
	
	java.util.List<fhir.NutritionOrderTexture> getTexture();
	void setTexture(java.util.List<fhir.NutritionOrderTexture> texture);

	@Description("The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.")
	
	java.util.List<fhir.CodeableConcept> getFluidConsistencyType();
	void setFluidConsistencyType(java.util.List<fhir.CodeableConcept> fluidConsistencyType);

}
