/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralConnection of the Data Model iai.
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
{@link AppliedCondition}, 
{@link ConnectsStructuralMembers}, 

* It provides of then following operations (getters and setters)
{@link getAppliedCondition},
{@link getConnectsStructuralMembers},
{@link setAppliedCondition},
{@link setConnectsStructuralMembers},
 */

@Description("")

public interface IfcStructuralConnection extends GenericEntity, ifc4.IfcStructuralItem {

	EntityType<IfcStructuralConnection> T = EntityTypes.T(IfcStructuralConnection.class);

	/* Constants for each property name. */
	java.lang.String AppliedCondition = "AppliedCondition";
	java.lang.String ConnectsStructuralMembers = "ConnectsStructuralMembers";

	@Description("")
	@Mandatory
	ifc4.IfcBoundaryCondition getAppliedCondition();
	void setAppliedCondition(ifc4.IfcBoundaryCondition AppliedCondition);
	@Description("")
	
	java.util.List<ifc4.IfcRelConnectsStructuralMember> getConnectsStructuralMembers();
	void setConnectsStructuralMembers(java.util.List<ifc4.IfcRelConnectsStructuralMember> ConnectsStructuralMembers);

}
