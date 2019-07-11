/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPcurve of the Data Model iai.
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
{@link ReferenceCurve}, 

* It provides of then following operations (getters and setters)
{@link getBasisSurface},
{@link getReferenceCurve},
{@link setBasisSurface},
{@link setReferenceCurve},
 */

@Description("")

public interface IfcPcurve extends GenericEntity, ifc4.IfcCurve, ifc4.IfcCurveOnSurface {

	EntityType<IfcPcurve> T = EntityTypes.T(IfcPcurve.class);

	/* Constants for each property name. */
	java.lang.String BasisSurface = "BasisSurface";
	java.lang.String ReferenceCurve = "ReferenceCurve";

	@Description("")
	@Mandatory
	ifc4.IfcSurface getBasisSurface();
	void setBasisSurface(ifc4.IfcSurface BasisSurface);
	@Description("")
	@Mandatory
	ifc4.IfcCurve getReferenceCurve();
	void setReferenceCurve(ifc4.IfcCurve ReferenceCurve);
}
