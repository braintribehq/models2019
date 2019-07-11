/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralActivity of the Data Model iai.
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
{@link AppliedLoad}, 
{@link GlobalOrLocal}, 
{@link AssignedToStructuralItem}, 

* It provides of then following operations (getters and setters)
{@link getAppliedLoad},
{@link getGlobalOrLocal},
{@link getAssignedToStructuralItem},
{@link setAppliedLoad},
{@link setGlobalOrLocal},
{@link setAssignedToStructuralItem},
 */

@Description("")

public interface IfcStructuralActivity extends GenericEntity, ifc4.IfcProduct {

	EntityType<IfcStructuralActivity> T = EntityTypes.T(IfcStructuralActivity.class);

	/* Constants for each property name. */
	java.lang.String AppliedLoad = "AppliedLoad";
	java.lang.String GlobalOrLocal = "GlobalOrLocal";
	java.lang.String AssignedToStructuralItem = "AssignedToStructuralItem";

	@Description("")
	@Mandatory
	ifc4.IfcStructuralLoad getAppliedLoad();
	void setAppliedLoad(ifc4.IfcStructuralLoad AppliedLoad);
	@Description("")
	@Mandatory
	ifc4.IfcGlobalOrLocalEnum getGlobalOrLocal();
	void setGlobalOrLocal(ifc4.IfcGlobalOrLocalEnum GlobalOrLocal);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelConnectsStructuralActivity> getAssignedToStructuralItem();
	void setAssignedToStructuralItem(java.util.List<ifc4.IfcRelConnectsStructuralActivity> AssignedToStructuralItem);

}
