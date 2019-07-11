/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialConstituent of the Data Model iai.
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
{@link Fraction}, 
{@link FractionAsString}, 
{@link Category}, 
{@link ToMaterialConstituentSet}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getMaterial},
{@link getFraction},
{@link getFractionAsString},
{@link getCategory},
{@link getToMaterialConstituentSet},
{@link setName},
{@link setDescription},
{@link setMaterial},
{@link setFraction},
{@link setFractionAsString},
{@link setCategory},
{@link setToMaterialConstituentSet},
 */

@Description("")

public interface IfcMaterialConstituent extends GenericEntity, ifc4.IfcMaterialDefinition {

	EntityType<IfcMaterialConstituent> T = EntityTypes.T(IfcMaterialConstituent.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String Material = "Material";
	java.lang.String Fraction = "Fraction";
	java.lang.String FractionAsString = "FractionAsString";
	java.lang.String Category = "Category";
	java.lang.String ToMaterialConstituentSet = "ToMaterialConstituentSet";

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
	java.lang.Double getFraction();
	void setFraction(java.lang.Double Fraction);
	@Description("")
	@Mandatory
	java.lang.String getFractionAsString();
	void setFractionAsString(java.lang.String FractionAsString);
	@Description("")
	@Mandatory
	java.lang.String getCategory();
	void setCategory(java.lang.String Category);
	@Description("")
	@Mandatory
	ifc4.IfcMaterialConstituentSet getToMaterialConstituentSet();
	void setToMaterialConstituentSet(ifc4.IfcMaterialConstituentSet ToMaterialConstituentSet);
}
