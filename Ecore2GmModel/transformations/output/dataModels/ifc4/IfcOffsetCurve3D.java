/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcOffsetCurve3D of the Data Model iai.
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
{@link BasisCurve}, 
{@link Distance}, 
{@link DistanceAsString}, 
{@link SelfIntersect}, 
{@link RefDirection}, 

* It provides of then following operations (getters and setters)
{@link getBasisCurve},
{@link getDistance},
{@link getDistanceAsString},
{@link getSelfIntersect},
{@link getRefDirection},
{@link setBasisCurve},
{@link setDistance},
{@link setDistanceAsString},
{@link setSelfIntersect},
{@link setRefDirection},
 */

@Description("")

public interface IfcOffsetCurve3D extends GenericEntity, ifc4.IfcCurve {

	EntityType<IfcOffsetCurve3D> T = EntityTypes.T(IfcOffsetCurve3D.class);

	/* Constants for each property name. */
	java.lang.String BasisCurve = "BasisCurve";
	java.lang.String Distance = "Distance";
	java.lang.String DistanceAsString = "DistanceAsString";
	java.lang.String SelfIntersect = "SelfIntersect";
	java.lang.String RefDirection = "RefDirection";

	@Description("")
	@Mandatory
	ifc4.IfcCurve getBasisCurve();
	void setBasisCurve(ifc4.IfcCurve BasisCurve);
	@Description("")
	@Mandatory
	java.lang.Double getDistance();
	void setDistance(java.lang.Double Distance);
	@Description("")
	@Mandatory
	java.lang.String getDistanceAsString();
	void setDistanceAsString(java.lang.String DistanceAsString);
	@Description("")
	@Mandatory
	ifc4.Tristate getSelfIntersect();
	void setSelfIntersect(ifc4.Tristate SelfIntersect);
	@Description("")
	@Mandatory
	ifc4.IfcDirection getRefDirection();
	void setRefDirection(ifc4.IfcDirection RefDirection);
}
