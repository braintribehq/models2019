/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSurfaceStyleLighting of the Data Model iai.
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
{@link DiffuseTransmissionColour}, 
{@link DiffuseReflectionColour}, 
{@link TransmissionColour}, 
{@link ReflectanceColour}, 

* It provides of then following operations (getters and setters)
{@link getDiffuseTransmissionColour},
{@link getDiffuseReflectionColour},
{@link getTransmissionColour},
{@link getReflectanceColour},
{@link setDiffuseTransmissionColour},
{@link setDiffuseReflectionColour},
{@link setTransmissionColour},
{@link setReflectanceColour},
 */

@Description("")

public interface IfcSurfaceStyleLighting extends GenericEntity, ifc4.IfcPresentationItem, ifc4.IfcSurfaceStyleElementSelect {

	EntityType<IfcSurfaceStyleLighting> T = EntityTypes.T(IfcSurfaceStyleLighting.class);

	/* Constants for each property name. */
	java.lang.String DiffuseTransmissionColour = "DiffuseTransmissionColour";
	java.lang.String DiffuseReflectionColour = "DiffuseReflectionColour";
	java.lang.String TransmissionColour = "TransmissionColour";
	java.lang.String ReflectanceColour = "ReflectanceColour";

	@Description("")
	@Mandatory
	ifc4.IfcColourRgb getDiffuseTransmissionColour();
	void setDiffuseTransmissionColour(ifc4.IfcColourRgb DiffuseTransmissionColour);
	@Description("")
	@Mandatory
	ifc4.IfcColourRgb getDiffuseReflectionColour();
	void setDiffuseReflectionColour(ifc4.IfcColourRgb DiffuseReflectionColour);
	@Description("")
	@Mandatory
	ifc4.IfcColourRgb getTransmissionColour();
	void setTransmissionColour(ifc4.IfcColourRgb TransmissionColour);
	@Description("")
	@Mandatory
	ifc4.IfcColourRgb getReflectanceColour();
	void setReflectanceColour(ifc4.IfcColourRgb ReflectanceColour);
}
