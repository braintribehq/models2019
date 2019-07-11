/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLocalPlacement of the Data Model iai.
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
{@link PlacementRelTo}, 
{@link RelativePlacement}, 

* It provides of then following operations (getters and setters)
{@link getPlacementRelTo},
{@link getRelativePlacement},
{@link setPlacementRelTo},
{@link setRelativePlacement},
 */

@Description("")

public interface IfcLocalPlacement extends GenericEntity, ifc4.IfcObjectPlacement {

	EntityType<IfcLocalPlacement> T = EntityTypes.T(IfcLocalPlacement.class);

	/* Constants for each property name. */
	java.lang.String PlacementRelTo = "PlacementRelTo";
	java.lang.String RelativePlacement = "RelativePlacement";

	@Description("")
	@Mandatory
	ifc4.IfcObjectPlacement getPlacementRelTo();
	void setPlacementRelTo(ifc4.IfcObjectPlacement PlacementRelTo);
	@Description("")
	@Mandatory
	ifc4.IfcAxis2Placement getRelativePlacement();
	void setRelativePlacement(ifc4.IfcAxis2Placement RelativePlacement);
}
