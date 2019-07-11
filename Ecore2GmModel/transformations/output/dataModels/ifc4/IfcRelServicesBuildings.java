/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelServicesBuildings of the Data Model iai.
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
{@link RelatingSystem}, 
{@link RelatedBuildings}, 

* It provides of then following operations (getters and setters)
{@link getRelatingSystem},
{@link getRelatedBuildings},
{@link setRelatingSystem},
{@link setRelatedBuildings},
 */

@Description("")

public interface IfcRelServicesBuildings extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelServicesBuildings> T = EntityTypes.T(IfcRelServicesBuildings.class);

	/* Constants for each property name. */
	java.lang.String RelatingSystem = "RelatingSystem";
	java.lang.String RelatedBuildings = "RelatedBuildings";

	@Description("")
	@Mandatory
	ifc4.IfcSystem getRelatingSystem();
	void setRelatingSystem(ifc4.IfcSystem RelatingSystem);
	@Description("")
	
	java.util.List<ifc4.IfcSpatialElement> getRelatedBuildings();
	void setRelatedBuildings(java.util.List<ifc4.IfcSpatialElement> RelatedBuildings);

}
