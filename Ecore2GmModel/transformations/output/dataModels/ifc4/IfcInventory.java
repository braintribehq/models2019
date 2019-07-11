/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcInventory of the Data Model iai.
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
{@link Jurisdiction}, 
{@link ResponsiblePersons}, 
{@link LastUpdateDate}, 
{@link CurrentValue}, 
{@link OriginalValue}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getJurisdiction},
{@link getResponsiblePersons},
{@link getLastUpdateDate},
{@link getCurrentValue},
{@link getOriginalValue},
{@link setPredefinedType},
{@link setJurisdiction},
{@link setResponsiblePersons},
{@link setLastUpdateDate},
{@link setCurrentValue},
{@link setOriginalValue},
 */

@Description("")

public interface IfcInventory extends GenericEntity, ifc4.IfcGroup {

	EntityType<IfcInventory> T = EntityTypes.T(IfcInventory.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String Jurisdiction = "Jurisdiction";
	java.lang.String ResponsiblePersons = "ResponsiblePersons";
	java.lang.String LastUpdateDate = "LastUpdateDate";
	java.lang.String CurrentValue = "CurrentValue";
	java.lang.String OriginalValue = "OriginalValue";

	@Description("")
	@Mandatory
	ifc4.IfcInventoryTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcInventoryTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcActorSelect getJurisdiction();
	void setJurisdiction(ifc4.IfcActorSelect Jurisdiction);
	@Description("")
	
	java.util.List<ifc4.IfcPerson> getResponsiblePersons();
	void setResponsiblePersons(java.util.List<ifc4.IfcPerson> ResponsiblePersons);

	@Description("")
	@Mandatory
	java.lang.String getLastUpdateDate();
	void setLastUpdateDate(java.lang.String LastUpdateDate);
	@Description("")
	@Mandatory
	ifc4.IfcCostValue getCurrentValue();
	void setCurrentValue(ifc4.IfcCostValue CurrentValue);
	@Description("")
	@Mandatory
	ifc4.IfcCostValue getOriginalValue();
	void setOriginalValue(ifc4.IfcCostValue OriginalValue);
}
