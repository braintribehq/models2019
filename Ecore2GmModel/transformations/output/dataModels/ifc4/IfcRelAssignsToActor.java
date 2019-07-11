/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelAssignsToActor of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link RelatingActor}, 
{@link ActingRole}, 

* It provides of then following operations (getters and setters)
{@link getRelatingActor},
{@link getActingRole},
{@link setRelatingActor},
{@link setActingRole},
 */

@Description("")

public interface IfcRelAssignsToActor extends GenericEntity, ifc4.IfcRelAssigns {

	EntityType<IfcRelAssignsToActor> T = EntityTypes.T(IfcRelAssignsToActor.class);

	/* Constants for each property name. */
	java.lang.String RelatingActor = "RelatingActor";
	java.lang.String ActingRole = "ActingRole";

	@Description("")
	@Mandatory
	ifc4.IfcActor getRelatingActor();
	void setRelatingActor(ifc4.IfcActor RelatingActor);
	@Description("")
	@Mandatory
	ifc4.IfcActorRole getActingRole();
	void setActingRole(ifc4.IfcActorRole ActingRole);
}
