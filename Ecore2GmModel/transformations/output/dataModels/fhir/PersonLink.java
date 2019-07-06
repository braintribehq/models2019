/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PersonLink of the Data Model fhir.
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
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getTarget},
{@link setTarget},
 */

@Description("Demographics and administrative information about a person independent of a specific health-related context.")

public interface PersonLink extends GenericEntity, fhir.BackboneElement {

	EntityType<PersonLink> T = EntityTypes.T(PersonLink.class);

	/* Constants for each property name. */
	java.lang.String target = "target";

	@Description("The resource to which this actual person is associated.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTarget();
	void setTarget(com.braintribe.model.generic.GenericEntity target);
}
