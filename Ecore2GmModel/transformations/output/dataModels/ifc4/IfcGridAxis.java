/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcGridAxis of the Data Model iai.
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
{@link AxisTag}, 
{@link AxisCurve}, 
{@link SameSense}, 
{@link PartOfW}, 
{@link PartOfV}, 
{@link PartOfU}, 
{@link HasIntersections}, 

* It provides of then following operations (getters and setters)
{@link getAxisTag},
{@link getAxisCurve},
{@link getSameSense},
{@link getPartOfW},
{@link getPartOfV},
{@link getPartOfU},
{@link getHasIntersections},
{@link setAxisTag},
{@link setAxisCurve},
{@link setSameSense},
{@link setPartOfW},
{@link setPartOfV},
{@link setPartOfU},
{@link setHasIntersections},
 */

@Description("")

public interface IfcGridAxis extends GenericEntity {

	EntityType<IfcGridAxis> T = EntityTypes.T(IfcGridAxis.class);

	/* Constants for each property name. */
	java.lang.String AxisTag = "AxisTag";
	java.lang.String AxisCurve = "AxisCurve";
	java.lang.String SameSense = "SameSense";
	java.lang.String PartOfW = "PartOfW";
	java.lang.String PartOfV = "PartOfV";
	java.lang.String PartOfU = "PartOfU";
	java.lang.String HasIntersections = "HasIntersections";

	@Description("")
	@Mandatory
	java.lang.String getAxisTag();
	void setAxisTag(java.lang.String AxisTag);
	@Description("")
	@Mandatory
	ifc4.IfcCurve getAxisCurve();
	void setAxisCurve(ifc4.IfcCurve AxisCurve);
	@Description("")
	@Mandatory
	ifc4.Tristate getSameSense();
	void setSameSense(ifc4.Tristate SameSense);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcGrid> getPartOfW();
	void setPartOfW(java.util.List<ifc4.IfcGrid> PartOfW);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcGrid> getPartOfV();
	void setPartOfV(java.util.List<ifc4.IfcGrid> PartOfV);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcGrid> getPartOfU();
	void setPartOfU(java.util.List<ifc4.IfcGrid> PartOfU);

	@Description("")
	
	java.util.List<ifc4.IfcVirtualGridIntersection> getHasIntersections();
	void setHasIntersections(java.util.List<ifc4.IfcVirtualGridIntersection> HasIntersections);

}
