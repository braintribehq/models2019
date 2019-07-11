/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcConstructionResourceType of the Data Model iai.
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
{@link BaseCosts}, 
{@link BaseQuantity}, 

* It provides of then following operations (getters and setters)
{@link getBaseCosts},
{@link getBaseQuantity},
{@link setBaseCosts},
{@link setBaseQuantity},
 */

@Description("")

public interface IfcConstructionResourceType extends GenericEntity, ifc4.IfcTypeResource {

	EntityType<IfcConstructionResourceType> T = EntityTypes.T(IfcConstructionResourceType.class);

	/* Constants for each property name. */
	java.lang.String BaseCosts = "BaseCosts";
	java.lang.String BaseQuantity = "BaseQuantity";

	@Description("")
	
	java.util.List<ifc4.IfcAppliedValue> getBaseCosts();
	void setBaseCosts(java.util.List<ifc4.IfcAppliedValue> BaseCosts);

	@Description("")
	@Mandatory
	ifc4.IfcPhysicalQuantity getBaseQuantity();
	void setBaseQuantity(ifc4.IfcPhysicalQuantity BaseQuantity);
}
