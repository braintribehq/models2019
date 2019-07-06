/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationProperty of the Data Model fhir.
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
{@link category}, 
{@link code}, 
{@link definingSubstanceReference}, 
{@link definingSubstanceCodeableConcept}, 
{@link amountQuantity}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getCode},
{@link getDefiningSubstanceReference},
{@link getDefiningSubstanceCodeableConcept},
{@link getAmountQuantity},
{@link setCategory},
{@link setCode},
{@link setDefiningSubstanceReference},
{@link setDefiningSubstanceCodeableConcept},
{@link setAmountQuantity},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationProperty extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationProperty> T = EntityTypes.T(SubstanceSpecificationProperty.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String definingSubstanceReference = "definingSubstanceReference";
	java.lang.String definingSubstanceCodeableConcept = "definingSubstanceCodeableConcept";
	java.lang.String amountQuantity = "amountQuantity";

	@Description("A category for this property, e.g. Physical, Chemical, Enzymatic.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("Property type e.g. viscosity, pH, isoelectric point.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDefiningSubstanceReference();
	void setDefiningSubstanceReference(com.braintribe.model.generic.GenericEntity definingSubstanceReference);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getDefiningSubstanceCodeableConcept();
	void setDefiningSubstanceCodeableConcept(fhir.CodeableConcept definingSubstanceCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Quantity getAmountQuantity();
	void setAmountQuantity(fhir.Quantity amountQuantity);
}
