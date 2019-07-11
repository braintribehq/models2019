/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBoundingBox of the Data Model iai.
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
{@link Corner}, 
{@link XDim}, 
{@link XDimAsString}, 
{@link YDim}, 
{@link YDimAsString}, 
{@link ZDim}, 
{@link ZDimAsString}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getCorner},
{@link getXDim},
{@link getXDimAsString},
{@link getYDim},
{@link getYDimAsString},
{@link getZDim},
{@link getZDimAsString},
{@link getDim},
{@link setCorner},
{@link setXDim},
{@link setXDimAsString},
{@link setYDim},
{@link setYDimAsString},
{@link setZDim},
{@link setZDimAsString},
{@link setDim},
 */

@Description("")

public interface IfcBoundingBox extends GenericEntity, ifc4.IfcGeometricRepresentationItem {

	EntityType<IfcBoundingBox> T = EntityTypes.T(IfcBoundingBox.class);

	/* Constants for each property name. */
	java.lang.String Corner = "Corner";
	java.lang.String XDim = "XDim";
	java.lang.String XDimAsString = "XDimAsString";
	java.lang.String YDim = "YDim";
	java.lang.String YDimAsString = "YDimAsString";
	java.lang.String ZDim = "ZDim";
	java.lang.String ZDimAsString = "ZDimAsString";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcCartesianPoint getCorner();
	void setCorner(ifc4.IfcCartesianPoint Corner);
	@Description("")
	@Mandatory
	java.lang.Double getXDim();
	void setXDim(java.lang.Double XDim);
	@Description("")
	@Mandatory
	java.lang.String getXDimAsString();
	void setXDimAsString(java.lang.String XDimAsString);
	@Description("")
	@Mandatory
	java.lang.Double getYDim();
	void setYDim(java.lang.Double YDim);
	@Description("")
	@Mandatory
	java.lang.String getYDimAsString();
	void setYDimAsString(java.lang.String YDimAsString);
	@Description("")
	@Mandatory
	java.lang.Double getZDim();
	void setZDim(java.lang.Double ZDim);
	@Description("")
	@Mandatory
	java.lang.String getZDimAsString();
	void setZDimAsString(java.lang.String ZDimAsString);
	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
