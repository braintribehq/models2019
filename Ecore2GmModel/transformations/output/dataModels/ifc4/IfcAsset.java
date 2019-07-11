/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcAsset of the Data Model iai.
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
{@link Identification}, 
{@link OriginalValue}, 
{@link CurrentValue}, 
{@link TotalReplacementCost}, 
{@link Owner}, 
{@link User}, 
{@link ResponsiblePerson}, 
{@link IncorporationDate}, 
{@link DepreciatedValue}, 

* It provides of then following operations (getters and setters)
{@link getIdentification},
{@link getOriginalValue},
{@link getCurrentValue},
{@link getTotalReplacementCost},
{@link getOwner},
{@link getUser},
{@link getResponsiblePerson},
{@link getIncorporationDate},
{@link getDepreciatedValue},
{@link setIdentification},
{@link setOriginalValue},
{@link setCurrentValue},
{@link setTotalReplacementCost},
{@link setOwner},
{@link setUser},
{@link setResponsiblePerson},
{@link setIncorporationDate},
{@link setDepreciatedValue},
 */

@Description("")

public interface IfcAsset extends GenericEntity, ifc4.IfcGroup {

	EntityType<IfcAsset> T = EntityTypes.T(IfcAsset.class);

	/* Constants for each property name. */
	java.lang.String Identification = "Identification";
	java.lang.String OriginalValue = "OriginalValue";
	java.lang.String CurrentValue = "CurrentValue";
	java.lang.String TotalReplacementCost = "TotalReplacementCost";
	java.lang.String Owner = "Owner";
	java.lang.String User = "User";
	java.lang.String ResponsiblePerson = "ResponsiblePerson";
	java.lang.String IncorporationDate = "IncorporationDate";
	java.lang.String DepreciatedValue = "DepreciatedValue";

	@Description("")
	@Mandatory
	java.lang.String getIdentification();
	void setIdentification(java.lang.String Identification);
	@Description("")
	@Mandatory
	ifc4.IfcCostValue getOriginalValue();
	void setOriginalValue(ifc4.IfcCostValue OriginalValue);
	@Description("")
	@Mandatory
	ifc4.IfcCostValue getCurrentValue();
	void setCurrentValue(ifc4.IfcCostValue CurrentValue);
	@Description("")
	@Mandatory
	ifc4.IfcCostValue getTotalReplacementCost();
	void setTotalReplacementCost(ifc4.IfcCostValue TotalReplacementCost);
	@Description("")
	@Mandatory
	ifc4.IfcActorSelect getOwner();
	void setOwner(ifc4.IfcActorSelect Owner);
	@Description("")
	@Mandatory
	ifc4.IfcActorSelect getUser();
	void setUser(ifc4.IfcActorSelect User);
	@Description("")
	@Mandatory
	ifc4.IfcPerson getResponsiblePerson();
	void setResponsiblePerson(ifc4.IfcPerson ResponsiblePerson);
	@Description("")
	@Mandatory
	java.lang.String getIncorporationDate();
	void setIncorporationDate(java.lang.String IncorporationDate);
	@Description("")
	@Mandatory
	ifc4.IfcCostValue getDepreciatedValue();
	void setDepreciatedValue(ifc4.IfcCostValue DepreciatedValue);
}
