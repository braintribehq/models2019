/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialConstituentSet of the Data Model iai.
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
{@link MaterialConstituents}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getMaterialConstituents},
{@link setName},
{@link setDescription},
{@link setMaterialConstituents},
 */

@Description("")

public interface IfcMaterialConstituentSet extends GenericEntity, ifc4.IfcMaterialDefinition {

	EntityType<IfcMaterialConstituentSet> T = EntityTypes.T(IfcMaterialConstituentSet.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String MaterialConstituents = "MaterialConstituents";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	
	java.util.List<ifc4.IfcMaterialConstituent> getMaterialConstituents();
	void setMaterialConstituents(java.util.List<ifc4.IfcMaterialConstituent> MaterialConstituents);

}
