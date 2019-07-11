/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCartesianTransformationOperator of the Data Model iai.
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
{@link Axis1}, 
{@link Axis2}, 
{@link LocalOrigin}, 
{@link Scale}, 
{@link ScaleAsString}, 
{@link Dim}, 
{@link Scl}, 
{@link SclAsString}, 

* It provides of then following operations (getters and setters)
{@link getAxis1},
{@link getAxis2},
{@link getLocalOrigin},
{@link getScale},
{@link getScaleAsString},
{@link getDim},
{@link getScl},
{@link getSclAsString},
{@link setAxis1},
{@link setAxis2},
{@link setLocalOrigin},
{@link setScale},
{@link setScaleAsString},
{@link setDim},
{@link setScl},
{@link setSclAsString},
 */

@Description("")

public interface IfcCartesianTransformationOperator extends GenericEntity, ifc4.IfcGeometricRepresentationItem {

	EntityType<IfcCartesianTransformationOperator> T = EntityTypes.T(IfcCartesianTransformationOperator.class);

	/* Constants for each property name. */
	java.lang.String Axis1 = "Axis1";
	java.lang.String Axis2 = "Axis2";
	java.lang.String LocalOrigin = "LocalOrigin";
	java.lang.String Scale = "Scale";
	java.lang.String ScaleAsString = "ScaleAsString";
	java.lang.String Dim = "Dim";
	java.lang.String Scl = "Scl";
	java.lang.String SclAsString = "SclAsString";

	@Description("")
	@Mandatory
	ifc4.IfcDirection getAxis1();
	void setAxis1(ifc4.IfcDirection Axis1);
	@Description("")
	@Mandatory
	ifc4.IfcDirection getAxis2();
	void setAxis2(ifc4.IfcDirection Axis2);
	@Description("")
	@Mandatory
	ifc4.IfcCartesianPoint getLocalOrigin();
	void setLocalOrigin(ifc4.IfcCartesianPoint LocalOrigin);
	@Description("")
	@Mandatory
	java.lang.Double getScale();
	void setScale(java.lang.Double Scale);
	@Description("")
	@Mandatory
	java.lang.String getScaleAsString();
	void setScaleAsString(java.lang.String ScaleAsString);
	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
	@Description("")
	@Mandatory
	java.lang.Double getScl();
	void setScl(java.lang.Double Scl);
	@Description("")
	@Mandatory
	java.lang.String getSclAsString();
	void setSclAsString(java.lang.String SclAsString);
}
