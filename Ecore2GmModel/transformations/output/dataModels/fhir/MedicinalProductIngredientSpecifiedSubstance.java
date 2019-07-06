/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductIngredientSpecifiedSubstance of the Data Model fhir.
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
{@link code}, 
{@link group}, 
{@link confidentiality}, 
{@link strength}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getGroup},
{@link getConfidentiality},
{@link getStrength},
{@link setCode},
{@link setGroup},
{@link setConfidentiality},
{@link setStrength},
 */

@Description("An ingredient of a manufactured item or pharmaceutical product.")

public interface MedicinalProductIngredientSpecifiedSubstance extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductIngredientSpecifiedSubstance> T = EntityTypes.T(MedicinalProductIngredientSpecifiedSubstance.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String group = "group";
	java.lang.String confidentiality = "confidentiality";
	java.lang.String strength = "strength";

	@Description("The specified substance.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The group of specified substance, e.g. group 1 to 4.")
	@Mandatory
	fhir.CodeableConcept getGroup();
	void setGroup(fhir.CodeableConcept group);
	@Description("Confidentiality level of the specified substance as the ingredient.")
	@Mandatory
	fhir.CodeableConcept getConfidentiality();
	void setConfidentiality(fhir.CodeableConcept confidentiality);
	@Description("Quantity of the substance or specified substance present in the manufactured item or pharmaceutical product.")
	
	java.util.List<fhir.MedicinalProductIngredientStrength> getStrength();
	void setStrength(java.util.List<fhir.MedicinalProductIngredientStrength> strength);

}
