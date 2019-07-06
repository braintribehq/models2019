/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceAmountReferenceRange of the Data Model fhir.
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
{@link lowLimit}, 
{@link highLimit}, 

* It provides of then following operations (getters and setters)
{@link getLowLimit},
{@link getHighLimit},
{@link setLowLimit},
{@link setHighLimit},
 */

@Description("Chemical substances are a single substance type whose primary defining element is the molecular structure. Chemical substances shall be defined on the basis of their complete covalent molecular structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured. Purity, grade, physical form or particle size are not taken into account in the definition of a chemical substance or in the assignment of a Substance ID.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface SubstanceAmountReferenceRange extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceAmountReferenceRange> T = EntityTypes.T(SubstanceAmountReferenceRange.class);

	/* Constants for each property name. */
	java.lang.String lowLimit = "lowLimit";
	java.lang.String highLimit = "highLimit";

	@Description("Lower limit possible or expected.")
	@Mandatory
	fhir.Quantity getLowLimit();
	void setLowLimit(fhir.Quantity lowLimit);
	@Description("Upper limit possible or expected.")
	@Mandatory
	fhir.Quantity getHighLimit();
	void setHighLimit(fhir.Quantity highLimit);
}
