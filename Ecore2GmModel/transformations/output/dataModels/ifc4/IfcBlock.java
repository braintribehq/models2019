/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBlock of the Data Model iai.
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
{@link ZLength}, 
{@link ZLengthAsString}, 

* It provides of then following operations (getters and setters)
{@link getXLength},
{@link getXLengthAsString},
{@link getYLength},
{@link getYLengthAsString},
{@link getZLength},
{@link getZLengthAsString},
{@link setXLength},
{@link setXLengthAsString},
{@link setYLength},
{@link setYLengthAsString},
{@link setZLength},
{@link setZLengthAsString},
 */

@Description("")

public interface IfcBlock extends GenericEntity, ifc4.IfcCsgPrimitive3D {

	EntityType<IfcBlock> T = EntityTypes.T(IfcBlock.class);

	/* Constants for each property name. */
	java.lang.String XLength = "XLength";
	java.lang.String XLengthAsString = "XLengthAsString";
	java.lang.String YLength = "YLength";
	java.lang.String YLengthAsString = "YLengthAsString";
	java.lang.String ZLength = "ZLength";
	java.lang.String ZLengthAsString = "ZLengthAsString";

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
	java.lang.Double getZLength();
	void setZLength(java.lang.Double ZLength);
	@Description("")
	@Mandatory
	java.lang.String getZLengthAsString();
	void setZLengthAsString(java.lang.String ZLengthAsString);
}
