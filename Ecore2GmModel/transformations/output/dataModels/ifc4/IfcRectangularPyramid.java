/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRectangularPyramid of the Data Model iai.
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
{@link XLength}, 
{@link XLengthAsString}, 
{@link YLength}, 
{@link YLengthAsString}, 
{@link Height}, 
{@link HeightAsString}, 

* It provides of then following operations (getters and setters)
{@link getXLength},
{@link getXLengthAsString},
{@link getYLength},
{@link getYLengthAsString},
{@link getHeight},
{@link getHeightAsString},
{@link setXLength},
{@link setXLengthAsString},
{@link setYLength},
{@link setYLengthAsString},
{@link setHeight},
{@link setHeightAsString},
 */

@Description("")

public interface IfcRectangularPyramid extends GenericEntity, ifc4.IfcCsgPrimitive3D {

	EntityType<IfcRectangularPyramid> T = EntityTypes.T(IfcRectangularPyramid.class);

	/* Constants for each property name. */
	java.lang.String XLength = "XLength";
	java.lang.String XLengthAsString = "XLengthAsString";
	java.lang.String YLength = "YLength";
	java.lang.String YLengthAsString = "YLengthAsString";
	java.lang.String Height = "Height";
	java.lang.String HeightAsString = "HeightAsString";

	@Description("")
	@Mandatory
	java.lang.Double getXLength();
	void setXLength(java.lang.Double XLength);
	@Description("")
	@Mandatory
	java.lang.String getXLengthAsString();
	void setXLengthAsString(java.lang.String XLengthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getYLength();
	void setYLength(java.lang.Double YLength);
	@Description("")
	@Mandatory
	java.lang.String getYLengthAsString();
	void setYLengthAsString(java.lang.String YLengthAsString);
	@Description("")
	@Mandatory
	java.lang.Double getHeight();
	void setHeight(java.lang.Double Height);
	@Description("")
	@Mandatory
	java.lang.String getHeightAsString();
	void setHeightAsString(java.lang.String HeightAsString);
}
