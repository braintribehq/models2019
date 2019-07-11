/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialDefinition of the Data Model iai.
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
{@link AssociatedTo}, 
{@link HasExternalReferences}, 
{@link HasProperties}, 

* It provides of then following operations (getters and setters)
{@link getAssociatedTo},
{@link getHasExternalReferences},
{@link getHasProperties},
{@link setAssociatedTo},
{@link setHasExternalReferences},
{@link setHasProperties},
 */

@Description("")

public interface IfcMaterialDefinition extends GenericEntity, ifc4.IfcMaterialSelect, ifc4.IfcObjectReferenceSelect, ifc4.IfcResourceObjectSelect {

	EntityType<IfcMaterialDefinition> T = EntityTypes.T(IfcMaterialDefinition.class);

	/* Constants for each property name. */
	java.lang.String AssociatedTo = "AssociatedTo";
	java.lang.String HasExternalReferences = "HasExternalReferences";
	java.lang.String HasProperties = "HasProperties";

	@Description("")
	
	java.util.List<ifc4.IfcRelAssociatesMaterial> getAssociatedTo();
	void setAssociatedTo(java.util.List<ifc4.IfcRelAssociatesMaterial> AssociatedTo);

	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReferences();
	void setHasExternalReferences(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReferences);

	@Description("")
	
	java.util.List<ifc4.IfcMaterialProperties> getHasProperties();
	void setHasProperties(java.util.List<ifc4.IfcMaterialProperties> HasProperties);

}
