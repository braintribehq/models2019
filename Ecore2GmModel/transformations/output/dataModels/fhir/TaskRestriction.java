/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TaskRestriction of the Data Model fhir.
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
{@link period}, 
{@link recipient}, 

* It provides of then following operations (getters and setters)
{@link getPeriod},
{@link getRecipient},
{@link setPeriod},
{@link setRecipient},
 */

@Description("A task to be performed.")

public interface TaskRestriction extends GenericEntity, fhir.BackboneElement {

	EntityType<TaskRestriction> T = EntityTypes.T(TaskRestriction.class);

	/* Constants for each property name. */
	java.lang.String period = "period";
	java.lang.String recipient = "recipient";

	@Description("Over what time-period is fulfillment sought.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getRecipient();
	void setRecipient(java.util.List<com.braintribe.model.generic.GenericEntity> recipient);

}
