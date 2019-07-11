/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialProfile of the Data Model iai.
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
{@link Material}, 
{@link Profile}, 
{@link Priority}, 
{@link Category}, 
{@link ToMaterialProfileSet}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getMaterial},
{@link getProfile},
{@link getPriority},
{@link getCategory},
{@link getToMaterialProfileSet},
{@link setName},
{@link setDescription},
{@link setMaterial},
{@link setProfile},
{@link setPriority},
{@link setCategory},
{@link setToMaterialProfileSet},
 */

@Description("")

public interface IfcMaterialProfile extends GenericEntity, ifc4.IfcMaterialDefinition {

	EntityType<IfcMaterialProfile> T = EntityTypes.T(IfcMaterialProfile.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String Material = "Material";
	java.lang.String Profile = "Profile";
	java.lang.String Priority = "Priority";
	java.lang.String Category = "Category";
	java.lang.String ToMaterialProfileSet = "ToMaterialProfileSet";

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
	ifc4.IfcMaterial getMaterial();
	void setMaterial(ifc4.IfcMaterial Material);
	@Description("")
	@Mandatory
	ifc4.IfcProfileDef getProfile();
	void setProfile(ifc4.IfcProfileDef Profile);
	@Description("")
	@Mandatory
	java.lang.Long getPriority();
	void setPriority(java.lang.Long Priority);
	@Description("")
	@Mandatory
	java.lang.String getCategory();
	void setCategory(java.lang.String Category);
	@Description("")
	@Mandatory
	ifc4.IfcMaterialProfileSet getToMaterialProfileSet();
	void setToMaterialProfileSet(ifc4.IfcMaterialProfileSet ToMaterialProfileSet);
}
