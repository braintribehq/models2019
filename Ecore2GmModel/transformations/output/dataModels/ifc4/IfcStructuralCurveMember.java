/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralCurveMember of the Data Model iai.
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
{@link PredefinedType}, 
{@link Axis}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getAxis},
{@link setPredefinedType},
{@link setAxis},
 */

@Description("")

public interface IfcStructuralCurveMember extends GenericEntity, ifc4.IfcStructuralMember {

	EntityType<IfcStructuralCurveMember> T = EntityTypes.T(IfcStructuralCurveMember.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String Axis = "Axis";

	@Description("")
	@Mandatory
	ifc4.IfcStructuralCurveMemberTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcStructuralCurveMemberTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcDirection getAxis();
	void setAxis(ifc4.IfcDirection Axis);
}
