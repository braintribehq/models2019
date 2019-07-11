/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSurfaceStyleRendering of the Data Model iai.
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
{@link DiffuseColour}, 
{@link TransmissionColour}, 
{@link DiffuseTransmissionColour}, 
{@link ReflectionColour}, 
{@link SpecularColour}, 
{@link SpecularHighlight}, 
{@link ReflectanceMethod}, 

* It provides of then following operations (getters and setters)
{@link getDiffuseColour},
{@link getTransmissionColour},
{@link getDiffuseTransmissionColour},
{@link getReflectionColour},
{@link getSpecularColour},
{@link getSpecularHighlight},
{@link getReflectanceMethod},
{@link setDiffuseColour},
{@link setTransmissionColour},
{@link setDiffuseTransmissionColour},
{@link setReflectionColour},
{@link setSpecularColour},
{@link setSpecularHighlight},
{@link setReflectanceMethod},
 */

@Description("")

public interface IfcSurfaceStyleRendering extends GenericEntity, ifc4.IfcSurfaceStyleShading {

	EntityType<IfcSurfaceStyleRendering> T = EntityTypes.T(IfcSurfaceStyleRendering.class);

	/* Constants for each property name. */
	java.lang.String DiffuseColour = "DiffuseColour";
	java.lang.String TransmissionColour = "TransmissionColour";
	java.lang.String DiffuseTransmissionColour = "DiffuseTransmissionColour";
	java.lang.String ReflectionColour = "ReflectionColour";
	java.lang.String SpecularColour = "SpecularColour";
	java.lang.String SpecularHighlight = "SpecularHighlight";
	java.lang.String ReflectanceMethod = "ReflectanceMethod";

	@Description("")
	@Mandatory
	ifc4.IfcColourOrFactor getDiffuseColour();
	void setDiffuseColour(ifc4.IfcColourOrFactor DiffuseColour);
	@Description("")
	@Mandatory
	ifc4.IfcColourOrFactor getTransmissionColour();
	void setTransmissionColour(ifc4.IfcColourOrFactor TransmissionColour);
	@Description("")
	@Mandatory
	ifc4.IfcColourOrFactor getDiffuseTransmissionColour();
	void setDiffuseTransmissionColour(ifc4.IfcColourOrFactor DiffuseTransmissionColour);
	@Description("")
	@Mandatory
	ifc4.IfcColourOrFactor getReflectionColour();
	void setReflectionColour(ifc4.IfcColourOrFactor ReflectionColour);
	@Description("")
	@Mandatory
	ifc4.IfcColourOrFactor getSpecularColour();
	void setSpecularColour(ifc4.IfcColourOrFactor SpecularColour);
	@Description("")
	@Mandatory
	ifc4.IfcSpecularHighlightSelect getSpecularHighlight();
	void setSpecularHighlight(ifc4.IfcSpecularHighlightSelect SpecularHighlight);
	@Description("")
	@Mandatory
	ifc4.IfcReflectanceMethodEnum getReflectanceMethod();
	void setReflectanceMethod(ifc4.IfcReflectanceMethodEnum ReflectanceMethod);
}
