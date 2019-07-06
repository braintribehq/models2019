/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NutritionOrder of the Data Model fhir.
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
{@link patient}, 
{@link encounter}, 
{@link orderer}, 
{@link allergyIntolerance}, 
{@link foodPreferenceModifier}, 
{@link excludeFoodModifier}, 
{@link oralDiet}, 
{@link supplement}, 
{@link enteralFormula}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getPatient},
{@link getEncounter},
{@link getOrderer},
{@link getAllergyIntolerance},
{@link getFoodPreferenceModifier},
{@link getExcludeFoodModifier},
{@link getOralDiet},
{@link getSupplement},
{@link getEnteralFormula},
{@link getNote},
{@link setIdentifier},
{@link setPatient},
{@link setEncounter},
{@link setOrderer},
{@link setAllergyIntolerance},
{@link setFoodPreferenceModifier},
{@link setExcludeFoodModifier},
{@link setOralDiet},
{@link setSupplement},
{@link setEnteralFormula},
{@link setNote},
 */

@Description("A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.If the element is present, it must have either a @value, an @id, or extensions")

public interface NutritionOrder extends GenericEntity, fhir.FhirDomainResource {

	EntityType<NutritionOrder> T = EntityTypes.T(NutritionOrder.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String patient = "patient";
	java.lang.String encounter = "encounter";
	java.lang.String orderer = "orderer";
	java.lang.String allergyIntolerance = "allergyIntolerance";
	java.lang.String foodPreferenceModifier = "foodPreferenceModifier";
	java.lang.String excludeFoodModifier = "excludeFoodModifier";
	java.lang.String oralDiet = "oralDiet";
	java.lang.String supplement = "supplement";
	java.lang.String enteralFormula = "enteralFormula";
	java.lang.String note = "note";

	@Description("Identifiers assigned to this order by the order sender or by the order receiver.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatient();
	void setPatient(com.braintribe.model.generic.GenericEntity patient);
	@Description("An encounter that provides additional information about the healthcare context in which this request is made.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOrderer();
	void setOrderer(com.braintribe.model.generic.GenericEntity orderer);
	@Description("A link to a record of allergies or intolerances  which should be included in the nutrition order.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getAllergyIntolerance();
	void setAllergyIntolerance(java.util.List<com.braintribe.model.generic.GenericEntity> allergyIntolerance);

	@Description("This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.")
	
	java.util.List<fhir.CodeableConcept> getFoodPreferenceModifier();
	void setFoodPreferenceModifier(java.util.List<fhir.CodeableConcept> foodPreferenceModifier);

	@Description("This modifier is used to convey Order-specific modifier about the type of oral food or oral fluids that should not be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced AllergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient?s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.")
	
	java.util.List<fhir.CodeableConcept> getExcludeFoodModifier();
	void setExcludeFoodModifier(java.util.List<fhir.CodeableConcept> excludeFoodModifier);

	@Description("Diet given orally in contrast to enteral (tube) feeding.")
	@Mandatory
	fhir.NutritionOrderOralDiet getOralDiet();
	void setOralDiet(fhir.NutritionOrderOralDiet oralDiet);
	@Description("Oral nutritional products given in order to add further nutritional value to the patient's diet.")
	
	java.util.List<fhir.NutritionOrderSupplement> getSupplement();
	void setSupplement(java.util.List<fhir.NutritionOrderSupplement> supplement);

	@Description("Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.")
	@Mandatory
	fhir.NutritionOrderEnteralFormula getEnteralFormula();
	void setEnteralFormula(fhir.NutritionOrderEnteralFormula enteralFormula);
	@Description("Comments made about the {{title}} by the requester, performer, subject or other participants.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
