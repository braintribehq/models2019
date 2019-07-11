/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMappedItem of the Data Model iai.
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
{@link MappingSource}, 
{@link MappingTarget}, 

* It provides of then following operations (getters and setters)
{@link getMappingSource},
{@link getMappingTarget},
{@link setMappingSource},
{@link setMappingTarget},
 */

@Description("")

public interface IfcMappedItem extends GenericEntity, ifc4.IfcRepresentationItem {

	EntityType<IfcMappedItem> T = EntityTypes.T(IfcMappedItem.class);

	/* Constants for each property name. */
	java.lang.String MappingSource = "MappingSource";
	java.lang.String MappingTarget = "MappingTarget";

	@Description("")
	@Mandatory
	ifc4.IfcRepresentationMap getMappingSource();
	void setMappingSource(ifc4.IfcRepresentationMap MappingSource);
	@Description("")
	@Mandatory
	ifc4.IfcCartesianTransformationOperator getMappingTarget();
	void setMappingTarget(ifc4.IfcCartesianTransformationOperator MappingTarget);
}
