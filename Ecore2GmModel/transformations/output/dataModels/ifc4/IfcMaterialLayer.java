/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialLayer of the Data Model iai.
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
{@link Material}, 
{@link LayerThickness}, 
{@link LayerThicknessAsString}, 
{@link IsVentilated}, 
{@link Name}, 
{@link Description}, 
{@link Category}, 
{@link Priority}, 
{@link ToMaterialLayerSet}, 

* It provides of then following operations (getters and setters)
{@link getMaterial},
{@link getLayerThickness},
{@link getLayerThicknessAsString},
{@link getIsVentilated},
{@link getName},
{@link getDescription},
{@link getCategory},
{@link getPriority},
{@link getToMaterialLayerSet},
{@link setMaterial},
{@link setLayerThickness},
{@link setLayerThicknessAsString},
{@link setIsVentilated},
{@link setName},
{@link setDescription},
{@link setCategory},
{@link setPriority},
{@link setToMaterialLayerSet},
 */

@Description("")

public interface IfcMaterialLayer extends GenericEntity, ifc4.IfcMaterialDefinition {

	EntityType<IfcMaterialLayer> T = EntityTypes.T(IfcMaterialLayer.class);

	/* Constants for each property name. */
	java.lang.String Material = "Material";
	java.lang.String LayerThickness = "LayerThickness";
	java.lang.String LayerThicknessAsString = "LayerThicknessAsString";
	java.lang.String IsVentilated = "IsVentilated";
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String Category = "Category";
	java.lang.String Priority = "Priority";
	java.lang.String ToMaterialLayerSet = "ToMaterialLayerSet";

	@Description("")
	@Mandatory
	ifc4.IfcMaterial getMaterial();
	void setMaterial(ifc4.IfcMaterial Material);
	@Description("")
	@Mandatory
	java.lang.Double getLayerThickness();
	void setLayerThickness(java.lang.Double LayerThickness);
	@Description("")
	@Mandatory
	java.lang.String getLayerThicknessAsString();
	void setLayerThicknessAsString(java.lang.String LayerThicknessAsString);
	@Description("")
	@Mandatory
	ifc4.Tristate getIsVentilated();
	void setIsVentilated(ifc4.Tristate IsVentilated);
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
	java.lang.Long getPriority();
	void setPriority(java.lang.Long Priority);
	@Description("")
	@Mandatory
	ifc4.IfcMaterialLayerSet getToMaterialLayerSet();
	void setToMaterialLayerSet(ifc4.IfcMaterialLayerSet ToMaterialLayerSet);
}
