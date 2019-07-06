/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductManufactured of the Data Model fhir.
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
{@link manufacturedDoseForm}, 
{@link unitOfPresentation}, 
{@link quantity}, 
{@link manufacturer}, 
{@link ingredient}, 
{@link physicalCharacteristics}, 
{@link otherCharacteristics}, 

* It provides of then following operations (getters and setters)
{@link getManufacturedDoseForm},
{@link getUnitOfPresentation},
{@link getQuantity},
{@link getManufacturer},
{@link getIngredient},
{@link getPhysicalCharacteristics},
{@link getOtherCharacteristics},
{@link setManufacturedDoseForm},
{@link setUnitOfPresentation},
{@link setQuantity},
{@link setManufacturer},
{@link setIngredient},
{@link setPhysicalCharacteristics},
{@link setOtherCharacteristics},
 */

@Description("The manufactured item as contained in the packaged medicinal product.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductManufactured extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductManufactured> T = EntityTypes.T(MedicinalProductManufactured.class);

	/* Constants for each property name. */
	java.lang.String manufacturedDoseForm = "manufacturedDoseForm";
	java.lang.String unitOfPresentation = "unitOfPresentation";
	java.lang.String quantity = "quantity";
	java.lang.String manufacturer = "manufacturer";
	java.lang.String ingredient = "ingredient";
	java.lang.String physicalCharacteristics = "physicalCharacteristics";
	java.lang.String otherCharacteristics = "otherCharacteristics";

	@Description("Dose form as manufactured and before any transformation into the pharmaceutical product.")
	@Mandatory
	fhir.CodeableConcept getManufacturedDoseForm();
	void setManufacturedDoseForm(fhir.CodeableConcept manufacturedDoseForm);
	@Description("The ?real world? units in which the quantity of the manufactured item is described.")
	@Mandatory
	fhir.CodeableConcept getUnitOfPresentation();
	void setUnitOfPresentation(fhir.CodeableConcept unitOfPresentation);
	@Description("The quantity or 'count number' of the manufactured item.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("Manufacturer of the item (Note that this should be named 'manufacturer' but it currently causes technical issues).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getManufacturer();
	void setManufacturer(java.util.List<com.braintribe.model.generic.GenericEntity> manufacturer);

	@Description("Ingredient.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getIngredient();
	void setIngredient(java.util.List<com.braintribe.model.generic.GenericEntity> ingredient);

	@Description("Dimensions, color etc.")
	@Mandatory
	fhir.ProdCharacteristic getPhysicalCharacteristics();
	void setPhysicalCharacteristics(fhir.ProdCharacteristic physicalCharacteristics);
	@Description("Other codeable characteristics.")
	
	java.util.List<fhir.CodeableConcept> getOtherCharacteristics();
	void setOtherCharacteristics(java.util.List<fhir.CodeableConcept> otherCharacteristics);

}
