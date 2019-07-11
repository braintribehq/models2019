/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcShellBasedSurfaceModel of the Data Model iai.
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
{@link SbsmBoundary}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getSbsmBoundary},
{@link getDim},
{@link setSbsmBoundary},
{@link setDim},
 */

@Description("")

public interface IfcShellBasedSurfaceModel extends GenericEntity, ifc4.IfcGeometricRepresentationItem {

	EntityType<IfcShellBasedSurfaceModel> T = EntityTypes.T(IfcShellBasedSurfaceModel.class);

	/* Constants for each property name. */
	java.lang.String SbsmBoundary = "SbsmBoundary";
	java.lang.String Dim = "Dim";

	@Description("")
	
	java.util.List<ifc4.IfcShell> getSbsmBoundary();
	void setSbsmBoundary(java.util.List<ifc4.IfcShell> SbsmBoundary);

	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
