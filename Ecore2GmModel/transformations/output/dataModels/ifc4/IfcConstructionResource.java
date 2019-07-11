/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcConstructionResource of the Data Model iai.
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
{@link Usage}, 
{@link BaseCosts}, 
{@link BaseQuantity}, 

* It provides of then following operations (getters and setters)
{@link getUsage},
{@link getBaseCosts},
{@link getBaseQuantity},
{@link setUsage},
{@link setBaseCosts},
{@link setBaseQuantity},
 */

@Description("")

public interface IfcConstructionResource extends GenericEntity, ifc4.IfcResource {

	EntityType<IfcConstructionResource> T = EntityTypes.T(IfcConstructionResource.class);

	/* Constants for each property name. */
	java.lang.String Usage = "Usage";
	java.lang.String BaseCosts = "BaseCosts";
	java.lang.String BaseQuantity = "BaseQuantity";

	@Description("")
	@Mandatory
	ifc4.IfcResourceTime getUsage();
	void setUsage(ifc4.IfcResourceTime Usage);
	@Description("")
	
	java.util.List<ifc4.IfcAppliedValue> getBaseCosts();
	void setBaseCosts(java.util.List<ifc4.IfcAppliedValue> BaseCosts);

	@Description("")
	@Mandatory
	ifc4.IfcPhysicalQuantity getBaseQuantity();
	void setBaseQuantity(ifc4.IfcPhysicalQuantity BaseQuantity);
}
