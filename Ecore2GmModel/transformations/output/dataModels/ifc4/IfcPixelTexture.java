/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPixelTexture of the Data Model iai.
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
{@link Width}, 
{@link Height}, 
{@link ColourComponents}, 
{@link Pixel}, 

* It provides of then following operations (getters and setters)
{@link getWidth},
{@link getHeight},
{@link getColourComponents},
{@link getPixel},
{@link setWidth},
{@link setHeight},
{@link setColourComponents},
{@link setPixel},
 */

@Description("")

public interface IfcPixelTexture extends GenericEntity, ifc4.IfcSurfaceTexture {

	EntityType<IfcPixelTexture> T = EntityTypes.T(IfcPixelTexture.class);

	/* Constants for each property name. */
	java.lang.String Width = "Width";
	java.lang.String Height = "Height";
	java.lang.String ColourComponents = "ColourComponents";
	java.lang.String Pixel = "Pixel";

	@Description("")
	@Mandatory
	java.lang.Long getWidth();
	void setWidth(java.lang.Long Width);
	@Description("")
	@Mandatory
	java.lang.Long getHeight();
	void setHeight(java.lang.Long Height);
	@Description("")
	@Mandatory
	java.lang.Long getColourComponents();
	void setColourComponents(java.lang.Long ColourComponents);
	@Description("")
	
	java.util.List<java.lang.String> getPixel();
	void setPixel(java.util.List<java.lang.String> Pixel);

}
