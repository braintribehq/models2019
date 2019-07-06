/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PlanDefinitionRelatedAction of the Data Model fhir.
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
{@link offsetDuration}, 
{@link offsetRange}, 

* It provides of then following operations (getters and setters)
{@link getOffsetDuration},
{@link getOffsetRange},
{@link setOffsetDuration},
{@link setOffsetRange},
 */

@Description("This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.")

public interface PlanDefinitionRelatedAction extends GenericEntity, fhir.BackboneElement {

	EntityType<PlanDefinitionRelatedAction> T = EntityTypes.T(PlanDefinitionRelatedAction.class);

	/* Constants for each property name. */
	java.lang.String offsetDuration = "offsetDuration";
	java.lang.String offsetRange = "offsetRange";

	@Description("")
	@Mandatory
	fhir.Duration getOffsetDuration();
	void setOffsetDuration(fhir.Duration offsetDuration);
	@Description("")
	@Mandatory
	fhir.Range getOffsetRange();
	void setOffsetRange(fhir.Range offsetRange);
}
