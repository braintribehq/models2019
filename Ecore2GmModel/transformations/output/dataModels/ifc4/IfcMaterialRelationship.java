/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialRelationship of the Data Model iai.
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
{@link RelatingMaterial}, 
{@link RelatedMaterials}, 
{@link Expression}, 

* It provides of then following operations (getters and setters)
{@link getRelatingMaterial},
{@link getRelatedMaterials},
{@link getExpression},
{@link setRelatingMaterial},
{@link setRelatedMaterials},
{@link setExpression},
 */

@Description("")

public interface IfcMaterialRelationship extends GenericEntity, ifc4.IfcResourceLevelRelationship {

	EntityType<IfcMaterialRelationship> T = EntityTypes.T(IfcMaterialRelationship.class);

	/* Constants for each property name. */
	java.lang.String RelatingMaterial = "RelatingMaterial";
	java.lang.String RelatedMaterials = "RelatedMaterials";
	java.lang.String Expression = "Expression";

	@Description("")
	@Mandatory
	ifc4.IfcMaterial getRelatingMaterial();
	void setRelatingMaterial(ifc4.IfcMaterial RelatingMaterial);
	@Description("")
	
	java.util.List<ifc4.IfcMaterial> getRelatedMaterials();
	void setRelatedMaterials(java.util.List<ifc4.IfcMaterial> RelatedMaterials);

	@Description("")
	@Mandatory
	java.lang.String getExpression();
	void setExpression(java.lang.String Expression);
}
