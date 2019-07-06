/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Medication of the Data Model fhir.
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
{@link code}, 
{@link manufacturer}, 
{@link form}, 
{@link amount}, 
{@link ingredient}, 
{@link batch}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getCode},
{@link getManufacturer},
{@link getForm},
{@link getAmount},
{@link getIngredient},
{@link getBatch},
{@link setIdentifier},
{@link setCode},
{@link setManufacturer},
{@link setForm},
{@link setAmount},
{@link setIngredient},
{@link setBatch},
 */

@Description("This resource is primarily used for the identification and definition of a medication for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.If the element is present, it must have either a @value, an @id, or extensions")

public interface Medication extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Medication> T = EntityTypes.T(Medication.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String code = "code";
	java.lang.String manufacturer = "manufacturer";
	java.lang.String form = "form";
	java.lang.String amount = "amount";
	java.lang.String ingredient = "ingredient";
	java.lang.String batch = "batch";

	@Description("Business identifier for this medication.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Describes the details of the manufacturer of the medication product.  This is not intended to represent the distributor of a medication product.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManufacturer();
	void setManufacturer(com.braintribe.model.generic.GenericEntity manufacturer);
	@Description("Describes the form of the item.  Powder; tablets; capsule.")
	@Mandatory
	fhir.CodeableConcept getForm();
	void setForm(fhir.CodeableConcept form);
	@Description("Specific amount of the drug in the packaged product.  For example, when specifying a product that has the same strength (For example, Insulin glargine 100 unit per mL solution for injection), this attribute provides additional clarification of the package amount (For example, 3 mL, 10mL, etc.).")
	@Mandatory
	fhir.Ratio getAmount();
	void setAmount(fhir.Ratio amount);
	@Description("Identifies a particular constituent of interest in the product.")
	
	java.util.List<fhir.MedicationIngredient> getIngredient();
	void setIngredient(java.util.List<fhir.MedicationIngredient> ingredient);

	@Description("Information that only applies to packages (not products).")
	@Mandatory
	fhir.MedicationBatch getBatch();
	void setBatch(fhir.MedicationBatch batch);
}
