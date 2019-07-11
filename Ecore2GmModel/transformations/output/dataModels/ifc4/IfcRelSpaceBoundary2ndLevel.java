/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelSpaceBoundary2ndLevel of the Data Model iai.
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
{@link CorrespondingBoundary}, 
{@link Corresponds}, 

* It provides of then following operations (getters and setters)
{@link getCorrespondingBoundary},
{@link getCorresponds},
{@link setCorrespondingBoundary},
{@link setCorresponds},
 */

@Description("")

public interface IfcRelSpaceBoundary2ndLevel extends GenericEntity, ifc4.IfcRelSpaceBoundary1stLevel {

	EntityType<IfcRelSpaceBoundary2ndLevel> T = EntityTypes.T(IfcRelSpaceBoundary2ndLevel.class);

	/* Constants for each property name. */
	java.lang.String CorrespondingBoundary = "CorrespondingBoundary";
	java.lang.String Corresponds = "Corresponds";

	@Description("")
	@Mandatory
	ifc4.IfcRelSpaceBoundary2ndLevel getCorrespondingBoundary();
	void setCorrespondingBoundary(ifc4.IfcRelSpaceBoundary2ndLevel CorrespondingBoundary);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelSpaceBoundary2ndLevel> getCorresponds();
	void setCorresponds(java.util.List<ifc4.IfcRelSpaceBoundary2ndLevel> Corresponds);

}
