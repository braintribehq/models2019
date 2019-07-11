/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTessellatedFaceSet of the Data Model iai.
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
{@link Coordinates}, 
{@link HasColours}, 
{@link HasTextures}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getCoordinates},
{@link getHasColours},
{@link getHasTextures},
{@link getDim},
{@link setCoordinates},
{@link setHasColours},
{@link setHasTextures},
{@link setDim},
 */

@Description("")

public interface IfcTessellatedFaceSet extends GenericEntity, ifc4.IfcTessellatedItem, ifc4.IfcBooleanOperand {

	EntityType<IfcTessellatedFaceSet> T = EntityTypes.T(IfcTessellatedFaceSet.class);

	/* Constants for each property name. */
	java.lang.String Coordinates = "Coordinates";
	java.lang.String HasColours = "HasColours";
	java.lang.String HasTextures = "HasTextures";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcCartesianPointList3D getCoordinates();
	void setCoordinates(ifc4.IfcCartesianPointList3D Coordinates);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcIndexedColourMap> getHasColours();
	void setHasColours(java.util.List<ifc4.IfcIndexedColourMap> HasColours);

	@Description("")
	
	java.util.List<ifc4.IfcIndexedTextureMap> getHasTextures();
	void setHasTextures(java.util.List<ifc4.IfcIndexedTextureMap> HasTextures);

	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
