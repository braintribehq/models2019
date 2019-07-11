/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertyDefinition of the Data Model iai.
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
{@link HasContext}, 
{@link HasAssociations}, 

* It provides of then following operations (getters and setters)
{@link getHasContext},
{@link getHasAssociations},
{@link setHasContext},
{@link setHasAssociations},
 */

@Description("")

public interface IfcPropertyDefinition extends GenericEntity, ifc4.IfcRoot, ifc4.IfcDefinitionSelect {

	EntityType<IfcPropertyDefinition> T = EntityTypes.T(IfcPropertyDefinition.class);

	/* Constants for each property name. */
	java.lang.String HasContext = "HasContext";
	java.lang.String HasAssociations = "HasAssociations";

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelDeclares> getHasContext();
	void setHasContext(java.util.List<ifc4.IfcRelDeclares> HasContext);

	@Description("")
	
	java.util.List<ifc4.IfcRelAssociates> getHasAssociations();
	void setHasAssociations(java.util.List<ifc4.IfcRelAssociates> HasAssociations);

}
