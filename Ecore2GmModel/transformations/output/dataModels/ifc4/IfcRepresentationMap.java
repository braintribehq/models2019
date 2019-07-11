/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRepresentationMap of the Data Model iai.
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
{@link MappingOrigin}, 
{@link MappedRepresentation}, 
{@link HasShapeAspects}, 
{@link MapUsage}, 

* It provides of then following operations (getters and setters)
{@link getMappingOrigin},
{@link getMappedRepresentation},
{@link getHasShapeAspects},
{@link getMapUsage},
{@link setMappingOrigin},
{@link setMappedRepresentation},
{@link setHasShapeAspects},
{@link setMapUsage},
 */

@Description("")

public interface IfcRepresentationMap extends GenericEntity, ifc4.IfcProductRepresentationSelect {

	EntityType<IfcRepresentationMap> T = EntityTypes.T(IfcRepresentationMap.class);

	/* Constants for each property name. */
	java.lang.String MappingOrigin = "MappingOrigin";
	java.lang.String MappedRepresentation = "MappedRepresentation";
	java.lang.String HasShapeAspects = "HasShapeAspects";
	java.lang.String MapUsage = "MapUsage";

	@Description("")
	@Mandatory
	ifc4.IfcAxis2Placement getMappingOrigin();
	void setMappingOrigin(ifc4.IfcAxis2Placement MappingOrigin);
	@Description("")
	@Mandatory
	ifc4.IfcRepresentation getMappedRepresentation();
	void setMappedRepresentation(ifc4.IfcRepresentation MappedRepresentation);
	@Description("")
	
	java.util.List<ifc4.IfcShapeAspect> getHasShapeAspects();
	void setHasShapeAspects(java.util.List<ifc4.IfcShapeAspect> HasShapeAspects);

	@Description("")
	
	java.util.List<ifc4.IfcMappedItem> getMapUsage();
	void setMapUsage(java.util.List<ifc4.IfcMappedItem> MapUsage);

}
