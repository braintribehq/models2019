/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcFace of the Data Model iai.
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
{@link Bounds}, 
{@link HasTextureMaps}, 

* It provides of then following operations (getters and setters)
{@link getBounds},
{@link getHasTextureMaps},
{@link setBounds},
{@link setHasTextureMaps},
 */

@Description("")

public interface IfcFace extends GenericEntity, ifc4.IfcTopologicalRepresentationItem {

	EntityType<IfcFace> T = EntityTypes.T(IfcFace.class);

	/* Constants for each property name. */
	java.lang.String Bounds = "Bounds";
	java.lang.String HasTextureMaps = "HasTextureMaps";

	@Description("")
	
	java.util.List<ifc4.IfcFaceBound> getBounds();
	void setBounds(java.util.List<ifc4.IfcFaceBound> Bounds);

	@Description("")
	
	java.util.List<ifc4.IfcTextureMap> getHasTextureMaps();
	void setHasTextureMaps(java.util.List<ifc4.IfcTextureMap> HasTextureMaps);

}
