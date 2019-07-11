/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcColourRgb of the Data Model iai.
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
{@link Red}, 
{@link RedAsString}, 
{@link Green}, 
{@link GreenAsString}, 
{@link Blue}, 
{@link BlueAsString}, 

* It provides of then following operations (getters and setters)
{@link getRed},
{@link getRedAsString},
{@link getGreen},
{@link getGreenAsString},
{@link getBlue},
{@link getBlueAsString},
{@link setRed},
{@link setRedAsString},
{@link setGreen},
{@link setGreenAsString},
{@link setBlue},
{@link setBlueAsString},
 */

@Description("")

public interface IfcColourRgb extends GenericEntity, ifc4.IfcColourSpecification, ifc4.IfcColourOrFactor {

	EntityType<IfcColourRgb> T = EntityTypes.T(IfcColourRgb.class);

	/* Constants for each property name. */
	java.lang.String Red = "Red";
	java.lang.String RedAsString = "RedAsString";
	java.lang.String Green = "Green";
	java.lang.String GreenAsString = "GreenAsString";
	java.lang.String Blue = "Blue";
	java.lang.String BlueAsString = "BlueAsString";

	@Description("")
	@Mandatory
	java.lang.Double getRed();
	void setRed(java.lang.Double Red);
	@Description("")
	@Mandatory
	java.lang.String getRedAsString();
	void setRedAsString(java.lang.String RedAsString);
	@Description("")
	@Mandatory
	java.lang.Double getGreen();
	void setGreen(java.lang.Double Green);
	@Description("")
	@Mandatory
	java.lang.String getGreenAsString();
	void setGreenAsString(java.lang.String GreenAsString);
	@Description("")
	@Mandatory
	java.lang.Double getBlue();
	void setBlue(java.lang.Double Blue);
	@Description("")
	@Mandatory
	java.lang.String getBlueAsString();
	void setBlueAsString(java.lang.String BlueAsString);
}
