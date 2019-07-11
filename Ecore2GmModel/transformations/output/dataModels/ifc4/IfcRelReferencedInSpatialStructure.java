/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelReferencedInSpatialStructure of the Data Model iai.
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
{@link RelatedElements}, 
{@link RelatingStructure}, 

* It provides of then following operations (getters and setters)
{@link getRelatedElements},
{@link getRelatingStructure},
{@link setRelatedElements},
{@link setRelatingStructure},
 */

@Description("")

public interface IfcRelReferencedInSpatialStructure extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelReferencedInSpatialStructure> T = EntityTypes.T(IfcRelReferencedInSpatialStructure.class);

	/* Constants for each property name. */
	java.lang.String RelatedElements = "RelatedElements";
	java.lang.String RelatingStructure = "RelatingStructure";

	@Description("")
	
	java.util.List<ifc4.IfcProduct> getRelatedElements();
	void setRelatedElements(java.util.List<ifc4.IfcProduct> RelatedElements);

	@Description("")
	@Mandatory
	ifc4.IfcSpatialElement getRelatingStructure();
	void setRelatingStructure(ifc4.IfcSpatialElement RelatingStructure);
}
