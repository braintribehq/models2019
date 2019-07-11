/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterial of the Data Model iai.
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
{@link Name}, 
{@link Description}, 
{@link Category}, 
{@link HasRepresentation}, 
{@link IsRelatedWith}, 
{@link RelatesTo}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getCategory},
{@link getHasRepresentation},
{@link getIsRelatedWith},
{@link getRelatesTo},
{@link setName},
{@link setDescription},
{@link setCategory},
{@link setHasRepresentation},
{@link setIsRelatedWith},
{@link setRelatesTo},
 */

@Description("")

public interface IfcMaterial extends GenericEntity, ifc4.IfcMaterialDefinition {

	EntityType<IfcMaterial> T = EntityTypes.T(IfcMaterial.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String Category = "Category";
	java.lang.String HasRepresentation = "HasRepresentation";
	java.lang.String IsRelatedWith = "IsRelatedWith";
	java.lang.String RelatesTo = "RelatesTo";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.String getCategory();
	void setCategory(java.lang.String Category);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcMaterialDefinitionRepresentation> getHasRepresentation();
	void setHasRepresentation(java.util.List<ifc4.IfcMaterialDefinitionRepresentation> HasRepresentation);

	@Description("")
	
	java.util.List<ifc4.IfcMaterialRelationship> getIsRelatedWith();
	void setIsRelatedWith(java.util.List<ifc4.IfcMaterialRelationship> IsRelatedWith);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcMaterialRelationship> getRelatesTo();
	void setRelatesTo(java.util.List<ifc4.IfcMaterialRelationship> RelatesTo);

}
