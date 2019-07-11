/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcGrid of the Data Model iai.
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
{@link UAxes}, 
{@link VAxes}, 
{@link WAxes}, 
{@link PredefinedType}, 
{@link ContainedInStructure}, 

* It provides of then following operations (getters and setters)
{@link getUAxes},
{@link getVAxes},
{@link getWAxes},
{@link getPredefinedType},
{@link getContainedInStructure},
{@link setUAxes},
{@link setVAxes},
{@link setWAxes},
{@link setPredefinedType},
{@link setContainedInStructure},
 */

@Description("")

public interface IfcGrid extends GenericEntity, ifc4.IfcProduct {

	EntityType<IfcGrid> T = EntityTypes.T(IfcGrid.class);

	/* Constants for each property name. */
	java.lang.String UAxes = "UAxes";
	java.lang.String VAxes = "VAxes";
	java.lang.String WAxes = "WAxes";
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String ContainedInStructure = "ContainedInStructure";

	@Description("")
	
	java.util.List<ifc4.IfcGridAxis> getUAxes();
	void setUAxes(java.util.List<ifc4.IfcGridAxis> UAxes);

	@Description("")
	
	java.util.List<ifc4.IfcGridAxis> getVAxes();
	void setVAxes(java.util.List<ifc4.IfcGridAxis> VAxes);

	@Description("")
	
	java.util.List<ifc4.IfcGridAxis> getWAxes();
	void setWAxes(java.util.List<ifc4.IfcGridAxis> WAxes);

	@Description("")
	@Mandatory
	ifc4.IfcGridTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcGridTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelContainedInSpatialStructure> getContainedInStructure();
	void setContainedInStructure(java.util.List<ifc4.IfcRelContainedInSpatialStructure> ContainedInStructure);

}
