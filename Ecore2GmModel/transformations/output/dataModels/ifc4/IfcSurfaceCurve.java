/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSurfaceCurve of the Data Model iai.
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
{@link Curve3D}, 
{@link AssociatedGeometry}, 
{@link MasterRepresentation}, 

* It provides of then following operations (getters and setters)
{@link getCurve3D},
{@link getAssociatedGeometry},
{@link getMasterRepresentation},
{@link setCurve3D},
{@link setAssociatedGeometry},
{@link setMasterRepresentation},
 */

@Description("")

public interface IfcSurfaceCurve extends GenericEntity, ifc4.IfcCurve, ifc4.IfcCurveOnSurface {

	EntityType<IfcSurfaceCurve> T = EntityTypes.T(IfcSurfaceCurve.class);

	/* Constants for each property name. */
	java.lang.String Curve3D = "Curve3D";
	java.lang.String AssociatedGeometry = "AssociatedGeometry";
	java.lang.String MasterRepresentation = "MasterRepresentation";

	@Description("")
	@Mandatory
	ifc4.IfcCurve getCurve3D();
	void setCurve3D(ifc4.IfcCurve Curve3D);
	@Description("")
	
	java.util.List<ifc4.IfcPcurve> getAssociatedGeometry();
	void setAssociatedGeometry(java.util.List<ifc4.IfcPcurve> AssociatedGeometry);

	@Description("")
	@Mandatory
	ifc4.IfcPreferredSurfaceCurveRepresentation getMasterRepresentation();
	void setMasterRepresentation(ifc4.IfcPreferredSurfaceCurveRepresentation MasterRepresentation);
}
