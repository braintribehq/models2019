/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcVirtualGridIntersection of the Data Model iai.
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
{@link IntersectingAxes}, 
{@link OffsetDistances}, 
{@link OffsetDistancesAsString}, 

* It provides of then following operations (getters and setters)
{@link getIntersectingAxes},
{@link getOffsetDistances},
{@link getOffsetDistancesAsString},
{@link setIntersectingAxes},
{@link setOffsetDistances},
{@link setOffsetDistancesAsString},
 */

@Description("")

public interface IfcVirtualGridIntersection extends GenericEntity, ifc4.IfcGridPlacementDirectionSelect {

	EntityType<IfcVirtualGridIntersection> T = EntityTypes.T(IfcVirtualGridIntersection.class);

	/* Constants for each property name. */
	java.lang.String IntersectingAxes = "IntersectingAxes";
	java.lang.String OffsetDistances = "OffsetDistances";
	java.lang.String OffsetDistancesAsString = "OffsetDistancesAsString";

	@Description("")
	
	java.util.List<ifc4.IfcGridAxis> getIntersectingAxes();
	void setIntersectingAxes(java.util.List<ifc4.IfcGridAxis> IntersectingAxes);

	@Description("")
	
	java.util.List<java.lang.Double> getOffsetDistances();
	void setOffsetDistances(java.util.List<java.lang.Double> OffsetDistances);

	@Description("")
	
	java.util.List<java.lang.String> getOffsetDistancesAsString();
	void setOffsetDistancesAsString(java.util.List<java.lang.String> OffsetDistancesAsString);

}
