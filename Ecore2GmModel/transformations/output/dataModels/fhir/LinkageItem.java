/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type LinkageItem of the Data Model fhir.
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
{@link resource}, 

* It provides of then following operations (getters and setters)
{@link getResource},
{@link setResource},
 */

@Description("Identifies two or more records (resource instances) that refer to the same real-world 'occurrence'.")

public interface LinkageItem extends GenericEntity, fhir.BackboneElement {

	EntityType<LinkageItem> T = EntityTypes.T(LinkageItem.class);

	/* Constants for each property name. */
	java.lang.String resource = "resource";

	@Description("The resource instance being linked as part of the group.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getResource();
	void setResource(com.braintribe.model.generic.GenericEntity resource);
}
