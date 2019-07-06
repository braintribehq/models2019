/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicinalProductInteractionInteractant of the Data Model fhir.
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
{@link itemReference}, 
{@link itemCodeableConcept}, 

* It provides of then following operations (getters and setters)
{@link getItemReference},
{@link getItemCodeableConcept},
{@link setItemReference},
{@link setItemCodeableConcept},
 */

@Description("The interactions of the medicinal product with other medicinal products, or other forms of interactions.")

public interface MedicinalProductInteractionInteractant extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicinalProductInteractionInteractant> T = EntityTypes.T(MedicinalProductInteractionInteractant.class);

	/* Constants for each property name. */
	java.lang.String itemReference = "itemReference";
	java.lang.String itemCodeableConcept = "itemCodeableConcept";

	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getItemReference();
	void setItemReference(com.braintribe.model.generic.GenericEntity itemReference);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getItemCodeableConcept();
	void setItemCodeableConcept(fhir.CodeableConcept itemCodeableConcept);
}
