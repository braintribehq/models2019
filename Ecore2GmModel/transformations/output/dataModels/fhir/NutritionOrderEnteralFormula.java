/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NutritionOrderEnteralFormula of the Data Model fhir.
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
{@link baseFormulaType}, 
{@link additiveType}, 
{@link caloricDensity}, 
{@link routeofAdministration}, 
{@link administration}, 
{@link maxVolumeToDeliver}, 

* It provides of then following operations (getters and setters)
{@link getBaseFormulaType},
{@link getAdditiveType},
{@link getCaloricDensity},
{@link getRouteofAdministration},
{@link getAdministration},
{@link getMaxVolumeToDeliver},
{@link setBaseFormulaType},
{@link setAdditiveType},
{@link setCaloricDensity},
{@link setRouteofAdministration},
{@link setAdministration},
{@link setMaxVolumeToDeliver},
 */

@Description("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.")

public interface NutritionOrderEnteralFormula extends GenericEntity, fhir.BackboneElement {

	EntityType<NutritionOrderEnteralFormula> T = EntityTypes.T(NutritionOrderEnteralFormula.class);

	/* Constants for each property name. */
	java.lang.String baseFormulaType = "baseFormulaType";
	java.lang.String additiveType = "additiveType";
	java.lang.String caloricDensity = "caloricDensity";
	java.lang.String routeofAdministration = "routeofAdministration";
	java.lang.String administration = "administration";
	java.lang.String maxVolumeToDeliver = "maxVolumeToDeliver";

	@Description("The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.")
	@Mandatory
	fhir.CodeableConcept getBaseFormulaType();
	void setBaseFormulaType(fhir.CodeableConcept baseFormulaType);
	@Description("Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.")
	@Mandatory
	fhir.CodeableConcept getAdditiveType();
	void setAdditiveType(fhir.CodeableConcept additiveType);
	@Description("The amount of energy (calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 calories per fluid ounce or an adult may require an enteral formula that provides 1.5 calorie/mL.")
	@Mandatory
	fhir.Quantity getCaloricDensity();
	void setCaloricDensity(fhir.Quantity caloricDensity);
	@Description("The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.")
	@Mandatory
	fhir.CodeableConcept getRouteofAdministration();
	void setRouteofAdministration(fhir.CodeableConcept routeofAdministration);
	@Description("Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.")
	
	java.util.List<fhir.NutritionOrderAdministration> getAdministration();
	void setAdministration(java.util.List<fhir.NutritionOrderAdministration> administration);

	@Description("The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.")
	@Mandatory
	fhir.Quantity getMaxVolumeToDeliver();
	void setMaxVolumeToDeliver(fhir.Quantity maxVolumeToDeliver);
}
