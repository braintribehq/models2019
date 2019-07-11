/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelConnectsStructuralActivity of the Data Model iai.
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
{@link RelatingElement}, 
{@link RelatedStructuralActivity}, 

* It provides of then following operations (getters and setters)
{@link getRelatingElement},
{@link getRelatedStructuralActivity},
{@link setRelatingElement},
{@link setRelatedStructuralActivity},
 */

@Description("")

public interface IfcRelConnectsStructuralActivity extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelConnectsStructuralActivity> T = EntityTypes.T(IfcRelConnectsStructuralActivity.class);

	/* Constants for each property name. */
	java.lang.String RelatingElement = "RelatingElement";
	java.lang.String RelatedStructuralActivity = "RelatedStructuralActivity";

	@Description("")
	@Mandatory
	ifc4.IfcStructuralActivityAssignmentSelect getRelatingElement();
	void setRelatingElement(ifc4.IfcStructuralActivityAssignmentSelect RelatingElement);
	@Description("")
	@Mandatory
	ifc4.IfcStructuralActivity getRelatedStructuralActivity();
	void setRelatedStructuralActivity(ifc4.IfcStructuralActivity RelatedStructuralActivity);
}
