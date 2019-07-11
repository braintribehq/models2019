/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelSpaceBoundary1stLevel of the Data Model iai.
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
{@link ParentBoundary}, 
{@link InnerBoundaries}, 

* It provides of then following operations (getters and setters)
{@link getParentBoundary},
{@link getInnerBoundaries},
{@link setParentBoundary},
{@link setInnerBoundaries},
 */

@Description("")

public interface IfcRelSpaceBoundary1stLevel extends GenericEntity, ifc4.IfcRelSpaceBoundary {

	EntityType<IfcRelSpaceBoundary1stLevel> T = EntityTypes.T(IfcRelSpaceBoundary1stLevel.class);

	/* Constants for each property name. */
	java.lang.String ParentBoundary = "ParentBoundary";
	java.lang.String InnerBoundaries = "InnerBoundaries";

	@Description("")
	@Mandatory
	ifc4.IfcRelSpaceBoundary1stLevel getParentBoundary();
	void setParentBoundary(ifc4.IfcRelSpaceBoundary1stLevel ParentBoundary);
	@Description("")
	
	java.util.List<ifc4.IfcRelSpaceBoundary1stLevel> getInnerBoundaries();
	void setInnerBoundaries(java.util.List<ifc4.IfcRelSpaceBoundary1stLevel> InnerBoundaries);

}
