/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgePackaging of the Data Model fhir.
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
{@link type}, 
{@link quantity}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getQuantity},
{@link setType},
{@link setQuantity},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgePackaging extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgePackaging> T = EntityTypes.T(MedicationKnowledgePackaging.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String quantity = "quantity";

	@Description("A code that defines the specific type of packaging that the medication can be found in (e.g. blister sleeve, tube, bottle).")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("The number of product units the package would contain if fully loaded.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
}
