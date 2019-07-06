/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductIngredientSubstance of the Data Model fhir.
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
{@link strength}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getStrength},
{@link setCode},
{@link setStrength},
 */

@Description("An ingredient of a manufactured item or pharmaceutical product.")

public interface MedicinalProductIngredientSubstance extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductIngredientSubstance> T = EntityTypes.T(MedicinalProductIngredientSubstance.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String strength = "strength";

	@Description("The ingredient substance.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Quantity of the substance or specified substance present in the manufactured item or pharmaceutical product.")
	
	java.util.List<fhir.MedicinalProductIngredientStrength> getStrength();
	void setStrength(java.util.List<fhir.MedicinalProductIngredientStrength> strength);

}
