/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcIndexedTextureMap of the Data Model iai.
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
{@link MappedTo}, 
{@link TexCoords}, 

* It provides of then following operations (getters and setters)
{@link getMappedTo},
{@link getTexCoords},
{@link setMappedTo},
{@link setTexCoords},
 */

@Description("")

public interface IfcIndexedTextureMap extends GenericEntity, ifc4.IfcTextureCoordinate {

	EntityType<IfcIndexedTextureMap> T = EntityTypes.T(IfcIndexedTextureMap.class);

	/* Constants for each property name. */
	java.lang.String MappedTo = "MappedTo";
	java.lang.String TexCoords = "TexCoords";

	@Description("")
	@Mandatory
	ifc4.IfcTessellatedFaceSet getMappedTo();
	void setMappedTo(ifc4.IfcTessellatedFaceSet MappedTo);
	@Description("")
	@Mandatory
	ifc4.IfcTextureVertexList getTexCoords();
	void setTexCoords(ifc4.IfcTextureVertexList TexCoords);
}
