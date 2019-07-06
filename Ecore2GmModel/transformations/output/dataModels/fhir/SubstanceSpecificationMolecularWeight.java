/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceSpecificationMolecularWeight of the Data Model fhir.
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
{@link method}, 
{@link type}, 
{@link amount}, 

* It provides of then following operations (getters and setters)
{@link getMethod},
{@link getType},
{@link getAmount},
{@link setMethod},
{@link setType},
{@link setAmount},
 */

@Description("The detailed description of a substance, typically at a level beyond what is used for prescribing.")

public interface SubstanceSpecificationMolecularWeight extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceSpecificationMolecularWeight> T = EntityTypes.T(SubstanceSpecificationMolecularWeight.class);

	/* Constants for each property name. */
	java.lang.String method = "method";
	java.lang.String type = "type";
	java.lang.String amount = "amount";

	@Description("The method by which the molecular weight was determined.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
	@Description("Type of molecular weight such as exact, average (also known as. number average), weight average.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.")
	@Mandatory
	fhir.Quantity getAmount();
	void setAmount(fhir.Quantity amount);
}
