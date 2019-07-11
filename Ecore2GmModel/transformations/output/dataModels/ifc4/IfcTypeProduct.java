/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTypeProduct of the Data Model iai.
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
{@link RepresentationMaps}, 
{@link Tag}, 
{@link ReferencedBy}, 

* It provides of then following operations (getters and setters)
{@link getRepresentationMaps},
{@link getTag},
{@link getReferencedBy},
{@link setRepresentationMaps},
{@link setTag},
{@link setReferencedBy},
 */

@Description("")

public interface IfcTypeProduct extends GenericEntity, ifc4.IfcTypeObject, ifc4.IfcProductSelect {

	EntityType<IfcTypeProduct> T = EntityTypes.T(IfcTypeProduct.class);

	/* Constants for each property name. */
	java.lang.String RepresentationMaps = "RepresentationMaps";
	java.lang.String Tag = "Tag";
	java.lang.String ReferencedBy = "ReferencedBy";

	@Description("")
	
	java.util.List<ifc4.IfcRepresentationMap> getRepresentationMaps();
	void setRepresentationMaps(java.util.List<ifc4.IfcRepresentationMap> RepresentationMaps);

	@Description("")
	@Mandatory
	java.lang.String getTag();
	void setTag(java.lang.String Tag);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssignsToProduct> getReferencedBy();
	void setReferencedBy(java.util.List<ifc4.IfcRelAssignsToProduct> ReferencedBy);

}
