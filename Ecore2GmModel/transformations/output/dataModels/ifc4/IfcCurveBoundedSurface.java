/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCurveBoundedSurface of the Data Model iai.
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
{@link Boundaries}, 
{@link ImplicitOuter}, 

* It provides of then following operations (getters and setters)
{@link getBasisSurface},
{@link getBoundaries},
{@link getImplicitOuter},
{@link setBasisSurface},
{@link setBoundaries},
{@link setImplicitOuter},
 */

@Description("")

public interface IfcCurveBoundedSurface extends GenericEntity, ifc4.IfcBoundedSurface {

	EntityType<IfcCurveBoundedSurface> T = EntityTypes.T(IfcCurveBoundedSurface.class);

	/* Constants for each property name. */
	java.lang.String BasisSurface = "BasisSurface";
	java.lang.String Boundaries = "Boundaries";
	java.lang.String ImplicitOuter = "ImplicitOuter";

	@Description("")
	@Mandatory
	ifc4.IfcSurface getBasisSurface();
	void setBasisSurface(ifc4.IfcSurface BasisSurface);
	@Description("")
	
	java.util.List<ifc4.IfcBoundaryCurve> getBoundaries();
	void setBoundaries(java.util.List<ifc4.IfcBoundaryCurve> Boundaries);

	@Description("")
	@Mandatory
	ifc4.Tristate getImplicitOuter();
	void setImplicitOuter(ifc4.Tristate ImplicitOuter);
}
