/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelNests of the Data Model iai.
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
{@link RelatingObject}, 
{@link RelatedObjects}, 

* It provides of then following operations (getters and setters)
{@link getRelatingObject},
{@link getRelatedObjects},
{@link setRelatingObject},
{@link setRelatedObjects},
 */

@Description("")

public interface IfcRelNests extends GenericEntity, ifc4.IfcRelDecomposes {

	EntityType<IfcRelNests> T = EntityTypes.T(IfcRelNests.class);

	/* Constants for each property name. */
	java.lang.String RelatingObject = "RelatingObject";
	java.lang.String RelatedObjects = "RelatedObjects";

	@Description("")
	@Mandatory
	ifc4.IfcObjectDefinition getRelatingObject();
	void setRelatingObject(ifc4.IfcObjectDefinition RelatingObject);
	@Description("")
	
	java.util.List<ifc4.IfcObjectDefinition> getRelatedObjects();
	void setRelatedObjects(java.util.List<ifc4.IfcObjectDefinition> RelatedObjects);

}
