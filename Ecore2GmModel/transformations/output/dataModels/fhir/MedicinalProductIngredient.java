/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductIngredient of the Data Model fhir.
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
{@link role}, 
{@link manufacturer}, 
{@link specifiedSubstance}, 
{@link substance}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getRole},
{@link getManufacturer},
{@link getSpecifiedSubstance},
{@link getSubstance},
{@link setIdentifier},
{@link setRole},
{@link setManufacturer},
{@link setSpecifiedSubstance},
{@link setSubstance},
 */

@Description("An ingredient of a manufactured item or pharmaceutical product.If the element is present, it must have either a @value, an @id, or extensions")

public interface MedicinalProductIngredient extends GenericEntity, fhir.FhirDomainResource {

	EntityType<MedicinalProductIngredient> T = EntityTypes.T(MedicinalProductIngredient.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String role = "role";
	java.lang.String manufacturer = "manufacturer";
	java.lang.String specifiedSubstance = "specifiedSubstance";
	java.lang.String substance = "substance";

	@Description("The identifier(s) of this Ingredient that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Ingredient role e.g. Active ingredient, excipient.")
	@Mandatory
	fhir.CodeableConcept getRole();
	void setRole(fhir.CodeableConcept role);
	@Description("Manufacturer of this Ingredient.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getManufacturer();
	void setManufacturer(java.util.List<com.braintribe.model.generic.GenericEntity> manufacturer);

	@Description("A specified substance that comprises this ingredient.")
	
	java.util.List<fhir.MedicinalProductIngredientSpecifiedSubstance> getSpecifiedSubstance();
	void setSpecifiedSubstance(java.util.List<fhir.MedicinalProductIngredientSpecifiedSubstance> specifiedSubstance);

	@Description("The ingredient substance.")
	@Mandatory
	fhir.MedicinalProductIngredientSubstance getSubstance();
	void setSubstance(fhir.MedicinalProductIngredientSubstance substance);
}
