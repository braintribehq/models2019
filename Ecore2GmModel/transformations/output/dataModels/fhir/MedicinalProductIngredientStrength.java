/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductIngredientStrength of the Data Model fhir.
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
{@link presentation}, 
{@link presentationLowLimit}, 
{@link concentration}, 
{@link concentrationLowLimit}, 
{@link country}, 
{@link referenceStrength}, 

* It provides of then following operations (getters and setters)
{@link getPresentation},
{@link getPresentationLowLimit},
{@link getConcentration},
{@link getConcentrationLowLimit},
{@link getCountry},
{@link getReferenceStrength},
{@link setPresentation},
{@link setPresentationLowLimit},
{@link setConcentration},
{@link setConcentrationLowLimit},
{@link setCountry},
{@link setReferenceStrength},
 */

@Description("An ingredient of a manufactured item or pharmaceutical product.")

public interface MedicinalProductIngredientStrength extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductIngredientStrength> T = EntityTypes.T(MedicinalProductIngredientStrength.class);

	/* Constants for each property name. */
	java.lang.String presentation = "presentation";
	java.lang.String presentationLowLimit = "presentationLowLimit";
	java.lang.String concentration = "concentration";
	java.lang.String concentrationLowLimit = "concentrationLowLimit";
	java.lang.String country = "country";
	java.lang.String referenceStrength = "referenceStrength";

	@Description("The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item.")
	@Mandatory
	fhir.Ratio getPresentation();
	void setPresentation(fhir.Ratio presentation);
	@Description("A lower limit for the quantity of substance in the unit of presentation. For use when there is a range of strengths, this is the lower limit, with the presentation attribute becoming the upper limit.")
	@Mandatory
	fhir.Ratio getPresentationLowLimit();
	void setPresentationLowLimit(fhir.Ratio presentationLowLimit);
	@Description("The strength per unitary volume (or mass).")
	@Mandatory
	fhir.Ratio getConcentration();
	void setConcentration(fhir.Ratio concentration);
	@Description("A lower limit for the strength per unitary volume (or mass), for when there is a range. The concentration attribute then becomes the upper limit.")
	@Mandatory
	fhir.Ratio getConcentrationLowLimit();
	void setConcentrationLowLimit(fhir.Ratio concentrationLowLimit);
	@Description("The country or countries for which the strength range applies.")
	
	java.util.List<fhir.CodeableConcept> getCountry();
	void setCountry(java.util.List<fhir.CodeableConcept> country);

	@Description("Strength expressed in terms of a reference substance.")
	
	java.util.List<fhir.MedicinalProductIngredientReferenceStrength> getReferenceStrength();
	void setReferenceStrength(java.util.List<fhir.MedicinalProductIngredientReferenceStrength> referenceStrength);

}
