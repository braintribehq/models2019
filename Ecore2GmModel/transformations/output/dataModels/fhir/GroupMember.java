/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type GroupMember of the Data Model fhir.
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
{@link entity}, 
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getEntity},
{@link getPeriod},
{@link setEntity},
{@link setPeriod},
 */

@Description("Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.")

public interface GroupMember extends GenericEntity, fhir.BackboneElement {

	EntityType<GroupMember> T = EntityTypes.T(GroupMember.class);

	/* Constants for each property name. */
	java.lang.String entity = "entity";
	java.lang.String period = "period";

	@Description("A reference to the entity that is a member of the group. Must be consistent with Group.type. If the entity is another group, then the type must be the same.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEntity();
	void setEntity(com.braintribe.model.generic.GenericEntity entity);
	@Description("The period that the member was in the group, if known.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
