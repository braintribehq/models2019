/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMaterialLayerSet of the Data Model iai.
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
{@link MaterialLayers}, 
{@link LayerSetName}, 
{@link Description}, 
{@link TotalThickness}, 
{@link TotalThicknessAsString}, 

* It provides of then following operations (getters and setters)
{@link getMaterialLayers},
{@link getLayerSetName},
{@link getDescription},
{@link getTotalThickness},
{@link getTotalThicknessAsString},
{@link setMaterialLayers},
{@link setLayerSetName},
{@link setDescription},
{@link setTotalThickness},
{@link setTotalThicknessAsString},
 */

@Description("")

public interface IfcMaterialLayerSet extends GenericEntity, ifc4.IfcMaterialDefinition {

	EntityType<IfcMaterialLayerSet> T = EntityTypes.T(IfcMaterialLayerSet.class);

	/* Constants for each property name. */
	java.lang.String MaterialLayers = "MaterialLayers";
	java.lang.String LayerSetName = "LayerSetName";
	java.lang.String Description = "Description";
	java.lang.String TotalThickness = "TotalThickness";
	java.lang.String TotalThicknessAsString = "TotalThicknessAsString";

	@Description("")
	
	java.util.List<ifc4.IfcMaterialLayer> getMaterialLayers();
	void setMaterialLayers(java.util.List<ifc4.IfcMaterialLayer> MaterialLayers);

	@Description("")
	@Mandatory
	java.lang.String getLayerSetName();
	void setLayerSetName(java.lang.String LayerSetName);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	java.lang.Double getTotalThickness();
	void setTotalThickness(java.lang.Double TotalThickness);
	@Description("")
	@Mandatory
	java.lang.String getTotalThicknessAsString();
	void setTotalThicknessAsString(java.lang.String TotalThicknessAsString);
}
