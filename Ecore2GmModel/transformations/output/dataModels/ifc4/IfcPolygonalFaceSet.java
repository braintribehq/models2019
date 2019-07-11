/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPolygonalFaceSet of the Data Model iai.
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
{@link Closed}, 
{@link Faces}, 
{@link PnIndex}, 

* It provides of then following operations (getters and setters)
{@link getClosed},
{@link getFaces},
{@link getPnIndex},
{@link setClosed},
{@link setFaces},
{@link setPnIndex},
 */

@Description("")

public interface IfcPolygonalFaceSet extends GenericEntity, ifc4.IfcTessellatedFaceSet {

	EntityType<IfcPolygonalFaceSet> T = EntityTypes.T(IfcPolygonalFaceSet.class);

	/* Constants for each property name. */
	java.lang.String Closed = "Closed";
	java.lang.String Faces = "Faces";
	java.lang.String PnIndex = "PnIndex";

	@Description("")
	@Mandatory
	ifc4.Tristate getClosed();
	void setClosed(ifc4.Tristate Closed);
	@Description("")
	
	java.util.List<ifc4.IfcIndexedPolygonalFace> getFaces();
	void setFaces(java.util.List<ifc4.IfcIndexedPolygonalFace> Faces);

	@Description("")
	
	java.util.List<java.lang.Long> getPnIndex();
	void setPnIndex(java.util.List<java.lang.Long> PnIndex);

}
