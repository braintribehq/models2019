/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRoot of the Data Model iai.
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
{@link GlobalId}, 
{@link OwnerHistory}, 
{@link Name}, 
{@link Description}, 

* It provides of then following operations (getters and setters)
{@link getGlobalId},
{@link getOwnerHistory},
{@link getName},
{@link getDescription},
{@link setGlobalId},
{@link setOwnerHistory},
{@link setName},
{@link setDescription},
 */

@Description("")

public interface IfcRoot extends GenericEntity {

	EntityType<IfcRoot> T = EntityTypes.T(IfcRoot.class);

	/* Constants for each property name. */
	java.lang.String GlobalId = "GlobalId";
	java.lang.String OwnerHistory = "OwnerHistory";
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";

	@Description("")
	@Mandatory
	java.lang.String getGlobalId();
	void setGlobalId(java.lang.String GlobalId);
	@Description("")
	@Mandatory
	ifc4.IfcOwnerHistory getOwnerHistory();
	void setOwnerHistory(ifc4.IfcOwnerHistory OwnerHistory);
	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
}
