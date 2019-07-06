/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationIngredient of the Data Model fhir.
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
{@link itemCodeableConcept}, 
{@link itemReference}, 
{@link strength}, 

* It provides of then following operations (getters and setters)
{@link getItemCodeableConcept},
{@link getItemReference},
{@link getStrength},
{@link setItemCodeableConcept},
{@link setItemReference},
{@link setStrength},
 */

@Description("This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.")

public interface MedicationIngredient extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationIngredient> T = EntityTypes.T(MedicationIngredient.class);

	/* Constants for each property name. */
	java.lang.String itemCodeableConcept = "itemCodeableConcept";
	java.lang.String itemReference = "itemReference";
	java.lang.String strength = "strength";

	@Description("")
	@Mandatory
	fhir.CodeableConcept getItemCodeableConcept();
	void setItemCodeableConcept(fhir.CodeableConcept itemCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getItemReference();
	void setItemReference(com.braintribe.model.generic.GenericEntity itemReference);
	@Description("Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet.  This is expressed as a ratio where the numerator is 250mg and the denominator is 1 tablet.")
	@Mandatory
	fhir.Ratio getStrength();
	void setStrength(fhir.Ratio strength);
}
