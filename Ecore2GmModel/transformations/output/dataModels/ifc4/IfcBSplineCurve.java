/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBSplineCurve of the Data Model iai.
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
{@link Degree}, 
{@link ControlPointsList}, 
{@link CurveForm}, 
{@link ClosedCurve}, 
{@link SelfIntersect}, 
{@link UpperIndexOnControlPoints}, 

* It provides of then following operations (getters and setters)
{@link getDegree},
{@link getControlPointsList},
{@link getCurveForm},
{@link getClosedCurve},
{@link getSelfIntersect},
{@link getUpperIndexOnControlPoints},
{@link setDegree},
{@link setControlPointsList},
{@link setCurveForm},
{@link setClosedCurve},
{@link setSelfIntersect},
{@link setUpperIndexOnControlPoints},
 */

@Description("")

public interface IfcBSplineCurve extends GenericEntity, ifc4.IfcBoundedCurve {

	EntityType<IfcBSplineCurve> T = EntityTypes.T(IfcBSplineCurve.class);

	/* Constants for each property name. */
	java.lang.String Degree = "Degree";
	java.lang.String ControlPointsList = "ControlPointsList";
	java.lang.String CurveForm = "CurveForm";
	java.lang.String ClosedCurve = "ClosedCurve";
	java.lang.String SelfIntersect = "SelfIntersect";
	java.lang.String UpperIndexOnControlPoints = "UpperIndexOnControlPoints";

	@Description("")
	@Mandatory
	java.lang.Long getDegree();
	void setDegree(java.lang.Long Degree);
	@Description("")
	
	java.util.List<ifc4.IfcCartesianPoint> getControlPointsList();
	void setControlPointsList(java.util.List<ifc4.IfcCartesianPoint> ControlPointsList);

	@Description("")
	@Mandatory
	ifc4.IfcBSplineCurveForm getCurveForm();
	void setCurveForm(ifc4.IfcBSplineCurveForm CurveForm);
	@Description("")
	@Mandatory
	ifc4.Tristate getClosedCurve();
	void setClosedCurve(ifc4.Tristate ClosedCurve);
	@Description("")
	@Mandatory
	ifc4.Tristate getSelfIntersect();
	void setSelfIntersect(ifc4.Tristate SelfIntersect);
	@Description("")
	@Mandatory
	java.lang.Long getUpperIndexOnControlPoints();
	void setUpperIndexOnControlPoints(java.lang.Long UpperIndexOnControlPoints);
}
