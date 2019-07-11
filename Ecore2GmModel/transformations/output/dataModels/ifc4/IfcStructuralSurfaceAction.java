/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralSurfaceAction of the Data Model iai.
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
{@link ProjectedOrTrue}, 
{@link PredefinedType}, 

* It provides of then following operations (getters and setters)
{@link getProjectedOrTrue},
{@link getPredefinedType},
{@link setProjectedOrTrue},
{@link setPredefinedType},
 */

@Description("")

public interface IfcStructuralSurfaceAction extends GenericEntity, ifc4.IfcStructuralAction {

	EntityType<IfcStructuralSurfaceAction> T = EntityTypes.T(IfcStructuralSurfaceAction.class);

	/* Constants for each property name. */
	java.lang.String ProjectedOrTrue = "ProjectedOrTrue";
	java.lang.String PredefinedType = "PredefinedType";

	@Description("")
	@Mandatory
	ifc4.IfcProjectedOrTrueLengthEnum getProjectedOrTrue();
	void setProjectedOrTrue(ifc4.IfcProjectedOrTrueLengthEnum ProjectedOrTrue);
	@Description("")
	@Mandatory
	ifc4.IfcStructuralSurfaceActivityTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcStructuralSurfaceActivityTypeEnum PredefinedType);
}
