/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSurfaceStyleShading of the Data Model iai.
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
{@link SurfaceColour}, 
{@link Transparency}, 
{@link TransparencyAsString}, 

* It provides of then following operations (getters and setters)
{@link getSurfaceColour},
{@link getTransparency},
{@link getTransparencyAsString},
{@link setSurfaceColour},
{@link setTransparency},
{@link setTransparencyAsString},
 */

@Description("")

public interface IfcSurfaceStyleShading extends GenericEntity, ifc4.IfcPresentationItem, ifc4.IfcSurfaceStyleElementSelect {

	EntityType<IfcSurfaceStyleShading> T = EntityTypes.T(IfcSurfaceStyleShading.class);

	/* Constants for each property name. */
	java.lang.String SurfaceColour = "SurfaceColour";
	java.lang.String Transparency = "Transparency";
	java.lang.String TransparencyAsString = "TransparencyAsString";

	@Description("")
	@Mandatory
	ifc4.IfcColourRgb getSurfaceColour();
	void setSurfaceColour(ifc4.IfcColourRgb SurfaceColour);
	@Description("")
	@Mandatory
	java.lang.Double getTransparency();
	void setTransparency(java.lang.Double Transparency);
	@Description("")
	@Mandatory
	java.lang.String getTransparencyAsString();
	void setTransparencyAsString(java.lang.String TransparencyAsString);
}
