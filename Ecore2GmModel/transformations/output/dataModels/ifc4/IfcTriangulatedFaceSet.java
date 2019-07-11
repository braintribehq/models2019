/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTriangulatedFaceSet of the Data Model iai.
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
{@link Normals}, 
{@link Closed}, 
{@link CoordIndex}, 
{@link PnIndex}, 
{@link NumberOfTriangles}, 

* It provides of then following operations (getters and setters)
{@link getNormals},
{@link getClosed},
{@link getCoordIndex},
{@link getPnIndex},
{@link getNumberOfTriangles},
{@link setNormals},
{@link setClosed},
{@link setCoordIndex},
{@link setPnIndex},
{@link setNumberOfTriangles},
 */

@Description("")

public interface IfcTriangulatedFaceSet extends GenericEntity, ifc4.IfcTessellatedFaceSet {

	EntityType<IfcTriangulatedFaceSet> T = EntityTypes.T(IfcTriangulatedFaceSet.class);

	/* Constants for each property name. */
	java.lang.String Normals = "Normals";
	java.lang.String Closed = "Closed";
	java.lang.String CoordIndex = "CoordIndex";
	java.lang.String PnIndex = "PnIndex";
	java.lang.String NumberOfTriangles = "NumberOfTriangles";

	@Description("")
	
	java.util.List<ifc4.ListOfIfcParameterValue> getNormals();
	void setNormals(java.util.List<ifc4.ListOfIfcParameterValue> Normals);

	@Description("")
	@Mandatory
	ifc4.Tristate getClosed();
	void setClosed(ifc4.Tristate Closed);
	@Description("")
	
	java.util.List<ifc4.ListOfELong> getCoordIndex();
	void setCoordIndex(java.util.List<ifc4.ListOfELong> CoordIndex);

	@Description("")
	
	java.util.List<java.lang.Long> getPnIndex();
	void setPnIndex(java.util.List<java.lang.Long> PnIndex);

	@Description("")
	@Mandatory
	java.lang.Long getNumberOfTriangles();
	void setNumberOfTriangles(java.lang.Long NumberOfTriangles);
}
