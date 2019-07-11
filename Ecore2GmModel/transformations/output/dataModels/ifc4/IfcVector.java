/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcVector of the Data Model iai.
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
{@link Orientation}, 
{@link Magnitude}, 
{@link MagnitudeAsString}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getOrientation},
{@link getMagnitude},
{@link getMagnitudeAsString},
{@link getDim},
{@link setOrientation},
{@link setMagnitude},
{@link setMagnitudeAsString},
{@link setDim},
 */

@Description("")

public interface IfcVector extends GenericEntity, ifc4.IfcGeometricRepresentationItem, ifc4.IfcHatchLineDistanceSelect, ifc4.IfcVectorOrDirection {

	EntityType<IfcVector> T = EntityTypes.T(IfcVector.class);

	/* Constants for each property name. */
	java.lang.String Orientation = "Orientation";
	java.lang.String Magnitude = "Magnitude";
	java.lang.String MagnitudeAsString = "MagnitudeAsString";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcDirection getOrientation();
	void setOrientation(ifc4.IfcDirection Orientation);
	@Description("")
	@Mandatory
	java.lang.Double getMagnitude();
	void setMagnitude(java.lang.Double Magnitude);
	@Description("")
	@Mandatory
	java.lang.String getMagnitudeAsString();
	void setMagnitudeAsString(java.lang.String MagnitudeAsString);
	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
