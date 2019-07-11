/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcTrapeziumProfileDef of the Data Model iai.
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
{@link BottomXDim}, 
{@link BottomXDimAsString}, 
{@link TopXDim}, 
{@link TopXDimAsString}, 
{@link YDim}, 
{@link YDimAsString}, 
{@link TopXOffset}, 
{@link TopXOffsetAsString}, 

* It provides of then following operations (getters and setters)
{@link getBottomXDim},
{@link getBottomXDimAsString},
{@link getTopXDim},
{@link getTopXDimAsString},
{@link getYDim},
{@link getYDimAsString},
{@link getTopXOffset},
{@link getTopXOffsetAsString},
{@link setBottomXDim},
{@link setBottomXDimAsString},
{@link setTopXDim},
{@link setTopXDimAsString},
{@link setYDim},
{@link setYDimAsString},
{@link setTopXOffset},
{@link setTopXOffsetAsString},
 */

@Description("")

public interface IfcTrapeziumProfileDef extends GenericEntity, ifc4.IfcParameterizedProfileDef {

	EntityType<IfcTrapeziumProfileDef> T = EntityTypes.T(IfcTrapeziumProfileDef.class);

	/* Constants for each property name. */
	java.lang.String BottomXDim = "BottomXDim";
	java.lang.String BottomXDimAsString = "BottomXDimAsString";
	java.lang.String TopXDim = "TopXDim";
	java.lang.String TopXDimAsString = "TopXDimAsString";
	java.lang.String YDim = "YDim";
	java.lang.String YDimAsString = "YDimAsString";
	java.lang.String TopXOffset = "TopXOffset";
	java.lang.String TopXOffsetAsString = "TopXOffsetAsString";

	@Description("")
	@Mandatory
	java.lang.Double getBottomXDim();
	void setBottomXDim(java.lang.Double BottomXDim);
	@Description("")
	@Mandatory
	java.lang.String getBottomXDimAsString();
	void setBottomXDimAsString(java.lang.String BottomXDimAsString);
	@Description("")
	@Mandatory
	java.lang.Double getTopXDim();
	void setTopXDim(java.lang.Double TopXDim);
	@Description("")
	@Mandatory
	java.lang.String getTopXDimAsString();
	void setTopXDimAsString(java.lang.String TopXDimAsString);
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
	java.lang.Double getTopXOffset();
	void setTopXOffset(java.lang.Double TopXOffset);
	@Description("")
	@Mandatory
	java.lang.String getTopXOffsetAsString();
	void setTopXOffsetAsString(java.lang.String TopXOffsetAsString);
}
