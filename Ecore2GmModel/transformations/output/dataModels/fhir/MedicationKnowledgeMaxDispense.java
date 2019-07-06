/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MedicationKnowledgeMaxDispense of the Data Model fhir.
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
{@link quantity}, 
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getQuantity},
{@link getPeriod},
{@link setQuantity},
{@link setPeriod},
 */

@Description("Information about a medication that is used to support knowledge.")

public interface MedicationKnowledgeMaxDispense extends GenericEntity, fhir.BackboneElement {

	EntityType<MedicationKnowledgeMaxDispense> T = EntityTypes.T(MedicationKnowledgeMaxDispense.class);

	/* Constants for each property name. */
	java.lang.String quantity = "quantity";
	java.lang.String period = "period";

	@Description("The maximum number of units of the medication that can be dispensed.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("The period that applies to the maximum number of units.")
	@Mandatory
	fhir.Duration getPeriod();
	void setPeriod(fhir.Duration period);
}
