/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcIndexedPolyCurve of the Data Model iai.
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
{@link Points}, 
{@link Segments}, 
{@link SelfIntersect}, 

* It provides of then following operations (getters and setters)
{@link getPoints},
{@link getSegments},
{@link getSelfIntersect},
{@link setPoints},
{@link setSegments},
{@link setSelfIntersect},
 */

@Description("")

public interface IfcIndexedPolyCurve extends GenericEntity, ifc4.IfcBoundedCurve {

	EntityType<IfcIndexedPolyCurve> T = EntityTypes.T(IfcIndexedPolyCurve.class);

	/* Constants for each property name. */
	java.lang.String Points = "Points";
	java.lang.String Segments = "Segments";
	java.lang.String SelfIntersect = "SelfIntersect";

	@Description("")
	@Mandatory
	ifc4.IfcCartesianPointList getPoints();
	void setPoints(ifc4.IfcCartesianPointList Points);
	@Description("")
	
	java.util.List<ifc4.IfcSegmentIndexSelect> getSegments();
	void setSegments(java.util.List<ifc4.IfcSegmentIndexSelect> Segments);

	@Description("")
	@Mandatory
	ifc4.Tristate getSelfIntersect();
	void setSelfIntersect(ifc4.Tristate SelfIntersect);
}
