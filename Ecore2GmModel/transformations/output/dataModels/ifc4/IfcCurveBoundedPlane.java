/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCurveBoundedPlane of the Data Model iai.
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
{@link BasisSurface}, 
{@link OuterBoundary}, 
{@link InnerBoundaries}, 

* It provides of then following operations (getters and setters)
{@link getBasisSurface},
{@link getOuterBoundary},
{@link getInnerBoundaries},
{@link setBasisSurface},
{@link setOuterBoundary},
{@link setInnerBoundaries},
 */

@Description("")

public interface IfcCurveBoundedPlane extends GenericEntity, ifc4.IfcBoundedSurface {

	EntityType<IfcCurveBoundedPlane> T = EntityTypes.T(IfcCurveBoundedPlane.class);

	/* Constants for each property name. */
	java.lang.String BasisSurface = "BasisSurface";
	java.lang.String OuterBoundary = "OuterBoundary";
	java.lang.String InnerBoundaries = "InnerBoundaries";

	@Description("")
	@Mandatory
	ifc4.IfcPlane getBasisSurface();
	void setBasisSurface(ifc4.IfcPlane BasisSurface);
	@Description("")
	@Mandatory
	ifc4.IfcCurve getOuterBoundary();
	void setOuterBoundary(ifc4.IfcCurve OuterBoundary);
	@Description("")
	
	java.util.List<ifc4.IfcCurve> getInnerBoundaries();
	void setInnerBoundaries(java.util.List<ifc4.IfcCurve> InnerBoundaries);

}
