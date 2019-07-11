/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCostItem of the Data Model iai.
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
{@link PredefinedType}, 
{@link CostValues}, 
{@link CostQuantities}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getCostValues},
{@link getCostQuantities},
{@link setPredefinedType},
{@link setCostValues},
{@link setCostQuantities},
 */

@Description("")

public interface IfcCostItem extends GenericEntity, ifc4.IfcControl {

	EntityType<IfcCostItem> T = EntityTypes.T(IfcCostItem.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String CostValues = "CostValues";
	java.lang.String CostQuantities = "CostQuantities";

	@Description("")
	@Mandatory
	ifc4.IfcCostItemTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcCostItemTypeEnum PredefinedType);
	@Description("")
	
	java.util.List<ifc4.IfcCostValue> getCostValues();
	void setCostValues(java.util.List<ifc4.IfcCostValue> CostValues);

	@Description("")
	
	java.util.List<ifc4.IfcPhysicalQuantity> getCostQuantities();
	void setCostQuantities(java.util.List<ifc4.IfcPhysicalQuantity> CostQuantities);

}
