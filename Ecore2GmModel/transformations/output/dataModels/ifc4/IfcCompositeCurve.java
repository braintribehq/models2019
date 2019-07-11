/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCompositeCurve of the Data Model iai.
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
{@link Segments}, 
{@link SelfIntersect}, 
{@link ClosedCurve}, 
{@link NSegments}, 

* It provides of then following operations (getters and setters)
{@link getSegments},
{@link getSelfIntersect},
{@link getClosedCurve},
{@link getNSegments},
{@link setSegments},
{@link setSelfIntersect},
{@link setClosedCurve},
{@link setNSegments},
 */

@Description("")

public interface IfcCompositeCurve extends GenericEntity, ifc4.IfcBoundedCurve {

	EntityType<IfcCompositeCurve> T = EntityTypes.T(IfcCompositeCurve.class);

	/* Constants for each property name. */
	java.lang.String Segments = "Segments";
	java.lang.String SelfIntersect = "SelfIntersect";
	java.lang.String ClosedCurve = "ClosedCurve";
	java.lang.String NSegments = "NSegments";

	@Description("")
	
	java.util.List<ifc4.IfcCompositeCurveSegment> getSegments();
	void setSegments(java.util.List<ifc4.IfcCompositeCurveSegment> Segments);

	@Description("")
	@Mandatory
	ifc4.Tristate getSelfIntersect();
	void setSelfIntersect(ifc4.Tristate SelfIntersect);
	@Description("")
	@Mandatory
	ifc4.Tristate getClosedCurve();
	void setClosedCurve(ifc4.Tristate ClosedCurve);
	@Description("")
	@Mandatory
	java.lang.Long getNSegments();
	void setNSegments(java.lang.Long NSegments);
}
