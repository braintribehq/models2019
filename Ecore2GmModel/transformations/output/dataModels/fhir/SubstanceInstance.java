/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstanceInstance of the Data Model fhir.
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
{@link quantity}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getQuantity},
{@link setIdentifier},
{@link setQuantity},
 */

@Description("A homogeneous material with a definite composition.")

public interface SubstanceInstance extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstanceInstance> T = EntityTypes.T(SubstanceInstance.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String quantity = "quantity";

	@Description("Identifier associated with the package/container (usually a label affixed directly).")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("The amount of the substance.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
}
