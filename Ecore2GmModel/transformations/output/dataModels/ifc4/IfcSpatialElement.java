/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSpatialElement of the Data Model iai.
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
{@link LongName}, 
{@link ContainsElements}, 
{@link ServicedBySystems}, 
{@link ReferencesElements}, 

* It provides of then following operations (getters and setters)
{@link getLongName},
{@link getContainsElements},
{@link getServicedBySystems},
{@link getReferencesElements},
{@link setLongName},
{@link setContainsElements},
{@link setServicedBySystems},
{@link setReferencesElements},
 */

@Description("")

public interface IfcSpatialElement extends GenericEntity, ifc4.IfcProduct {

	EntityType<IfcSpatialElement> T = EntityTypes.T(IfcSpatialElement.class);

	/* Constants for each property name. */
	java.lang.String LongName = "LongName";
	java.lang.String ContainsElements = "ContainsElements";
	java.lang.String ServicedBySystems = "ServicedBySystems";
	java.lang.String ReferencesElements = "ReferencesElements";

	@Description("")
	@Mandatory
	java.lang.String getLongName();
	void setLongName(java.lang.String LongName);
	@Description("")
	
	java.util.List<ifc4.IfcRelContainedInSpatialStructure> getContainsElements();
	void setContainsElements(java.util.List<ifc4.IfcRelContainedInSpatialStructure> ContainsElements);

	@Description("")
	
	java.util.List<ifc4.IfcRelServicesBuildings> getServicedBySystems();
	void setServicedBySystems(java.util.List<ifc4.IfcRelServicesBuildings> ServicedBySystems);

	@Description("")
	
	java.util.List<ifc4.IfcRelReferencedInSpatialStructure> getReferencesElements();
	void setReferencesElements(java.util.List<ifc4.IfcRelReferencedInSpatialStructure> ReferencesElements);

}
