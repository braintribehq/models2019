/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SubstancePolymerStartingMaterial of the Data Model fhir.
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
{@link material}, 
{@link type}, 
{@link amount}, 

* It provides of then following operations (getters and setters)
{@link getMaterial},
{@link getType},
{@link getAmount},
{@link setMaterial},
{@link setType},
{@link setAmount},
 */

@Description("Todo.")

public interface SubstancePolymerStartingMaterial extends GenericEntity, fhir.BackboneElement {

	EntityType<SubstancePolymerStartingMaterial> T = EntityTypes.T(SubstancePolymerStartingMaterial.class);

	/* Constants for each property name. */
	java.lang.String material = "material";
	java.lang.String type = "type";
	java.lang.String amount = "amount";

	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getMaterial();
	void setMaterial(fhir.CodeableConcept material);
	@Description("Todo.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Todo.")
	@Mandatory
	fhir.SubstanceAmount getAmount();
	void setAmount(fhir.SubstanceAmount amount);
}
