/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClaimResponseAdjudication of the Data Model fhir.
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
{@link reason}, 
{@link amount}, 

* It provides of then following operations (getters and setters)
{@link getCategory},
{@link getReason},
{@link getAmount},
{@link setCategory},
{@link setReason},
{@link setAmount},
 */

@Description("This resource provides the adjudication details from the processing of a Claim resource.")

public interface ClaimResponseAdjudication extends GenericEntity, fhir.BackboneElement {

	EntityType<ClaimResponseAdjudication> T = EntityTypes.T(ClaimResponseAdjudication.class);

	/* Constants for each property name. */
	java.lang.String category = "category";
	java.lang.String reason = "reason";
	java.lang.String amount = "amount";

	@Description("A code to indicate the information type of this adjudication record. Information types may include the value submitted, maximum values or percentages allowed or payable under the plan, amounts that: the patient is responsible for in aggregate or pertaining to this item; amounts paid by other coverages; and, the benefit payable for this item.")
	@Mandatory
	fhir.CodeableConcept getCategory();
	void setCategory(fhir.CodeableConcept category);
	@Description("A code supporting the understanding of the adjudication result and explaining variance from expected amount.")
	@Mandatory
	fhir.CodeableConcept getReason();
	void setReason(fhir.CodeableConcept reason);
	@Description("Monetary amount associated with the category.")
	@Mandatory
	fhir.Money getAmount();
	void setAmount(fhir.Money amount);
}
