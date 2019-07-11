/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRepresentation of the Data Model iai.
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
{@link ContextOfItems}, 
{@link RepresentationIdentifier}, 
{@link RepresentationType}, 
{@link Items}, 
{@link RepresentationMap}, 
{@link LayerAssignments}, 
{@link OfProductRepresentation}, 

* It provides of then following operations (getters and setters)
{@link getContextOfItems},
{@link getRepresentationIdentifier},
{@link getRepresentationType},
{@link getItems},
{@link getRepresentationMap},
{@link getLayerAssignments},
{@link getOfProductRepresentation},
{@link setContextOfItems},
{@link setRepresentationIdentifier},
{@link setRepresentationType},
{@link setItems},
{@link setRepresentationMap},
{@link setLayerAssignments},
{@link setOfProductRepresentation},
 */

@Description("")

public interface IfcRepresentation extends GenericEntity, ifc4.IfcLayeredItem {

	EntityType<IfcRepresentation> T = EntityTypes.T(IfcRepresentation.class);

	/* Constants for each property name. */
	java.lang.String ContextOfItems = "ContextOfItems";
	java.lang.String RepresentationIdentifier = "RepresentationIdentifier";
	java.lang.String RepresentationType = "RepresentationType";
	java.lang.String Items = "Items";
	java.lang.String RepresentationMap = "RepresentationMap";
	java.lang.String LayerAssignments = "LayerAssignments";
	java.lang.String OfProductRepresentation = "OfProductRepresentation";

	@Description("")
	@Mandatory
	ifc4.IfcRepresentationContext getContextOfItems();
	void setContextOfItems(ifc4.IfcRepresentationContext ContextOfItems);
	@Description("")
	@Mandatory
	java.lang.String getRepresentationIdentifier();
	void setRepresentationIdentifier(java.lang.String RepresentationIdentifier);
	@Description("")
	@Mandatory
	java.lang.String getRepresentationType();
	void setRepresentationType(java.lang.String RepresentationType);
	@Description("")
	
	java.util.List<ifc4.IfcRepresentationItem> getItems();
	void setItems(java.util.List<ifc4.IfcRepresentationItem> Items);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRepresentationMap> getRepresentationMap();
	void setRepresentationMap(java.util.List<ifc4.IfcRepresentationMap> RepresentationMap);

	@Description("")
	
	java.util.List<ifc4.IfcPresentationLayerAssignment> getLayerAssignments();
	void setLayerAssignments(java.util.List<ifc4.IfcPresentationLayerAssignment> LayerAssignments);

	@Description("")
	
	java.util.List<ifc4.IfcProductRepresentation> getOfProductRepresentation();
	void setOfProductRepresentation(java.util.List<ifc4.IfcProductRepresentation> OfProductRepresentation);

}
