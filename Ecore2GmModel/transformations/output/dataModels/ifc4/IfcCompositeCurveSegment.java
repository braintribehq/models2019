/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCompositeCurveSegment of the Data Model iai.
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
{@link Transition}, 
{@link SameSense}, 
{@link ParentCurve}, 
{@link UsingCurves}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getTransition},
{@link getSameSense},
{@link getParentCurve},
{@link getUsingCurves},
{@link getDim},
{@link setTransition},
{@link setSameSense},
{@link setParentCurve},
{@link setUsingCurves},
{@link setDim},
 */

@Description("")

public interface IfcCompositeCurveSegment extends GenericEntity, ifc4.IfcGeometricRepresentationItem {

	EntityType<IfcCompositeCurveSegment> T = EntityTypes.T(IfcCompositeCurveSegment.class);

	/* Constants for each property name. */
	java.lang.String Transition = "Transition";
	java.lang.String SameSense = "SameSense";
	java.lang.String ParentCurve = "ParentCurve";
	java.lang.String UsingCurves = "UsingCurves";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcTransitionCode getTransition();
	void setTransition(ifc4.IfcTransitionCode Transition);
	@Description("")
	@Mandatory
	ifc4.Tristate getSameSense();
	void setSameSense(ifc4.Tristate SameSense);
	@Description("")
	@Mandatory
	ifc4.IfcCurve getParentCurve();
	void setParentCurve(ifc4.IfcCurve ParentCurve);
	@Description("")
	
	java.util.List<ifc4.IfcCompositeCurve> getUsingCurves();
	void setUsingCurves(java.util.List<ifc4.IfcCompositeCurve> UsingCurves);

	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
