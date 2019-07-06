/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductIngredientReferenceStrength of the Data Model fhir.
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
{@link substance}, 
{@link strength}, 
{@link strengthLowLimit}, 
{@link country}, 

* It provides of then following operations (getters and setters)
{@link getSubstance},
{@link getStrength},
{@link getStrengthLowLimit},
{@link getCountry},
{@link setSubstance},
{@link setStrength},
{@link setStrengthLowLimit},
{@link setCountry},
 */

@Description("An ingredient of a manufactured item or pharmaceutical product.")

public interface MedicinalProductIngredientReferenceStrength extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductIngredientReferenceStrength> T = EntityTypes.T(MedicinalProductIngredientReferenceStrength.class);

	/* Constants for each property name. */
	java.lang.String substance = "substance";
	java.lang.String strength = "strength";
	java.lang.String strengthLowLimit = "strengthLowLimit";
	java.lang.String country = "country";

	@Description("Relevant reference substance.")
	@Mandatory
	fhir.CodeableConcept getSubstance();
	void setSubstance(fhir.CodeableConcept substance);
	@Description("Strength expressed in terms of a reference substance.")
	@Mandatory
	fhir.Ratio getStrength();
	void setStrength(fhir.Ratio strength);
	@Description("Strength expressed in terms of a reference substance.")
	@Mandatory
	fhir.Ratio getStrengthLowLimit();
	void setStrengthLowLimit(fhir.Ratio strengthLowLimit);
	@Description("The country or countries for which the strength range applies.")
	
	java.util.List<fhir.CodeableConcept> getCountry();
	void setCountry(java.util.List<fhir.CodeableConcept> country);

}
