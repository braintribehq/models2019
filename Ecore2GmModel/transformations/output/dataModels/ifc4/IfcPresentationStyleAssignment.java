/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPresentationStyleAssignment of the Data Model iai.
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
{@link Styles}, 

* It provides of then following operations (getters and setters)
{@link getStyles},
{@link setStyles},
 */

@Description("")

public interface IfcPresentationStyleAssignment extends GenericEntity, ifc4.IfcStyleAssignmentSelect {

	EntityType<IfcPresentationStyleAssignment> T = EntityTypes.T(IfcPresentationStyleAssignment.class);

	/* Constants for each property name. */
	java.lang.String Styles = "Styles";

	@Description("")
	
	java.util.List<ifc4.IfcPresentationStyleSelect> getStyles();
	void setStyles(java.util.List<ifc4.IfcPresentationStyleSelect> Styles);

}
