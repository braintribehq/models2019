/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCartesianPoint of the Data Model iai.
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
{@link Coordinates}, 
{@link CoordinatesAsString}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getCoordinates},
{@link getCoordinatesAsString},
{@link getDim},
{@link setCoordinates},
{@link setCoordinatesAsString},
{@link setDim},
 */

@Description("")

public interface IfcCartesianPoint extends GenericEntity, ifc4.IfcPoint, ifc4.IfcTrimmingSelect {

	EntityType<IfcCartesianPoint> T = EntityTypes.T(IfcCartesianPoint.class);

	/* Constants for each property name. */
	java.lang.String Coordinates = "Coordinates";
	java.lang.String CoordinatesAsString = "CoordinatesAsString";
	java.lang.String Dim = "Dim";

	@Description("")
	
	java.util.List<java.lang.Double> getCoordinates();
	void setCoordinates(java.util.List<java.lang.Double> Coordinates);

	@Description("")
	
	java.util.List<java.lang.String> getCoordinatesAsString();
	void setCoordinatesAsString(java.util.List<java.lang.String> CoordinatesAsString);

	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
