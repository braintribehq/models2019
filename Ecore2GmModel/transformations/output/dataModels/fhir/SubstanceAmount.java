/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceAmount of the Data Model fhir.
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
{@link amountQuantity}, 
{@link amountRange}, 
{@link amountType}, 
{@link referenceRange}, 

* It provides of then following operations (getters and setters)
{@link getAmountQuantity},
{@link getAmountRange},
{@link getAmountType},
{@link getReferenceRange},
{@link setAmountQuantity},
{@link setAmountRange},
{@link setAmountType},
{@link setReferenceRange},
 */

@Description("Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface SubstanceAmount extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceAmount> T = EntityTypes.T(SubstanceAmount.class);

	/* Constants for each property name. */
	java.lang.String amountQuantity = "amountQuantity";
	java.lang.String amountRange = "amountRange";
	java.lang.String amountType = "amountType";
	java.lang.String referenceRange = "referenceRange";

	@Description("")
	@Mandatory
	fhir.Quantity getAmountQuantity();
	void setAmountQuantity(fhir.Quantity amountQuantity);
	@Description("")
	@Mandatory
	fhir.Range getAmountRange();
	void setAmountRange(fhir.Range amountRange);
	@Description("Most elements that require a quantitative value will also have a field called amount type. Amount type should always be specified because the actual value of the amount is often dependent on it. EXAMPLE: In capturing the actual relative amounts of substances or molecular fragments it is essential to indicate whether the amount refers to a mole ratio or weight ratio. For any given element an effort should be made to use same the amount type for all related definitional elements.")
	@Mandatory
	fhir.CodeableConcept getAmountType();
	void setAmountType(fhir.CodeableConcept amountType);
	@Description("Reference range of possible or expected values.")
	@Mandatory
	fhir.SubstanceAmountReferenceRange getReferenceRange();
	void setReferenceRange(fhir.SubstanceAmountReferenceRange referenceRange);
}
