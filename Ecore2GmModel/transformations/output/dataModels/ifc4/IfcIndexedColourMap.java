/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcIndexedColourMap of the Data Model iai.
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
{@link MappedTo}, 
{@link Opacity}, 
{@link OpacityAsString}, 
{@link Colours}, 
{@link ColourIndex}, 

* It provides of then following operations (getters and setters)
{@link getMappedTo},
{@link getOpacity},
{@link getOpacityAsString},
{@link getColours},
{@link getColourIndex},
{@link setMappedTo},
{@link setOpacity},
{@link setOpacityAsString},
{@link setColours},
{@link setColourIndex},
 */

@Description("")

public interface IfcIndexedColourMap extends GenericEntity, ifc4.IfcPresentationItem {

	EntityType<IfcIndexedColourMap> T = EntityTypes.T(IfcIndexedColourMap.class);

	/* Constants for each property name. */
	java.lang.String MappedTo = "MappedTo";
	java.lang.String Opacity = "Opacity";
	java.lang.String OpacityAsString = "OpacityAsString";
	java.lang.String Colours = "Colours";
	java.lang.String ColourIndex = "ColourIndex";

	@Description("")
	@Mandatory
	ifc4.IfcTessellatedFaceSet getMappedTo();
	void setMappedTo(ifc4.IfcTessellatedFaceSet MappedTo);
	@Description("")
	@Mandatory
	java.lang.Double getOpacity();
	void setOpacity(java.lang.Double Opacity);
	@Description("")
	@Mandatory
	java.lang.String getOpacityAsString();
	void setOpacityAsString(java.lang.String OpacityAsString);
	@Description("")
	@Mandatory
	ifc4.IfcColourRgbList getColours();
	void setColours(ifc4.IfcColourRgbList Colours);
	@Description("")
	
	java.util.List<java.lang.Long> getColourIndex();
	void setColourIndex(java.util.List<java.lang.Long> ColourIndex);

}
