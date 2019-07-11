/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadSingleForceWarping of the Data Model iai.
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
{@link WarpingMoment}, 
{@link WarpingMomentAsString}, 

* It provides of then following operations (getters and setters)
{@link getWarpingMoment},
{@link getWarpingMomentAsString},
{@link setWarpingMoment},
{@link setWarpingMomentAsString},
 */

@Description("")

public interface IfcStructuralLoadSingleForceWarping extends GenericEntity, ifc4.IfcStructuralLoadSingleForce {

	EntityType<IfcStructuralLoadSingleForceWarping> T = EntityTypes.T(IfcStructuralLoadSingleForceWarping.class);

	/* Constants for each property name. */
	java.lang.String WarpingMoment = "WarpingMoment";
	java.lang.String WarpingMomentAsString = "WarpingMomentAsString";

	@Description("")
	@Mandatory
	java.lang.Double getWarpingMoment();
	void setWarpingMoment(java.lang.Double WarpingMoment);
	@Description("")
	@Mandatory
	java.lang.String getWarpingMomentAsString();
	void setWarpingMomentAsString(java.lang.String WarpingMomentAsString);
}
